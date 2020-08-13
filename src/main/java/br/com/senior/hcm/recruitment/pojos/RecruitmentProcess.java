/*
 * Recrutamento e Seleção
 * Serviço do Gestão de Recrutamento e Seleção.
 *
 * OpenAPI spec version: develop-SNAPSHOT
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
import io.swagger.client.model.RecruitmentProcessEmployee;
import io.swagger.client.model.RecruitmentProcessHistoryStatus;
import io.swagger.client.model.RecruitmentProcessResume;
import io.swagger.client.model.RecruitmentProcessVacancy;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Processo seletivo do candidato.
 */
@ApiModel(description = "Processo seletivo do candidato.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-13T11:29:04.266Z")



public class RecruitmentProcess {
  @SerializedName("resume")
  private RecruitmentProcessResume resume = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("resumeId")
  private String resumeId = null;

  @SerializedName("employeeId")
  private String employeeId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("justification")
  private String justification = null;

  @SerializedName("employee")
  private RecruitmentProcessEmployee employee = null;

  @SerializedName("vacancy")
  private RecruitmentProcessVacancy vacancy = null;

  @SerializedName("vacancyId")
  private String vacancyId = null;

  @SerializedName("updatedAt")
  private OffsetDateTime updatedAt = null;

  @SerializedName("status")
  private RecruitmentProcessHistoryStatus status = null;

  public RecruitmentProcess resume(RecruitmentProcessResume resume) {
    this.resume = resume;
    return this;
  }

   /**
   * Get resume
   * @return resume
  **/
  @ApiModelProperty(value = "")
  public RecruitmentProcessResume getResume() {
    return resume;
  }

  public void setResume(RecruitmentProcessResume resume) {
    this.resume = resume;
  }

  public RecruitmentProcess createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Data e hora da criação da candidatura.
   * @return createdAt
  **/
  @ApiModelProperty(value = "Data e hora da criação da candidatura.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public RecruitmentProcess resumeId(String resumeId) {
    this.resumeId = resumeId;
    return this;
  }

   /**
   * Identificador único do candidato externo.
   * @return resumeId
  **/
  @ApiModelProperty(value = "Identificador único do candidato externo.")
  public String getResumeId() {
    return resumeId;
  }

  public void setResumeId(String resumeId) {
    this.resumeId = resumeId;
  }

  public RecruitmentProcess employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Identificador único do colaborador.
   * @return employeeId
  **/
  @ApiModelProperty(value = "Identificador único do colaborador.")
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public RecruitmentProcess id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identificador único da entidade.
   * @return id
  **/
  @ApiModelProperty(value = "Identificador único da entidade.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RecruitmentProcess justification(String justification) {
    this.justification = justification;
    return this;
  }

   /**
   * Justificativa para a reprovação/remoção do candidato no processo seletivo em questão (Se for o caso).
   * @return justification
  **/
  @ApiModelProperty(value = "Justificativa para a reprovação/remoção do candidato no processo seletivo em questão (Se for o caso).")
  public String getJustification() {
    return justification;
  }

  public void setJustification(String justification) {
    this.justification = justification;
  }

  public RecruitmentProcess employee(RecruitmentProcessEmployee employee) {
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @ApiModelProperty(value = "")
  public RecruitmentProcessEmployee getEmployee() {
    return employee;
  }

  public void setEmployee(RecruitmentProcessEmployee employee) {
    this.employee = employee;
  }

  public RecruitmentProcess vacancy(RecruitmentProcessVacancy vacancy) {
    this.vacancy = vacancy;
    return this;
  }

   /**
   * Get vacancy
   * @return vacancy
  **/
  @ApiModelProperty(value = "")
  public RecruitmentProcessVacancy getVacancy() {
    return vacancy;
  }

  public void setVacancy(RecruitmentProcessVacancy vacancy) {
    this.vacancy = vacancy;
  }

  public RecruitmentProcess vacancyId(String vacancyId) {
    this.vacancyId = vacancyId;
    return this;
  }

   /**
   * Identificador único da vaga.
   * @return vacancyId
  **/
  @ApiModelProperty(value = "Identificador único da vaga.")
  public String getVacancyId() {
    return vacancyId;
  }

  public void setVacancyId(String vacancyId) {
    this.vacancyId = vacancyId;
  }

  public RecruitmentProcess updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Data e hora da última alteração na candidatura.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "Data e hora da última alteração na candidatura.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public RecruitmentProcess status(RecruitmentProcessHistoryStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public RecruitmentProcessHistoryStatus getStatus() {
    return status;
  }

  public void setStatus(RecruitmentProcessHistoryStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecruitmentProcess recruitmentProcess = (RecruitmentProcess) o;
    return Objects.equals(this.resume, recruitmentProcess.resume) &&
        Objects.equals(this.createdAt, recruitmentProcess.createdAt) &&
        Objects.equals(this.resumeId, recruitmentProcess.resumeId) &&
        Objects.equals(this.employeeId, recruitmentProcess.employeeId) &&
        Objects.equals(this.id, recruitmentProcess.id) &&
        Objects.equals(this.justification, recruitmentProcess.justification) &&
        Objects.equals(this.employee, recruitmentProcess.employee) &&
        Objects.equals(this.vacancy, recruitmentProcess.vacancy) &&
        Objects.equals(this.vacancyId, recruitmentProcess.vacancyId) &&
        Objects.equals(this.updatedAt, recruitmentProcess.updatedAt) &&
        Objects.equals(this.status, recruitmentProcess.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resume, createdAt, resumeId, employeeId, id, justification, employee, vacancy, vacancyId, updatedAt, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecruitmentProcess {\n");
    
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    resumeId: ").append(toIndentedString(resumeId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    justification: ").append(toIndentedString(justification)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    vacancy: ").append(toIndentedString(vacancy)).append("\n");
    sb.append("    vacancyId: ").append(toIndentedString(vacancyId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

