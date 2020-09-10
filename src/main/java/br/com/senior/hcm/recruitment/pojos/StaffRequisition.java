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
import br.com.senior.hcm.recruitment.pojos.ContractTypeDto;
import br.com.senior.hcm.recruitment.pojos.CostCenter;
import br.com.senior.hcm.recruitment.pojos.Department;
import br.com.senior.hcm.recruitment.pojos.EmployeeSummary;
import br.com.senior.hcm.recruitment.pojos.EmploymentContractDto;
import br.com.senior.hcm.recruitment.pojos.JobPosition;
import br.com.senior.hcm.recruitment.pojos.ProcessTypeDto;
import br.com.senior.hcm.recruitment.pojos.SequenceStaffrequisitionVacancy;
import br.com.senior.hcm.recruitment.pojos.StaffRequisitionStatusDto;
import br.com.senior.hcm.recruitment.pojos.WorkShift;
import br.com.senior.hcm.recruitment.pojos.WorkstationGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * StaffRequisition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-10T16:52:01.386Z")



public class StaffRequisition {
  @SerializedName("reason")
  private ProcessTypeDto reason = null;

  @SerializedName("finalizationComment")
  private String finalizationComment = null;

  @SerializedName("workstationGroup")
  private WorkstationGroup workstationGroup = null;

  @SerializedName("employmentContract")
  private EmploymentContractDto employmentContract = null;

  @SerializedName("keywords")
  private List<String> keywords = null;

  @SerializedName("contractType")
  private ContractTypeDto contractType = null;

  @SerializedName("departmentId")
  private String departmentId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("disapprovalJustification")
  private String disapprovalJustification = null;

  @SerializedName("keywordCompetencySession")
  private Boolean keywordCompetencySession = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("costCenterId")
  private String costCenterId = null;

  @SerializedName("keywordProfessionalExperienceSession")
  private Boolean keywordProfessionalExperienceSession = null;

  @SerializedName("company")
  private Company company = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("justification")
  private String justification = null;

  @SerializedName("department")
  private Department department = null;

  @SerializedName("keywordEducationSession")
  private Boolean keywordEducationSession = null;

  @SerializedName("requester")
  private EmployeeSummary requester = null;

  @SerializedName("workShift")
  private WorkShift workShift = null;

  @SerializedName("finalizationAttachmentId")
  private String finalizationAttachmentId = null;

  @SerializedName("startSalaryRange")
  private String startSalaryRange = null;

  @SerializedName("admissionDate")
  private LocalDate admissionDate = null;

  @SerializedName("workstationGroupId")
  private String workstationGroupId = null;

  @SerializedName("requesterId")
  private String requesterId = null;

  @SerializedName("costCenter")
  private CostCenter costCenter = null;

  @SerializedName("createdByVacancyManagement")
  private Boolean createdByVacancyManagement = null;

  @SerializedName("keywordPositionSoughtSession")
  private Boolean keywordPositionSoughtSession = null;

  @SerializedName("positions")
  private Integer positions = null;

  @SerializedName("replacedEmployeeId")
  private String replacedEmployeeId = null;

  @SerializedName("keywordTrajectorySession")
  private Boolean keywordTrajectorySession = null;

  @SerializedName("jobPosition")
  private JobPosition jobPosition = null;

  @SerializedName("keywordLanguageSession")
  private Boolean keywordLanguageSession = null;

  @SerializedName("companyId")
  private String companyId = null;

  @SerializedName("sequenceStaffrequisitionVacancyId")
  private String sequenceStaffrequisitionVacancyId = null;

  @SerializedName("endSalaryRange")
  private String endSalaryRange = null;

  @SerializedName("jobPositionId")
  private String jobPositionId = null;

  @SerializedName("sequenceStaffrequisitionVacancy")
  private SequenceStaffrequisitionVacancy sequenceStaffrequisitionVacancy = null;

  @SerializedName("replacedEmployee")
  private EmployeeSummary replacedEmployee = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("status")
  private StaffRequisitionStatusDto status = null;

  @SerializedName("workShiftId")
  private String workShiftId = null;

  public StaffRequisition reason(ProcessTypeDto reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public ProcessTypeDto getReason() {
    return reason;
  }

  public void setReason(ProcessTypeDto reason) {
    this.reason = reason;
  }

  public StaffRequisition finalizationComment(String finalizationComment) {
    this.finalizationComment = finalizationComment;
    return this;
  }

   /**
   * Justificativa do cancelamento da RP.
   * @return finalizationComment
  **/
  @ApiModelProperty(value = "Justificativa do cancelamento da RP.")
  public String getFinalizationComment() {
    return finalizationComment;
  }

  public void setFinalizationComment(String finalizationComment) {
    this.finalizationComment = finalizationComment;
  }

  public StaffRequisition workstationGroup(WorkstationGroup workstationGroup) {
    this.workstationGroup = workstationGroup;
    return this;
  }

   /**
   * Get workstationGroup
   * @return workstationGroup
  **/
  @ApiModelProperty(value = "")
  public WorkstationGroup getWorkstationGroup() {
    return workstationGroup;
  }

  public void setWorkstationGroup(WorkstationGroup workstationGroup) {
    this.workstationGroup = workstationGroup;
  }

  public StaffRequisition employmentContract(EmploymentContractDto employmentContract) {
    this.employmentContract = employmentContract;
    return this;
  }

   /**
   * Get employmentContract
   * @return employmentContract
  **/
  @ApiModelProperty(value = "")
  public EmploymentContractDto getEmploymentContract() {
    return employmentContract;
  }

  public void setEmploymentContract(EmploymentContractDto employmentContract) {
    this.employmentContract = employmentContract;
  }

  public StaffRequisition keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public StaffRequisition addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<String>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Palavras chaves para o cálculo da aderência.
   * @return keywords
  **/
  @ApiModelProperty(value = "Palavras chaves para o cálculo da aderência.")
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public StaffRequisition contractType(ContractTypeDto contractType) {
    this.contractType = contractType;
    return this;
  }

   /**
   * Get contractType
   * @return contractType
  **/
  @ApiModelProperty(value = "")
  public ContractTypeDto getContractType() {
    return contractType;
  }

  public void setContractType(ContractTypeDto contractType) {
    this.contractType = contractType;
  }

  public StaffRequisition departmentId(String departmentId) {
    this.departmentId = departmentId;
    return this;
  }

   /**
   * Identificador do departamento.
   * @return departmentId
  **/
  @ApiModelProperty(value = "Identificador do departamento.")
  public String getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public StaffRequisition description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Descrição da vaga.
   * @return description
  **/
  @ApiModelProperty(value = "Descrição da vaga.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StaffRequisition disapprovalJustification(String disapprovalJustification) {
    this.disapprovalJustification = disapprovalJustification;
    return this;
  }

   /**
   * Justificativa da reprovação da RP.
   * @return disapprovalJustification
  **/
  @ApiModelProperty(value = "Justificativa da reprovação da RP.")
  public String getDisapprovalJustification() {
    return disapprovalJustification;
  }

  public void setDisapprovalJustification(String disapprovalJustification) {
    this.disapprovalJustification = disapprovalJustification;
  }

  public StaffRequisition keywordCompetencySession(Boolean keywordCompetencySession) {
    this.keywordCompetencySession = keywordCompetencySession;
    return this;
  }

   /**
   * Seção de conhecimentos e habilidades (aderência).
   * @return keywordCompetencySession
  **/
  @ApiModelProperty(value = "Seção de conhecimentos e habilidades (aderência).")
  public Boolean isKeywordCompetencySession() {
    return keywordCompetencySession;
  }

  public void setKeywordCompetencySession(Boolean keywordCompetencySession) {
    this.keywordCompetencySession = keywordCompetencySession;
  }

  public StaffRequisition createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Data de criação da requisição de pessoal.
   * @return createdAt
  **/
  @ApiModelProperty(value = "Data de criação da requisição de pessoal.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public StaffRequisition costCenterId(String costCenterId) {
    this.costCenterId = costCenterId;
    return this;
  }

   /**
   * Identificador do centro de custo
   * @return costCenterId
  **/
  @ApiModelProperty(value = "Identificador do centro de custo")
  public String getCostCenterId() {
    return costCenterId;
  }

  public void setCostCenterId(String costCenterId) {
    this.costCenterId = costCenterId;
  }

  public StaffRequisition keywordProfessionalExperienceSession(Boolean keywordProfessionalExperienceSession) {
    this.keywordProfessionalExperienceSession = keywordProfessionalExperienceSession;
    return this;
  }

   /**
   * Seção de histórico profissional (aderência).
   * @return keywordProfessionalExperienceSession
  **/
  @ApiModelProperty(value = "Seção de histórico profissional (aderência).")
  public Boolean isKeywordProfessionalExperienceSession() {
    return keywordProfessionalExperienceSession;
  }

  public void setKeywordProfessionalExperienceSession(Boolean keywordProfessionalExperienceSession) {
    this.keywordProfessionalExperienceSession = keywordProfessionalExperienceSession;
  }

  public StaffRequisition company(Company company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public StaffRequisition id(String id) {
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

  public StaffRequisition justification(String justification) {
    this.justification = justification;
    return this;
  }

   /**
   * Justificativa para a abertura da requisição de pessoal.
   * @return justification
  **/
  @ApiModelProperty(value = "Justificativa para a abertura da requisição de pessoal.")
  public String getJustification() {
    return justification;
  }

  public void setJustification(String justification) {
    this.justification = justification;
  }

  public StaffRequisition department(Department department) {
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

  public StaffRequisition keywordEducationSession(Boolean keywordEducationSession) {
    this.keywordEducationSession = keywordEducationSession;
    return this;
  }

   /**
   * Seção de formação acadêmica (aderência).
   * @return keywordEducationSession
  **/
  @ApiModelProperty(value = "Seção de formação acadêmica (aderência).")
  public Boolean isKeywordEducationSession() {
    return keywordEducationSession;
  }

  public void setKeywordEducationSession(Boolean keywordEducationSession) {
    this.keywordEducationSession = keywordEducationSession;
  }

  public StaffRequisition requester(EmployeeSummary requester) {
    this.requester = requester;
    return this;
  }

   /**
   * Get requester
   * @return requester
  **/
  @ApiModelProperty(value = "")
  public EmployeeSummary getRequester() {
    return requester;
  }

  public void setRequester(EmployeeSummary requester) {
    this.requester = requester;
  }

  public StaffRequisition workShift(WorkShift workShift) {
    this.workShift = workShift;
    return this;
  }

   /**
   * Get workShift
   * @return workShift
  **/
  @ApiModelProperty(value = "")
  public WorkShift getWorkShift() {
    return workShift;
  }

  public void setWorkShift(WorkShift workShift) {
    this.workShift = workShift;
  }

  public StaffRequisition finalizationAttachmentId(String finalizationAttachmentId) {
    this.finalizationAttachmentId = finalizationAttachmentId;
    return this;
  }

   /**
   * Id do anexo de finalização da requisição de pessoal.
   * @return finalizationAttachmentId
  **/
  @ApiModelProperty(value = "Id do anexo de finalização da requisição de pessoal.")
  public String getFinalizationAttachmentId() {
    return finalizationAttachmentId;
  }

  public void setFinalizationAttachmentId(String finalizationAttachmentId) {
    this.finalizationAttachmentId = finalizationAttachmentId;
  }

  public StaffRequisition startSalaryRange(String startSalaryRange) {
    this.startSalaryRange = startSalaryRange;
    return this;
  }

   /**
   * Faixa inicial da remuneração da vaga.
   * @return startSalaryRange
  **/
  @ApiModelProperty(value = "Faixa inicial da remuneração da vaga.")
  public String getStartSalaryRange() {
    return startSalaryRange;
  }

  public void setStartSalaryRange(String startSalaryRange) {
    this.startSalaryRange = startSalaryRange;
  }

  public StaffRequisition admissionDate(LocalDate admissionDate) {
    this.admissionDate = admissionDate;
    return this;
  }

   /**
   * Data de admissão prevista do colaborador.
   * @return admissionDate
  **/
  @ApiModelProperty(value = "Data de admissão prevista do colaborador.")
  public LocalDate getAdmissionDate() {
    return admissionDate;
  }

  public void setAdmissionDate(LocalDate admissionDate) {
    this.admissionDate = admissionDate;
  }

  public StaffRequisition workstationGroupId(String workstationGroupId) {
    this.workstationGroupId = workstationGroupId;
    return this;
  }

   /**
   * Identificador do posto de trabalho.
   * @return workstationGroupId
  **/
  @ApiModelProperty(value = "Identificador do posto de trabalho.")
  public String getWorkstationGroupId() {
    return workstationGroupId;
  }

  public void setWorkstationGroupId(String workstationGroupId) {
    this.workstationGroupId = workstationGroupId;
  }

  public StaffRequisition requesterId(String requesterId) {
    this.requesterId = requesterId;
    return this;
  }

   /**
   * ID do colaborador que criou a requisição de pessoal.
   * @return requesterId
  **/
  @ApiModelProperty(value = "ID do colaborador que criou a requisição de pessoal.")
  public String getRequesterId() {
    return requesterId;
  }

  public void setRequesterId(String requesterId) {
    this.requesterId = requesterId;
  }

  public StaffRequisition costCenter(CostCenter costCenter) {
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

  public StaffRequisition createdByVacancyManagement(Boolean createdByVacancyManagement) {
    this.createdByVacancyManagement = createdByVacancyManagement;
    return this;
  }

   /**
   * Identifica se deve criar a vaga no vacancymanagement ou no recruitment (default false).
   * @return createdByVacancyManagement
  **/
  @ApiModelProperty(value = "Identifica se deve criar a vaga no vacancymanagement ou no recruitment (default false).")
  public Boolean isCreatedByVacancyManagement() {
    return createdByVacancyManagement;
  }

  public void setCreatedByVacancyManagement(Boolean createdByVacancyManagement) {
    this.createdByVacancyManagement = createdByVacancyManagement;
  }

  public StaffRequisition keywordPositionSoughtSession(Boolean keywordPositionSoughtSession) {
    this.keywordPositionSoughtSession = keywordPositionSoughtSession;
    return this;
  }

   /**
   * Seção de cargos e áreas desejadas (aderência).
   * @return keywordPositionSoughtSession
  **/
  @ApiModelProperty(value = "Seção de cargos e áreas desejadas (aderência).")
  public Boolean isKeywordPositionSoughtSession() {
    return keywordPositionSoughtSession;
  }

  public void setKeywordPositionSoughtSession(Boolean keywordPositionSoughtSession) {
    this.keywordPositionSoughtSession = keywordPositionSoughtSession;
  }

  public StaffRequisition positions(Integer positions) {
    this.positions = positions;
    return this;
  }

   /**
   * Quantidade de vagas.
   * @return positions
  **/
  @ApiModelProperty(value = "Quantidade de vagas.")
  public Integer getPositions() {
    return positions;
  }

  public void setPositions(Integer positions) {
    this.positions = positions;
  }

  public StaffRequisition replacedEmployeeId(String replacedEmployeeId) {
    this.replacedEmployeeId = replacedEmployeeId;
    return this;
  }

   /**
   * ID do colaborador que será substituido (Se for o caso).
   * @return replacedEmployeeId
  **/
  @ApiModelProperty(value = "ID do colaborador que será substituido (Se for o caso).")
  public String getReplacedEmployeeId() {
    return replacedEmployeeId;
  }

  public void setReplacedEmployeeId(String replacedEmployeeId) {
    this.replacedEmployeeId = replacedEmployeeId;
  }

  public StaffRequisition keywordTrajectorySession(Boolean keywordTrajectorySession) {
    this.keywordTrajectorySession = keywordTrajectorySession;
    return this;
  }

   /**
   * Seção de trajetória profissional (aderência).
   * @return keywordTrajectorySession
  **/
  @ApiModelProperty(value = "Seção de trajetória profissional (aderência).")
  public Boolean isKeywordTrajectorySession() {
    return keywordTrajectorySession;
  }

  public void setKeywordTrajectorySession(Boolean keywordTrajectorySession) {
    this.keywordTrajectorySession = keywordTrajectorySession;
  }

  public StaffRequisition jobPosition(JobPosition jobPosition) {
    this.jobPosition = jobPosition;
    return this;
  }

   /**
   * Get jobPosition
   * @return jobPosition
  **/
  @ApiModelProperty(value = "")
  public JobPosition getJobPosition() {
    return jobPosition;
  }

  public void setJobPosition(JobPosition jobPosition) {
    this.jobPosition = jobPosition;
  }

  public StaffRequisition keywordLanguageSession(Boolean keywordLanguageSession) {
    this.keywordLanguageSession = keywordLanguageSession;
    return this;
  }

   /**
   * Seção de idiomas (aderência).
   * @return keywordLanguageSession
  **/
  @ApiModelProperty(value = "Seção de idiomas (aderência).")
  public Boolean isKeywordLanguageSession() {
    return keywordLanguageSession;
  }

  public void setKeywordLanguageSession(Boolean keywordLanguageSession) {
    this.keywordLanguageSession = keywordLanguageSession;
  }

  public StaffRequisition companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * Identificador da empresa
   * @return companyId
  **/
  @ApiModelProperty(value = "Identificador da empresa")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public StaffRequisition sequenceStaffrequisitionVacancyId(String sequenceStaffrequisitionVacancyId) {
    this.sequenceStaffrequisitionVacancyId = sequenceStaffrequisitionVacancyId;
    return this;
  }

   /**
   * Identificador do responsável por armazenar uma sequência única da Requisição de Pessoal.
   * @return sequenceStaffrequisitionVacancyId
  **/
  @ApiModelProperty(value = "Identificador do responsável por armazenar uma sequência única da Requisição de Pessoal.")
  public String getSequenceStaffrequisitionVacancyId() {
    return sequenceStaffrequisitionVacancyId;
  }

  public void setSequenceStaffrequisitionVacancyId(String sequenceStaffrequisitionVacancyId) {
    this.sequenceStaffrequisitionVacancyId = sequenceStaffrequisitionVacancyId;
  }

  public StaffRequisition endSalaryRange(String endSalaryRange) {
    this.endSalaryRange = endSalaryRange;
    return this;
  }

   /**
   * Faixa final da remuneração da vaga.
   * @return endSalaryRange
  **/
  @ApiModelProperty(value = "Faixa final da remuneração da vaga.")
  public String getEndSalaryRange() {
    return endSalaryRange;
  }

  public void setEndSalaryRange(String endSalaryRange) {
    this.endSalaryRange = endSalaryRange;
  }

  public StaffRequisition jobPositionId(String jobPositionId) {
    this.jobPositionId = jobPositionId;
    return this;
  }

   /**
   * ID do cargo desejado na requisição de pessoal.
   * @return jobPositionId
  **/
  @ApiModelProperty(value = "ID do cargo desejado na requisição de pessoal.")
  public String getJobPositionId() {
    return jobPositionId;
  }

  public void setJobPositionId(String jobPositionId) {
    this.jobPositionId = jobPositionId;
  }

  public StaffRequisition sequenceStaffrequisitionVacancy(SequenceStaffrequisitionVacancy sequenceStaffrequisitionVacancy) {
    this.sequenceStaffrequisitionVacancy = sequenceStaffrequisitionVacancy;
    return this;
  }

   /**
   * Get sequenceStaffrequisitionVacancy
   * @return sequenceStaffrequisitionVacancy
  **/
  @ApiModelProperty(value = "")
  public SequenceStaffrequisitionVacancy getSequenceStaffrequisitionVacancy() {
    return sequenceStaffrequisitionVacancy;
  }

  public void setSequenceStaffrequisitionVacancy(SequenceStaffrequisitionVacancy sequenceStaffrequisitionVacancy) {
    this.sequenceStaffrequisitionVacancy = sequenceStaffrequisitionVacancy;
  }

  public StaffRequisition replacedEmployee(EmployeeSummary replacedEmployee) {
    this.replacedEmployee = replacedEmployee;
    return this;
  }

   /**
   * Get replacedEmployee
   * @return replacedEmployee
  **/
  @ApiModelProperty(value = "")
  public EmployeeSummary getReplacedEmployee() {
    return replacedEmployee;
  }

  public void setReplacedEmployee(EmployeeSummary replacedEmployee) {
    this.replacedEmployee = replacedEmployee;
  }

  public StaffRequisition location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Local geográfico que a vaga referência.
   * @return location
  **/
  @ApiModelProperty(value = "Local geográfico que a vaga referência.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public StaffRequisition status(StaffRequisitionStatusDto status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StaffRequisitionStatusDto getStatus() {
    return status;
  }

  public void setStatus(StaffRequisitionStatusDto status) {
    this.status = status;
  }

  public StaffRequisition workShiftId(String workShiftId) {
    this.workShiftId = workShiftId;
    return this;
  }

   /**
   * Identificador do turno de trabalho
   * @return workShiftId
  **/
  @ApiModelProperty(value = "Identificador do turno de trabalho")
  public String getWorkShiftId() {
    return workShiftId;
  }

  public void setWorkShiftId(String workShiftId) {
    this.workShiftId = workShiftId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffRequisition staffRequisition = (StaffRequisition) o;
    return Objects.equals(this.reason, staffRequisition.reason) &&
        Objects.equals(this.finalizationComment, staffRequisition.finalizationComment) &&
        Objects.equals(this.workstationGroup, staffRequisition.workstationGroup) &&
        Objects.equals(this.employmentContract, staffRequisition.employmentContract) &&
        Objects.equals(this.keywords, staffRequisition.keywords) &&
        Objects.equals(this.contractType, staffRequisition.contractType) &&
        Objects.equals(this.departmentId, staffRequisition.departmentId) &&
        Objects.equals(this.description, staffRequisition.description) &&
        Objects.equals(this.disapprovalJustification, staffRequisition.disapprovalJustification) &&
        Objects.equals(this.keywordCompetencySession, staffRequisition.keywordCompetencySession) &&
        Objects.equals(this.createdAt, staffRequisition.createdAt) &&
        Objects.equals(this.costCenterId, staffRequisition.costCenterId) &&
        Objects.equals(this.keywordProfessionalExperienceSession, staffRequisition.keywordProfessionalExperienceSession) &&
        Objects.equals(this.company, staffRequisition.company) &&
        Objects.equals(this.id, staffRequisition.id) &&
        Objects.equals(this.justification, staffRequisition.justification) &&
        Objects.equals(this.department, staffRequisition.department) &&
        Objects.equals(this.keywordEducationSession, staffRequisition.keywordEducationSession) &&
        Objects.equals(this.requester, staffRequisition.requester) &&
        Objects.equals(this.workShift, staffRequisition.workShift) &&
        Objects.equals(this.finalizationAttachmentId, staffRequisition.finalizationAttachmentId) &&
        Objects.equals(this.startSalaryRange, staffRequisition.startSalaryRange) &&
        Objects.equals(this.admissionDate, staffRequisition.admissionDate) &&
        Objects.equals(this.workstationGroupId, staffRequisition.workstationGroupId) &&
        Objects.equals(this.requesterId, staffRequisition.requesterId) &&
        Objects.equals(this.costCenter, staffRequisition.costCenter) &&
        Objects.equals(this.createdByVacancyManagement, staffRequisition.createdByVacancyManagement) &&
        Objects.equals(this.keywordPositionSoughtSession, staffRequisition.keywordPositionSoughtSession) &&
        Objects.equals(this.positions, staffRequisition.positions) &&
        Objects.equals(this.replacedEmployeeId, staffRequisition.replacedEmployeeId) &&
        Objects.equals(this.keywordTrajectorySession, staffRequisition.keywordTrajectorySession) &&
        Objects.equals(this.jobPosition, staffRequisition.jobPosition) &&
        Objects.equals(this.keywordLanguageSession, staffRequisition.keywordLanguageSession) &&
        Objects.equals(this.companyId, staffRequisition.companyId) &&
        Objects.equals(this.sequenceStaffrequisitionVacancyId, staffRequisition.sequenceStaffrequisitionVacancyId) &&
        Objects.equals(this.endSalaryRange, staffRequisition.endSalaryRange) &&
        Objects.equals(this.jobPositionId, staffRequisition.jobPositionId) &&
        Objects.equals(this.sequenceStaffrequisitionVacancy, staffRequisition.sequenceStaffrequisitionVacancy) &&
        Objects.equals(this.replacedEmployee, staffRequisition.replacedEmployee) &&
        Objects.equals(this.location, staffRequisition.location) &&
        Objects.equals(this.status, staffRequisition.status) &&
        Objects.equals(this.workShiftId, staffRequisition.workShiftId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, finalizationComment, workstationGroup, employmentContract, keywords, contractType, departmentId, description, disapprovalJustification, keywordCompetencySession, createdAt, costCenterId, keywordProfessionalExperienceSession, company, id, justification, department, keywordEducationSession, requester, workShift, finalizationAttachmentId, startSalaryRange, admissionDate, workstationGroupId, requesterId, costCenter, createdByVacancyManagement, keywordPositionSoughtSession, positions, replacedEmployeeId, keywordTrajectorySession, jobPosition, keywordLanguageSession, companyId, sequenceStaffrequisitionVacancyId, endSalaryRange, jobPositionId, sequenceStaffrequisitionVacancy, replacedEmployee, location, status, workShiftId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffRequisition {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    finalizationComment: ").append(toIndentedString(finalizationComment)).append("\n");
    sb.append("    workstationGroup: ").append(toIndentedString(workstationGroup)).append("\n");
    sb.append("    employmentContract: ").append(toIndentedString(employmentContract)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disapprovalJustification: ").append(toIndentedString(disapprovalJustification)).append("\n");
    sb.append("    keywordCompetencySession: ").append(toIndentedString(keywordCompetencySession)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    costCenterId: ").append(toIndentedString(costCenterId)).append("\n");
    sb.append("    keywordProfessionalExperienceSession: ").append(toIndentedString(keywordProfessionalExperienceSession)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    justification: ").append(toIndentedString(justification)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    keywordEducationSession: ").append(toIndentedString(keywordEducationSession)).append("\n");
    sb.append("    requester: ").append(toIndentedString(requester)).append("\n");
    sb.append("    workShift: ").append(toIndentedString(workShift)).append("\n");
    sb.append("    finalizationAttachmentId: ").append(toIndentedString(finalizationAttachmentId)).append("\n");
    sb.append("    startSalaryRange: ").append(toIndentedString(startSalaryRange)).append("\n");
    sb.append("    admissionDate: ").append(toIndentedString(admissionDate)).append("\n");
    sb.append("    workstationGroupId: ").append(toIndentedString(workstationGroupId)).append("\n");
    sb.append("    requesterId: ").append(toIndentedString(requesterId)).append("\n");
    sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
    sb.append("    createdByVacancyManagement: ").append(toIndentedString(createdByVacancyManagement)).append("\n");
    sb.append("    keywordPositionSoughtSession: ").append(toIndentedString(keywordPositionSoughtSession)).append("\n");
    sb.append("    positions: ").append(toIndentedString(positions)).append("\n");
    sb.append("    replacedEmployeeId: ").append(toIndentedString(replacedEmployeeId)).append("\n");
    sb.append("    keywordTrajectorySession: ").append(toIndentedString(keywordTrajectorySession)).append("\n");
    sb.append("    jobPosition: ").append(toIndentedString(jobPosition)).append("\n");
    sb.append("    keywordLanguageSession: ").append(toIndentedString(keywordLanguageSession)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    sequenceStaffrequisitionVacancyId: ").append(toIndentedString(sequenceStaffrequisitionVacancyId)).append("\n");
    sb.append("    endSalaryRange: ").append(toIndentedString(endSalaryRange)).append("\n");
    sb.append("    jobPositionId: ").append(toIndentedString(jobPositionId)).append("\n");
    sb.append("    sequenceStaffrequisitionVacancy: ").append(toIndentedString(sequenceStaffrequisitionVacancy)).append("\n");
    sb.append("    replacedEmployee: ").append(toIndentedString(replacedEmployee)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    workShiftId: ").append(toIndentedString(workShiftId)).append("\n");
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

