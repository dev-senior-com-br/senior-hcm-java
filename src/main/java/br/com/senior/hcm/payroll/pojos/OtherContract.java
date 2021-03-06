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
import br.com.senior.hcm.payroll.pojos.OtherContractType;
import java.io.IOException;

/**
 * OtherContract
 */

public class OtherContract {
  @SerializedName("otherEmployee")
  private Employee otherEmployee = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("employee")
  private Employee employee = null;

  @SerializedName("otherContractType")
  private OtherContractType otherContractType = null;

  @SerializedName("inssCeiling")
  private Boolean inssCeiling = null;

  public OtherContract otherEmployee(Employee otherEmployee) {
    this.otherEmployee = otherEmployee;
    return this;
  }

   /**
   * Get otherEmployee
   * @return otherEmployee
  **/
  @ApiModelProperty(value = "")
  public Employee getOtherEmployee() {
    return otherEmployee;
  }

  public void setOtherEmployee(Employee otherEmployee) {
    this.otherEmployee = otherEmployee;
  }

  public OtherContract id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id do outro contrato
   * @return id
  **/
  @ApiModelProperty(value = "Id do outro contrato")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OtherContract employee(Employee employee) {
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

  public OtherContract otherContractType(OtherContractType otherContractType) {
    this.otherContractType = otherContractType;
    return this;
  }

   /**
   * Get otherContractType
   * @return otherContractType
  **/
  @ApiModelProperty(value = "")
  public OtherContractType getOtherContractType() {
    return otherContractType;
  }

  public void setOtherContractType(OtherContractType otherContractType) {
    this.otherContractType = otherContractType;
  }

  public OtherContract inssCeiling(Boolean inssCeiling) {
    this.inssCeiling = inssCeiling;
    return this;
  }

   /**
   * Utiliza teto de INSS?
   * @return inssCeiling
  **/
  @ApiModelProperty(value = "Utiliza teto de INSS?")
  public Boolean isInssCeiling() {
    return inssCeiling;
  }

  public void setInssCeiling(Boolean inssCeiling) {
    this.inssCeiling = inssCeiling;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherContract otherContract = (OtherContract) o;
    return Objects.equals(this.otherEmployee, otherContract.otherEmployee) &&
        Objects.equals(this.id, otherContract.id) &&
        Objects.equals(this.employee, otherContract.employee) &&
        Objects.equals(this.otherContractType, otherContract.otherContractType) &&
        Objects.equals(this.inssCeiling, otherContract.inssCeiling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherEmployee, id, employee, otherContractType, inssCeiling);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherContract {\n");
    
    sb.append("    otherEmployee: ").append(toIndentedString(otherEmployee)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    otherContractType: ").append(toIndentedString(otherContractType)).append("\n");
    sb.append("    inssCeiling: ").append(toIndentedString(inssCeiling)).append("\n");
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

