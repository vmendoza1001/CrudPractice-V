package com.example.CrudPractice.dao;

import com.example.CrudPractice.entity.Instructor;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class AppDAOImpl implements AppDAO {


    // define field for entity manager
    private EntityManager entityManager;

    // inject entity manager using constructor injection
    @Autowired
    public AppDAOImpl (EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    // Add @Transactional since we are persisting the entity (performing update on database)
    @Transactional
    public void save(Instructor theInstructor) {
        entityManager.persist(theInstructor);

    }
}
