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
import br.com.senior.hcm.payroll.pojos.AdditionalPaymentType;
import br.com.senior.hcm.payroll.pojos.JobActingType;
import java.io.IOException;

/**
 * Actingtype
 */

public class Actingtype {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("goal")
  private String goal = null;

  @SerializedName("additionalPaymentType")
  private AdditionalPaymentType additionalPaymentType = null;

  @SerializedName("additionalPaymentPercentage")
  private Double additionalPaymentPercentage = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("consistCharacteristic")
  private Boolean consistCharacteristic = null;

  @SerializedName("jobActingType")
  private JobActingType jobActingType = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("mainhistory")
  private Boolean mainhistory = null;

  @SerializedName("headCountControl")
  private Boolean headCountControl = null;

  public Actingtype code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Código do tipo de atuação
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Código do tipo de atuação")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Actingtype goal(String goal) {
    this.goal = goal;
    return this;
  }

   /**
   * Objetivo
   * @return goal
  **/
  @ApiModelProperty(required = true, value = "Objetivo")
  public String getGoal() {
    return goal;
  }

  public void setGoal(String goal) {
    this.goal = goal;
  }

  public Actingtype additionalPaymentType(AdditionalPaymentType additionalPaymentType) {
    this.additionalPaymentType = additionalPaymentType;
    return this;
  }

   /**
   * Get additionalPaymentType
   * @return additionalPaymentType
  **/
  @ApiModelProperty(required = true, value = "")
  public AdditionalPaymentType getAdditionalPaymentType() {
    return additionalPaymentType;
  }

  public void setAdditionalPaymentType(AdditionalPaymentType additionalPaymentType) {
    this.additionalPaymentType = additionalPaymentType;
  }

  public Actingtype additionalPaymentPercentage(Double additionalPaymentPercentage) {
    this.additionalPaymentPercentage = additionalPaymentPercentage;
    return this;
  }

   /**
   * Porcentagem do pagamento do posto adicional
   * @return additionalPaymentPercentage
  **/
  @ApiModelProperty(required = true, value = "Porcentagem do pagamento do posto adicional")
  public Double getAdditionalPaymentPercentage() {
    return additionalPaymentPercentage;
  }

  public void setAdditionalPaymentPercentage(Double additionalPaymentPercentage) {
    this.additionalPaymentPercentage = additionalPaymentPercentage;
  }

  public Actingtype name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Descrição do tipo de atuação
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Descrição do tipo de atuação")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Actingtype consistCharacteristic(Boolean consistCharacteristic) {
    this.consistCharacteristic = consistCharacteristic;
    return this;
  }

   /**
   * Consistir característica?
   * @return consistCharacteristic
  **/
  @ApiModelProperty(required = true, value = "Consistir característica?")
  public Boolean isConsistCharacteristic() {
    return consistCharacteristic;
  }

  public void setConsistCharacteristic(Boolean consistCharacteristic) {
    this.consistCharacteristic = consistCharacteristic;
  }

  public Actingtype jobActingType(JobActingType jobActingType) {
    this.jobActingType = jobActingType;
    return this;
  }

   /**
   * Get jobActingType
   * @return jobActingType
  **/
  @ApiModelProperty(required = true, value = "")
  public JobActingType getJobActingType() {
    return jobActingType;
  }

  public void setJobActingType(JobActingType jobActingType) {
    this.jobActingType = jobActingType;
  }

  public Actingtype id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id do tipo de atuação
   * @return id
  **/
  @ApiModelProperty(value = "Id do tipo de atuação")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Actingtype mainhistory(Boolean mainhistory) {
    this.mainhistory = mainhistory;
    return this;
  }

   /**
   * Histórico principal?
   * @return mainhistory
  **/
  @ApiModelProperty(required = true, value = "Histórico principal?")
  public Boolean isMainhistory() {
    return mainhistory;
  }

  public void setMainhistory(Boolean mainhistory) {
    this.mainhistory = mainhistory;
  }

  public Actingtype headCountControl(Boolean headCountControl) {
    this.headCountControl = headCountControl;
    return this;
  }

   /**
   * Indica se atuações deste tipo contrabilizam uma vaga no quadro de lotação
   * @return headCountControl
  **/
  @ApiModelProperty(required = true, value = "Indica se atuações deste tipo contrabilizam uma vaga no quadro de lotação")
  public Boolean isHeadCountControl() {
    return headCountControl;
  }

  public void setHeadCountControl(Boolean headCountControl) {
    this.headCountControl = headCountControl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Actingtype actingtype = (Actingtype) o;
    return Objects.equals(this.code, actingtype.code) &&
        Objects.equals(this.goal, actingtype.goal) &&
        Objects.equals(this.additionalPaymentType, actingtype.additionalPaymentType) &&
        Objects.equals(this.additionalPaymentPercentage, actingtype.additionalPaymentPercentage) &&
        Objects.equals(this.name, actingtype.name) &&
        Objects.equals(this.consistCharacteristic, actingtype.consistCharacteristic) &&
        Objects.equals(this.jobActingType, actingtype.jobActingType) &&
        Objects.equals(this.id, actingtype.id) &&
        Objects.equals(this.mainhistory, actingtype.mainhistory) &&
        Objects.equals(this.headCountControl, actingtype.headCountControl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, goal, additionalPaymentType, additionalPaymentPercentage, name, consistCharacteristic, jobActingType, id, mainhistory, headCountControl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Actingtype {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    goal: ").append(toIndentedString(goal)).append("\n");
    sb.append("    additionalPaymentType: ").append(toIndentedString(additionalPaymentType)).append("\n");
    sb.append("    additionalPaymentPercentage: ").append(toIndentedString(additionalPaymentPercentage)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    consistCharacteristic: ").append(toIndentedString(consistCharacteristic)).append("\n");
    sb.append("    jobActingType: ").append(toIndentedString(jobActingType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mainhistory: ").append(toIndentedString(mainhistory)).append("\n");
    sb.append("    headCountControl: ").append(toIndentedString(headCountControl)).append("\n");
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

