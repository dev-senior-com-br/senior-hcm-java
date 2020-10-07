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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets methodPaymentType
 */
@JsonAdapter(MethodPaymentType.Adapter.class)
public enum MethodPaymentType {
  
  BANK_CHECK("BANK_CHECK"),
  
  MONEY("MONEY"),
  
  MONEY_ORDER("MONEY_ORDER"),
  
  BANKING_RELATIONSHIP("BANKING_RELATIONSHIP"),
  
  EXTERNAL("EXTERNAL");

  private String value;

  MethodPaymentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MethodPaymentType fromValue(String text) {
    for (MethodPaymentType b : MethodPaymentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MethodPaymentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final MethodPaymentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MethodPaymentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MethodPaymentType.fromValue(String.valueOf(value));
    }
  }
}

