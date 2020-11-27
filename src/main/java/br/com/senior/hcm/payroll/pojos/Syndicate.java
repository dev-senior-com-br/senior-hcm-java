/*
 * Folha de Pagamento
 * HCM - Folha de pagamento
 *
 *
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
import br.com.senior.hcm.payroll.pojos.VacationRightType;
import java.io.IOException;

/**
 * Syndicate
 */




public class Syndicate {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("vacationMonths")
  private Integer vacationMonths = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("vacationRightType")
  private VacationRightType vacationRightType = null;

  public Syndicate code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Código do sindicato
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Código do sindicato")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Syndicate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome do sindicato
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Nome do sindicato")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Syndicate vacationMonths(Integer vacationMonths) {
    this.vacationMonths = vacationMonths;
    return this;
  }

   /**
   * Meses do período aquisitivo de férias
   * @return vacationMonths
  **/
  @ApiModelProperty(required = true, value = "Meses do período aquisitivo de férias")
  public Integer getVacationMonths() {
    return vacationMonths;
  }

  public void setVacationMonths(Integer vacationMonths) {
    this.vacationMonths = vacationMonths;
  }

  public Syndicate id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id do sindicato
   * @return id
  **/
  @ApiModelProperty(value = "Id do sindicato")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Syndicate vacationRightType(VacationRightType vacationRightType) {
    this.vacationRightType = vacationRightType;
    return this;
  }

   /**
   * Get vacationRightType
   * @return vacationRightType
  **/
  @ApiModelProperty(value = "")
  public VacationRightType getVacationRightType() {
    return vacationRightType;
  }

  public void setVacationRightType(VacationRightType vacationRightType) {
    this.vacationRightType = vacationRightType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Syndicate syndicate = (Syndicate) o;
    return Objects.equals(this.code, syndicate.code) &&
        Objects.equals(this.name, syndicate.name) &&
        Objects.equals(this.vacationMonths, syndicate.vacationMonths) &&
        Objects.equals(this.id, syndicate.id) &&
        Objects.equals(this.vacationRightType, syndicate.vacationRightType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, vacationMonths, id, vacationRightType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Syndicate {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vacationMonths: ").append(toIndentedString(vacationMonths)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vacationRightType: ").append(toIndentedString(vacationRightType)).append("\n");
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

