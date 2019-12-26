package com.example.springbootpractice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Entity: 类似用java代码扮演数据库中表的结构
@Entity
public class Task {

    @Id // 声明这个变量是表的主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 声明主键的生成方式， AUTO 自增
    private int id;

    private String taskName;
    private String username;
}
