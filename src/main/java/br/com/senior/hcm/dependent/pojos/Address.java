/*
 * Dependentes
 * HCM - Gestão de dependentes
 *
 * OpenAPI spec version: 6.0.0
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
import br.com.senior.hcm.dependent.pojos.AddressType;
import br.com.senior.hcm.dependent.pojos.City;
import br.com.senior.hcm.dependent.pojos.Neighborhood;
import java.io.IOException;

/**
 * Address
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-14T14:43:38.281Z")



public class Address {
  @SerializedName("neighborhoodId")
  private Neighborhood neighborhoodId = null;

  @SerializedName("number")
  private String number = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("postalcode")
  private String postalcode = null;

  @SerializedName("additional")
  private String additional = null;

  @SerializedName("addresstype")
  private AddressType addresstype = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("cityId")
  private City cityId = null;

  public Address neighborhoodId(Neighborhood neighborhoodId) {
    this.neighborhoodId = neighborhoodId;
    return this;
  }

   /**
   * Get neighborhoodId
   * @return neighborhoodId
  **/
  @ApiModelProperty(value = "")
  public Neighborhood getNeighborhoodId() {
    return neighborhoodId;
  }

  public void setNeighborhoodId(Neighborhood neighborhoodId) {
    this.neighborhoodId = neighborhoodId;
  }

  public Address number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Número do endereço.
   * @return number
  **/
  @ApiModelProperty(value = "Número do endereço.")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Address address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Endereço.
   * @return address
  **/
  @ApiModelProperty(value = "Endereço.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Address postalcode(String postalcode) {
    this.postalcode = postalcode;
    return this;
  }

   /**
   * Código postal do endereço (CEP)
   * @return postalcode
  **/
  @ApiModelProperty(value = "Código postal do endereço (CEP)")
  public String getPostalcode() {
    return postalcode;
  }

  public void setPostalcode(String postalcode) {
    this.postalcode = postalcode;
  }

  public Address additional(String additional) {
    this.additional = additional;
    return this;
  }

   /**
   * Informação adicional referente ao endereço.
   * @return additional
  **/
  @ApiModelProperty(value = "Informação adicional referente ao endereço.")
  public String getAdditional() {
    return additional;
  }

  public void setAdditional(String additional) {
    this.additional = additional;
  }

  public Address addresstype(AddressType addresstype) {
    this.addresstype = addresstype;
    return this;
  }

   /**
   * Get addresstype
   * @return addresstype
  **/
  @ApiModelProperty(value = "")
  public AddressType getAddresstype() {
    return addresstype;
  }

  public void setAddresstype(AddressType addresstype) {
    this.addresstype = addresstype;
  }

  public Address id(String id) {
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

  public Address cityId(City cityId) {
    this.cityId = cityId;
    return this;
  }

   /**
   * Get cityId
   * @return cityId
  **/
  @ApiModelProperty(value = "")
  public City getCityId() {
    return cityId;
  }

  public void setCityId(City cityId) {
    this.cityId = cityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.neighborhoodId, address.neighborhoodId) &&
        Objects.equals(this.number, address.number) &&
        Objects.equals(this.address, address.address) &&
        Objects.equals(this.postalcode, address.postalcode) &&
        Objects.equals(this.additional, address.additional) &&
        Objects.equals(this.addresstype, address.addresstype) &&
        Objects.equals(this.id, address.id) &&
        Objects.equals(this.cityId, address.cityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(neighborhoodId, number, address, postalcode, additional, addresstype, id, cityId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    neighborhoodId: ").append(toIndentedString(neighborhoodId)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    postalcode: ").append(toIndentedString(postalcode)).append("\n");
    sb.append("    additional: ").append(toIndentedString(additional)).append("\n");
    sb.append("    addresstype: ").append(toIndentedString(addresstype)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cityId: ").append(toIndentedString(cityId)).append("\n");
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

