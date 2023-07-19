package org.example.mavenProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/")
    public String get(){
        return "Laptop";
    }
    @GetMapping("/products")
    public String get2(){
        System.out.println();
        return "laptop 2";
    }

}
