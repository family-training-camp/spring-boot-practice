package com.example.springbootpractice.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter // 自动生成Getter,Setter 方法
@Setter
public class PersonInfo {
    private String username;
    private int age;
    private Address address;
    private List<Integer> sw = new ArrayList<>();
}
