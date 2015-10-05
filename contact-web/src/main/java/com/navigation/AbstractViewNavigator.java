/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navigation;

import com.google.common.base.Strings;
import org.apache.commons.lang.StringUtils;
import org.apache.deltaspike.core.api.config.view.ViewConfig;
import org.apache.deltaspike.core.api.config.view.metadata.ConfigDescriptor;
import org.apache.deltaspike.core.api.config.view.metadata.ViewConfigDescriptor;
import org.apache.deltaspike.core.api.config.view.metadata.ViewConfigResolver;

import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author J-bos
 */
public abstract class AbstractViewNavigator implements Serializable {

    private static final long serialVersionUID = -5083762687235914704L;
    @Inject
    protected ViewConfigResolver viewConfigResolver;

    public String getViewId(Class<? extends ViewConfig> viewConfigClass) {
        return viewConfigResolver.getViewConfigDescriptor(viewConfigClass).getViewId(); //or #getPath
    }

    public String getPath(Class pathConfigClass) {
        return viewConfigResolver.getConfigDescriptor(pathConfigClass).getPath();
    }

    public Class resolveViewConfig(String path) {
        if (Strings.isNullOrEmpty(path)) {
            return null;
        }
        String checkPath = null;
        if (path.contains("?faces-redirect=true")) {
            checkPath = StringUtils.remove(path, "?faces-redirect=true");
        } else {
            checkPath = path;
        }
        ConfigDescriptor descriptor = viewConfigResolver.getConfigDescriptor(checkPath);
        if (descriptor == null) {
            return null;
        }
        return descriptor.getConfigClass();
    }

    public List<ConfigDescriptor<?>> getAllFolderDescriptors() {
        return viewConfigResolver.getConfigDescriptors();
    }

    public List<ViewConfigDescriptor> getAllPageDescriptors() {
        return viewConfigResolver.getViewConfigDescriptors();
    }

    public ViewConfigDescriptor getCurrentViewConfig() {
        return viewConfigResolver.getViewConfigDescriptor(FacesContext.getCurrentInstance().getViewRoot().getViewId());
    }

    public Class<? extends ViewConfig> getCurrentViewConfigClass() {
        return viewConfigResolver.getViewConfigDescriptor(FacesContext.getCurrentInstance().getViewRoot().getViewId()).getConfigClass();
    }

}
