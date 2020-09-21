/*
 * Dependentes
 * HCM - Gestão de dependentes
 *
 * OpenAPI spec version: 6.2.0
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
import br.com.senior.hcm.dependent.pojos.State;
import java.io.IOException;

/**
 * City
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-21T19:42:01.930Z")



public class City {
  @SerializedName("stateId")
  private State stateId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  public City stateId(State stateId) {
    this.stateId = stateId;
    return this;
  }

   /**
   * Get stateId
   * @return stateId
  **/
  @ApiModelProperty(value = "")
  public State getStateId() {
    return stateId;
  }

  public void setStateId(State stateId) {
    this.stateId = stateId;
  }

  public City name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome da cidade
   * @return name
  **/
  @ApiModelProperty(value = "Nome da cidade")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public City id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id da cidade
   * @return id
  **/
  @ApiModelProperty(value = "Id da cidade")
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
    City city = (City) o;
    return Objects.equals(this.stateId, city.stateId) &&
        Objects.equals(this.name, city.name) &&
        Objects.equals(this.id, city.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateId, name, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class City {\n");
    
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
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

