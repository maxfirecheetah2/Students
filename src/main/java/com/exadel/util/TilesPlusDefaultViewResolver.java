package com.exadel.util;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;


public class TilesPlusDefaultViewResolver implements ViewResolver {

    private ViewResolver tilesResolver;
    private ViewResolver jspResolver;

    public void setJspResolver(ViewResolver jspResolver) {
        this.jspResolver = jspResolver;
    }

    public void setTilesResolver(ViewResolver tilesResolver) {
        this.tilesResolver = tilesResolver;
    }

    private boolean isTilesView(){
         return false;
    }

    private boolean isJspView(){
       return false;
    }

    @Override
    public View resolveViewName(String s, Locale locale) throws Exception {
        System.out.println(s);
        return null;
    }
}
