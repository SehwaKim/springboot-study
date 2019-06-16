package com.study.springbootstudy.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
@ToString
public class House {
    private String name;
    private String symbol;
    private String seat;
    private MultipartFile image;
    private List<House> houses;
}
