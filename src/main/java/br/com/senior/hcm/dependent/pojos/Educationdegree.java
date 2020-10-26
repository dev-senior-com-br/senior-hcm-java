/*
 * Dependentes
 * HCM - Gestão de dependentes
 *
 * OpenAPI spec version: 6.4.2
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
import br.com.senior.hcm.dependent.pojos.DegreeInstructionType;
import java.io.IOException;

/**
 * Educationdegree
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-20T08:24:01.629Z")



public class Educationdegree {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("nameRais")
  private DegreeInstructionType nameRais = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  public Educationdegree code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Código do grau de instrução
   * @return code
  **/
  @ApiModelProperty(value = "Código do grau de instrução")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Educationdegree nameRais(DegreeInstructionType nameRais) {
    this.nameRais = nameRais;
    return this;
  }

   /**
   * Get nameRais
   * @return nameRais
  **/
  @ApiModelProperty(value = "")
  public DegreeInstructionType getNameRais() {
    return nameRais;
  }

  public void setNameRais(DegreeInstructionType nameRais) {
    this.nameRais = nameRais;
  }

  public Educationdegree name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome do grau de instrução
   * @return name
  **/
  @ApiModelProperty(value = "Nome do grau de instrução")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Educationdegree id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id do grau de instrução
   * @return id
  **/
  @ApiModelProperty(value = "Id do grau de instrução")
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
    Educationdegree educationdegree = (Educationdegree) o;
    return Objects.equals(this.code, educationdegree.code) &&
        Objects.equals(this.nameRais, educationdegree.nameRais) &&
        Objects.equals(this.name, educationdegree.name) &&
        Objects.equals(this.id, educationdegree.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, nameRais, name, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Educationdegree {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    nameRais: ").append(toIndentedString(nameRais)).append("\n");
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

