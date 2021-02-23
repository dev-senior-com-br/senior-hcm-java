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
import br.com.senior.hcm.payroll.pojos.CurrencyType;
import br.com.senior.hcm.payroll.pojos.Wageclass;
import java.io.IOException;

/**
 * Wagelevel
 */

public class Wagelevel {
  @SerializedName("initialsalaryCrypto")
  private String initialsalaryCrypto = null;

  @SerializedName("sequence")
  private Integer sequence = null;

  @SerializedName("wageclass")
  private Wageclass wageclass = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("currency")
  private CurrencyType currency = null;

  @SerializedName("id")
  private String id = null;

  public Wagelevel initialsalaryCrypto(String initialsalaryCrypto) {
    this.initialsalaryCrypto = initialsalaryCrypto;
    return this;
  }

   /**
   * Salário inicial
   * @return initialsalaryCrypto
  **/
  @ApiModelProperty(required = true, value = "Salário inicial")
  public String getInitialsalaryCrypto() {
    return initialsalaryCrypto;
  }

  public void setInitialsalaryCrypto(String initialsalaryCrypto) {
    this.initialsalaryCrypto = initialsalaryCrypto;
  }

  public Wagelevel sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Sequência
   * @return sequence
  **/
  @ApiModelProperty(required = true, value = "Sequência")
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public Wagelevel wageclass(Wageclass wageclass) {
    this.wageclass = wageclass;
    return this;
  }

   /**
   * Get wageclass
   * @return wageclass
  **/
  @ApiModelProperty(value = "")
  public Wageclass getWageclass() {
    return wageclass;
  }

  public void setWageclass(Wageclass wageclass) {
    this.wageclass = wageclass;
  }

  public Wagelevel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome do nível salarial
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Nome do nível salarial")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Wagelevel currency(CurrencyType currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "")
  public CurrencyType getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }

  public Wagelevel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id do nível salarial
   * @return id
  **/
  @ApiModelProperty(value = "Id do nível salarial")
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
    Wagelevel wagelevel = (Wagelevel) o;
    return Objects.equals(this.initialsalaryCrypto, wagelevel.initialsalaryCrypto) &&
        Objects.equals(this.sequence, wagelevel.sequence) &&
        Objects.equals(this.wageclass, wagelevel.wageclass) &&
        Objects.equals(this.name, wagelevel.name) &&
        Objects.equals(this.currency, wagelevel.currency) &&
        Objects.equals(this.id, wagelevel.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialsalaryCrypto, sequence, wageclass, name, currency, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wagelevel {\n");
    
    sb.append("    initialsalaryCrypto: ").append(toIndentedString(initialsalaryCrypto)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    wageclass: ").append(toIndentedString(wageclass)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

