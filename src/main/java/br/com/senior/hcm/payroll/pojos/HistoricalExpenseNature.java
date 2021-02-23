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
import br.com.senior.hcm.payroll.pojos.Employee;
import br.com.senior.hcm.payroll.pojos.ExpenseNature;
import br.com.senior.hcm.payroll.pojos.OriginExpenseNatureType;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * HistoricalExpenseNature
 */

public class HistoricalExpenseNature {
  @SerializedName("originExpenseNature")
  private OriginExpenseNatureType originExpenseNature = null;

  @SerializedName("lotWorkstation")
  private String lotWorkstation = null;

  @SerializedName("dateWhen")
  private LocalDate dateWhen = null;

  @SerializedName("endDate")
  private LocalDate endDate = null;

  @SerializedName("expenseNature")
  private ExpenseNature expenseNature = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("isIntegration")
  private Boolean isIntegration = null;

  @SerializedName("employee")
  private Employee employee = null;

  public HistoricalExpenseNature originExpenseNature(OriginExpenseNatureType originExpenseNature) {
    this.originExpenseNature = originExpenseNature;
    return this;
  }

   /**
   * Get originExpenseNature
   * @return originExpenseNature
  **/
  @ApiModelProperty(required = true, value = "")
  public OriginExpenseNatureType getOriginExpenseNature() {
    return originExpenseNature;
  }

  public void setOriginExpenseNature(OriginExpenseNatureType originExpenseNature) {
    this.originExpenseNature = originExpenseNature;
  }

  public HistoricalExpenseNature lotWorkstation(String lotWorkstation) {
    this.lotWorkstation = lotWorkstation;
    return this;
  }

   /**
   * Lote do histórico de posto de trabalho
   * @return lotWorkstation
  **/
  @ApiModelProperty(value = "Lote do histórico de posto de trabalho")
  public String getLotWorkstation() {
    return lotWorkstation;
  }

  public void setLotWorkstation(String lotWorkstation) {
    this.lotWorkstation = lotWorkstation;
  }

  public HistoricalExpenseNature dateWhen(LocalDate dateWhen) {
    this.dateWhen = dateWhen;
    return this;
  }

   /**
   * Data do histórico
   * @return dateWhen
  **/
  @ApiModelProperty(required = true, value = "Data do histórico")
  public LocalDate getDateWhen() {
    return dateWhen;
  }

  public void setDateWhen(LocalDate dateWhen) {
    this.dateWhen = dateWhen;
  }

  public HistoricalExpenseNature endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Data fim do histórico
   * @return endDate
  **/
  @ApiModelProperty(value = "Data fim do histórico")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public HistoricalExpenseNature expenseNature(ExpenseNature expenseNature) {
    this.expenseNature = expenseNature;
    return this;
  }

   /**
   * Get expenseNature
   * @return expenseNature
  **/
  @ApiModelProperty(required = true, value = "")
  public ExpenseNature getExpenseNature() {
    return expenseNature;
  }

  public void setExpenseNature(ExpenseNature expenseNature) {
    this.expenseNature = expenseNature;
  }

  public HistoricalExpenseNature id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id do histórico
   * @return id
  **/
  @ApiModelProperty(value = "Id do histórico")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HistoricalExpenseNature isIntegration(Boolean isIntegration) {
    this.isIntegration = isIntegration;
    return this;
  }

   /**
   * É integração? (campo calculado)
   * @return isIntegration
  **/
  @ApiModelProperty(value = "É integração? (campo calculado)")
  public Boolean isIsIntegration() {
    return isIntegration;
  }

  public void setIsIntegration(Boolean isIntegration) {
    this.isIntegration = isIntegration;
  }

  public HistoricalExpenseNature employee(Employee employee) {
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @ApiModelProperty(required = true, value = "")
  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalExpenseNature historicalExpenseNature = (HistoricalExpenseNature) o;
    return Objects.equals(this.originExpenseNature, historicalExpenseNature.originExpenseNature) &&
        Objects.equals(this.lotWorkstation, historicalExpenseNature.lotWorkstation) &&
        Objects.equals(this.dateWhen, historicalExpenseNature.dateWhen) &&
        Objects.equals(this.endDate, historicalExpenseNature.endDate) &&
        Objects.equals(this.expenseNature, historicalExpenseNature.expenseNature) &&
        Objects.equals(this.id, historicalExpenseNature.id) &&
        Objects.equals(this.isIntegration, historicalExpenseNature.isIntegration) &&
        Objects.equals(this.employee, historicalExpenseNature.employee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originExpenseNature, lotWorkstation, dateWhen, endDate, expenseNature, id, isIntegration, employee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalExpenseNature {\n");
    
    sb.append("    originExpenseNature: ").append(toIndentedString(originExpenseNature)).append("\n");
    sb.append("    lotWorkstation: ").append(toIndentedString(lotWorkstation)).append("\n");
    sb.append("    dateWhen: ").append(toIndentedString(dateWhen)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    expenseNature: ").append(toIndentedString(expenseNature)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isIntegration: ").append(toIndentedString(isIntegration)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
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

