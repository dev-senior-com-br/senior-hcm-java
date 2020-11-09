/*
 * Dependentes
 * HCM - Gestão de dependentes
 *
 *
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.hcm.dependent.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import br.com.senior.hcm.dependent.pojos.Dependent;
import java.io.IOException;

/**
 * ChildcareAssistance
 */




public class ChildcareAssistance {
  @SerializedName("months")
  private Integer months = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("dependent")
  private Dependent dependent = null;

  @SerializedName("childcareAssistance")
  private Boolean childcareAssistance = null;

  public ChildcareAssistance months(Integer months) {
    this.months = months;
    return this;
  }

   /**
   * Meses
   * @return months
  **/
  @ApiModelProperty(value = "Meses")
  public Integer getMonths() {
    return months;
  }

  public void setMonths(Integer months) {
    this.months = months;
  }

  public ChildcareAssistance id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id do auxílio creche
   * @return id
  **/
  @ApiModelProperty(value = "Id do auxílio creche")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChildcareAssistance dependent(Dependent dependent) {
    this.dependent = dependent;
    return this;
  }

   /**
   * Get dependent
   * @return dependent
  **/
  @ApiModelProperty(value = "")
  public Dependent getDependent() {
    return dependent;
  }

  public void setDependent(Dependent dependent) {
    this.dependent = dependent;
  }

  public ChildcareAssistance childcareAssistance(Boolean childcareAssistance) {
    this.childcareAssistance = childcareAssistance;
    return this;
  }

   /**
   * Se tem auxílio creche
   * @return childcareAssistance
  **/
  @ApiModelProperty(value = "Se tem auxílio creche")
  public Boolean isChildcareAssistance() {
    return childcareAssistance;
  }

  public void setChildcareAssistance(Boolean childcareAssistance) {
    this.childcareAssistance = childcareAssistance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChildcareAssistance childcareAssistance = (ChildcareAssistance) o;
    return Objects.equals(this.months, childcareAssistance.months) &&
        Objects.equals(this.id, childcareAssistance.id) &&
        Objects.equals(this.dependent, childcareAssistance.dependent) &&
        Objects.equals(this.childcareAssistance, childcareAssistance.childcareAssistance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(months, id, dependent, childcareAssistance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildcareAssistance {\n");
    
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dependent: ").append(toIndentedString(dependent)).append("\n");
    sb.append("    childcareAssistance: ").append(toIndentedString(childcareAssistance)).append("\n");
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

