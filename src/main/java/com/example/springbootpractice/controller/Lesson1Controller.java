package com.example.springbootpractice.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.springbootpractice.dto.Address;
import com.example.springbootpractice.dto.PersonInfo;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController //1. 表示这个class是一个controller，同时这个controller定义的api返回的结果用json表示
@RequestMapping("/lesson1") // 2. 定义这个controller所定义的api由/lesson1 开头， /lesson1是前缀
public class Lesson1Controller {
    /**
     * api的种类
     * 1. /person
     * 2. /person?id=1， id=1是请求参数
     * 3. /person/1, /person/2, /person/3， 这里的123是变量，是路径参数
     * 请求方法
     * HTTP的请求方法
     */


    @GetMapping("/person") // 定义了一个API 是'/lesson1/person'，只支持get请求
    public String getPerson() { // 处理这个请求的方法
        return "person";
    }

    // 定义了一个api是/lesson1/fruits， 支持请求参数id，也就说可以这样请求/lesson1/fruits?type=苹果&price=10
    @GetMapping("/fruits")
    public String queryTest(@RequestParam(name = "type", required = false, defaultValue = "香蕉") String type,
                            @RequestParam(name = "price", required = false, defaultValue = "15") int price) { // @RequestParam 定义了这个api支持哪些请求参数， name要跟方法入参的变量名一致，才会绑定上
        return type + price;
    }

    @GetMapping("/person/{id}")
    public String getPersonById(@PathVariable String id) {
        return id;
    }

    @GetMapping("/json-test")
    public PersonInfo jsonTest() {
        Address address = new Address();
        address.setCountry("CN");
        address.setStreet("DA");

        PersonInfo personInfo = new PersonInfo();
        personInfo.setUsername("manyuet");
        personInfo.setAge(18);
        personInfo.setAddress(address);
        List<Integer> sw = Arrays.asList(90,90,90);
        personInfo.setSw(sw);
        return personInfo;
    }

    @RequestMapping(path = "/test", method = {RequestMethod.POST, RequestMethod.GET})
    public void test() {

    }
}
