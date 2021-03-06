package io.swagger.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import io.swagger.api.impl.FoodApiServiceImpl;
import io.swagger.api.impl.RecipeApiServiceImpl;

@ApplicationPath("/")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(FoodApiServiceImpl.class);
        resources.add(RecipeApiServiceImpl.class);


        return resources;
    }




}