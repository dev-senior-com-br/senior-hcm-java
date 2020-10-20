/*
 * Dependentes
 * HCM - Gestão de dependentes
 *
 * OpenAPI spec version: 6.4.2
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
 * Gets or Sets maritalStatusType
 */
@JsonAdapter(MaritalStatusType.Adapter.class)
public enum MaritalStatusType {
  
  SINGLE("Single"),
  
  MARRIED("Married"),
  
  DIVORCED("Divorced"),
  
  WIDOWER("Widower"),
  
  CONCUBINAGE("Concubinage"),
  
  SEPARATED("Separated"),
  
  STABLEUNION("StableUnion"),
  
  OTHERS("Others");

  private String value;

  MaritalStatusType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MaritalStatusType fromValue(String text) {
    for (MaritalStatusType b : MaritalStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MaritalStatusType> {
    @Override
    public void write(final JsonWriter jsonWriter, final MaritalStatusType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MaritalStatusType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MaritalStatusType.fromValue(String.valueOf(value));
    }
  }
}

