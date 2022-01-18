package com.telsuko.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private int id ;
    private String name ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "laptop " + id + "name" + name ;
    }
    public void compile(){
        System.out.println("compiling ...");
    }
}
