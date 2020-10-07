/*
 * Dependentes
 * HCM - Gestão de dependentes
 *
 * OpenAPI spec version: ${version}
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
import br.com.senior.hcm.dependent.pojos.DecisionType;
import br.com.senior.hcm.dependent.pojos.FinancialIndex;
import br.com.senior.hcm.dependent.pojos.Salary13Type;
import br.com.senior.hcm.dependent.pojos.SalaryAdvancedType;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * FixedJudicialValue
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-07T19:34:31.961Z")



public class FixedJudicialValue {
  @SerializedName("financialIndex")
  private FinancialIndex financialIndex = null;

  @SerializedName("vacationType")
  private DecisionType vacationType = null;

  @SerializedName("salaryAdvancedPercentage")
  private Integer salaryAdvancedPercentage = null;

  @SerializedName("startCorrection")
  private LocalDate startCorrection = null;

  @SerializedName("periodicityCorrection")
  private Integer periodicityCorrection = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("salary13Type")
  private Salary13Type salary13Type = null;

  @SerializedName("salaryAdvancedType")
  private SalaryAdvancedType salaryAdvancedType = null;

  @SerializedName("wageBonusType")
  private DecisionType wageBonusType = null;

  @SerializedName("initialValue")
  private Double initialValue = null;

  @SerializedName("correctionDay")
  private Integer correctionDay = null;

  public FixedJudicialValue financialIndex(FinancialIndex financialIndex) {
    this.financialIndex = financialIndex;
    return this;
  }

   /**
   * Get financialIndex
   * @return financialIndex
  **/
  @ApiModelProperty(value = "")
  public FinancialIndex getFinancialIndex() {
    return financialIndex;
  }

  public void setFinancialIndex(FinancialIndex financialIndex) {
    this.financialIndex = financialIndex;
  }

  public FixedJudicialValue vacationType(DecisionType vacationType) {
    this.vacationType = vacationType;
    return this;
  }

   /**
   * Get vacationType
   * @return vacationType
  **/
  @ApiModelProperty(value = "")
  public DecisionType getVacationType() {
    return vacationType;
  }

  public void setVacationType(DecisionType vacationType) {
    this.vacationType = vacationType;
  }

  public FixedJudicialValue salaryAdvancedPercentage(Integer salaryAdvancedPercentage) {
    this.salaryAdvancedPercentage = salaryAdvancedPercentage;
    return this;
  }

   /**
   * Porcentagem do adiantamento salarial para a pensão
   * @return salaryAdvancedPercentage
  **/
  @ApiModelProperty(value = "Porcentagem do adiantamento salarial para a pensão")
  public Integer getSalaryAdvancedPercentage() {
    return salaryAdvancedPercentage;
  }

  public void setSalaryAdvancedPercentage(Integer salaryAdvancedPercentage) {
    this.salaryAdvancedPercentage = salaryAdvancedPercentage;
  }

  public FixedJudicialValue startCorrection(LocalDate startCorrection) {
    this.startCorrection = startCorrection;
    return this;
  }

   /**
   * Data de inicio da correção
   * @return startCorrection
  **/
  @ApiModelProperty(value = "Data de inicio da correção")
  public LocalDate getStartCorrection() {
    return startCorrection;
  }

  public void setStartCorrection(LocalDate startCorrection) {
    this.startCorrection = startCorrection;
  }

  public FixedJudicialValue periodicityCorrection(Integer periodicityCorrection) {
    this.periodicityCorrection = periodicityCorrection;
    return this;
  }

   /**
   * Periodicidade da correção
   * @return periodicityCorrection
  **/
  @ApiModelProperty(value = "Periodicidade da correção")
  public Integer getPeriodicityCorrection() {
    return periodicityCorrection;
  }

  public void setPeriodicityCorrection(Integer periodicityCorrection) {
    this.periodicityCorrection = periodicityCorrection;
  }

  public FixedJudicialValue id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id da entidade
   * @return id
  **/
  @ApiModelProperty(value = "Id da entidade")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FixedJudicialValue salary13Type(Salary13Type salary13Type) {
    this.salary13Type = salary13Type;
    return this;
  }

   /**
   * Get salary13Type
   * @return salary13Type
  **/
  @ApiModelProperty(value = "")
  public Salary13Type getSalary13Type() {
    return salary13Type;
  }

  public void setSalary13Type(Salary13Type salary13Type) {
    this.salary13Type = salary13Type;
  }

  public FixedJudicialValue salaryAdvancedType(SalaryAdvancedType salaryAdvancedType) {
    this.salaryAdvancedType = salaryAdvancedType;
    return this;
  }

   /**
   * Get salaryAdvancedType
   * @return salaryAdvancedType
  **/
  @ApiModelProperty(value = "")
  public SalaryAdvancedType getSalaryAdvancedType() {
    return salaryAdvancedType;
  }

  public void setSalaryAdvancedType(SalaryAdvancedType salaryAdvancedType) {
    this.salaryAdvancedType = salaryAdvancedType;
  }

  public FixedJudicialValue wageBonusType(DecisionType wageBonusType) {
    this.wageBonusType = wageBonusType;
    return this;
  }

   /**
   * Get wageBonusType
   * @return wageBonusType
  **/
  @ApiModelProperty(value = "")
  public DecisionType getWageBonusType() {
    return wageBonusType;
  }

  public void setWageBonusType(DecisionType wageBonusType) {
    this.wageBonusType = wageBonusType;
  }

  public FixedJudicialValue initialValue(Double initialValue) {
    this.initialValue = initialValue;
    return this;
  }

   /**
   * Valor inicial
   * @return initialValue
  **/
  @ApiModelProperty(value = "Valor inicial")
  public Double getInitialValue() {
    return initialValue;
  }

  public void setInitialValue(Double initialValue) {
    this.initialValue = initialValue;
  }

  public FixedJudicialValue correctionDay(Integer correctionDay) {
    this.correctionDay = correctionDay;
    return this;
  }

   /**
   * Dia da correção
   * @return correctionDay
  **/
  @ApiModelProperty(value = "Dia da correção")
  public Integer getCorrectionDay() {
    return correctionDay;
  }

  public void setCorrectionDay(Integer correctionDay) {
    this.correctionDay = correctionDay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FixedJudicialValue fixedJudicialValue = (FixedJudicialValue) o;
    return Objects.equals(this.financialIndex, fixedJudicialValue.financialIndex) &&
        Objects.equals(this.vacationType, fixedJudicialValue.vacationType) &&
        Objects.equals(this.salaryAdvancedPercentage, fixedJudicialValue.salaryAdvancedPercentage) &&
        Objects.equals(this.startCorrection, fixedJudicialValue.startCorrection) &&
        Objects.equals(this.periodicityCorrection, fixedJudicialValue.periodicityCorrection) &&
        Objects.equals(this.id, fixedJudicialValue.id) &&
        Objects.equals(this.salary13Type, fixedJudicialValue.salary13Type) &&
        Objects.equals(this.salaryAdvancedType, fixedJudicialValue.salaryAdvancedType) &&
        Objects.equals(this.wageBonusType, fixedJudicialValue.wageBonusType) &&
        Objects.equals(this.initialValue, fixedJudicialValue.initialValue) &&
        Objects.equals(this.correctionDay, fixedJudicialValue.correctionDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialIndex, vacationType, salaryAdvancedPercentage, startCorrection, periodicityCorrection, id, salary13Type, salaryAdvancedType, wageBonusType, initialValue, correctionDay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FixedJudicialValue {\n");
    
    sb.append("    financialIndex: ").append(toIndentedString(financialIndex)).append("\n");
    sb.append("    vacationType: ").append(toIndentedString(vacationType)).append("\n");
    sb.append("    salaryAdvancedPercentage: ").append(toIndentedString(salaryAdvancedPercentage)).append("\n");
    sb.append("    startCorrection: ").append(toIndentedString(startCorrection)).append("\n");
    sb.append("    periodicityCorrection: ").append(toIndentedString(periodicityCorrection)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    salary13Type: ").append(toIndentedString(salary13Type)).append("\n");
    sb.append("    salaryAdvancedType: ").append(toIndentedString(salaryAdvancedType)).append("\n");
    sb.append("    wageBonusType: ").append(toIndentedString(wageBonusType)).append("\n");
    sb.append("    initialValue: ").append(toIndentedString(initialValue)).append("\n");
    sb.append("    correctionDay: ").append(toIndentedString(correctionDay)).append("\n");
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

