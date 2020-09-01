/*
 * Recrutamento e Seleção
 * Serviço do Gestão de Recrutamento e Seleção.
 *
 * OpenAPI spec version: 15.11.0
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
import java.io.IOException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * ProfessionalExperienceSection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-26T22:02:06.260Z")



public class ProfessionalExperienceSection {
  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("resumeId")
  private String resumeId = null;

  @SerializedName("endDate")
  private LocalDate endDate = null;

  @SerializedName("g5Id")
  private String g5Id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("position")
  private String position = null;

  @SerializedName("startDate")
  private LocalDate startDate = null;

  @SerializedName("updatedAt")
  private OffsetDateTime updatedAt = null;

  public ProfessionalExperienceSection createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Data de criação.
   * @return createdAt
  **/
  @ApiModelProperty(value = "Data de criação.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ProfessionalExperienceSection address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Endereço.
   * @return address
  **/
  @ApiModelProperty(value = "Endereço.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public ProfessionalExperienceSection resumeId(String resumeId) {
    this.resumeId = resumeId;
    return this;
  }

   /**
   * Identificador do currículo a qual o interesse está associado.
   * @return resumeId
  **/
  @ApiModelProperty(value = "Identificador do currículo a qual o interesse está associado.")
  public String getResumeId() {
    return resumeId;
  }

  public void setResumeId(String resumeId) {
    this.resumeId = resumeId;
  }

  public ProfessionalExperienceSection endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Data final.
   * @return endDate
  **/
  @ApiModelProperty(value = "Data final.")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public ProfessionalExperienceSection g5Id(String g5Id) {
    this.g5Id = g5Id;
    return this;
  }

   /**
   * ID do registro no sistema legado. Esse atributo não é persistido na base, é utilizado apenas como identificador na integração do registro da g5 para G7.
   * @return g5Id
  **/
  @ApiModelProperty(value = "ID do registro no sistema legado. Esse atributo não é persistido na base, é utilizado apenas como identificador na integração do registro da g5 para G7.")
  public String getG5Id() {
    return g5Id;
  }

  public void setG5Id(String g5Id) {
    this.g5Id = g5Id;
  }

  public ProfessionalExperienceSection description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Descrição.
   * @return description
  **/
  @ApiModelProperty(value = "Descrição.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProfessionalExperienceSection company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Empresa.
   * @return company
  **/
  @ApiModelProperty(value = "Empresa.")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public ProfessionalExperienceSection id(String id) {
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

  public ProfessionalExperienceSection position(String position) {
    this.position = position;
    return this;
  }

   /**
   * Cargo.
   * @return position
  **/
  @ApiModelProperty(value = "Cargo.")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public ProfessionalExperienceSection startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Data inicial.
   * @return startDate
  **/
  @ApiModelProperty(value = "Data inicial.")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public ProfessionalExperienceSection updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Data da última alteração.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "Data da última alteração.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfessionalExperienceSection professionalExperienceSection = (ProfessionalExperienceSection) o;
    return Objects.equals(this.createdAt, professionalExperienceSection.createdAt) &&
        Objects.equals(this.address, professionalExperienceSection.address) &&
        Objects.equals(this.resumeId, professionalExperienceSection.resumeId) &&
        Objects.equals(this.endDate, professionalExperienceSection.endDate) &&
        Objects.equals(this.g5Id, professionalExperienceSection.g5Id) &&
        Objects.equals(this.description, professionalExperienceSection.description) &&
        Objects.equals(this.company, professionalExperienceSection.company) &&
        Objects.equals(this.id, professionalExperienceSection.id) &&
        Objects.equals(this.position, professionalExperienceSection.position) &&
        Objects.equals(this.startDate, professionalExperienceSection.startDate) &&
        Objects.equals(this.updatedAt, professionalExperienceSection.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, address, resumeId, endDate, g5Id, description, company, id, position, startDate, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfessionalExperienceSection {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    resumeId: ").append(toIndentedString(resumeId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    g5Id: ").append(toIndentedString(g5Id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

