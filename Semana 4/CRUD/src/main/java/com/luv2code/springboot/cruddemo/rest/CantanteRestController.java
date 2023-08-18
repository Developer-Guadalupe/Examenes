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

    // expose "/sings" and return a list of employees
    @GetMapping("/sings")
    public List<Super_Junior> findAll() {
        return cantanteService.findAll();
    }

    // add mapping for GET /sings/{singId}

    @GetMapping("/sings/{singId}")
    public Super_Junior getEmployee(@PathVariable int singId) {

        Super_Junior theSing = cantanteService.findById(singId);

        if (theSing == null) {
            throw new RuntimeException("Sing id not found - " + singId);
        }

        return theSing;
    }

    // add mapping for POST /sings - add new sing

    @PostMapping("/sings")
    public Super_Junior addEmployee(@RequestBody Super_Junior theSing) {


        theSing.setId(0);

        Super_Junior dbSing= cantanteService.save(theSing);

        return dbSing;
    }

    // add mapping for PUT /sings - update existing sing

    @PutMapping("/sings")
    public Super_Junior updateEmployee(@RequestBody Super_Junior theSing) {

        Super_Junior dbSing= cantanteService.save(theSing);

        return dbSing;
    }

    // add mapping for DELETE /sings/{singId} - delete sing

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














