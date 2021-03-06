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
import br.com.senior.hcm.recruitment.pojos.CostCenter;
import br.com.senior.hcm.recruitment.pojos.Department;
import br.com.senior.hcm.recruitment.pojos.JobPosition;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WorkstationGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-10T16:52:01.386Z")



public class WorkstationGroup {
  @SerializedName("branchOffice")
  private Company branchOffice = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("costCenterId")
  private String costCenterId = null;

  @SerializedName("headOfficeId")
  private String headOfficeId = null;

  @SerializedName("costCenter")
  private CostCenter costCenter = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("jobPositions")
  private List<JobPosition> jobPositions = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("branchOfficeId")
  private String branchOfficeId = null;

  @SerializedName("department")
  private Department department = null;

  @SerializedName("departamentId")
  private String departamentId = null;

  public WorkstationGroup branchOffice(Company branchOffice) {
    this.branchOffice = branchOffice;
    return this;
  }

   /**
   * Get branchOffice
   * @return branchOffice
  **/
  @ApiModelProperty(value = "")
  public Company getBranchOffice() {
    return branchOffice;
  }

  public void setBranchOffice(Company branchOffice) {
    this.branchOffice = branchOffice;
  }

  public WorkstationGroup code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Código do posto.
   * @return code
  **/
  @ApiModelProperty(value = "Código do posto.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public WorkstationGroup costCenterId(String costCenterId) {
    this.costCenterId = costCenterId;
    return this;
  }

   /**
   * Centro de custo que compõe o grupo de posto de trabalho.
   * @return costCenterId
  **/
  @ApiModelProperty(value = "Centro de custo que compõe o grupo de posto de trabalho.")
  public String getCostCenterId() {
    return costCenterId;
  }

  public void setCostCenterId(String costCenterId) {
    this.costCenterId = costCenterId;
  }

  public WorkstationGroup headOfficeId(String headOfficeId) {
    this.headOfficeId = headOfficeId;
    return this;
  }

   /**
   * Identificador da matriz do posto de trabalho.
   * @return headOfficeId
  **/
  @ApiModelProperty(value = "Identificador da matriz do posto de trabalho.")
  public String getHeadOfficeId() {
    return headOfficeId;
  }

  public void setHeadOfficeId(String headOfficeId) {
    this.headOfficeId = headOfficeId;
  }

  public WorkstationGroup costCenter(CostCenter costCenter) {
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

  public WorkstationGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome do grupo de postos de trabalho.
   * @return name
  **/
  @ApiModelProperty(value = "Nome do grupo de postos de trabalho.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkstationGroup jobPositions(List<JobPosition> jobPositions) {
    this.jobPositions = jobPositions;
    return this;
  }

  public WorkstationGroup addJobPositionsItem(JobPosition jobPositionsItem) {
    if (this.jobPositions == null) {
      this.jobPositions = new ArrayList<JobPosition>();
    }
    this.jobPositions.add(jobPositionsItem);
    return this;
  }

   /**
   * Lista de postos de trabalho.
   * @return jobPositions
  **/
  @ApiModelProperty(value = "Lista de postos de trabalho.")
  public List<JobPosition> getJobPositions() {
    return jobPositions;
  }

  public void setJobPositions(List<JobPosition> jobPositions) {
    this.jobPositions = jobPositions;
  }

  public WorkstationGroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identificador único que representa o posto de trabalho.
   * @return id
  **/
  @ApiModelProperty(value = "Identificador único que representa o posto de trabalho.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WorkstationGroup branchOfficeId(String branchOfficeId) {
    this.branchOfficeId = branchOfficeId;
    return this;
  }

   /**
   * Identificador da filial do posto de trabalho.
   * @return branchOfficeId
  **/
  @ApiModelProperty(value = "Identificador da filial do posto de trabalho.")
  public String getBranchOfficeId() {
    return branchOfficeId;
  }

  public void setBranchOfficeId(String branchOfficeId) {
    this.branchOfficeId = branchOfficeId;
  }

  public WorkstationGroup department(Department department) {
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @ApiModelProperty(value = "")
  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public WorkstationGroup departamentId(String departamentId) {
    this.departamentId = departamentId;
    return this;
  }

   /**
   * Identificador do departamento a qual o grupo de postos de trabalho está associado.
   * @return departamentId
  **/
  @ApiModelProperty(value = "Identificador do departamento a qual o grupo de postos de trabalho está associado.")
  public String getDepartamentId() {
    return departamentId;
  }

  public void setDepartamentId(String departamentId) {
    this.departamentId = departamentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkstationGroup workstationGroup = (WorkstationGroup) o;
    return Objects.equals(this.branchOffice, workstationGroup.branchOffice) &&
        Objects.equals(this.code, workstationGroup.code) &&
        Objects.equals(this.costCenterId, workstationGroup.costCenterId) &&
        Objects.equals(this.headOfficeId, workstationGroup.headOfficeId) &&
        Objects.equals(this.costCenter, workstationGroup.costCenter) &&
        Objects.equals(this.name, workstationGroup.name) &&
        Objects.equals(this.jobPositions, workstationGroup.jobPositions) &&
        Objects.equals(this.id, workstationGroup.id) &&
        Objects.equals(this.branchOfficeId, workstationGroup.branchOfficeId) &&
        Objects.equals(this.department, workstationGroup.department) &&
        Objects.equals(this.departamentId, workstationGroup.departamentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchOffice, code, costCenterId, headOfficeId, costCenter, name, jobPositions, id, branchOfficeId, department, departamentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkstationGroup {\n");
    
    sb.append("    branchOffice: ").append(toIndentedString(branchOffice)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    costCenterId: ").append(toIndentedString(costCenterId)).append("\n");
    sb.append("    headOfficeId: ").append(toIndentedString(headOfficeId)).append("\n");
    sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    jobPositions: ").append(toIndentedString(jobPositions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    branchOfficeId: ").append(toIndentedString(branchOfficeId)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    departamentId: ").append(toIndentedString(departamentId)).append("\n");
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

