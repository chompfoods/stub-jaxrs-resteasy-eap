package io.swagger.api;

import io.swagger.model.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.BrandedFoodObject;
import io.swagger.model.IngredientObject;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
@Path("/food")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2021-03-09T22:27:28.365Z[GMT]")public interface FoodApi  {
   
    @GET
    @Path("/branded/barcode.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item using a barcode", description = "## Get data for a branded food using the food's UPC/EAN barcode.  **You must have a Food API key to use this endpoint.** Get a [Food API key](https://chompthis.com/api/).  **Example**  > ```https://chompthis.com/api/v2/food/branded/barcode.php?api_key=API_KEY&code=CODE```  **Tips**   * Read our **[Knowledge Base article](https://desk.zoho.com/portal/chompthis/kb/articles/im-having-trouble-getting-matches-for-barcodes-what-can-id-do)** for helpful tips and tricks.   * Perform a [check-digit](https://en.wikipedia.org/wiki/Check_digit#UPC) on the barcode you are using.   * Use a barcode from our website [ChompThis.com](https://chompthis.com/?r=api). Search for a food and use the barcode shown in the search results.   * It is possible that our database contains the food you're looking for, but does not have the same barcode you are using. This can happen if a manufacturer introduces a variation of the same food, or the barcode you got was from a 2 oz bag of chips when our database has the food packaged in a 4 oz bag.   * [Contact us](https://chompthis.com/contact.php?api=y) if you are having trouble. ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching foods.  ", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
                @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
                @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
                @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
                @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ")
         })
    Response foodBrandedBarcodePhpGet( @NotNull @QueryParam("code") String code, @QueryParam("user_id") String userId,@Context SecurityContext securityContext);

    @GET
    @Path("/branded/name.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item by name", description = "## Search for branded food items by name.  **You must have a Food API key to use this endpoint.** Get a [Food API key](https://chompthis.com/api/).  **Example** > ```https://chompthis.com/api/v2/food/branded/name.php?api_key=API_KEY&name=NAME```  **Tips**   * Get started by using our **[food lookup tool](https://chompthis.com/api/lookup.php)**.  > This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren't sure how to upgrade your subscription. ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching foods.  ", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
                @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
                @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
                @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
                @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ")
         })
    Response foodBrandedNamePhpGet( @NotNull @QueryParam("name") String name, @QueryParam("limit") Integer limit, @QueryParam("page") Integer page, @QueryParam("user_id") String userId,@Context SecurityContext securityContext);

    @GET
    @Path("/branded/search.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get data for branded food items using various search parameters", description = "## Search for branded food items using various parameters.  **You must have a Food API key to use this endpoint.** Get a [Food API key](https://chompthis.com/api/).  **Example** > ```https://chompthis.com/api/v2/food/branded/search.php?api_key=API_KEY&brand=BRAND&country=COUNTRY&page=1```  **Tips**    * Get started by using the **[Query Builder](https://chompthis.com/api/build.php)**.  > This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren't sure how to upgrade your subscription. ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching foods.  ", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
                @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
                @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
                @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
                @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ")
         })
    Response foodBrandedSearchPhpGet( @QueryParam("allergen") String allergen, @QueryParam("brand") String brand, @QueryParam("category") String category, @QueryParam("country") String country, @QueryParam("diet") String diet, @QueryParam("ingredient") String ingredient, @QueryParam("keyword") String keyword, @QueryParam("mineral") String mineral, @QueryParam("nutrient") String nutrient, @QueryParam("palm_oil") String palmOil, @QueryParam("trace") String trace, @QueryParam("vitamin") String vitamin, @QueryParam("limit") Integer limit, @QueryParam("page") Integer page, @QueryParam("user_id") String userId,@Context SecurityContext securityContext);

    @GET
    @Path("/ingredient/search.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get raw/generic food ingredient item(s)", description = "## Get data for a specific ingredient or a specific set of ingredients.  **You must have a Food API key to use this endpoint.** Get a [Food API key](https://chompthis.com/api/).  **Example #1: Single Ingredient** > ```https://chompthis.com/api/v2/food/ingredient/search.php?api_key=API_KEY&find=raw broccoli```  **Example #2: Set of Ingredients** > ```https://chompthis.com/api/v2/food/ingredient/search.php?api_key=API_KEY&find=raw broccoli,mashed potatoes,chicken drumstick```  **Tips**   * Expose ingredient endpoints by using our **[food lookup tool](https://chompthis.com/api/lookup.php)**.  > This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren't sure how to upgrade your subscription. ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching ingredient foods.  ", content = @Content(schema = @Schema(implementation = IngredientObject.class))),
                @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
                @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
                @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
                @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ")
         })
    Response foodIngredientSearchPhpGet( @NotNull @QueryParam("find") String find, @QueryParam("limit") Integer limit, @QueryParam("user_id") String userId,@Context SecurityContext securityContext);

}
