package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.BrandedFoodObject;
import io.swagger.model.IngredientObject;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2020-01-28T14:07:08.315Z[GMT]")public class FoodApiServiceImpl implements FoodApi {
      public Response foodBrandedBarcodePhpGet(String code,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response foodBrandedNamePhpGet(String name,Integer limit,Integer page,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response foodBrandedSearchPhpGet(String allergen,String brand,String category,String country,String diet,String ingredient,String keyword,String mineral,String nutrient,String palmOil,String trace,String vitamin,Integer limit,Integer page,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response foodIngredientSearchPhpGet(String find,Integer limit,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
