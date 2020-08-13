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
import br.com.senior.hcm.recruitment.pojos.CostCenter;
import java.io.IOException;

/**
 * Company
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-13T15:24:45.430Z")



public class Company {
  @SerializedName("headQuarterName")
  private String headQuarterName = null;

  @SerializedName("code")
  private Integer code = null;

  @SerializedName("costCenter")
  private CostCenter costCenter = null;

  @SerializedName("companyName")
  private String companyName = null;

  @SerializedName("headQuarterId")
  private String headQuarterId = null;

  @SerializedName("headQuarterCode")
  private Integer headQuarterCode = null;

  @SerializedName("id")
  private String id = null;

  public Company headQuarterName(String headQuarterName) {
    this.headQuarterName = headQuarterName;
    return this;
  }

   /**
   * Nome da Empresa Matriz.
   * @return headQuarterName
  **/
  @ApiModelProperty(value = "Nome da Empresa Matriz.")
  public String getHeadQuarterName() {
    return headQuarterName;
  }

  public void setHeadQuarterName(String headQuarterName) {
    this.headQuarterName = headQuarterName;
  }

  public Company code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Código da empresa.
   * @return code
  **/
  @ApiModelProperty(value = "Código da empresa.")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Company costCenter(CostCenter costCenter) {
    this.costCenter = costCenter;
    return this;
  }

   /**
   * Get costCenter
   * @return costCenter
  **/
  @ApiModelProperty(value = "")
  public CostCenter getCostCenter() {
    return costCenter;
  }

  public void setCostCenter(CostCenter costCenter) {
    this.costCenter = costCenter;
  }

  public Company companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Nome da Empresa.
   * @return companyName
  **/
  @ApiModelProperty(value = "Nome da Empresa.")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Company headQuarterId(String headQuarterId) {
    this.headQuarterId = headQuarterId;
    return this;
  }

   /**
   * Identificador da Empresa Matriz.
   * @return headQuarterId
  **/
  @ApiModelProperty(value = "Identificador da Empresa Matriz.")
  public String getHeadQuarterId() {
    return headQuarterId;
  }

  public void setHeadQuarterId(String headQuarterId) {
    this.headQuarterId = headQuarterId;
  }

  public Company headQuarterCode(Integer headQuarterCode) {
    this.headQuarterCode = headQuarterCode;
    return this;
  }

   /**
   * Código da empresa matriz.
   * @return headQuarterCode
  **/
  @ApiModelProperty(value = "Código da empresa matriz.")
  public Integer getHeadQuarterCode() {
    return headQuarterCode;
  }

  public void setHeadQuarterCode(Integer headQuarterCode) {
    this.headQuarterCode = headQuarterCode;
  }

  public Company id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identificador único da empresa.
   * @return id
  **/
  @ApiModelProperty(value = "Identificador único da empresa.")
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
    Company company = (Company) o;
    return Objects.equals(this.headQuarterName, company.headQuarterName) &&
        Objects.equals(this.code, company.code) &&
        Objects.equals(this.costCenter, company.costCenter) &&
        Objects.equals(this.companyName, company.companyName) &&
        Objects.equals(this.headQuarterId, company.headQuarterId) &&
        Objects.equals(this.headQuarterCode, company.headQuarterCode) &&
        Objects.equals(this.id, company.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headQuarterName, code, costCenter, companyName, headQuarterId, headQuarterCode, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    
    sb.append("    headQuarterName: ").append(toIndentedString(headQuarterName)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    headQuarterId: ").append(toIndentedString(headQuarterId)).append("\n");
    sb.append("    headQuarterCode: ").append(toIndentedString(headQuarterCode)).append("\n");
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

