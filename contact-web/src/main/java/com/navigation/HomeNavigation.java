/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navigation;

import javax.enterprise.inject.Model;

/**
 *
 * @author ben
 */

@Model
public class HomeNavigation  extends AbstractViewNavigator{
    
    private static final long serialVersionUID = -589740942010458487L;

    
    public String getHomeIndex() {
        return getViewId(Views.Home.Index.class);
    }

    public String getAbout() {
        return getViewId(Views.Home.About.class);
    }

    public String getContact() {
        return getViewId(Views.Home.Contact.class);
    }

    
}
