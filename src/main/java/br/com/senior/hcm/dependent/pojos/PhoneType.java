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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets phoneType
 */
@JsonAdapter(PhoneType.Adapter.class)
public enum PhoneType {
  
  PERSONAL("PERSONAL"),
  
  PROFESSIONAL("PROFESSIONAL"),
  
  MOBILE("MOBILE"),
  
  BUSINESS_FAX("BUSINESS_FAX"),
  
  PERSONAL_FAX("PERSONAL_FAX"),
  
  OTHER("OTHER");

  private String value;

  PhoneType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PhoneType fromValue(String text) {
    for (PhoneType b : PhoneType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PhoneType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PhoneType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PhoneType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PhoneType.fromValue(String.valueOf(value));
    }
  }
}

