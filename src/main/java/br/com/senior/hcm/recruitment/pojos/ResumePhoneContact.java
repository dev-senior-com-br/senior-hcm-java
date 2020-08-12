/*
 * recruitment
 * Serviço do Gestão de Recrutamento e Seleção.
 *
 * OpenAPI spec version: 15.10.3
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
import io.swagger.client.model.PersonPhoneContactPhoneContact;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Contato telefônico (Currículo).
 */
@ApiModel(description = "Contato telefônico (Currículo).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-12T19:10:42.806Z")



public class ResumePhoneContact {
  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("resumeId")
  private String resumeId = null;

  @SerializedName("phoneContact")
  private PersonPhoneContactPhoneContact phoneContact = null;

  @SerializedName("g5Id")
  private String g5Id = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("updatedAt")
  private OffsetDateTime updatedAt = null;

  public ResumePhoneContact createdAt(OffsetDateTime createdAt) {
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

  public ResumePhoneContact resumeId(String resumeId) {
    this.resumeId = resumeId;
    return this;
  }

   /**
   * Identificador único do currículo.
   * @return resumeId
  **/
  @ApiModelProperty(required = true, value = "Identificador único do currículo.")
  public String getResumeId() {
    return resumeId;
  }

  public void setResumeId(String resumeId) {
    this.resumeId = resumeId;
  }

  public ResumePhoneContact phoneContact(PersonPhoneContactPhoneContact phoneContact) {
    this.phoneContact = phoneContact;
    return this;
  }

   /**
   * Get phoneContact
   * @return phoneContact
  **/
  @ApiModelProperty(required = true, value = "")
  public PersonPhoneContactPhoneContact getPhoneContact() {
    return phoneContact;
  }

  public void setPhoneContact(PersonPhoneContactPhoneContact phoneContact) {
    this.phoneContact = phoneContact;
  }

  public ResumePhoneContact g5Id(String g5Id) {
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

  public ResumePhoneContact id(String id) {
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

  public ResumePhoneContact updatedAt(OffsetDateTime updatedAt) {
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
    ResumePhoneContact resumePhoneContact = (ResumePhoneContact) o;
    return Objects.equals(this.createdAt, resumePhoneContact.createdAt) &&
        Objects.equals(this.resumeId, resumePhoneContact.resumeId) &&
        Objects.equals(this.phoneContact, resumePhoneContact.phoneContact) &&
        Objects.equals(this.g5Id, resumePhoneContact.g5Id) &&
        Objects.equals(this.id, resumePhoneContact.id) &&
        Objects.equals(this.updatedAt, resumePhoneContact.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, resumeId, phoneContact, g5Id, id, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumePhoneContact {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    resumeId: ").append(toIndentedString(resumeId)).append("\n");
    sb.append("    phoneContact: ").append(toIndentedString(phoneContact)).append("\n");
    sb.append("    g5Id: ").append(toIndentedString(g5Id)).append("\n");
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

