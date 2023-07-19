package org.example.mavenProject.service;

import org.example.mavenProject.repository.CityDal;
import org.example.mavenProject.entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
public class CityServiceImpl implements CityService {
    private CityDal cityDal;


    @Autowired
    public CityServiceImpl(CityDal cityDal) {
        this.cityDal = cityDal;
    }

    @Override
    @Transactional
    public List<City> getAll() {
        return this.cityDal.getAll();
    }

    @Override
    @Transactional
    public void add(City city) {
        //business, iş kodları
        this.cityDal.add(city);

    }

    @Override
    @Transactional
    public void update(City city) {
        this.cityDal.add(city);
    }

    @Override
    @Transactional
    public void delete(City city) {
        this.cityDal.delete(city);

    }

    @Override
    @Transactional
    public City getById(int id) {
        return this.cityDal.getById(id);
    }
}
