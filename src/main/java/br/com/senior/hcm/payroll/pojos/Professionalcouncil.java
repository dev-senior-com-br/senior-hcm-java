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
import br.com.senior.hcm.payroll.pojos.City;
import br.com.senior.hcm.payroll.pojos.ClassOrganType;
import java.io.IOException;

/**
 * Professionalcouncil
 */




public class Professionalcouncil {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("classOrganType")
  private ClassOrganType classOrganType = null;

  @SerializedName("headquarter")
  private City headquarter = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("region")
  private String region = null;

  public Professionalcouncil code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Código conselho profissional
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Código conselho profissional")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Professionalcouncil classOrganType(ClassOrganType classOrganType) {
    this.classOrganType = classOrganType;
    return this;
  }

   /**
   * Get classOrganType
   * @return classOrganType
  **/
  @ApiModelProperty(required = true, value = "")
  public ClassOrganType getClassOrganType() {
    return classOrganType;
  }

  public void setClassOrganType(ClassOrganType classOrganType) {
    this.classOrganType = classOrganType;
  }

  public Professionalcouncil headquarter(City headquarter) {
    this.headquarter = headquarter;
    return this;
  }

   /**
   * Get headquarter
   * @return headquarter
  **/
  @ApiModelProperty(value = "")
  public City getHeadquarter() {
    return headquarter;
  }

  public void setHeadquarter(City headquarter) {
    this.headquarter = headquarter;
  }

  public Professionalcouncil name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Descrição conselho profissional
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Descrição conselho profissional")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Professionalcouncil id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identificador conselho profissional
   * @return id
  **/
  @ApiModelProperty(value = "Identificador conselho profissional")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Professionalcouncil region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Região conselho profissional
   * @return region
  **/
  @ApiModelProperty(required = true, value = "Região conselho profissional")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Professionalcouncil professionalcouncil = (Professionalcouncil) o;
    return Objects.equals(this.code, professionalcouncil.code) &&
        Objects.equals(this.classOrganType, professionalcouncil.classOrganType) &&
        Objects.equals(this.headquarter, professionalcouncil.headquarter) &&
        Objects.equals(this.name, professionalcouncil.name) &&
        Objects.equals(this.id, professionalcouncil.id) &&
        Objects.equals(this.region, professionalcouncil.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, classOrganType, headquarter, name, id, region);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Professionalcouncil {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    classOrganType: ").append(toIndentedString(classOrganType)).append("\n");
    sb.append("    headquarter: ").append(toIndentedString(headquarter)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

