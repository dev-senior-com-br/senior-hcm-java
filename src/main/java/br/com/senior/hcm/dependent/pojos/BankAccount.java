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
import br.com.senior.hcm.dependent.pojos.AccountType;
import br.com.senior.hcm.dependent.pojos.Bank;
import br.com.senior.hcm.dependent.pojos.BankBranch;
import java.io.IOException;

/**
 * BankAccount
 */

public class BankAccount {
  @SerializedName("bankAccount")
  private String bankAccount = null;

  @SerializedName("bank")
  private Bank bank = null;

  @SerializedName("bankBranch")
  private BankBranch bankBranch = null;

  @SerializedName("accountType")
  private AccountType accountType = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("digit")
  private String digit = null;

  public BankAccount bankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Conta bancária.
   * @return bankAccount
  **/
  @ApiModelProperty(required = true, value = "Conta bancária.")
  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }

  public BankAccount bank(Bank bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @ApiModelProperty(required = true, value = "")
  public Bank getBank() {
    return bank;
  }

  public void setBank(Bank bank) {
    this.bank = bank;
  }

  public BankAccount bankBranch(BankBranch bankBranch) {
    this.bankBranch = bankBranch;
    return this;
  }

   /**
   * Get bankBranch
   * @return bankBranch
  **/
  @ApiModelProperty(required = true, value = "")
  public BankBranch getBankBranch() {
    return bankBranch;
  }

  public void setBankBranch(BankBranch bankBranch) {
    this.bankBranch = bankBranch;
  }

  public BankAccount accountType(AccountType accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(required = true, value = "")
  public AccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
  }

  public BankAccount id(String id) {
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

  public BankAccount digit(String digit) {
    this.digit = digit;
    return this;
  }

   /**
   * Digito da conta
   * @return digit
  **/
  @ApiModelProperty(value = "Digito da conta")
  public String getDigit() {
    return digit;
  }

  public void setDigit(String digit) {
    this.digit = digit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccount bankAccount = (BankAccount) o;
    return Objects.equals(this.bankAccount, bankAccount.bankAccount) &&
        Objects.equals(this.bank, bankAccount.bank) &&
        Objects.equals(this.bankBranch, bankAccount.bankBranch) &&
        Objects.equals(this.accountType, bankAccount.accountType) &&
        Objects.equals(this.id, bankAccount.id) &&
        Objects.equals(this.digit, bankAccount.digit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccount, bank, bankBranch, accountType, id, digit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccount {\n");
    
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    bankBranch: ").append(toIndentedString(bankBranch)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    digit: ").append(toIndentedString(digit)).append("\n");
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

