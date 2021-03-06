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
import br.com.senior.hcm.payroll.pojos.Person;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * Attachment
 */

public class Attachment {
  @SerializedName("sourceId")
  private String sourceId = null;

  @SerializedName("createdat")
  private LocalDate createdat = null;

  @SerializedName("sourceType")
  private String sourceType = null;

  @SerializedName("permanentUrl")
  private String permanentUrl = null;

  @SerializedName("person")
  private Person person = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("updatedat")
  private LocalDate updatedat = null;

  @SerializedName("status")
  private Integer status = null;

  public Attachment sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Identificador do anexo
   * @return sourceId
  **/
  @ApiModelProperty(value = "Identificador do anexo")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public Attachment createdat(LocalDate createdat) {
    this.createdat = createdat;
    return this;
  }

   /**
   * Data de criação
   * @return createdat
  **/
  @ApiModelProperty(value = "Data de criação")
  public LocalDate getCreatedat() {
    return createdat;
  }

  public void setCreatedat(LocalDate createdat) {
    this.createdat = createdat;
  }

  public Attachment sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Tipo do anexo
   * @return sourceType
  **/
  @ApiModelProperty(value = "Tipo do anexo")
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  public Attachment permanentUrl(String permanentUrl) {
    this.permanentUrl = permanentUrl;
    return this;
  }

   /**
   * Caminho permanente do arquivo
   * @return permanentUrl
  **/
  @ApiModelProperty(value = "Caminho permanente do arquivo")
  public String getPermanentUrl() {
    return permanentUrl;
  }

  public void setPermanentUrl(String permanentUrl) {
    this.permanentUrl = permanentUrl;
  }

  public Attachment person(Person person) {
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  @ApiModelProperty(value = "")
  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public Attachment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome do arquivo
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Nome do arquivo")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Attachment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identificador
   * @return id
  **/
  @ApiModelProperty(value = "Identificador")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Attachment version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Versão do arquivo temporário
   * @return version
  **/
  @ApiModelProperty(value = "Versão do arquivo temporário")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Attachment updatedat(LocalDate updatedat) {
    this.updatedat = updatedat;
    return this;
  }

   /**
   * Data de alteração
   * @return updatedat
  **/
  @ApiModelProperty(value = "Data de alteração")
  public LocalDate getUpdatedat() {
    return updatedat;
  }

  public void setUpdatedat(LocalDate updatedat) {
    this.updatedat = updatedat;
  }

  public Attachment status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Status
   * @return status
  **/
  @ApiModelProperty(value = "Status")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
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
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.sourceId, attachment.sourceId) &&
        Objects.equals(this.createdat, attachment.createdat) &&
        Objects.equals(this.sourceType, attachment.sourceType) &&
        Objects.equals(this.permanentUrl, attachment.permanentUrl) &&
        Objects.equals(this.person, attachment.person) &&
        Objects.equals(this.name, attachment.name) &&
        Objects.equals(this.id, attachment.id) &&
        Objects.equals(this.version, attachment.version) &&
        Objects.equals(this.updatedat, attachment.updatedat) &&
        Objects.equals(this.status, attachment.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, createdat, sourceType, permanentUrl, person, name, id, version, updatedat, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    createdat: ").append(toIndentedString(createdat)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    permanentUrl: ").append(toIndentedString(permanentUrl)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    updatedat: ").append(toIndentedString(updatedat)).append("\n");
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

