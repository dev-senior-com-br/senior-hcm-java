/*
 * Dependentes
 * HCM - Gestão de dependentes
 *
 * OpenAPI spec version: 6.2.1
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
import br.com.senior.hcm.dependent.pojos.Bank;
import java.io.IOException;

/**
 * BankBranch
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-07T19:15:20.705Z")



public class BankBranch {
  @SerializedName("bank")
  private Bank bank = null;

  @SerializedName("code")
  private Integer code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  public BankBranch bank(Bank bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @ApiModelProperty(value = "")
  public Bank getBank() {
    return bank;
  }

  public void setBank(Bank bank) {
    this.bank = bank;
  }

  public BankBranch code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Número da agência
   * @return code
  **/
  @ApiModelProperty(value = "Número da agência")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public BankBranch name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome da agência
   * @return name
  **/
  @ApiModelProperty(value = "Nome da agência")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BankBranch id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id da entidade
   * @return id
  **/
  @ApiModelProperty(value = "Id da entidade")
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
    BankBranch bankBranch = (BankBranch) o;
    return Objects.equals(this.bank, bankBranch.bank) &&
        Objects.equals(this.code, bankBranch.code) &&
        Objects.equals(this.name, bankBranch.name) &&
        Objects.equals(this.id, bankBranch.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bank, code, name, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankBranch {\n");
    
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

