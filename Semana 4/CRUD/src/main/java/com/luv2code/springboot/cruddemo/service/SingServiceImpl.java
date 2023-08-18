package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.SingDAO;
import com.luv2code.springboot.cruddemo.entity.Super_Junior;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SingServiceImpl implements CantanteService {

    private SingDAO singDAO;

    @Autowired
    public SingServiceImpl(SingDAO theSingDAO) {
        singDAO = theSingDAO;
    }

    @Override
    public List<Super_Junior> findAll() {
        return singDAO.findAll();
    }

    @Override
    public Super_Junior findById(int theId) {
        return singDAO.findById(theId);
    }

    @Transactional
    @Override
    public Super_Junior save(Super_Junior theSing) {
        return singDAO.save(theSing);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        singDAO.deleteById(theId);
    }
}






