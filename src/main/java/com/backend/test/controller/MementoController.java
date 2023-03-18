package com.backend.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api-test")
public class MementoController {

    private List<String> listNames = new ArrayList<>();

    @GetMapping("/hola-mundo")
    public String getMundo(){
        return "Hola mundo";
    }

    @GetMapping("/names")
    public List<String> getNamesAdd(){
        return listNames;
    }

    @PostMapping("/name-add")
    public ResponseEntity<Map<String,String>> addNames(@RequestParam("name") String name){
        Map<String,String> mapResponse = new HashMap<>();
        mapResponse.put("mensaje","Se añadio el nombre ".concat(name));
        System.out.println(this.listNames);
        this.listNames.add(name);
        return ResponseEntity.ok(mapResponse);
    }


}
