/*
 * Dependentes
 * HCM - Gestão de dependentes
 *
 * OpenAPI spec version: 6.0.0
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
import br.com.senior.hcm.dependent.pojos.IndexType;
import br.com.senior.hcm.dependent.pojos.InformationType;
import java.io.IOException;

/**
 * FinancialIndex
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-14T14:43:38.281Z")



public class FinancialIndex {
  @SerializedName("indexType")
  private IndexType indexType = null;

  @SerializedName("code")
  private Integer code = null;

  @SerializedName("numberOfDecimals")
  private Integer numberOfDecimals = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("numberOfDigits")
  private Integer numberOfDigits = null;

  @SerializedName("informationType")
  private InformationType informationType = null;

  public FinancialIndex indexType(IndexType indexType) {
    this.indexType = indexType;
    return this;
  }

   /**
   * Get indexType
   * @return indexType
  **/
  @ApiModelProperty(value = "")
  public IndexType getIndexType() {
    return indexType;
  }

  public void setIndexType(IndexType indexType) {
    this.indexType = indexType;
  }

  public FinancialIndex code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Código do índice
   * @return code
  **/
  @ApiModelProperty(value = "Código do índice")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public FinancialIndex numberOfDecimals(Integer numberOfDecimals) {
    this.numberOfDecimals = numberOfDecimals;
    return this;
  }

   /**
   * Quantidade de decimais
   * @return numberOfDecimals
  **/
  @ApiModelProperty(value = "Quantidade de decimais")
  public Integer getNumberOfDecimals() {
    return numberOfDecimals;
  }

  public void setNumberOfDecimals(Integer numberOfDecimals) {
    this.numberOfDecimals = numberOfDecimals;
  }

  public FinancialIndex name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome do índice
   * @return name
  **/
  @ApiModelProperty(value = "Nome do índice")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FinancialIndex id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id do índice
   * @return id
  **/
  @ApiModelProperty(value = "Id do índice")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FinancialIndex numberOfDigits(Integer numberOfDigits) {
    this.numberOfDigits = numberOfDigits;
    return this;
  }

   /**
   * Quantidade de dígitos
   * @return numberOfDigits
  **/
  @ApiModelProperty(value = "Quantidade de dígitos")
  public Integer getNumberOfDigits() {
    return numberOfDigits;
  }

  public void setNumberOfDigits(Integer numberOfDigits) {
    this.numberOfDigits = numberOfDigits;
  }

  public FinancialIndex informationType(InformationType informationType) {
    this.informationType = informationType;
    return this;
  }

   /**
   * Get informationType
   * @return informationType
  **/
  @ApiModelProperty(value = "")
  public InformationType getInformationType() {
    return informationType;
  }

  public void setInformationType(InformationType informationType) {
    this.informationType = informationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialIndex financialIndex = (FinancialIndex) o;
    return Objects.equals(this.indexType, financialIndex.indexType) &&
        Objects.equals(this.code, financialIndex.code) &&
        Objects.equals(this.numberOfDecimals, financialIndex.numberOfDecimals) &&
        Objects.equals(this.name, financialIndex.name) &&
        Objects.equals(this.id, financialIndex.id) &&
        Objects.equals(this.numberOfDigits, financialIndex.numberOfDigits) &&
        Objects.equals(this.informationType, financialIndex.informationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexType, code, numberOfDecimals, name, id, numberOfDigits, informationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialIndex {\n");
    
    sb.append("    indexType: ").append(toIndentedString(indexType)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    numberOfDecimals: ").append(toIndentedString(numberOfDecimals)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numberOfDigits: ").append(toIndentedString(numberOfDigits)).append("\n");
    sb.append("    informationType: ").append(toIndentedString(informationType)).append("\n");
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
