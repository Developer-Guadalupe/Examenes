package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Super_Junior;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SingeDAOJpaImpl implements SingDAO {

    // define field for entitymanager
    private EntityManager entityManager;


    // set up constructor injection
    @Autowired
    public SingeDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }


    @Override
    public List<Super_Junior > findAll() {

        // create a query
        TypedQuery<Super_Junior > theQuery = entityManager.createQuery("from Super_Junior", Super_Junior.class);

        // execute query and get result list
        List<Super_Junior > sings = theQuery.getResultList();

        // return the results
        return sings;
    }

    @Override
    public Super_Junior findById(int theId) {

        // get employee
        Super_Junior theSing = entityManager.find(Super_Junior.class, theId);

        // return employee
        return theSing;
    }

    @Override
    public Super_Junior save(Super_Junior theSing) {

        // save employee
        Super_Junior dbEmployee = entityManager.merge(theSing);

        // return the dbEmployee
        return dbEmployee;
    }

    @Override
    public void deleteById(int theId) {

        // find employee by id
        Super_Junior theSing = entityManager.find(Super_Junior.class, theId);

        // remove employee
        entityManager.remove(theSing);
    }
}











