/*
 * Dependentes
 * HCM - Gestão de dependentes
 *
 * OpenAPI spec version: 6.4.0
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
import java.io.IOException;

/**
 * Bank
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-09T11:27:01.295Z")



public class Bank {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  public Bank code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Número do banco
   * @return code
  **/
  @ApiModelProperty(value = "Número do banco")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Bank name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Descrição
   * @return name
  **/
  @ApiModelProperty(value = "Descrição")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Bank id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id do banco
   * @return id
  **/
  @ApiModelProperty(value = "Id do banco")
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
    Bank bank = (Bank) o;
    return Objects.equals(this.code, bank.code) &&
        Objects.equals(this.name, bank.name) &&
        Objects.equals(this.id, bank.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bank {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

