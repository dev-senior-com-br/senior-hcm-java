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
import br.com.senior.hcm.recruitment.pojos.CandidateTypeDto;
import java.io.IOException;

/**
 * BasicCandidateSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-13T14:43:12.718Z")



public class BasicCandidateSummary {
  @SerializedName("candidatesType")
  private CandidateTypeDto candidatesType = null;

  @SerializedName("recruitmentProcessId")
  private String recruitmentProcessId = null;

  @SerializedName("candidateName")
  private String candidateName = null;

  public BasicCandidateSummary candidatesType(CandidateTypeDto candidatesType) {
    this.candidatesType = candidatesType;
    return this;
  }

   /**
   * Get candidatesType
   * @return candidatesType
  **/
  @ApiModelProperty(value = "")
  public CandidateTypeDto getCandidatesType() {
    return candidatesType;
  }

  public void setCandidatesType(CandidateTypeDto candidatesType) {
    this.candidatesType = candidatesType;
  }

  public BasicCandidateSummary recruitmentProcessId(String recruitmentProcessId) {
    this.recruitmentProcessId = recruitmentProcessId;
    return this;
  }

   /**
   * ID do processo de recrutamento a qual o candidato pertence.
   * @return recruitmentProcessId
  **/
  @ApiModelProperty(value = "ID do processo de recrutamento a qual o candidato pertence.")
  public String getRecruitmentProcessId() {
    return recruitmentProcessId;
  }

  public void setRecruitmentProcessId(String recruitmentProcessId) {
    this.recruitmentProcessId = recruitmentProcessId;
  }

  public BasicCandidateSummary candidateName(String candidateName) {
    this.candidateName = candidateName;
    return this;
  }

   /**
   * Nome do candidato.
   * @return candidateName
  **/
  @ApiModelProperty(value = "Nome do candidato.")
  public String getCandidateName() {
    return candidateName;
  }

  public void setCandidateName(String candidateName) {
    this.candidateName = candidateName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicCandidateSummary basicCandidateSummary = (BasicCandidateSummary) o;
    return Objects.equals(this.candidatesType, basicCandidateSummary.candidatesType) &&
        Objects.equals(this.recruitmentProcessId, basicCandidateSummary.recruitmentProcessId) &&
        Objects.equals(this.candidateName, basicCandidateSummary.candidateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidatesType, recruitmentProcessId, candidateName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicCandidateSummary {\n");
    
    sb.append("    candidatesType: ").append(toIndentedString(candidatesType)).append("\n");
    sb.append("    recruitmentProcessId: ").append(toIndentedString(recruitmentProcessId)).append("\n");
    sb.append("    candidateName: ").append(toIndentedString(candidateName)).append("\n");
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

