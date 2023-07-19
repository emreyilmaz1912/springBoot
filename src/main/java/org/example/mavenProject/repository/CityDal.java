package org.example.mavenProject.repository;

import org.example.mavenProject.entities.City;
import java.util.List;

public interface CityDal {
    List<City> getAll();
    void add(City city);
    void update(City city);
    void delete(City city);
    City getById(int id);
}
