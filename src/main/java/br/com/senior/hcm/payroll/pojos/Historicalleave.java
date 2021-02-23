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
import br.com.senior.hcm.payroll.pojos.Attachment;
import br.com.senior.hcm.payroll.pojos.Attendant;
import br.com.senior.hcm.payroll.pojos.ClassOrganType;
import br.com.senior.hcm.payroll.pojos.Disease;
import br.com.senior.hcm.payroll.pojos.Employee;
import br.com.senior.hcm.payroll.pojos.MovimentationRaisType;
import br.com.senior.hcm.payroll.pojos.State;
import br.com.senior.hcm.payroll.pojos.SubgroupDisease;
import br.com.senior.hcm.payroll.pojos.Timetrackingsituation;
import br.com.senior.hcm.payroll.pojos.WorkAccidentType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * Historicalleave
 */

public class Historicalleave {
  @SerializedName("attachments")
  private List<Attachment> attachments = null;

  @SerializedName("classOrganType")
  private ClassOrganType classOrganType = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  @SerializedName("timetrackingsituation")
  private Timetrackingsituation timetrackingsituation = null;

  @SerializedName("employee")
  private Employee employee = null;

  @SerializedName("startdate")
  private OffsetDateTime startdate = null;

  @SerializedName("pregnancyConfirmation")
  private LocalDate pregnancyConfirmation = null;

  @SerializedName("estimatedenddate")
  private LocalDate estimatedenddate = null;

  @SerializedName("attendant")
  private Attendant attendant = null;

  @SerializedName("medicalDecisionDate")
  private LocalDate medicalDecisionDate = null;

  @SerializedName("returnExamination")
  private Boolean returnExamination = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("workAccidentType")
  private WorkAccidentType workAccidentType = null;

  @SerializedName("subgroupDisease")
  private SubgroupDisease subgroupDisease = null;

  @SerializedName("initialSituation")
  private Timetrackingsituation initialSituation = null;

  @SerializedName("professionalCouncilState")
  private String professionalCouncilState = null;

  @SerializedName("attendantState")
  private State attendantState = null;

  @SerializedName("disease")
  private Disease disease = null;

  @SerializedName("nexusHazard")
  private Boolean nexusHazard = null;

  @SerializedName("recordCouncil")
  private String recordCouncil = null;

  @SerializedName("observation")
  private String observation = null;

  @SerializedName("externalId")
  private String externalId = null;

  @SerializedName("isIntegration")
  private Boolean isIntegration = null;

  @SerializedName("attendantName")
  private String attendantName = null;

  @SerializedName("birthDate")
  private LocalDate birthDate = null;

  @SerializedName("justifiedDays")
  private Integer justifiedDays = null;

  @SerializedName("enddate")
  private OffsetDateTime enddate = null;

  @SerializedName("nexusStartDate")
  private LocalDate nexusStartDate = null;

  @SerializedName("startDate")
  private OffsetDateTime startDate = null;

  @SerializedName("movimentationRaisType")
  private MovimentationRaisType movimentationRaisType = null;

  public Historicalleave attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public Historicalleave addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Anexo
   * @return attachments
  **/
  @ApiModelProperty(value = "Anexo")
  public List<Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  public Historicalleave classOrganType(ClassOrganType classOrganType) {
    this.classOrganType = classOrganType;
    return this;
  }

   /**
   * Get classOrganType
   * @return classOrganType
  **/
  @ApiModelProperty(value = "")
  public ClassOrganType getClassOrganType() {
    return classOrganType;
  }

  public void setClassOrganType(ClassOrganType classOrganType) {
    this.classOrganType = classOrganType;
  }

  public Historicalleave endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Término do afastamento(Sem timezone)
   * @return endDate
  **/
  @ApiModelProperty(value = "Término do afastamento(Sem timezone)")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public Historicalleave timetrackingsituation(Timetrackingsituation timetrackingsituation) {
    this.timetrackingsituation = timetrackingsituation;
    return this;
  }

   /**
   * Get timetrackingsituation
   * @return timetrackingsituation
  **/
  @ApiModelProperty(required = true, value = "")
  public Timetrackingsituation getTimetrackingsituation() {
    return timetrackingsituation;
  }

  public void setTimetrackingsituation(Timetrackingsituation timetrackingsituation) {
    this.timetrackingsituation = timetrackingsituation;
  }

  public Historicalleave employee(Employee employee) {
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

  public Historicalleave startdate(OffsetDateTime startdate) {
    this.startdate = startdate;
    return this;
  }

   /**
   * Início do afastamento(Com timezone)
   * @return startdate
  **/
  @ApiModelProperty(required = true, value = "Início do afastamento(Com timezone)")
  public OffsetDateTime getStartdate() {
    return startdate;
  }

  public void setStartdate(OffsetDateTime startdate) {
    this.startdate = startdate;
  }

  public Historicalleave pregnancyConfirmation(LocalDate pregnancyConfirmation) {
    this.pregnancyConfirmation = pregnancyConfirmation;
    return this;
  }

   /**
   * Confirmação da gravidez
   * @return pregnancyConfirmation
  **/
  @ApiModelProperty(value = "Confirmação da gravidez")
  public LocalDate getPregnancyConfirmation() {
    return pregnancyConfirmation;
  }

  public void setPregnancyConfirmation(LocalDate pregnancyConfirmation) {
    this.pregnancyConfirmation = pregnancyConfirmation;
  }

  public Historicalleave estimatedenddate(LocalDate estimatedenddate) {
    this.estimatedenddate = estimatedenddate;
    return this;
  }

   /**
   * Data prevista de término do afastamento
   * @return estimatedenddate
  **/
  @ApiModelProperty(value = "Data prevista de término do afastamento")
  public LocalDate getEstimatedenddate() {
    return estimatedenddate;
  }

  public void setEstimatedenddate(LocalDate estimatedenddate) {
    this.estimatedenddate = estimatedenddate;
  }

  public Historicalleave attendant(Attendant attendant) {
    this.attendant = attendant;
    return this;
  }

   /**
   * Get attendant
   * @return attendant
  **/
  @ApiModelProperty(value = "")
  public Attendant getAttendant() {
    return attendant;
  }

  public void setAttendant(Attendant attendant) {
    this.attendant = attendant;
  }

  public Historicalleave medicalDecisionDate(LocalDate medicalDecisionDate) {
    this.medicalDecisionDate = medicalDecisionDate;
    return this;
  }

   /**
   * Decisão da perícia
   * @return medicalDecisionDate
  **/
  @ApiModelProperty(value = "Decisão da perícia")
  public LocalDate getMedicalDecisionDate() {
    return medicalDecisionDate;
  }

  public void setMedicalDecisionDate(LocalDate medicalDecisionDate) {
    this.medicalDecisionDate = medicalDecisionDate;
  }

  public Historicalleave returnExamination(Boolean returnExamination) {
    this.returnExamination = returnExamination;
    return this;
  }

   /**
   * Exame de retorno
   * @return returnExamination
  **/
  @ApiModelProperty(value = "Exame de retorno")
  public Boolean isReturnExamination() {
    return returnExamination;
  }

  public void setReturnExamination(Boolean returnExamination) {
    this.returnExamination = returnExamination;
  }

  public Historicalleave id(String id) {
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

  public Historicalleave workAccidentType(WorkAccidentType workAccidentType) {
    this.workAccidentType = workAccidentType;
    return this;
  }

   /**
   * Get workAccidentType
   * @return workAccidentType
  **/
  @ApiModelProperty(value = "")
  public WorkAccidentType getWorkAccidentType() {
    return workAccidentType;
  }

  public void setWorkAccidentType(WorkAccidentType workAccidentType) {
    this.workAccidentType = workAccidentType;
  }

  public Historicalleave subgroupDisease(SubgroupDisease subgroupDisease) {
    this.subgroupDisease = subgroupDisease;
    return this;
  }

   /**
   * Get subgroupDisease
   * @return subgroupDisease
  **/
  @ApiModelProperty(value = "")
  public SubgroupDisease getSubgroupDisease() {
    return subgroupDisease;
  }

  public void setSubgroupDisease(SubgroupDisease subgroupDisease) {
    this.subgroupDisease = subgroupDisease;
  }

  public Historicalleave initialSituation(Timetrackingsituation initialSituation) {
    this.initialSituation = initialSituation;
    return this;
  }

   /**
   * Get initialSituation
   * @return initialSituation
  **/
  @ApiModelProperty(value = "")
  public Timetrackingsituation getInitialSituation() {
    return initialSituation;
  }

  public void setInitialSituation(Timetrackingsituation initialSituation) {
    this.initialSituation = initialSituation;
  }

  public Historicalleave professionalCouncilState(String professionalCouncilState) {
    this.professionalCouncilState = professionalCouncilState;
    return this;
  }

   /**
   * UF do Conselho Profissional
   * @return professionalCouncilState
  **/
  @ApiModelProperty(value = "UF do Conselho Profissional")
  public String getProfessionalCouncilState() {
    return professionalCouncilState;
  }

  public void setProfessionalCouncilState(String professionalCouncilState) {
    this.professionalCouncilState = professionalCouncilState;
  }

  public Historicalleave attendantState(State attendantState) {
    this.attendantState = attendantState;
    return this;
  }

   /**
   * Get attendantState
   * @return attendantState
  **/
  @ApiModelProperty(value = "")
  public State getAttendantState() {
    return attendantState;
  }

  public void setAttendantState(State attendantState) {
    this.attendantState = attendantState;
  }

  public Historicalleave disease(Disease disease) {
    this.disease = disease;
    return this;
  }

   /**
   * Get disease
   * @return disease
  **/
  @ApiModelProperty(value = "")
  public Disease getDisease() {
    return disease;
  }

  public void setDisease(Disease disease) {
    this.disease = disease;
  }

  public Historicalleave nexusHazard(Boolean nexusHazard) {
    this.nexusHazard = nexusHazard;
    return this;
  }

   /**
   * Risco nexo
   * @return nexusHazard
  **/
  @ApiModelProperty(value = "Risco nexo")
  public Boolean isNexusHazard() {
    return nexusHazard;
  }

  public void setNexusHazard(Boolean nexusHazard) {
    this.nexusHazard = nexusHazard;
  }

  public Historicalleave recordCouncil(String recordCouncil) {
    this.recordCouncil = recordCouncil;
    return this;
  }

   /**
   * Registro do conselho profissional
   * @return recordCouncil
  **/
  @ApiModelProperty(value = "Registro do conselho profissional")
  public String getRecordCouncil() {
    return recordCouncil;
  }

  public void setRecordCouncil(String recordCouncil) {
    this.recordCouncil = recordCouncil;
  }

  public Historicalleave observation(String observation) {
    this.observation = observation;
    return this;
  }

   /**
   * Observação do afastamento
   * @return observation
  **/
  @ApiModelProperty(value = "Observação do afastamento")
  public String getObservation() {
    return observation;
  }

  public void setObservation(String observation) {
    this.observation = observation;
  }

  public Historicalleave externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Id externo
   * @return externalId
  **/
  @ApiModelProperty(value = "Id externo")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public Historicalleave isIntegration(Boolean isIntegration) {
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

  public Historicalleave attendantName(String attendantName) {
    this.attendantName = attendantName;
    return this;
  }

   /**
   * Nome do atendente
   * @return attendantName
  **/
  @ApiModelProperty(value = "Nome do atendente")
  public String getAttendantName() {
    return attendantName;
  }

  public void setAttendantName(String attendantName) {
    this.attendantName = attendantName;
  }

  public Historicalleave birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

   /**
   * Data do parto
   * @return birthDate
  **/
  @ApiModelProperty(value = "Data do parto")
  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public Historicalleave justifiedDays(Integer justifiedDays) {
    this.justifiedDays = justifiedDays;
    return this;
  }

   /**
   * Dias justificados
   * @return justifiedDays
  **/
  @ApiModelProperty(value = "Dias justificados")
  public Integer getJustifiedDays() {
    return justifiedDays;
  }

  public void setJustifiedDays(Integer justifiedDays) {
    this.justifiedDays = justifiedDays;
  }

  public Historicalleave enddate(OffsetDateTime enddate) {
    this.enddate = enddate;
    return this;
  }

   /**
   * Término do afastamento(Com timezone)
   * @return enddate
  **/
  @ApiModelProperty(value = "Término do afastamento(Com timezone)")
  public OffsetDateTime getEnddate() {
    return enddate;
  }

  public void setEnddate(OffsetDateTime enddate) {
    this.enddate = enddate;
  }

  public Historicalleave nexusStartDate(LocalDate nexusStartDate) {
    this.nexusStartDate = nexusStartDate;
    return this;
  }

   /**
   * Início do nexo
   * @return nexusStartDate
  **/
  @ApiModelProperty(value = "Início do nexo")
  public LocalDate getNexusStartDate() {
    return nexusStartDate;
  }

  public void setNexusStartDate(LocalDate nexusStartDate) {
    this.nexusStartDate = nexusStartDate;
  }

  public Historicalleave startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Início do afastamento(Sem timezone)
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "Início do afastamento(Sem timezone)")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Historicalleave movimentationRaisType(MovimentationRaisType movimentationRaisType) {
    this.movimentationRaisType = movimentationRaisType;
    return this;
  }

   /**
   * Get movimentationRaisType
   * @return movimentationRaisType
  **/
  @ApiModelProperty(value = "")
  public MovimentationRaisType getMovimentationRaisType() {
    return movimentationRaisType;
  }

  public void setMovimentationRaisType(MovimentationRaisType movimentationRaisType) {
    this.movimentationRaisType = movimentationRaisType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Historicalleave historicalleave = (Historicalleave) o;
    return Objects.equals(this.attachments, historicalleave.attachments) &&
        Objects.equals(this.classOrganType, historicalleave.classOrganType) &&
        Objects.equals(this.endDate, historicalleave.endDate) &&
        Objects.equals(this.timetrackingsituation, historicalleave.timetrackingsituation) &&
        Objects.equals(this.employee, historicalleave.employee) &&
        Objects.equals(this.startdate, historicalleave.startdate) &&
        Objects.equals(this.pregnancyConfirmation, historicalleave.pregnancyConfirmation) &&
        Objects.equals(this.estimatedenddate, historicalleave.estimatedenddate) &&
        Objects.equals(this.attendant, historicalleave.attendant) &&
        Objects.equals(this.medicalDecisionDate, historicalleave.medicalDecisionDate) &&
        Objects.equals(this.returnExamination, historicalleave.returnExamination) &&
        Objects.equals(this.id, historicalleave.id) &&
        Objects.equals(this.workAccidentType, historicalleave.workAccidentType) &&
        Objects.equals(this.subgroupDisease, historicalleave.subgroupDisease) &&
        Objects.equals(this.initialSituation, historicalleave.initialSituation) &&
        Objects.equals(this.professionalCouncilState, historicalleave.professionalCouncilState) &&
        Objects.equals(this.attendantState, historicalleave.attendantState) &&
        Objects.equals(this.disease, historicalleave.disease) &&
        Objects.equals(this.nexusHazard, historicalleave.nexusHazard) &&
        Objects.equals(this.recordCouncil, historicalleave.recordCouncil) &&
        Objects.equals(this.observation, historicalleave.observation) &&
        Objects.equals(this.externalId, historicalleave.externalId) &&
        Objects.equals(this.isIntegration, historicalleave.isIntegration) &&
        Objects.equals(this.attendantName, historicalleave.attendantName) &&
        Objects.equals(this.birthDate, historicalleave.birthDate) &&
        Objects.equals(this.justifiedDays, historicalleave.justifiedDays) &&
        Objects.equals(this.enddate, historicalleave.enddate) &&
        Objects.equals(this.nexusStartDate, historicalleave.nexusStartDate) &&
        Objects.equals(this.startDate, historicalleave.startDate) &&
        Objects.equals(this.movimentationRaisType, historicalleave.movimentationRaisType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, classOrganType, endDate, timetrackingsituation, employee, startdate, pregnancyConfirmation, estimatedenddate, attendant, medicalDecisionDate, returnExamination, id, workAccidentType, subgroupDisease, initialSituation, professionalCouncilState, attendantState, disease, nexusHazard, recordCouncil, observation, externalId, isIntegration, attendantName, birthDate, justifiedDays, enddate, nexusStartDate, startDate, movimentationRaisType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Historicalleave {\n");
    
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    classOrganType: ").append(toIndentedString(classOrganType)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    timetrackingsituation: ").append(toIndentedString(timetrackingsituation)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    startdate: ").append(toIndentedString(startdate)).append("\n");
    sb.append("    pregnancyConfirmation: ").append(toIndentedString(pregnancyConfirmation)).append("\n");
    sb.append("    estimatedenddate: ").append(toIndentedString(estimatedenddate)).append("\n");
    sb.append("    attendant: ").append(toIndentedString(attendant)).append("\n");
    sb.append("    medicalDecisionDate: ").append(toIndentedString(medicalDecisionDate)).append("\n");
    sb.append("    returnExamination: ").append(toIndentedString(returnExamination)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workAccidentType: ").append(toIndentedString(workAccidentType)).append("\n");
    sb.append("    subgroupDisease: ").append(toIndentedString(subgroupDisease)).append("\n");
    sb.append("    initialSituation: ").append(toIndentedString(initialSituation)).append("\n");
    sb.append("    professionalCouncilState: ").append(toIndentedString(professionalCouncilState)).append("\n");
    sb.append("    attendantState: ").append(toIndentedString(attendantState)).append("\n");
    sb.append("    disease: ").append(toIndentedString(disease)).append("\n");
    sb.append("    nexusHazard: ").append(toIndentedString(nexusHazard)).append("\n");
    sb.append("    recordCouncil: ").append(toIndentedString(recordCouncil)).append("\n");
    sb.append("    observation: ").append(toIndentedString(observation)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    isIntegration: ").append(toIndentedString(isIntegration)).append("\n");
    sb.append("    attendantName: ").append(toIndentedString(attendantName)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    justifiedDays: ").append(toIndentedString(justifiedDays)).append("\n");
    sb.append("    enddate: ").append(toIndentedString(enddate)).append("\n");
    sb.append("    nexusStartDate: ").append(toIndentedString(nexusStartDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    movimentationRaisType: ").append(toIndentedString(movimentationRaisType)).append("\n");
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

