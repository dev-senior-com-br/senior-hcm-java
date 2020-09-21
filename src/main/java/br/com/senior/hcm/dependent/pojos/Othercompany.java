/*
 * Dependentes
 * HCM - Gestão de dependentes
 *
 * OpenAPI spec version: 6.2.0
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
import br.com.senior.hcm.dependent.pojos.SubscriptionType;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * Othercompany
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-21T19:42:01.930Z")



public class Othercompany {
  @SerializedName("subscriptionNumber")
  private Integer subscriptionNumber = null;

  @SerializedName("subscriptionType")
  private SubscriptionType subscriptionType = null;

  @SerializedName("endDate")
  private LocalDate endDate = null;

  @SerializedName("subscriptionNumberCNO")
  private Integer subscriptionNumberCNO = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nickname")
  private String nickname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("subscriptionNumberCAEPF")
  private Integer subscriptionNumberCAEPF = null;

  @SerializedName("startDate")
  private LocalDate startDate = null;

  public Othercompany subscriptionNumber(Integer subscriptionNumber) {
    this.subscriptionNumber = subscriptionNumber;
    return this;
  }

   /**
   * Número da inscrição
   * @return subscriptionNumber
  **/
  @ApiModelProperty(value = "Número da inscrição")
  public Integer getSubscriptionNumber() {
    return subscriptionNumber;
  }

  public void setSubscriptionNumber(Integer subscriptionNumber) {
    this.subscriptionNumber = subscriptionNumber;
  }

  public Othercompany subscriptionType(SubscriptionType subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

   /**
   * Get subscriptionType
   * @return subscriptionType
  **/
  @ApiModelProperty(value = "")
  public SubscriptionType getSubscriptionType() {
    return subscriptionType;
  }

  public void setSubscriptionType(SubscriptionType subscriptionType) {
    this.subscriptionType = subscriptionType;
  }

  public Othercompany endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Data fim da validade
   * @return endDate
  **/
  @ApiModelProperty(value = "Data fim da validade")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Othercompany subscriptionNumberCNO(Integer subscriptionNumberCNO) {
    this.subscriptionNumberCNO = subscriptionNumberCNO;
    return this;
  }

   /**
   * Número inscrição CNO
   * @return subscriptionNumberCNO
  **/
  @ApiModelProperty(value = "Número inscrição CNO")
  public Integer getSubscriptionNumberCNO() {
    return subscriptionNumberCNO;
  }

  public void setSubscriptionNumberCNO(Integer subscriptionNumberCNO) {
    this.subscriptionNumberCNO = subscriptionNumberCNO;
  }

  public Othercompany name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome da outra empresa
   * @return name
  **/
  @ApiModelProperty(value = "Nome da outra empresa")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Othercompany nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Apelido da outra empresa
   * @return nickname
  **/
  @ApiModelProperty(value = "Apelido da outra empresa")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public Othercompany id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id da outra empresa
   * @return id
  **/
  @ApiModelProperty(value = "Id da outra empresa")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Othercompany subscriptionNumberCAEPF(Integer subscriptionNumberCAEPF) {
    this.subscriptionNumberCAEPF = subscriptionNumberCAEPF;
    return this;
  }

   /**
   * Inscrição no CAEPF (número)
   * @return subscriptionNumberCAEPF
  **/
  @ApiModelProperty(value = "Inscrição no CAEPF (número)")
  public Integer getSubscriptionNumberCAEPF() {
    return subscriptionNumberCAEPF;
  }

  public void setSubscriptionNumberCAEPF(Integer subscriptionNumberCAEPF) {
    this.subscriptionNumberCAEPF = subscriptionNumberCAEPF;
  }

  public Othercompany startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Data de inicio da validade
   * @return startDate
  **/
  @ApiModelProperty(value = "Data de inicio da validade")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Othercompany othercompany = (Othercompany) o;
    return Objects.equals(this.subscriptionNumber, othercompany.subscriptionNumber) &&
        Objects.equals(this.subscriptionType, othercompany.subscriptionType) &&
        Objects.equals(this.endDate, othercompany.endDate) &&
        Objects.equals(this.subscriptionNumberCNO, othercompany.subscriptionNumberCNO) &&
        Objects.equals(this.name, othercompany.name) &&
        Objects.equals(this.nickname, othercompany.nickname) &&
        Objects.equals(this.id, othercompany.id) &&
        Objects.equals(this.subscriptionNumberCAEPF, othercompany.subscriptionNumberCAEPF) &&
        Objects.equals(this.startDate, othercompany.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionNumber, subscriptionType, endDate, subscriptionNumberCNO, name, nickname, id, subscriptionNumberCAEPF, startDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Othercompany {\n");
    
    sb.append("    subscriptionNumber: ").append(toIndentedString(subscriptionNumber)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    subscriptionNumberCNO: ").append(toIndentedString(subscriptionNumberCNO)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subscriptionNumberCAEPF: ").append(toIndentedString(subscriptionNumberCAEPF)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

