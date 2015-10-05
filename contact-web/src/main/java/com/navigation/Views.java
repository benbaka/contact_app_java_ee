/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navigation;

import org.apache.deltaspike.core.api.config.view.DefaultErrorView;
import org.apache.deltaspike.core.api.config.view.ViewConfig;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * This represents a type safe representation of all the folders and files in
 * this project. Please follow the heirachy, and add as appropriate.
 *
 * All folders are marked with "interface" to extend their parents, and all are
 * denoted with "class" and implement their parent.
 *
 * @author J-bos
 */
@ApplicationScoped
@Named
public interface Views extends ViewConfig {

    
    public interface Home extends Views {
        
        public class Index implements Home{
            
        }
        
        public class Contact implements Home{
            
        }
        
        public class About implements Home{
            
        }
    }
    

}
