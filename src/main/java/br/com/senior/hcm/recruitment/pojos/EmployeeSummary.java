/*
 * Recrutamento e Seleção
 * Serviço do Gestão de Recrutamento e Seleção.
 *
 * OpenAPI spec version: 16.0.2
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
import br.com.senior.hcm.recruitment.pojos.CostCenter;
import br.com.senior.hcm.recruitment.pojos.Department;
import br.com.senior.hcm.recruitment.pojos.Employee;
import br.com.senior.hcm.recruitment.pojos.JobPosition;
import br.com.senior.hcm.recruitment.pojos.WorkShift;
import br.com.senior.hcm.recruitment.pojos.WorkstationGroup;
import java.io.IOException;

/**
 * EmployeeSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-16T19:14:01.468Z")



public class EmployeeSummary {
  @SerializedName("newDepartment")
  private Department newDepartment = null;

  @SerializedName("existsReferenceOfThisReplacedEmployeeOnVacancy")
  private Boolean existsReferenceOfThisReplacedEmployeeOnVacancy = null;

  @SerializedName("newJobPosition")
  private JobPosition newJobPosition = null;

  @SerializedName("newWorkstation")
  private WorkstationGroup newWorkstation = null;

  @SerializedName("companyName")
  private String companyName = null;

  @SerializedName("newCompany")
  private Company newCompany = null;

  @SerializedName("dismissed")
  private Boolean dismissed = null;

  @SerializedName("newWorkshift")
  private WorkShift newWorkshift = null;

  @SerializedName("newCostCenter")
  private CostCenter newCostCenter = null;

  @SerializedName("workstationGroupName")
  private String workstationGroupName = null;

  @SerializedName("employee")
  private Employee employee = null;

  @SerializedName("jobPositionName")
  private String jobPositionName = null;

  @SerializedName("existsReferenceOfThisReplacedEmployeeOnStaffRequisition")
  private Boolean existsReferenceOfThisReplacedEmployeeOnStaffRequisition = null;

  @SerializedName("hasPositionInTheHierarchy")
  private Boolean hasPositionInTheHierarchy = null;

  @SerializedName("location")
  private String location = null;

  public EmployeeSummary newDepartment(Department newDepartment) {
    this.newDepartment = newDepartment;
    return this;
  }

   /**
   * Get newDepartment
   * @return newDepartment
  **/
  @ApiModelProperty(value = "")
  public Department getNewDepartment() {
    return newDepartment;
  }

  public void setNewDepartment(Department newDepartment) {
    this.newDepartment = newDepartment;
  }

  public EmployeeSummary existsReferenceOfThisReplacedEmployeeOnVacancy(Boolean existsReferenceOfThisReplacedEmployeeOnVacancy) {
    this.existsReferenceOfThisReplacedEmployeeOnVacancy = existsReferenceOfThisReplacedEmployeeOnVacancy;
    return this;
  }

   /**
   * Representa se o colaborador já está sendo referenciado em outra vaga como o colaborador a ser substituído.
   * @return existsReferenceOfThisReplacedEmployeeOnVacancy
  **/
  @ApiModelProperty(value = "Representa se o colaborador já está sendo referenciado em outra vaga como o colaborador a ser substituído.")
  public Boolean isExistsReferenceOfThisReplacedEmployeeOnVacancy() {
    return existsReferenceOfThisReplacedEmployeeOnVacancy;
  }

  public void setExistsReferenceOfThisReplacedEmployeeOnVacancy(Boolean existsReferenceOfThisReplacedEmployeeOnVacancy) {
    this.existsReferenceOfThisReplacedEmployeeOnVacancy = existsReferenceOfThisReplacedEmployeeOnVacancy;
  }

  public EmployeeSummary newJobPosition(JobPosition newJobPosition) {
    this.newJobPosition = newJobPosition;
    return this;
  }

   /**
   * Get newJobPosition
   * @return newJobPosition
  **/
  @ApiModelProperty(value = "")
  public JobPosition getNewJobPosition() {
    return newJobPosition;
  }

  public void setNewJobPosition(JobPosition newJobPosition) {
    this.newJobPosition = newJobPosition;
  }

  public EmployeeSummary newWorkstation(WorkstationGroup newWorkstation) {
    this.newWorkstation = newWorkstation;
    return this;
  }

   /**
   * Get newWorkstation
   * @return newWorkstation
  **/
  @ApiModelProperty(value = "")
  public WorkstationGroup getNewWorkstation() {
    return newWorkstation;
  }

  public void setNewWorkstation(WorkstationGroup newWorkstation) {
    this.newWorkstation = newWorkstation;
  }

  public EmployeeSummary companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Nome da empresa em que o colaborador trabalha.
   * @return companyName
  **/
  @ApiModelProperty(value = "Nome da empresa em que o colaborador trabalha.")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public EmployeeSummary newCompany(Company newCompany) {
    this.newCompany = newCompany;
    return this;
  }

   /**
   * Get newCompany
   * @return newCompany
  **/
  @ApiModelProperty(value = "")
  public Company getNewCompany() {
    return newCompany;
  }

  public void setNewCompany(Company newCompany) {
    this.newCompany = newCompany;
  }

  public EmployeeSummary dismissed(Boolean dismissed) {
    this.dismissed = dismissed;
    return this;
  }

   /**
   * Identifica se o colaborador foi demitido ou não.
   * @return dismissed
  **/
  @ApiModelProperty(value = "Identifica se o colaborador foi demitido ou não.")
  public Boolean isDismissed() {
    return dismissed;
  }

  public void setDismissed(Boolean dismissed) {
    this.dismissed = dismissed;
  }

  public EmployeeSummary newWorkshift(WorkShift newWorkshift) {
    this.newWorkshift = newWorkshift;
    return this;
  }

   /**
   * Get newWorkshift
   * @return newWorkshift
  **/
  @ApiModelProperty(value = "")
  public WorkShift getNewWorkshift() {
    return newWorkshift;
  }

  public void setNewWorkshift(WorkShift newWorkshift) {
    this.newWorkshift = newWorkshift;
  }

  public EmployeeSummary newCostCenter(CostCenter newCostCenter) {
    this.newCostCenter = newCostCenter;
    return this;
  }

   /**
   * Get newCostCenter
   * @return newCostCenter
  **/
  @ApiModelProperty(value = "")
  public CostCenter getNewCostCenter() {
    return newCostCenter;
  }

  public void setNewCostCenter(CostCenter newCostCenter) {
    this.newCostCenter = newCostCenter;
  }

  public EmployeeSummary workstationGroupName(String workstationGroupName) {
    this.workstationGroupName = workstationGroupName;
    return this;
  }

   /**
   * Nome do grupo de posto de trabalho do colaborador.
   * @return workstationGroupName
  **/
  @ApiModelProperty(value = "Nome do grupo de posto de trabalho do colaborador.")
  public String getWorkstationGroupName() {
    return workstationGroupName;
  }

  public void setWorkstationGroupName(String workstationGroupName) {
    this.workstationGroupName = workstationGroupName;
  }

  public EmployeeSummary employee(Employee employee) {
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @ApiModelProperty(value = "")
  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public EmployeeSummary jobPositionName(String jobPositionName) {
    this.jobPositionName = jobPositionName;
    return this;
  }

   /**
   * Nome do cargo do colaborador.
   * @return jobPositionName
  **/
  @ApiModelProperty(value = "Nome do cargo do colaborador.")
  public String getJobPositionName() {
    return jobPositionName;
  }

  public void setJobPositionName(String jobPositionName) {
    this.jobPositionName = jobPositionName;
  }

  public EmployeeSummary existsReferenceOfThisReplacedEmployeeOnStaffRequisition(Boolean existsReferenceOfThisReplacedEmployeeOnStaffRequisition) {
    this.existsReferenceOfThisReplacedEmployeeOnStaffRequisition = existsReferenceOfThisReplacedEmployeeOnStaffRequisition;
    return this;
  }

   /**
   * Representa se o colaborador já está sendo referenciado em outra RP como o colaborador a ser substituído.
   * @return existsReferenceOfThisReplacedEmployeeOnStaffRequisition
  **/
  @ApiModelProperty(value = "Representa se o colaborador já está sendo referenciado em outra RP como o colaborador a ser substituído.")
  public Boolean isExistsReferenceOfThisReplacedEmployeeOnStaffRequisition() {
    return existsReferenceOfThisReplacedEmployeeOnStaffRequisition;
  }

  public void setExistsReferenceOfThisReplacedEmployeeOnStaffRequisition(Boolean existsReferenceOfThisReplacedEmployeeOnStaffRequisition) {
    this.existsReferenceOfThisReplacedEmployeeOnStaffRequisition = existsReferenceOfThisReplacedEmployeeOnStaffRequisition;
  }

  public EmployeeSummary hasPositionInTheHierarchy(Boolean hasPositionInTheHierarchy) {
    this.hasPositionInTheHierarchy = hasPositionInTheHierarchy;
    return this;
  }

   /**
   * Verifica se o colaborador possui uma posição na hierarquia atual.
   * @return hasPositionInTheHierarchy
  **/
  @ApiModelProperty(value = "Verifica se o colaborador possui uma posição na hierarquia atual.")
  public Boolean isHasPositionInTheHierarchy() {
    return hasPositionInTheHierarchy;
  }

  public void setHasPositionInTheHierarchy(Boolean hasPositionInTheHierarchy) {
    this.hasPositionInTheHierarchy = hasPositionInTheHierarchy;
  }

  public EmployeeSummary location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Local onde o colaborador substituído trabalha.
   * @return location
  **/
  @ApiModelProperty(value = "Local onde o colaborador substituído trabalha.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeSummary employeeSummary = (EmployeeSummary) o;
    return Objects.equals(this.newDepartment, employeeSummary.newDepartment) &&
        Objects.equals(this.existsReferenceOfThisReplacedEmployeeOnVacancy, employeeSummary.existsReferenceOfThisReplacedEmployeeOnVacancy) &&
        Objects.equals(this.newJobPosition, employeeSummary.newJobPosition) &&
        Objects.equals(this.newWorkstation, employeeSummary.newWorkstation) &&
        Objects.equals(this.companyName, employeeSummary.companyName) &&
        Objects.equals(this.newCompany, employeeSummary.newCompany) &&
        Objects.equals(this.dismissed, employeeSummary.dismissed) &&
        Objects.equals(this.newWorkshift, employeeSummary.newWorkshift) &&
        Objects.equals(this.newCostCenter, employeeSummary.newCostCenter) &&
        Objects.equals(this.workstationGroupName, employeeSummary.workstationGroupName) &&
        Objects.equals(this.employee, employeeSummary.employee) &&
        Objects.equals(this.jobPositionName, employeeSummary.jobPositionName) &&
        Objects.equals(this.existsReferenceOfThisReplacedEmployeeOnStaffRequisition, employeeSummary.existsReferenceOfThisReplacedEmployeeOnStaffRequisition) &&
        Objects.equals(this.hasPositionInTheHierarchy, employeeSummary.hasPositionInTheHierarchy) &&
        Objects.equals(this.location, employeeSummary.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newDepartment, existsReferenceOfThisReplacedEmployeeOnVacancy, newJobPosition, newWorkstation, companyName, newCompany, dismissed, newWorkshift, newCostCenter, workstationGroupName, employee, jobPositionName, existsReferenceOfThisReplacedEmployeeOnStaffRequisition, hasPositionInTheHierarchy, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeSummary {\n");
    
    sb.append("    newDepartment: ").append(toIndentedString(newDepartment)).append("\n");
    sb.append("    existsReferenceOfThisReplacedEmployeeOnVacancy: ").append(toIndentedString(existsReferenceOfThisReplacedEmployeeOnVacancy)).append("\n");
    sb.append("    newJobPosition: ").append(toIndentedString(newJobPosition)).append("\n");
    sb.append("    newWorkstation: ").append(toIndentedString(newWorkstation)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    newCompany: ").append(toIndentedString(newCompany)).append("\n");
    sb.append("    dismissed: ").append(toIndentedString(dismissed)).append("\n");
    sb.append("    newWorkshift: ").append(toIndentedString(newWorkshift)).append("\n");
    sb.append("    newCostCenter: ").append(toIndentedString(newCostCenter)).append("\n");
    sb.append("    workstationGroupName: ").append(toIndentedString(workstationGroupName)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    jobPositionName: ").append(toIndentedString(jobPositionName)).append("\n");
    sb.append("    existsReferenceOfThisReplacedEmployeeOnStaffRequisition: ").append(toIndentedString(existsReferenceOfThisReplacedEmployeeOnStaffRequisition)).append("\n");
    sb.append("    hasPositionInTheHierarchy: ").append(toIndentedString(hasPositionInTheHierarchy)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

