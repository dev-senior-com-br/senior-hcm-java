/*
 * Dependentes
 * HCM - Gestão de dependentes
 *
 *
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.hcm.dependent.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import br.com.senior.hcm.dependent.pojos.City;
import java.io.IOException;

/**
 * Neighborhood
 */

public class Neighborhood {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("city")
  private City city = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  public Neighborhood code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Código do bairro
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Código do bairro")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Neighborhood city(City city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")
  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public Neighborhood name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome do bairro.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Nome do bairro.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Neighborhood id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id do bairro.
   * @return id
  **/
  @ApiModelProperty(value = "Id do bairro.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Neighborhood neighborhood = (Neighborhood) o;
    return Objects.equals(this.code, neighborhood.code) &&
        Objects.equals(this.city, neighborhood.city) &&
        Objects.equals(this.name, neighborhood.name) &&
        Objects.equals(this.id, neighborhood.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, city, name, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neighborhood {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

