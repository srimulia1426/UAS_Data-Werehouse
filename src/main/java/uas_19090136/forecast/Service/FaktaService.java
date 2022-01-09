package uas_19090136.forecast.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uas_19090136.forecast.Repo.FaktaRepo;
import uas_19090136.forecast.model.Fakta;

import java.util.List;

@Service
public class FaktaService {
    @Autowired
    private FaktaRepo repo;

    public List<Fakta> listAll() {
        return repo.findAll();
    }


    public void save(Fakta std) {
        repo.save(std);
    }

    public Fakta get(int id) {
        return repo.findById(id).get();
    }

    public void delete(int id) {
        repo.deleteById(id);
    }

}

