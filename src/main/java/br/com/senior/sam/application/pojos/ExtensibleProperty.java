/*
 * Aplicação
 * Serviço do backend da aplicação do Ronda senior X
 *
 * OpenAPI spec version: 4.7.0
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.sam.application.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import br.com.senior.sam.application.pojos.ExtensibleConfiguration;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * ExtensibleProperty
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-24T13:38:01.755Z")



public class ExtensibleProperty {
  @SerializedName("createdDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("extensibleConfiguration")
  private ExtensibleConfiguration extensibleConfiguration = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("lastModifiedDate")
  private OffsetDateTime lastModifiedDate = null;

  @SerializedName("lastModifiedBy")
  private String lastModifiedBy = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("key")
  private String key = null;

  public ExtensibleProperty createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * 
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public ExtensibleProperty extensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
    this.extensibleConfiguration = extensibleConfiguration;
    return this;
  }

   /**
   * Get extensibleConfiguration
   * @return extensibleConfiguration
  **/
  @ApiModelProperty(value = "")
  public ExtensibleConfiguration getExtensibleConfiguration() {
    return extensibleConfiguration;
  }

  public void setExtensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
    this.extensibleConfiguration = extensibleConfiguration;
  }

  public ExtensibleProperty createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public ExtensibleProperty lastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * 
   * @return lastModifiedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public ExtensibleProperty lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * 
   * @return lastModifiedBy
  **/
  @ApiModelProperty(value = "")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public ExtensibleProperty id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(value = "ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ExtensibleProperty value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Valor
   * @return value
  **/
  @ApiModelProperty(value = "Valor")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ExtensibleProperty key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Chave
   * @return key
  **/
  @ApiModelProperty(value = "Chave")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensibleProperty extensibleProperty = (ExtensibleProperty) o;
    return Objects.equals(this.createdDate, extensibleProperty.createdDate) &&
        Objects.equals(this.extensibleConfiguration, extensibleProperty.extensibleConfiguration) &&
        Objects.equals(this.createdBy, extensibleProperty.createdBy) &&
        Objects.equals(this.lastModifiedDate, extensibleProperty.lastModifiedDate) &&
        Objects.equals(this.lastModifiedBy, extensibleProperty.lastModifiedBy) &&
        Objects.equals(this.id, extensibleProperty.id) &&
        Objects.equals(this.value, extensibleProperty.value) &&
        Objects.equals(this.key, extensibleProperty.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, extensibleConfiguration, createdBy, lastModifiedDate, lastModifiedBy, id, value, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensibleProperty {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    extensibleConfiguration: ").append(toIndentedString(extensibleConfiguration)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

