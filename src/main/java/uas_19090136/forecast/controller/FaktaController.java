package uas_19090136.forecast.controller;

import java.util.List;

import org.hibernate.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import uas_19090136.forecast.model.Fakta;
import uas_19090136.forecast.Service.FaktaService;

@Controller
public class FaktaController {
    @Autowired
    private FaktaService service;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Fakta> listfakta = service.listAll();
        model.addAttribute("listed", listfakta);
        System.out.print("Get / ");
        return "index";
    }
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("fakta", new Fakta());
        return "new";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("fakta") Fakta std) {
        service.save(std);
        return "redirect:/";
    }
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id)
    {
        ModelAndView mav = new ModelAndView("new");
        Fakta std = service.get(id);
        mav.addObject("fakta", std);
        return mav;
    }
    @RequestMapping("/delete/{id}")
    public String deletefakta(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }


}

