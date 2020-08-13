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
import org.threeten.bp.OffsetDateTime;

/**
 * Department
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-13T20:31:14.805Z")



public class Department {
  @SerializedName("experitionDate")
  private OffsetDateTime experitionDate = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("place")
  private String place = null;

  @SerializedName("position")
  private String position = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  public Department experitionDate(OffsetDateTime experitionDate) {
    this.experitionDate = experitionDate;
    return this;
  }

   /**
   * Data de Expiração.
   * @return experitionDate
  **/
  @ApiModelProperty(value = "Data de Expiração.")
  public OffsetDateTime getExperitionDate() {
    return experitionDate;
  }

  public void setExperitionDate(OffsetDateTime experitionDate) {
    this.experitionDate = experitionDate;
  }

  public Department code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Codigo do departamento
   * @return code
  **/
  @ApiModelProperty(value = "Codigo do departamento")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Department name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome.
   * @return name
  **/
  @ApiModelProperty(value = "Nome.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Department id(String id) {
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

  public Department place(String place) {
    this.place = place;
    return this;
  }

   /**
   * Endereço do departamento
   * @return place
  **/
  @ApiModelProperty(value = "Endereço do departamento")
  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public Department position(String position) {
    this.position = position;
    return this;
  }

   /**
   * Posicao do departamento.
   * @return position
  **/
  @ApiModelProperty(value = "Posicao do departamento.")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public Department createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Data de Criação.
   * @return createDate
  **/
  @ApiModelProperty(value = "Data de Criação.")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Department department = (Department) o;
    return Objects.equals(this.experitionDate, department.experitionDate) &&
        Objects.equals(this.code, department.code) &&
        Objects.equals(this.name, department.name) &&
        Objects.equals(this.id, department.id) &&
        Objects.equals(this.place, department.place) &&
        Objects.equals(this.position, department.position) &&
        Objects.equals(this.createDate, department.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experitionDate, code, name, id, place, position, createDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Department {\n");
    
    sb.append("    experitionDate: ").append(toIndentedString(experitionDate)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

