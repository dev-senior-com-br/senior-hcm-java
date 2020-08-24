/*
 * Aplicação
 * Serviço do backend da aplicação do Ronda senior X
 *
 * OpenAPI spec version: 4.7.0
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.sam.application.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import br.com.senior.sam.application.pojos.AccessCall;
import br.com.senior.sam.application.pojos.InputDevice;
import java.io.IOException;

/**
 * InputDeviceAccessCall
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-24T13:38:01.755Z")



public class InputDeviceAccessCall {
  @SerializedName("accessCall")
  private AccessCall accessCall = null;

  @SerializedName("inputDevice")
  private InputDevice inputDevice = null;

  @SerializedName("id")
  private Integer id = null;

  public InputDeviceAccessCall accessCall(AccessCall accessCall) {
    this.accessCall = accessCall;
    return this;
  }

   /**
   * Get accessCall
   * @return accessCall
  **/
  @ApiModelProperty(value = "")
  public AccessCall getAccessCall() {
    return accessCall;
  }

  public void setAccessCall(AccessCall accessCall) {
    this.accessCall = accessCall;
  }

  public InputDeviceAccessCall inputDevice(InputDevice inputDevice) {
    this.inputDevice = inputDevice;
    return this;
  }

   /**
   * Get inputDevice
   * @return inputDevice
  **/
  @ApiModelProperty(value = "")
  public InputDevice getInputDevice() {
    return inputDevice;
  }

  public void setInputDevice(InputDevice inputDevice) {
    this.inputDevice = inputDevice;
  }

  public InputDeviceAccessCall id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(value = "ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
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
    InputDeviceAccessCall inputDeviceAccessCall = (InputDeviceAccessCall) o;
    return Objects.equals(this.accessCall, inputDeviceAccessCall.accessCall) &&
        Objects.equals(this.inputDevice, inputDeviceAccessCall.inputDevice) &&
        Objects.equals(this.id, inputDeviceAccessCall.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCall, inputDevice, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputDeviceAccessCall {\n");
    
    sb.append("    accessCall: ").append(toIndentedString(accessCall)).append("\n");
    sb.append("    inputDevice: ").append(toIndentedString(inputDevice)).append("\n");
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

