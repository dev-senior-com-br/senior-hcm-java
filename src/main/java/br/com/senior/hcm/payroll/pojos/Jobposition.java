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
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * Jobposition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-14T17:15:20.586Z")



public class Jobposition {
  @SerializedName("cbo")
  private String cbo = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("jobpositionstructure")
  private String jobpositionstructure = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("creationDate")
  private LocalDate creationDate = null;

  @SerializedName("expirationDate")
  private LocalDate expirationDate = null;

  public Jobposition cbo(String cbo) {
    this.cbo = cbo;
    return this;
  }

   /**
   * CBO do cargo
   * @return cbo
  **/
  @ApiModelProperty(value = "CBO do cargo")
  public String getCbo() {
    return cbo;
  }

  public void setCbo(String cbo) {
    this.cbo = cbo;
  }

  public Jobposition code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Código do cargo
   * @return code
  **/
  @ApiModelProperty(value = "Código do cargo")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Jobposition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome do cargo
   * @return name
  **/
  @ApiModelProperty(value = "Nome do cargo")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Jobposition jobpositionstructure(String jobpositionstructure) {
    this.jobpositionstructure = jobpositionstructure;
    return this;
  }

   /**
   * Id da estrutura de cargos
   * @return jobpositionstructure
  **/
  @ApiModelProperty(value = "Id da estrutura de cargos")
  public String getJobpositionstructure() {
    return jobpositionstructure;
  }

  public void setJobpositionstructure(String jobpositionstructure) {
    this.jobpositionstructure = jobpositionstructure;
  }

  public Jobposition id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id do cargo
   * @return id
  **/
  @ApiModelProperty(value = "Id do cargo")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Jobposition creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Data de criação do cargo
   * @return creationDate
  **/
  @ApiModelProperty(value = "Data de criação do cargo")
  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public Jobposition expirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Data de extinção do cargo
   * @return expirationDate
  **/
  @ApiModelProperty(value = "Data de extinção do cargo")
  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Jobposition jobposition = (Jobposition) o;
    return Objects.equals(this.cbo, jobposition.cbo) &&
        Objects.equals(this.code, jobposition.code) &&
        Objects.equals(this.name, jobposition.name) &&
        Objects.equals(this.jobpositionstructure, jobposition.jobpositionstructure) &&
        Objects.equals(this.id, jobposition.id) &&
        Objects.equals(this.creationDate, jobposition.creationDate) &&
        Objects.equals(this.expirationDate, jobposition.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cbo, code, name, jobpositionstructure, id, creationDate, expirationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Jobposition {\n");
    
    sb.append("    cbo: ").append(toIndentedString(cbo)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    jobpositionstructure: ").append(toIndentedString(jobpositionstructure)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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

