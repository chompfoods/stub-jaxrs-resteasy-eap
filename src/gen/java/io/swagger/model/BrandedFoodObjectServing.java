package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="An object containing serving information for this item")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2021-03-09T22:27:28.365Z[GMT]")public class BrandedFoodObjectServing   {
  private String size = null;
  private String measurementUnit = null;
  private String sizeFulltext = null;

  /**
   * Serving size
   **/
  
  @Schema(description = "Serving size")
  @JsonProperty("size")
  public String getSize() {
    return size;
  }
  public void setSize(String size) {
    this.size = size;
  }

  /**
   * Measurement unit for each serving (e.g. if measure is 3 tsp, the unit is tsp)
   **/
  
  @Schema(description = "Measurement unit for each serving (e.g. if measure is 3 tsp, the unit is tsp)")
  @JsonProperty("measurement_unit")
  public String getMeasurementUnit() {
    return measurementUnit;
  }
  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  /**
   * Serving size description
   **/
  
  @Schema(description = "Serving size description")
  @JsonProperty("size_fulltext")
  public String getSizeFulltext() {
    return sizeFulltext;
  }
  public void setSizeFulltext(String sizeFulltext) {
    this.sizeFulltext = sizeFulltext;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectServing brandedFoodObjectServing = (BrandedFoodObjectServing) o;
    return Objects.equals(size, brandedFoodObjectServing.size) &&
        Objects.equals(measurementUnit, brandedFoodObjectServing.measurementUnit) &&
        Objects.equals(sizeFulltext, brandedFoodObjectServing.sizeFulltext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, measurementUnit, sizeFulltext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectServing {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    sizeFulltext: ").append(toIndentedString(sizeFulltext)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
