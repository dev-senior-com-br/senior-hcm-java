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
import br.com.senior.hcm.payroll.pojos.Workshift;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * WorkshiftGroup
 */

public class WorkshiftGroup {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("baseDate")
  private LocalDate baseDate = null;

  @SerializedName("workshift")
  private Workshift workshift = null;

  @SerializedName("id")
  private String id = null;

  public WorkshiftGroup code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Código da turma de escala
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Código da turma de escala")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public WorkshiftGroup baseDate(LocalDate baseDate) {
    this.baseDate = baseDate;
    return this;
  }

   /**
   * Data base da turma
   * @return baseDate
  **/
  @ApiModelProperty(required = true, value = "Data base da turma")
  public LocalDate getBaseDate() {
    return baseDate;
  }

  public void setBaseDate(LocalDate baseDate) {
    this.baseDate = baseDate;
  }

  public WorkshiftGroup workshift(Workshift workshift) {
    this.workshift = workshift;
    return this;
  }

   /**
   * Get workshift
   * @return workshift
  **/
  @ApiModelProperty(required = true, value = "")
  public Workshift getWorkshift() {
    return workshift;
  }

  public void setWorkshift(Workshift workshift) {
    this.workshift = workshift;
  }

  public WorkshiftGroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id da turma de escala
   * @return id
  **/
  @ApiModelProperty(value = "Id da turma de escala")
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
    WorkshiftGroup workshiftGroup = (WorkshiftGroup) o;
    return Objects.equals(this.code, workshiftGroup.code) &&
        Objects.equals(this.baseDate, workshiftGroup.baseDate) &&
        Objects.equals(this.workshift, workshiftGroup.workshift) &&
        Objects.equals(this.id, workshiftGroup.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, baseDate, workshift, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkshiftGroup {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    baseDate: ").append(toIndentedString(baseDate)).append("\n");
    sb.append("    workshift: ").append(toIndentedString(workshift)).append("\n");
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

