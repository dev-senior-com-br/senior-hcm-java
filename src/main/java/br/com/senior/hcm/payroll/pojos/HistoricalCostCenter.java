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
import br.com.senior.hcm.payroll.pojos.Costcenter;
import br.com.senior.hcm.payroll.pojos.Employee;
import br.com.senior.hcm.payroll.pojos.Movimentationreason;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * HistoricalCostCenter
 */

public class HistoricalCostCenter {
  @SerializedName("lotWorkstation")
  private String lotWorkstation = null;

  @SerializedName("dateWhen")
  private LocalDate dateWhen = null;

  @SerializedName("endDate")
  private LocalDate endDate = null;

  @SerializedName("costCenterId")
  private Costcenter costCenterId = null;

  @SerializedName("movimentationReasonId")
  private Movimentationreason movimentationReasonId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("isIntegration")
  private Boolean isIntegration = null;

  @SerializedName("employee")
  private Employee employee = null;

  public HistoricalCostCenter lotWorkstation(String lotWorkstation) {
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

  public HistoricalCostCenter dateWhen(LocalDate dateWhen) {
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

  public HistoricalCostCenter endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Data de término
   * @return endDate
  **/
  @ApiModelProperty(value = "Data de término")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public HistoricalCostCenter costCenterId(Costcenter costCenterId) {
    this.costCenterId = costCenterId;
    return this;
  }

   /**
   * Get costCenterId
   * @return costCenterId
  **/
  @ApiModelProperty(required = true, value = "")
  public Costcenter getCostCenterId() {
    return costCenterId;
  }

  public void setCostCenterId(Costcenter costCenterId) {
    this.costCenterId = costCenterId;
  }

  public HistoricalCostCenter movimentationReasonId(Movimentationreason movimentationReasonId) {
    this.movimentationReasonId = movimentationReasonId;
    return this;
  }

   /**
   * Get movimentationReasonId
   * @return movimentationReasonId
  **/
  @ApiModelProperty(value = "")
  public Movimentationreason getMovimentationReasonId() {
    return movimentationReasonId;
  }

  public void setMovimentationReasonId(Movimentationreason movimentationReasonId) {
    this.movimentationReasonId = movimentationReasonId;
  }

  public HistoricalCostCenter id(String id) {
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

  public HistoricalCostCenter isIntegration(Boolean isIntegration) {
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

  public HistoricalCostCenter employee(Employee employee) {
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
    HistoricalCostCenter historicalCostCenter = (HistoricalCostCenter) o;
    return Objects.equals(this.lotWorkstation, historicalCostCenter.lotWorkstation) &&
        Objects.equals(this.dateWhen, historicalCostCenter.dateWhen) &&
        Objects.equals(this.endDate, historicalCostCenter.endDate) &&
        Objects.equals(this.costCenterId, historicalCostCenter.costCenterId) &&
        Objects.equals(this.movimentationReasonId, historicalCostCenter.movimentationReasonId) &&
        Objects.equals(this.id, historicalCostCenter.id) &&
        Objects.equals(this.isIntegration, historicalCostCenter.isIntegration) &&
        Objects.equals(this.employee, historicalCostCenter.employee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lotWorkstation, dateWhen, endDate, costCenterId, movimentationReasonId, id, isIntegration, employee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalCostCenter {\n");
    
    sb.append("    lotWorkstation: ").append(toIndentedString(lotWorkstation)).append("\n");
    sb.append("    dateWhen: ").append(toIndentedString(dateWhen)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    costCenterId: ").append(toIndentedString(costCenterId)).append("\n");
    sb.append("    movimentationReasonId: ").append(toIndentedString(movimentationReasonId)).append("\n");
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

