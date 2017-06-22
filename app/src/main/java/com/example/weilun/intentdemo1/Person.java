package com.example.weilun.intentdemo1;
import java.io.Serializable;

/**
 * Created by Wei Lun on 6/22/2017.
 */

public class Person implements Serializable{

    private String name;
    private String email;
    private int age;

    public Person(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Person(){
        this("", "", 0);
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setAge(int age){
        this.age = age;
    }
}
