package com.webschmiede.bestbeforedate.controller;

import com.webschmiede.bestbeforedate.BestbeforedateApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodsController {

    public static void main(String[] args) {
        SpringApplication.run(BestbeforedateApplication.class, args);
    }

    @GetMapping("/foods/getAll")
    public String getAll() {
        return String.format("getAll");
    }

    @GetMapping("/foods/get/{id}")
    public String getById(@PathVariable String id){
        return String.format("get: %s", id);
    }

    @GetMapping("/foods/search")
    public String getByName(@RequestParam(value = "name") String name){
        if(name.isBlank()){
            return String.format("Fehlerhafte Eingabe.");
        }
        return String.format("get all foods with: %s", name);
    }
}
