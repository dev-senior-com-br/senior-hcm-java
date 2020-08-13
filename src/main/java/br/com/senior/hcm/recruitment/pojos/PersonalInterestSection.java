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
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * PersonalInterestSection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-13T14:23:53.017Z")



public class PersonalInterestSection {
  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("resumeId")
  private String resumeId = null;

  @SerializedName("interest")
  private String interest = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("updatedAt")
  private OffsetDateTime updatedAt = null;

  public PersonalInterestSection createdAt(OffsetDateTime createdAt) {
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

  public PersonalInterestSection resumeId(String resumeId) {
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

  public PersonalInterestSection interest(String interest) {
    this.interest = interest;
    return this;
  }

   /**
   * Interesse.
   * @return interest
  **/
  @ApiModelProperty(value = "Interesse.")
  public String getInterest() {
    return interest;
  }

  public void setInterest(String interest) {
    this.interest = interest;
  }

  public PersonalInterestSection id(String id) {
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

  public PersonalInterestSection updatedAt(OffsetDateTime updatedAt) {
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
    PersonalInterestSection personalInterestSection = (PersonalInterestSection) o;
    return Objects.equals(this.createdAt, personalInterestSection.createdAt) &&
        Objects.equals(this.resumeId, personalInterestSection.resumeId) &&
        Objects.equals(this.interest, personalInterestSection.interest) &&
        Objects.equals(this.id, personalInterestSection.id) &&
        Objects.equals(this.updatedAt, personalInterestSection.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, resumeId, interest, id, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalInterestSection {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    resumeId: ").append(toIndentedString(resumeId)).append("\n");
    sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

