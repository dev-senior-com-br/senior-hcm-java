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
import java.io.IOException;

/**
 * DocumentType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-24T13:38:01.755Z")



public class DocumentType {
  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("useOnREP")
  private Boolean useOnREP = null;

  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("mask")
  private String mask = null;

  public DocumentType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome do Tipo de Documento
   * @return name
  **/
  @ApiModelProperty(value = "Nome do Tipo de Documento")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DocumentType id(Integer id) {
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

  public DocumentType label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Label de Apresentação
   * @return label
  **/
  @ApiModelProperty(value = "Label de Apresentação")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public DocumentType useOnREP(Boolean useOnREP) {
    this.useOnREP = useOnREP;
    return this;
  }

   /**
   * Documento Utilizado pelo REP
   * @return useOnREP
  **/
  @ApiModelProperty(value = "Documento Utilizado pelo REP")
  public Boolean isUseOnREP() {
    return useOnREP;
  }

  public void setUseOnREP(Boolean useOnREP) {
    this.useOnREP = useOnREP;
  }

  public DocumentType required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Documento Obrigatório
   * @return required
  **/
  @ApiModelProperty(value = "Documento Obrigatório")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public DocumentType mask(String mask) {
    this.mask = mask;
    return this;
  }

   /**
   * Máscara
   * @return mask
  **/
  @ApiModelProperty(value = "Máscara")
  public String getMask() {
    return mask;
  }

  public void setMask(String mask) {
    this.mask = mask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentType documentType = (DocumentType) o;
    return Objects.equals(this.name, documentType.name) &&
        Objects.equals(this.id, documentType.id) &&
        Objects.equals(this.label, documentType.label) &&
        Objects.equals(this.useOnREP, documentType.useOnREP) &&
        Objects.equals(this.required, documentType.required) &&
        Objects.equals(this.mask, documentType.mask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, label, useOnREP, required, mask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    useOnREP: ").append(toIndentedString(useOnREP)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
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

