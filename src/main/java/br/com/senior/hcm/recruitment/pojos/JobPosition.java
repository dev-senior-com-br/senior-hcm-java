/*
 * Recrutamento e Seleção
 * Serviço do Gestão de Recrutamento e Seleção.
 *
 * OpenAPI spec version: develop-SNAPSHOT
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.hcm.recruitment.pojos;

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
 * JobPosition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-13T20:44:04.403Z")



public class JobPosition {
  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  public JobPosition code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Código do cargo.
   * @return code
  **/
  @ApiModelProperty(value = "Código do cargo.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public JobPosition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome do cargo.
   * @return name
  **/
  @ApiModelProperty(value = "Nome do cargo.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JobPosition id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identificador único da entidade.
   * @return id
  **/
  @ApiModelProperty(value = "Identificador único da entidade.")
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
    JobPosition jobPosition = (JobPosition) o;
    return Objects.equals(this.code, jobPosition.code) &&
        Objects.equals(this.name, jobPosition.name) &&
        Objects.equals(this.id, jobPosition.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobPosition {\n");
    
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

