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
import br.com.senior.hcm.payroll.pojos.Country;
import java.io.IOException;

/**
 * State
 */

public class State {
  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("abbreviation")
  private String abbreviation = null;

  @SerializedName("countryId")
  private Country countryId = null;

  public State name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome do estado
   * @return name
  **/
  @ApiModelProperty(value = "Nome do estado")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public State id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id do estado
   * @return id
  **/
  @ApiModelProperty(value = "Id do estado")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public State abbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

   /**
   * Abreviação do nome do estado
   * @return abbreviation
  **/
  @ApiModelProperty(value = "Abreviação do nome do estado")
  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public State countryId(Country countryId) {
    this.countryId = countryId;
    return this;
  }

   /**
   * Get countryId
   * @return countryId
  **/
  @ApiModelProperty(value = "")
  public Country getCountryId() {
    return countryId;
  }

  public void setCountryId(Country countryId) {
    this.countryId = countryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    State state = (State) o;
    return Objects.equals(this.name, state.name) &&
        Objects.equals(this.id, state.id) &&
        Objects.equals(this.abbreviation, state.abbreviation) &&
        Objects.equals(this.countryId, state.countryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, abbreviation, countryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class State {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
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

