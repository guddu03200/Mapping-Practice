package com.Guddu.StudentMapping.controller;

import com.Guddu.StudentMapping.model.Laptop;
import com.Guddu.StudentMapping.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    @GetMapping
    public List<Laptop> getAllLaptops() {
        return laptopService.getAllLaptops();
    }

    @GetMapping("/{id}")
    public Laptop getLaptopById(@PathVariable("id") String id) {
        return laptopService.getLaptopById(id);
    }

    @PostMapping
    public Laptop createLaptop(@RequestBody Laptop laptop) {
        return laptopService.createLaptop(laptop);
    }

    @PutMapping("/{id}")
    public Laptop updateLaptop(@PathVariable("id") String id, @RequestBody Laptop laptop) {
        laptop.setLaptopId(id);
        return laptopService.updateLaptop(laptop);
    }

    @DeleteMapping("/{id}")
    public void deleteLaptop(@PathVariable("id") String id) {
        laptopService.deleteLaptop(id);
    }
}
