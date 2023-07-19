package org.example.mavenProject.service;

import org.example.mavenProject.entities.City;

import java.util.List;

public interface CityService {
    List<City> getAll();
    void add(City city);
    void update(City city);
    void delete(City city);
    City getById(int id);
}
