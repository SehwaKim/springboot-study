package com.study.springbootstudy.controller;

import com.study.springbootstudy.domain.House;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("/api/houses")
public class HouseController {

    @PostMapping
    public ResponseEntity addHouses(House house) {
        if (house.getHouses() != null) {
            house.getHouses().forEach(h -> log.info("Westeros House {}", h));
        }

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
