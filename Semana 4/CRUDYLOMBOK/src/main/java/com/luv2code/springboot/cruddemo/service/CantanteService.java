package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.entity.Super_Junior;

import java.util.List;

public interface CantanteService {

    List<Super_Junior> findAll();

    Super_Junior findById(int theId);  

    Super_Junior save(Super_Junior theSing);

    void deleteById(int theId);

}
