/*
 * Recrutamento e Seleção
 * Serviço do Gestão de Recrutamento e Seleção.
 *
 * OpenAPI spec version: 16.0.1
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
import br.com.senior.hcm.recruitment.pojos.Company;
import java.io.IOException;

/**
 * CostCenter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-10T16:52:01.386Z")



public class CostCenter {
  @SerializedName("companyId")
  private String companyId = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("company")
  private Company company = null;

  @SerializedName("id")
  private String id = null;

  public CostCenter companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * Identificador da Empresa.
   * @return companyId
  **/
  @ApiModelProperty(value = "Identificador da Empresa.")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public CostCenter code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Código do centro de custo.
   * @return code
  **/
  @ApiModelProperty(value = "Código do centro de custo.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CostCenter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome do centro de custo.
   * @return name
  **/
  @ApiModelProperty(value = "Nome do centro de custo.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CostCenter company(Company company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public CostCenter id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identificador do centro de custo.
   * @return id
  **/
  @ApiModelProperty(value = "Identificador do centro de custo.")
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
    CostCenter costCenter = (CostCenter) o;
    return Objects.equals(this.companyId, costCenter.companyId) &&
        Objects.equals(this.code, costCenter.code) &&
        Objects.equals(this.name, costCenter.name) &&
        Objects.equals(this.company, costCenter.company) &&
        Objects.equals(this.id, costCenter.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, code, name, company, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostCenter {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

