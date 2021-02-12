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
import br.com.senior.hcm.dependent.pojos.Address;
import br.com.senior.hcm.dependent.pojos.BankAccount;
import br.com.senior.hcm.dependent.pojos.BaseCalculationType;
import br.com.senior.hcm.dependent.pojos.City;
import br.com.senior.hcm.dependent.pojos.Dependent;
import br.com.senior.hcm.dependent.pojos.FixedJudicialValue;
import br.com.senior.hcm.dependent.pojos.MethodPaymentType;
import br.com.senior.hcm.dependent.pojos.Phone;
import br.com.senior.hcm.dependent.pojos.VariableJudicialValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * JudicialPension
 */

public class JudicialPension {
  @SerializedName("bankAccount")
  private BankAccount bankAccount = null;

  @SerializedName("address")
  private Address address = null;

  @SerializedName("baseCalculationType")
  private BaseCalculationType baseCalculationType = null;

  @SerializedName("variableJudicialValue")
  private VariableJudicialValue variableJudicialValue = null;

  @SerializedName("endDate")
  private LocalDate endDate = null;

  @SerializedName("familySalaryQuota")
  private Integer familySalaryQuota = null;

  @SerializedName("methodPaymentType")
  private MethodPaymentType methodPaymentType = null;

  @SerializedName("sequence")
  private Integer sequence = null;

  @SerializedName("phone")
  private List<Phone> phone = null;

  @SerializedName("fixedJudicialValue")
  private FixedJudicialValue fixedJudicialValue = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("judicialDistrict")
  private City judicialDistrict = null;

  @SerializedName("dependent")
  private Dependent dependent = null;

  @SerializedName("startDate")
  private LocalDate startDate = null;

  @SerializedName("bookAccount")
  private String bookAccount = null;

  public JudicialPension bankAccount(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(value = "")
  public BankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public JudicialPension address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public JudicialPension baseCalculationType(BaseCalculationType baseCalculationType) {
    this.baseCalculationType = baseCalculationType;
    return this;
  }

   /**
   * Get baseCalculationType
   * @return baseCalculationType
  **/
  @ApiModelProperty(required = true, value = "")
  public BaseCalculationType getBaseCalculationType() {
    return baseCalculationType;
  }

  public void setBaseCalculationType(BaseCalculationType baseCalculationType) {
    this.baseCalculationType = baseCalculationType;
  }

  public JudicialPension variableJudicialValue(VariableJudicialValue variableJudicialValue) {
    this.variableJudicialValue = variableJudicialValue;
    return this;
  }

   /**
   * Get variableJudicialValue
   * @return variableJudicialValue
  **/
  @ApiModelProperty(value = "")
  public VariableJudicialValue getVariableJudicialValue() {
    return variableJudicialValue;
  }

  public void setVariableJudicialValue(VariableJudicialValue variableJudicialValue) {
    this.variableJudicialValue = variableJudicialValue;
  }

  public JudicialPension endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Data de encerramento
   * @return endDate
  **/
  @ApiModelProperty(value = "Data de encerramento")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public JudicialPension familySalaryQuota(Integer familySalaryQuota) {
    this.familySalaryQuota = familySalaryQuota;
    return this;
  }

   /**
   * Cota salário família
   * @return familySalaryQuota
  **/
  @ApiModelProperty(value = "Cota salário família")
  public Integer getFamilySalaryQuota() {
    return familySalaryQuota;
  }

  public void setFamilySalaryQuota(Integer familySalaryQuota) {
    this.familySalaryQuota = familySalaryQuota;
  }

  public JudicialPension methodPaymentType(MethodPaymentType methodPaymentType) {
    this.methodPaymentType = methodPaymentType;
    return this;
  }

   /**
   * Get methodPaymentType
   * @return methodPaymentType
  **/
  @ApiModelProperty(required = true, value = "")
  public MethodPaymentType getMethodPaymentType() {
    return methodPaymentType;
  }

  public void setMethodPaymentType(MethodPaymentType methodPaymentType) {
    this.methodPaymentType = methodPaymentType;
  }

  public JudicialPension sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Sequência do cadastro
   * @return sequence
  **/
  @ApiModelProperty(value = "Sequência do cadastro")
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public JudicialPension phone(List<Phone> phone) {
    this.phone = phone;
    return this;
  }

  public JudicialPension addPhoneItem(Phone phoneItem) {
    if (this.phone == null) {
      this.phone = new ArrayList<Phone>();
    }
    this.phone.add(phoneItem);
    return this;
  }

   /**
   * Telefones de contato
   * @return phone
  **/
  @ApiModelProperty(value = "Telefones de contato")
  public List<Phone> getPhone() {
    return phone;
  }

  public void setPhone(List<Phone> phone) {
    this.phone = phone;
  }

  public JudicialPension fixedJudicialValue(FixedJudicialValue fixedJudicialValue) {
    this.fixedJudicialValue = fixedJudicialValue;
    return this;
  }

   /**
   * Get fixedJudicialValue
   * @return fixedJudicialValue
  **/
  @ApiModelProperty(value = "")
  public FixedJudicialValue getFixedJudicialValue() {
    return fixedJudicialValue;
  }

  public void setFixedJudicialValue(FixedJudicialValue fixedJudicialValue) {
    this.fixedJudicialValue = fixedJudicialValue;
  }

  public JudicialPension id(String id) {
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

  public JudicialPension judicialDistrict(City judicialDistrict) {
    this.judicialDistrict = judicialDistrict;
    return this;
  }

   /**
   * Get judicialDistrict
   * @return judicialDistrict
  **/
  @ApiModelProperty(value = "")
  public City getJudicialDistrict() {
    return judicialDistrict;
  }

  public void setJudicialDistrict(City judicialDistrict) {
    this.judicialDistrict = judicialDistrict;
  }

  public JudicialPension dependent(Dependent dependent) {
    this.dependent = dependent;
    return this;
  }

   /**
   * Get dependent
   * @return dependent
  **/
  @ApiModelProperty(required = true, value = "")
  public Dependent getDependent() {
    return dependent;
  }

  public void setDependent(Dependent dependent) {
    this.dependent = dependent;
  }

  public JudicialPension startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Data de inicio
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "Data de inicio")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public JudicialPension bookAccount(String bookAccount) {
    this.bookAccount = bookAccount;
    return this;
  }

   /**
   * Conta contábil
   * @return bookAccount
  **/
  @ApiModelProperty(value = "Conta contábil")
  public String getBookAccount() {
    return bookAccount;
  }

  public void setBookAccount(String bookAccount) {
    this.bookAccount = bookAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JudicialPension judicialPension = (JudicialPension) o;
    return Objects.equals(this.bankAccount, judicialPension.bankAccount) &&
        Objects.equals(this.address, judicialPension.address) &&
        Objects.equals(this.baseCalculationType, judicialPension.baseCalculationType) &&
        Objects.equals(this.variableJudicialValue, judicialPension.variableJudicialValue) &&
        Objects.equals(this.endDate, judicialPension.endDate) &&
        Objects.equals(this.familySalaryQuota, judicialPension.familySalaryQuota) &&
        Objects.equals(this.methodPaymentType, judicialPension.methodPaymentType) &&
        Objects.equals(this.sequence, judicialPension.sequence) &&
        Objects.equals(this.phone, judicialPension.phone) &&
        Objects.equals(this.fixedJudicialValue, judicialPension.fixedJudicialValue) &&
        Objects.equals(this.id, judicialPension.id) &&
        Objects.equals(this.judicialDistrict, judicialPension.judicialDistrict) &&
        Objects.equals(this.dependent, judicialPension.dependent) &&
        Objects.equals(this.startDate, judicialPension.startDate) &&
        Objects.equals(this.bookAccount, judicialPension.bookAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccount, address, baseCalculationType, variableJudicialValue, endDate, familySalaryQuota, methodPaymentType, sequence, phone, fixedJudicialValue, id, judicialDistrict, dependent, startDate, bookAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JudicialPension {\n");
    
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    baseCalculationType: ").append(toIndentedString(baseCalculationType)).append("\n");
    sb.append("    variableJudicialValue: ").append(toIndentedString(variableJudicialValue)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    familySalaryQuota: ").append(toIndentedString(familySalaryQuota)).append("\n");
    sb.append("    methodPaymentType: ").append(toIndentedString(methodPaymentType)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fixedJudicialValue: ").append(toIndentedString(fixedJudicialValue)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    judicialDistrict: ").append(toIndentedString(judicialDistrict)).append("\n");
    sb.append("    dependent: ").append(toIndentedString(dependent)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    bookAccount: ").append(toIndentedString(bookAccount)).append("\n");
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

