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
import br.com.senior.hcm.dependent.pojos.Dependent;
import br.com.senior.hcm.dependent.pojos.Othercompany;
import br.com.senior.hcm.dependent.pojos.SchoolGradeType;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * FamilySalaryDocument
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-07T18:58:09.351Z")



public class FamilySalaryDocument {
  @SerializedName("percentageInNovember")
  private Double percentageInNovember = null;

  @SerializedName("frequencyInNovember")
  private LocalDate frequencyInNovember = null;

  @SerializedName("school")
  private Othercompany school = null;

  @SerializedName("referenceYear")
  private Integer referenceYear = null;

  @SerializedName("scholarship")
  private Boolean scholarship = null;

  @SerializedName("frequencyInMay")
  private LocalDate frequencyInMay = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("schoolGrade")
  private SchoolGradeType schoolGrade = null;

  @SerializedName("percentageInMay")
  private Double percentageInMay = null;

  @SerializedName("dependent")
  private Dependent dependent = null;

  @SerializedName("vaccination")
  private LocalDate vaccination = null;

  public FamilySalaryDocument percentageInNovember(Double percentageInNovember) {
    this.percentageInNovember = percentageInNovember;
    return this;
  }

   /**
   * Percentual em novembro
   * @return percentageInNovember
  **/
  @ApiModelProperty(value = "Percentual em novembro")
  public Double getPercentageInNovember() {
    return percentageInNovember;
  }

  public void setPercentageInNovember(Double percentageInNovember) {
    this.percentageInNovember = percentageInNovember;
  }

  public FamilySalaryDocument frequencyInNovember(LocalDate frequencyInNovember) {
    this.frequencyInNovember = frequencyInNovember;
    return this;
  }

   /**
   * Frequência em novembro
   * @return frequencyInNovember
  **/
  @ApiModelProperty(value = "Frequência em novembro")
  public LocalDate getFrequencyInNovember() {
    return frequencyInNovember;
  }

  public void setFrequencyInNovember(LocalDate frequencyInNovember) {
    this.frequencyInNovember = frequencyInNovember;
  }

  public FamilySalaryDocument school(Othercompany school) {
    this.school = school;
    return this;
  }

   /**
   * Get school
   * @return school
  **/
  @ApiModelProperty(value = "")
  public Othercompany getSchool() {
    return school;
  }

  public void setSchool(Othercompany school) {
    this.school = school;
  }

  public FamilySalaryDocument referenceYear(Integer referenceYear) {
    this.referenceYear = referenceYear;
    return this;
  }

   /**
   * Ano de referência
   * @return referenceYear
  **/
  @ApiModelProperty(value = "Ano de referência")
  public Integer getReferenceYear() {
    return referenceYear;
  }

  public void setReferenceYear(Integer referenceYear) {
    this.referenceYear = referenceYear;
  }

  public FamilySalaryDocument scholarship(Boolean scholarship) {
    this.scholarship = scholarship;
    return this;
  }

   /**
   * É bolsista?
   * @return scholarship
  **/
  @ApiModelProperty(value = "É bolsista?")
  public Boolean isScholarship() {
    return scholarship;
  }

  public void setScholarship(Boolean scholarship) {
    this.scholarship = scholarship;
  }

  public FamilySalaryDocument frequencyInMay(LocalDate frequencyInMay) {
    this.frequencyInMay = frequencyInMay;
    return this;
  }

   /**
   * Frequência em maio
   * @return frequencyInMay
  **/
  @ApiModelProperty(value = "Frequência em maio")
  public LocalDate getFrequencyInMay() {
    return frequencyInMay;
  }

  public void setFrequencyInMay(LocalDate frequencyInMay) {
    this.frequencyInMay = frequencyInMay;
  }

  public FamilySalaryDocument id(String id) {
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

  public FamilySalaryDocument schoolGrade(SchoolGradeType schoolGrade) {
    this.schoolGrade = schoolGrade;
    return this;
  }

   /**
   * Get schoolGrade
   * @return schoolGrade
  **/
  @ApiModelProperty(value = "")
  public SchoolGradeType getSchoolGrade() {
    return schoolGrade;
  }

  public void setSchoolGrade(SchoolGradeType schoolGrade) {
    this.schoolGrade = schoolGrade;
  }

  public FamilySalaryDocument percentageInMay(Double percentageInMay) {
    this.percentageInMay = percentageInMay;
    return this;
  }

   /**
   * Percentual em maio
   * @return percentageInMay
  **/
  @ApiModelProperty(value = "Percentual em maio")
  public Double getPercentageInMay() {
    return percentageInMay;
  }

  public void setPercentageInMay(Double percentageInMay) {
    this.percentageInMay = percentageInMay;
  }

  public FamilySalaryDocument dependent(Dependent dependent) {
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

  public FamilySalaryDocument vaccination(LocalDate vaccination) {
    this.vaccination = vaccination;
    return this;
  }

   /**
   * Vacinação
   * @return vaccination
  **/
  @ApiModelProperty(value = "Vacinação")
  public LocalDate getVaccination() {
    return vaccination;
  }

  public void setVaccination(LocalDate vaccination) {
    this.vaccination = vaccination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FamilySalaryDocument familySalaryDocument = (FamilySalaryDocument) o;
    return Objects.equals(this.percentageInNovember, familySalaryDocument.percentageInNovember) &&
        Objects.equals(this.frequencyInNovember, familySalaryDocument.frequencyInNovember) &&
        Objects.equals(this.school, familySalaryDocument.school) &&
        Objects.equals(this.referenceYear, familySalaryDocument.referenceYear) &&
        Objects.equals(this.scholarship, familySalaryDocument.scholarship) &&
        Objects.equals(this.frequencyInMay, familySalaryDocument.frequencyInMay) &&
        Objects.equals(this.id, familySalaryDocument.id) &&
        Objects.equals(this.schoolGrade, familySalaryDocument.schoolGrade) &&
        Objects.equals(this.percentageInMay, familySalaryDocument.percentageInMay) &&
        Objects.equals(this.dependent, familySalaryDocument.dependent) &&
        Objects.equals(this.vaccination, familySalaryDocument.vaccination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentageInNovember, frequencyInNovember, school, referenceYear, scholarship, frequencyInMay, id, schoolGrade, percentageInMay, dependent, vaccination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FamilySalaryDocument {\n");
    
    sb.append("    percentageInNovember: ").append(toIndentedString(percentageInNovember)).append("\n");
    sb.append("    frequencyInNovember: ").append(toIndentedString(frequencyInNovember)).append("\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
    sb.append("    referenceYear: ").append(toIndentedString(referenceYear)).append("\n");
    sb.append("    scholarship: ").append(toIndentedString(scholarship)).append("\n");
    sb.append("    frequencyInMay: ").append(toIndentedString(frequencyInMay)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schoolGrade: ").append(toIndentedString(schoolGrade)).append("\n");
    sb.append("    percentageInMay: ").append(toIndentedString(percentageInMay)).append("\n");
    sb.append("    dependent: ").append(toIndentedString(dependent)).append("\n");
    sb.append("    vaccination: ").append(toIndentedString(vaccination)).append("\n");
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

