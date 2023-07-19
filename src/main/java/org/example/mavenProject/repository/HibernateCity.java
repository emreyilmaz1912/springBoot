package org.example.mavenProject.repository;

import jakarta.persistence.EntityManager;
import org.example.mavenProject.entities.City;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class HibernateCity implements CityDal {

    private EntityManager entityManager;


    @Autowired
    public HibernateCity(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<City> getAll() {
         Session session = entityManager.unwrap(Session.class);
        List<City> cities = session.createQuery("from City", City.class).getResultList();
        return cities;
    }

    @Override
    public void add(City city) {
        //if()
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(city);


    }

    @Override
    public void update(City city) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(city);
    }

    @Override
    public void delete(City city) {
        Session session = entityManager.unwrap(Session.class);
        session.remove(city);
    }

    @Override
    public City getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        City city = session.get(City.class,id);
        return city;
    }
}
