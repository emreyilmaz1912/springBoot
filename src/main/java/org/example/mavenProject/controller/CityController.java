package org.example.mavenProject.controller;

import org.example.mavenProject.service.CityService;
import org.example.mavenProject.entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CityController {
    private CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }
    @GetMapping("/cities")
    public List<City> get(){
        return cityService.getAll();
    }

    @PostMapping ("/add")
    public void add(@RequestBody City city){
        cityService.add(city);
    }
    @PostMapping("/update")
    public void update(@RequestBody City city){
        cityService.update(city);
    }
    @PostMapping("/delete")
    public void delete(@RequestBody City city){
        cityService.delete(city);
    }
    @GetMapping("/cities/{id}")
    public City getById(@PathVariable int id){
        return cityService.getById(id);
    }

}
