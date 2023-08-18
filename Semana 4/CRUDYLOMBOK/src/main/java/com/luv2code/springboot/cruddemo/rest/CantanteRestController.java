package com.luv2code.springboot.cruddemo.rest;

import com.luv2code.springboot.cruddemo.entity.Super_Junior;
import com.luv2code.springboot.cruddemo.service.CantanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CantanteRestController {

    private CantanteService cantanteService;

    @Autowired
    public CantanteRestController(CantanteService theSingService) {
        cantanteService = theSingService;
    }

    // expose "/employees" and return a list of employees
    @GetMapping("/sings")
    public List<Super_Junior> findAll() {
        return cantanteService.findAll();
    }

    // add mapping for GET /employees/{employeeId}

    @GetMapping("/sings/{singId}")
    public Super_Junior getEmployee(@PathVariable int singId) {

        Super_Junior theSing = cantanteService.findById(singId);

        if (theSing == null) {
            throw new RuntimeException("Sing id not found - " + singId);
        }

        return theSing;
    }

    // add mapping for POST /employees - add new employee

    @PostMapping("/sings")
    public Super_Junior addEmployee(@RequestBody Super_Junior theSing) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        theSing.setId(0);

        Super_Junior dbSing= cantanteService.save(theSing);

        return dbSing;
    }

    // add mapping for PUT /employees - update existing employee

    @PutMapping("/sings")
    public Super_Junior updateEmployee(@RequestBody Super_Junior theSing) {

        Super_Junior dbSing= cantanteService.save(theSing);

        return dbSing;
    }

    // add mapping for DELETE /employees/{employeeId} - delete employee

    @DeleteMapping("/sings/{singId}")
    public String deleteEmployee(@PathVariable int singId) {

        Super_Junior tempEmployee = cantanteService.findById(singId);

        // throw exception if null

        if (tempEmployee == null) {
            throw new RuntimeException("Sing id not found - " + singId);
        }

        cantanteService.deleteById(singId);

        return "Deleted cantante id - " + singId;
    }

}














