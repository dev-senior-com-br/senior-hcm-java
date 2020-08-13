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
import br.com.senior.hcm.recruitment.pojos.ShiftDto;
import java.io.IOException;

/**
 * WorkShift
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-13T14:43:12.718Z")



public class WorkShift {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("shift")
  private ShiftDto shift = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  public WorkShift code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Código do turno de trabalho.
   * @return code
  **/
  @ApiModelProperty(value = "Código do turno de trabalho.")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public WorkShift shift(ShiftDto shift) {
    this.shift = shift;
    return this;
  }

   /**
   * Get shift
   * @return shift
  **/
  @ApiModelProperty(value = "")
  public ShiftDto getShift() {
    return shift;
  }

  public void setShift(ShiftDto shift) {
    this.shift = shift;
  }

  public WorkShift description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Descrição do turno.
   * @return description
  **/
  @ApiModelProperty(value = "Descrição do turno.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WorkShift id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identificador do turno de trabalho.
   * @return id
  **/
  @ApiModelProperty(value = "Identificador do turno de trabalho.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkShift workShift = (WorkShift) o;
    return Objects.equals(this.code, workShift.code) &&
        Objects.equals(this.shift, workShift.shift) &&
        Objects.equals(this.description, workShift.description) &&
        Objects.equals(this.id, workShift.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, shift, description, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkShift {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    shift: ").append(toIndentedString(shift)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

