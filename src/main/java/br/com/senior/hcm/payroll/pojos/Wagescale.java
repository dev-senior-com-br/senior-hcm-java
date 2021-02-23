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
import br.com.senior.hcm.payroll.pojos.SalaryType;
import java.io.IOException;

/**
 * Wagescale
 */

public class Wagescale {
  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("salarytype")
  private SalaryType salarytype = null;

  @SerializedName("marketlevel")
  private Integer marketlevel = null;

  public Wagescale name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome da estrutura salarial
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Nome da estrutura salarial")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Wagescale id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID da estrutura salarial
   * @return id
  **/
  @ApiModelProperty(value = "ID da estrutura salarial")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Wagescale salarytype(SalaryType salarytype) {
    this.salarytype = salarytype;
    return this;
  }

   /**
   * Get salarytype
   * @return salarytype
  **/
  @ApiModelProperty(required = true, value = "")
  public SalaryType getSalarytype() {
    return salarytype;
  }

  public void setSalarytype(SalaryType salarytype) {
    this.salarytype = salarytype;
  }

  public Wagescale marketlevel(Integer marketlevel) {
    this.marketlevel = marketlevel;
    return this;
  }

   /**
   * Sequência que corresponde ao salário de mercado
   * @return marketlevel
  **/
  @ApiModelProperty(required = true, value = "Sequência que corresponde ao salário de mercado")
  public Integer getMarketlevel() {
    return marketlevel;
  }

  public void setMarketlevel(Integer marketlevel) {
    this.marketlevel = marketlevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wagescale wagescale = (Wagescale) o;
    return Objects.equals(this.name, wagescale.name) &&
        Objects.equals(this.id, wagescale.id) &&
        Objects.equals(this.salarytype, wagescale.salarytype) &&
        Objects.equals(this.marketlevel, wagescale.marketlevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, salarytype, marketlevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wagescale {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    salarytype: ").append(toIndentedString(salarytype)).append("\n");
    sb.append("    marketlevel: ").append(toIndentedString(marketlevel)).append("\n");
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

