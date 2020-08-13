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

/**
 * SequenceStaffrequisitionVacancy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-13T15:24:45.430Z")



public class SequenceStaffrequisitionVacancy {
  @SerializedName("sequence")
  private Integer sequence = null;

  @SerializedName("id")
  private String id = null;

  public SequenceStaffrequisitionVacancy sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Sequência única.
   * @return sequence
  **/
  @ApiModelProperty(value = "Sequência única.")
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public SequenceStaffrequisitionVacancy id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identificador da entidade.
   * @return id
  **/
  @ApiModelProperty(value = "Identificador da entidade.")
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
    SequenceStaffrequisitionVacancy sequenceStaffrequisitionVacancy = (SequenceStaffrequisitionVacancy) o;
    return Objects.equals(this.sequence, sequenceStaffrequisitionVacancy.sequence) &&
        Objects.equals(this.id, sequenceStaffrequisitionVacancy.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequence, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SequenceStaffrequisitionVacancy {\n");
    
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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

