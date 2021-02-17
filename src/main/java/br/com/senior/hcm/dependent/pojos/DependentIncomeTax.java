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
import org.threeten.bp.LocalDate;

/**
 * DependentIncomeTax
 */

public class DependentIncomeTax {
  @SerializedName("beginCompetence")
  private LocalDate beginCompetence = null;

  @SerializedName("endCompetence")
  private LocalDate endCompetence = null;

  @SerializedName("ageLimitIncomeTax")
  private Integer ageLimitIncomeTax = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("dependent")
  private Dependent dependent = null;

  public DependentIncomeTax beginCompetence(LocalDate beginCompetence) {
    this.beginCompetence = beginCompetence;
    return this;
  }

   /**
   * Inicio da competência
   * @return beginCompetence
  **/
  @ApiModelProperty(required = true, value = "Inicio da competência")
  public LocalDate getBeginCompetence() {
    return beginCompetence;
  }

  public void setBeginCompetence(LocalDate beginCompetence) {
    this.beginCompetence = beginCompetence;
  }

  public DependentIncomeTax endCompetence(LocalDate endCompetence) {
    this.endCompetence = endCompetence;
    return this;
  }

   /**
   * Fim da competência
   * @return endCompetence
  **/
  @ApiModelProperty(required = true, value = "Fim da competência")
  public LocalDate getEndCompetence() {
    return endCompetence;
  }

  public void setEndCompetence(LocalDate endCompetence) {
    this.endCompetence = endCompetence;
  }

  public DependentIncomeTax ageLimitIncomeTax(Integer ageLimitIncomeTax) {
    this.ageLimitIncomeTax = ageLimitIncomeTax;
    return this;
  }

   /**
   * Idade limite imposto de renda
   * @return ageLimitIncomeTax
  **/
  @ApiModelProperty(value = "Idade limite imposto de renda")
  public Integer getAgeLimitIncomeTax() {
    return ageLimitIncomeTax;
  }

  public void setAgeLimitIncomeTax(Integer ageLimitIncomeTax) {
    this.ageLimitIncomeTax = ageLimitIncomeTax;
  }

  public DependentIncomeTax id(String id) {
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

  public DependentIncomeTax dependent(Dependent dependent) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependentIncomeTax dependentIncomeTax = (DependentIncomeTax) o;
    return Objects.equals(this.beginCompetence, dependentIncomeTax.beginCompetence) &&
        Objects.equals(this.endCompetence, dependentIncomeTax.endCompetence) &&
        Objects.equals(this.ageLimitIncomeTax, dependentIncomeTax.ageLimitIncomeTax) &&
        Objects.equals(this.id, dependentIncomeTax.id) &&
        Objects.equals(this.dependent, dependentIncomeTax.dependent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginCompetence, endCompetence, ageLimitIncomeTax, id, dependent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependentIncomeTax {\n");
    
    sb.append("    beginCompetence: ").append(toIndentedString(beginCompetence)).append("\n");
    sb.append("    endCompetence: ").append(toIndentedString(endCompetence)).append("\n");
    sb.append("    ageLimitIncomeTax: ").append(toIndentedString(ageLimitIncomeTax)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dependent: ").append(toIndentedString(dependent)).append("\n");
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

