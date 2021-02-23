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
import br.com.senior.hcm.payroll.pojos.CalculationAveragePriorNoticeType;
import br.com.senior.hcm.payroll.pojos.DaysAdditionInCountType;
import br.com.senior.hcm.payroll.pojos.FormAdditionCountType;
import br.com.senior.hcm.payroll.pojos.FormDisregardWithdrawalDayType;
import br.com.senior.hcm.payroll.pojos.PriorNoticeDaysInCountType;
import br.com.senior.hcm.payroll.pojos.StartCountAdditionType;
import br.com.senior.hcm.payroll.pojos.Syndicate;
import br.com.senior.hcm.payroll.pojos.UseDifferentiatedNoticeType;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * PriorNotice
 */

public class PriorNotice {
  @SerializedName("daysAdditionInCount")
  private DaysAdditionInCountType daysAdditionInCount = null;

  @SerializedName("priorNoticeDaysInCount")
  private PriorNoticeDaysInCountType priorNoticeDaysInCount = null;

  @SerializedName("indemnifiedDaysAdditionYear")
  private Integer indemnifiedDaysAdditionYear = null;

  @SerializedName("syndicate")
  private Syndicate syndicate = null;

  @SerializedName("startCountAddition")
  private StartCountAdditionType startCountAddition = null;

  @SerializedName("useDifferentiatedNotice")
  private UseDifferentiatedNoticeType useDifferentiatedNotice = null;

  @SerializedName("sumNoticeDaysRetrievedTermination")
  private Boolean sumNoticeDaysRetrievedTermination = null;

  @SerializedName("dateWhen")
  private LocalDate dateWhen = null;

  @SerializedName("formAdditionCount")
  private FormAdditionCountType formAdditionCount = null;

  @SerializedName("calculationAveragePriorNotice")
  private CalculationAveragePriorNoticeType calculationAveragePriorNotice = null;

  @SerializedName("serviceTimeSelection")
  private Boolean serviceTimeSelection = null;

  @SerializedName("retrievedNoticeDays")
  private Integer retrievedNoticeDays = null;

  @SerializedName("recoveredDaysAdditionYear")
  private Integer recoveredDaysAdditionYear = null;

  @SerializedName("ageSelection")
  private Boolean ageSelection = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("formDisregardWithdrawalDay")
  private FormDisregardWithdrawalDayType formDisregardWithdrawalDay = null;

  @SerializedName("indemnifiedNoticeDays")
  private Integer indemnifiedNoticeDays = null;

  public PriorNotice daysAdditionInCount(DaysAdditionInCountType daysAdditionInCount) {
    this.daysAdditionInCount = daysAdditionInCount;
    return this;
  }

   /**
   * Get daysAdditionInCount
   * @return daysAdditionInCount
  **/
  @ApiModelProperty(value = "")
  public DaysAdditionInCountType getDaysAdditionInCount() {
    return daysAdditionInCount;
  }

  public void setDaysAdditionInCount(DaysAdditionInCountType daysAdditionInCount) {
    this.daysAdditionInCount = daysAdditionInCount;
  }

  public PriorNotice priorNoticeDaysInCount(PriorNoticeDaysInCountType priorNoticeDaysInCount) {
    this.priorNoticeDaysInCount = priorNoticeDaysInCount;
    return this;
  }

   /**
   * Get priorNoticeDaysInCount
   * @return priorNoticeDaysInCount
  **/
  @ApiModelProperty(value = "")
  public PriorNoticeDaysInCountType getPriorNoticeDaysInCount() {
    return priorNoticeDaysInCount;
  }

  public void setPriorNoticeDaysInCount(PriorNoticeDaysInCountType priorNoticeDaysInCount) {
    this.priorNoticeDaysInCount = priorNoticeDaysInCount;
  }

  public PriorNotice indemnifiedDaysAdditionYear(Integer indemnifiedDaysAdditionYear) {
    this.indemnifiedDaysAdditionYear = indemnifiedDaysAdditionYear;
    return this;
  }

   /**
   * Acréscimo dias indenizado no ano
   * @return indemnifiedDaysAdditionYear
  **/
  @ApiModelProperty(value = "Acréscimo dias indenizado no ano")
  public Integer getIndemnifiedDaysAdditionYear() {
    return indemnifiedDaysAdditionYear;
  }

  public void setIndemnifiedDaysAdditionYear(Integer indemnifiedDaysAdditionYear) {
    this.indemnifiedDaysAdditionYear = indemnifiedDaysAdditionYear;
  }

  public PriorNotice syndicate(Syndicate syndicate) {
    this.syndicate = syndicate;
    return this;
  }

   /**
   * Get syndicate
   * @return syndicate
  **/
  @ApiModelProperty(required = true, value = "")
  public Syndicate getSyndicate() {
    return syndicate;
  }

  public void setSyndicate(Syndicate syndicate) {
    this.syndicate = syndicate;
  }

  public PriorNotice startCountAddition(StartCountAdditionType startCountAddition) {
    this.startCountAddition = startCountAddition;
    return this;
  }

   /**
   * Get startCountAddition
   * @return startCountAddition
  **/
  @ApiModelProperty(value = "")
  public StartCountAdditionType getStartCountAddition() {
    return startCountAddition;
  }

  public void setStartCountAddition(StartCountAdditionType startCountAddition) {
    this.startCountAddition = startCountAddition;
  }

  public PriorNotice useDifferentiatedNotice(UseDifferentiatedNoticeType useDifferentiatedNotice) {
    this.useDifferentiatedNotice = useDifferentiatedNotice;
    return this;
  }

   /**
   * Get useDifferentiatedNotice
   * @return useDifferentiatedNotice
  **/
  @ApiModelProperty(value = "")
  public UseDifferentiatedNoticeType getUseDifferentiatedNotice() {
    return useDifferentiatedNotice;
  }

  public void setUseDifferentiatedNotice(UseDifferentiatedNoticeType useDifferentiatedNotice) {
    this.useDifferentiatedNotice = useDifferentiatedNotice;
  }

  public PriorNotice sumNoticeDaysRetrievedTermination(Boolean sumNoticeDaysRetrievedTermination) {
    this.sumNoticeDaysRetrievedTermination = sumNoticeDaysRetrievedTermination;
    return this;
  }

   /**
   * Somar aviso reavido na rescisão
   * @return sumNoticeDaysRetrievedTermination
  **/
  @ApiModelProperty(value = "Somar aviso reavido na rescisão")
  public Boolean isSumNoticeDaysRetrievedTermination() {
    return sumNoticeDaysRetrievedTermination;
  }

  public void setSumNoticeDaysRetrievedTermination(Boolean sumNoticeDaysRetrievedTermination) {
    this.sumNoticeDaysRetrievedTermination = sumNoticeDaysRetrievedTermination;
  }

  public PriorNotice dateWhen(LocalDate dateWhen) {
    this.dateWhen = dateWhen;
    return this;
  }

   /**
   * Data da última alteração do aviso prévio
   * @return dateWhen
  **/
  @ApiModelProperty(required = true, value = "Data da última alteração do aviso prévio")
  public LocalDate getDateWhen() {
    return dateWhen;
  }

  public void setDateWhen(LocalDate dateWhen) {
    this.dateWhen = dateWhen;
  }

  public PriorNotice formAdditionCount(FormAdditionCountType formAdditionCount) {
    this.formAdditionCount = formAdditionCount;
    return this;
  }

   /**
   * Get formAdditionCount
   * @return formAdditionCount
  **/
  @ApiModelProperty(value = "")
  public FormAdditionCountType getFormAdditionCount() {
    return formAdditionCount;
  }

  public void setFormAdditionCount(FormAdditionCountType formAdditionCount) {
    this.formAdditionCount = formAdditionCount;
  }

  public PriorNotice calculationAveragePriorNotice(CalculationAveragePriorNoticeType calculationAveragePriorNotice) {
    this.calculationAveragePriorNotice = calculationAveragePriorNotice;
    return this;
  }

   /**
   * Get calculationAveragePriorNotice
   * @return calculationAveragePriorNotice
  **/
  @ApiModelProperty(value = "")
  public CalculationAveragePriorNoticeType getCalculationAveragePriorNotice() {
    return calculationAveragePriorNotice;
  }

  public void setCalculationAveragePriorNotice(CalculationAveragePriorNoticeType calculationAveragePriorNotice) {
    this.calculationAveragePriorNotice = calculationAveragePriorNotice;
  }

  public PriorNotice serviceTimeSelection(Boolean serviceTimeSelection) {
    this.serviceTimeSelection = serviceTimeSelection;
    return this;
  }

   /**
   * Seleção por tempo de serviço
   * @return serviceTimeSelection
  **/
  @ApiModelProperty(value = "Seleção por tempo de serviço")
  public Boolean isServiceTimeSelection() {
    return serviceTimeSelection;
  }

  public void setServiceTimeSelection(Boolean serviceTimeSelection) {
    this.serviceTimeSelection = serviceTimeSelection;
  }

  public PriorNotice retrievedNoticeDays(Integer retrievedNoticeDays) {
    this.retrievedNoticeDays = retrievedNoticeDays;
    return this;
  }

   /**
   * Dias aviso reavido
   * @return retrievedNoticeDays
  **/
  @ApiModelProperty(value = "Dias aviso reavido")
  public Integer getRetrievedNoticeDays() {
    return retrievedNoticeDays;
  }

  public void setRetrievedNoticeDays(Integer retrievedNoticeDays) {
    this.retrievedNoticeDays = retrievedNoticeDays;
  }

  public PriorNotice recoveredDaysAdditionYear(Integer recoveredDaysAdditionYear) {
    this.recoveredDaysAdditionYear = recoveredDaysAdditionYear;
    return this;
  }

   /**
   * Acréscimo dias reavido no ano
   * @return recoveredDaysAdditionYear
  **/
  @ApiModelProperty(value = "Acréscimo dias reavido no ano")
  public Integer getRecoveredDaysAdditionYear() {
    return recoveredDaysAdditionYear;
  }

  public void setRecoveredDaysAdditionYear(Integer recoveredDaysAdditionYear) {
    this.recoveredDaysAdditionYear = recoveredDaysAdditionYear;
  }

  public PriorNotice ageSelection(Boolean ageSelection) {
    this.ageSelection = ageSelection;
    return this;
  }

   /**
   * Seleção por idade
   * @return ageSelection
  **/
  @ApiModelProperty(value = "Seleção por idade")
  public Boolean isAgeSelection() {
    return ageSelection;
  }

  public void setAgeSelection(Boolean ageSelection) {
    this.ageSelection = ageSelection;
  }

  public PriorNotice id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id do aviso prévio
   * @return id
  **/
  @ApiModelProperty(value = "Id do aviso prévio")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PriorNotice formDisregardWithdrawalDay(FormDisregardWithdrawalDayType formDisregardWithdrawalDay) {
    this.formDisregardWithdrawalDay = formDisregardWithdrawalDay;
    return this;
  }

   /**
   * Get formDisregardWithdrawalDay
   * @return formDisregardWithdrawalDay
  **/
  @ApiModelProperty(value = "")
  public FormDisregardWithdrawalDayType getFormDisregardWithdrawalDay() {
    return formDisregardWithdrawalDay;
  }

  public void setFormDisregardWithdrawalDay(FormDisregardWithdrawalDayType formDisregardWithdrawalDay) {
    this.formDisregardWithdrawalDay = formDisregardWithdrawalDay;
  }

  public PriorNotice indemnifiedNoticeDays(Integer indemnifiedNoticeDays) {
    this.indemnifiedNoticeDays = indemnifiedNoticeDays;
    return this;
  }

   /**
   * Dias aviso indenizado
   * @return indemnifiedNoticeDays
  **/
  @ApiModelProperty(value = "Dias aviso indenizado")
  public Integer getIndemnifiedNoticeDays() {
    return indemnifiedNoticeDays;
  }

  public void setIndemnifiedNoticeDays(Integer indemnifiedNoticeDays) {
    this.indemnifiedNoticeDays = indemnifiedNoticeDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriorNotice priorNotice = (PriorNotice) o;
    return Objects.equals(this.daysAdditionInCount, priorNotice.daysAdditionInCount) &&
        Objects.equals(this.priorNoticeDaysInCount, priorNotice.priorNoticeDaysInCount) &&
        Objects.equals(this.indemnifiedDaysAdditionYear, priorNotice.indemnifiedDaysAdditionYear) &&
        Objects.equals(this.syndicate, priorNotice.syndicate) &&
        Objects.equals(this.startCountAddition, priorNotice.startCountAddition) &&
        Objects.equals(this.useDifferentiatedNotice, priorNotice.useDifferentiatedNotice) &&
        Objects.equals(this.sumNoticeDaysRetrievedTermination, priorNotice.sumNoticeDaysRetrievedTermination) &&
        Objects.equals(this.dateWhen, priorNotice.dateWhen) &&
        Objects.equals(this.formAdditionCount, priorNotice.formAdditionCount) &&
        Objects.equals(this.calculationAveragePriorNotice, priorNotice.calculationAveragePriorNotice) &&
        Objects.equals(this.serviceTimeSelection, priorNotice.serviceTimeSelection) &&
        Objects.equals(this.retrievedNoticeDays, priorNotice.retrievedNoticeDays) &&
        Objects.equals(this.recoveredDaysAdditionYear, priorNotice.recoveredDaysAdditionYear) &&
        Objects.equals(this.ageSelection, priorNotice.ageSelection) &&
        Objects.equals(this.id, priorNotice.id) &&
        Objects.equals(this.formDisregardWithdrawalDay, priorNotice.formDisregardWithdrawalDay) &&
        Objects.equals(this.indemnifiedNoticeDays, priorNotice.indemnifiedNoticeDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysAdditionInCount, priorNoticeDaysInCount, indemnifiedDaysAdditionYear, syndicate, startCountAddition, useDifferentiatedNotice, sumNoticeDaysRetrievedTermination, dateWhen, formAdditionCount, calculationAveragePriorNotice, serviceTimeSelection, retrievedNoticeDays, recoveredDaysAdditionYear, ageSelection, id, formDisregardWithdrawalDay, indemnifiedNoticeDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriorNotice {\n");
    
    sb.append("    daysAdditionInCount: ").append(toIndentedString(daysAdditionInCount)).append("\n");
    sb.append("    priorNoticeDaysInCount: ").append(toIndentedString(priorNoticeDaysInCount)).append("\n");
    sb.append("    indemnifiedDaysAdditionYear: ").append(toIndentedString(indemnifiedDaysAdditionYear)).append("\n");
    sb.append("    syndicate: ").append(toIndentedString(syndicate)).append("\n");
    sb.append("    startCountAddition: ").append(toIndentedString(startCountAddition)).append("\n");
    sb.append("    useDifferentiatedNotice: ").append(toIndentedString(useDifferentiatedNotice)).append("\n");
    sb.append("    sumNoticeDaysRetrievedTermination: ").append(toIndentedString(sumNoticeDaysRetrievedTermination)).append("\n");
    sb.append("    dateWhen: ").append(toIndentedString(dateWhen)).append("\n");
    sb.append("    formAdditionCount: ").append(toIndentedString(formAdditionCount)).append("\n");
    sb.append("    calculationAveragePriorNotice: ").append(toIndentedString(calculationAveragePriorNotice)).append("\n");
    sb.append("    serviceTimeSelection: ").append(toIndentedString(serviceTimeSelection)).append("\n");
    sb.append("    retrievedNoticeDays: ").append(toIndentedString(retrievedNoticeDays)).append("\n");
    sb.append("    recoveredDaysAdditionYear: ").append(toIndentedString(recoveredDaysAdditionYear)).append("\n");
    sb.append("    ageSelection: ").append(toIndentedString(ageSelection)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    formDisregardWithdrawalDay: ").append(toIndentedString(formDisregardWithdrawalDay)).append("\n");
    sb.append("    indemnifiedNoticeDays: ").append(toIndentedString(indemnifiedNoticeDays)).append("\n");
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

