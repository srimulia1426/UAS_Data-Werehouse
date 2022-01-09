package uas_19090136.forecast.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uas_19090136.forecast.model.Fakta;


@Repository
public interface FaktaRepo extends JpaRepository<Fakta, Integer> {
}
