/*
 * Dependentes
 * HCM - Gestão de dependentes
 *
 * OpenAPI spec version: 6.2.0
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
import br.com.senior.hcm.dependent.pojos.Dependent;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * FamilySalary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-21T19:42:01.930Z")



public class FamilySalary {
  @SerializedName("id")
  private String id = null;

  @SerializedName("ageLimitSalaryFamily")
  private Integer ageLimitSalaryFamily = null;

  @SerializedName("printedNotice")
  private Boolean printedNotice = null;

  @SerializedName("certificateSubmission")
  private LocalDate certificateSubmission = null;

  @SerializedName("dependent")
  private Dependent dependent = null;

  public FamilySalary id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id do salário familia
   * @return id
  **/
  @ApiModelProperty(value = "Id do salário familia")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FamilySalary ageLimitSalaryFamily(Integer ageLimitSalaryFamily) {
    this.ageLimitSalaryFamily = ageLimitSalaryFamily;
    return this;
  }

   /**
   * Idade limite do salário familia
   * @return ageLimitSalaryFamily
  **/
  @ApiModelProperty(value = "Idade limite do salário familia")
  public Integer getAgeLimitSalaryFamily() {
    return ageLimitSalaryFamily;
  }

  public void setAgeLimitSalaryFamily(Integer ageLimitSalaryFamily) {
    this.ageLimitSalaryFamily = ageLimitSalaryFamily;
  }

  public FamilySalary printedNotice(Boolean printedNotice) {
    this.printedNotice = printedNotice;
    return this;
  }

   /**
   * Aviso impresso
   * @return printedNotice
  **/
  @ApiModelProperty(value = "Aviso impresso")
  public Boolean isPrintedNotice() {
    return printedNotice;
  }

  public void setPrintedNotice(Boolean printedNotice) {
    this.printedNotice = printedNotice;
  }

  public FamilySalary certificateSubmission(LocalDate certificateSubmission) {
    this.certificateSubmission = certificateSubmission;
    return this;
  }

   /**
   * Data de entrega da certidão
   * @return certificateSubmission
  **/
  @ApiModelProperty(value = "Data de entrega da certidão")
  public LocalDate getCertificateSubmission() {
    return certificateSubmission;
  }

  public void setCertificateSubmission(LocalDate certificateSubmission) {
    this.certificateSubmission = certificateSubmission;
  }

  public FamilySalary dependent(Dependent dependent) {
    this.dependent = dependent;
    return this;
  }

   /**
   * Get dependent
   * @return dependent
  **/
  @ApiModelProperty(value = "")
  public Dependent getDependent() {
    return dependent;
  }

  public void setDependent(Dependent dependent) {
    this.dependent = dependent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FamilySalary familySalary = (FamilySalary) o;
    return Objects.equals(this.id, familySalary.id) &&
        Objects.equals(this.ageLimitSalaryFamily, familySalary.ageLimitSalaryFamily) &&
        Objects.equals(this.printedNotice, familySalary.printedNotice) &&
        Objects.equals(this.certificateSubmission, familySalary.certificateSubmission) &&
        Objects.equals(this.dependent, familySalary.dependent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ageLimitSalaryFamily, printedNotice, certificateSubmission, dependent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FamilySalary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ageLimitSalaryFamily: ").append(toIndentedString(ageLimitSalaryFamily)).append("\n");
    sb.append("    printedNotice: ").append(toIndentedString(printedNotice)).append("\n");
    sb.append("    certificateSubmission: ").append(toIndentedString(certificateSubmission)).append("\n");
    sb.append("    dependent: ").append(toIndentedString(dependent)).append("\n");
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

