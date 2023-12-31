package com.example.flowerstore.flowers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.example.flowerstore.flowers.FlowerColor.RED;

@RestController
@RequestMapping("/api/flower")
public class FlowerController {

    @GetMapping("/hello")
    public String getHello(){
        return "wy";
    }

    @GetMapping("/list")
    public List<Flower> getFlower(){
        return  List.of(new Flower(50 ,0.5 ,RED));
    }

}
