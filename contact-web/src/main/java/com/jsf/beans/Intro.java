/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans;

import com.navigation.Views;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import org.apache.deltaspike.core.api.config.view.ViewConfig;

/**
 *
 * @author ben
 */
@Named(value = "intro")
@SessionScoped
public class Intro implements Serializable {

    /**
     * Creates a new instance of Intro
     */
    public Intro() {
    }
    
    private String name;
    private String address;
    private String phone_number;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    public Class<? extends ViewConfig> process_contact(){
        System.out.println(this.name);
        return Views.Home.Contact.class;
    }
    
    
}
