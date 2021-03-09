package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.RecipeObject;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2021-03-09T22:27:28.365Z[GMT]")public class RecipeApiServiceImpl implements RecipeApi {
      public Response recipeIdPhpGet(String id,String userId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response recipeIngredientPhpGet(String list,Integer limit,Integer page,String userId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response recipeRandomPhpGet(Integer limit,String userId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response recipeSearchPhpGet(String title,String excludedCuisine,String includedCuisine,String excludedIngredient,String includedIngredient,Integer nutrientsRequired,Integer limit,Integer page,String userId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
