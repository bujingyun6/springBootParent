package com.example.pojo;

/**
 * Created by 赵红祥（hx.zhao01@zuche.com）创建 on 2016/11/29.13:36
 */
public class Person {

    private String name;
    private Integer age;
    private String address;

    public Person() {
    }

    public Person(String address, Integer age, String name) {
        this.address = address;
        this.age = age;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
