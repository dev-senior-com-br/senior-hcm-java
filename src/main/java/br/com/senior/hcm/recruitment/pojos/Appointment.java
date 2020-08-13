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
import br.com.senior.hcm.recruitment.pojos.BasicCandidateSummary;
import br.com.senior.hcm.recruitment.pojos.EmployeeSummary;
import br.com.senior.hcm.recruitment.pojos.ModelStage;
import br.com.senior.hcm.recruitment.pojos.Vacancy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * Appointment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-13T15:44:06.345Z")



public class Appointment {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("candidates")
  private List<BasicCandidateSummary> candidates = null;

  @SerializedName("site")
  private String site = null;

  @SerializedName("stage")
  private ModelStage stage = null;

  @SerializedName("startTime")
  private String startTime = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("endTime")
  private String endTime = null;

  @SerializedName("employees")
  private List<EmployeeSummary> employees = null;

  @SerializedName("vacancy")
  private Vacancy vacancy = null;

  @SerializedName("vacancyId")
  private String vacancyId = null;

  @SerializedName("stageId")
  private String stageId = null;

  public Appointment date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Data do compromisso.
   * @return date
  **/
  @ApiModelProperty(value = "Data do compromisso.")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Appointment subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Assunto do compromisso.
   * @return subject
  **/
  @ApiModelProperty(value = "Assunto do compromisso.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Appointment candidates(List<BasicCandidateSummary> candidates) {
    this.candidates = candidates;
    return this;
  }

  public Appointment addCandidatesItem(BasicCandidateSummary candidatesItem) {
    if (this.candidates == null) {
      this.candidates = new ArrayList<BasicCandidateSummary>();
    }
    this.candidates.add(candidatesItem);
    return this;
  }

   /**
   * Candidatos que participarão do compromisso.
   * @return candidates
  **/
  @ApiModelProperty(value = "Candidatos que participarão do compromisso.")
  public List<BasicCandidateSummary> getCandidates() {
    return candidates;
  }

  public void setCandidates(List<BasicCandidateSummary> candidates) {
    this.candidates = candidates;
  }

  public Appointment site(String site) {
    this.site = site;
    return this;
  }

   /**
   * Local do compromisso.
   * @return site
  **/
  @ApiModelProperty(value = "Local do compromisso.")
  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public Appointment stage(ModelStage stage) {
    this.stage = stage;
    return this;
  }

   /**
   * Get stage
   * @return stage
  **/
  @ApiModelProperty(value = "")
  public ModelStage getStage() {
    return stage;
  }

  public void setStage(ModelStage stage) {
    this.stage = stage;
  }

  public Appointment startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Horário de início do compromisso.
   * @return startTime
  **/
  @ApiModelProperty(value = "Horário de início do compromisso.")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public Appointment comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Comentário do compromisso.
   * @return comment
  **/
  @ApiModelProperty(value = "Comentário do compromisso.")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Appointment id(String id) {
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

  public Appointment endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Horário de término do compromisso.
   * @return endTime
  **/
  @ApiModelProperty(value = "Horário de término do compromisso.")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public Appointment employees(List<EmployeeSummary> employees) {
    this.employees = employees;
    return this;
  }

  public Appointment addEmployeesItem(EmployeeSummary employeesItem) {
    if (this.employees == null) {
      this.employees = new ArrayList<EmployeeSummary>();
    }
    this.employees.add(employeesItem);
    return this;
  }

   /**
   * Colaboradores que participarão do compromisso para ajudar a avaliar os candidatos.
   * @return employees
  **/
  @ApiModelProperty(value = "Colaboradores que participarão do compromisso para ajudar a avaliar os candidatos.")
  public List<EmployeeSummary> getEmployees() {
    return employees;
  }

  public void setEmployees(List<EmployeeSummary> employees) {
    this.employees = employees;
  }

  public Appointment vacancy(Vacancy vacancy) {
    this.vacancy = vacancy;
    return this;
  }

   /**
   * Get vacancy
   * @return vacancy
  **/
  @ApiModelProperty(value = "")
  public Vacancy getVacancy() {
    return vacancy;
  }

  public void setVacancy(Vacancy vacancy) {
    this.vacancy = vacancy;
  }

  public Appointment vacancyId(String vacancyId) {
    this.vacancyId = vacancyId;
    return this;
  }

   /**
   * Identificador único da vaga &amp;#9;do processo seletivo.
   * @return vacancyId
  **/
  @ApiModelProperty(value = "Identificador único da vaga &#9;do processo seletivo.")
  public String getVacancyId() {
    return vacancyId;
  }

  public void setVacancyId(String vacancyId) {
    this.vacancyId = vacancyId;
  }

  public Appointment stageId(String stageId) {
    this.stageId = stageId;
    return this;
  }

   /**
   * Identificador único da etapa do processo seletivo.
   * @return stageId
  **/
  @ApiModelProperty(value = "Identificador único da etapa do processo seletivo.")
  public String getStageId() {
    return stageId;
  }

  public void setStageId(String stageId) {
    this.stageId = stageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Appointment appointment = (Appointment) o;
    return Objects.equals(this.date, appointment.date) &&
        Objects.equals(this.subject, appointment.subject) &&
        Objects.equals(this.candidates, appointment.candidates) &&
        Objects.equals(this.site, appointment.site) &&
        Objects.equals(this.stage, appointment.stage) &&
        Objects.equals(this.startTime, appointment.startTime) &&
        Objects.equals(this.comment, appointment.comment) &&
        Objects.equals(this.id, appointment.id) &&
        Objects.equals(this.endTime, appointment.endTime) &&
        Objects.equals(this.employees, appointment.employees) &&
        Objects.equals(this.vacancy, appointment.vacancy) &&
        Objects.equals(this.vacancyId, appointment.vacancyId) &&
        Objects.equals(this.stageId, appointment.stageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, subject, candidates, site, stage, startTime, comment, id, endTime, employees, vacancy, vacancyId, stageId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Appointment {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    candidates: ").append(toIndentedString(candidates)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
    sb.append("    vacancy: ").append(toIndentedString(vacancy)).append("\n");
    sb.append("    vacancyId: ").append(toIndentedString(vacancyId)).append("\n");
    sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
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

