/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author ben
 */
@Named(value = "contactAction")
@SessionScoped
public class ContactAction implements Serializable {

    /**
     * Creates a new instance of ContactAction
     */
    public ContactAction() {
    }
    
    private String contactId;

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }
    
    public void obtainContact(){
        
        System.out.println("Processing Contact");
        this.contactId = this.contactId + "Finally set";
        
    }
    
}
