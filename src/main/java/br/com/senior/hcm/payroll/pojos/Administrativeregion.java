/*
 * Folha de Pagamento
 * HCM - Folha de pagamento
 *
 * OpenAPI spec version: 9.0.3
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.hcm.payroll.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import br.com.senior.hcm.payroll.pojos.City;
import java.io.IOException;

/**
 * Administrativeregion
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-14T17:15:20.586Z")



public class Administrativeregion {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("city")
  private City city = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  public Administrativeregion code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Código da região
   * @return code
  **/
  @ApiModelProperty(value = "Código da região")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Administrativeregion city(City city) {
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

  public Administrativeregion name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome da região administrativa
   * @return name
  **/
  @ApiModelProperty(value = "Nome da região administrativa")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Administrativeregion id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id da região administrativa
   * @return id
  **/
  @ApiModelProperty(value = "Id da região administrativa")
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
    Administrativeregion administrativeregion = (Administrativeregion) o;
    return Objects.equals(this.code, administrativeregion.code) &&
        Objects.equals(this.city, administrativeregion.city) &&
        Objects.equals(this.name, administrativeregion.name) &&
        Objects.equals(this.id, administrativeregion.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, city, name, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Administrativeregion {\n");
    
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
