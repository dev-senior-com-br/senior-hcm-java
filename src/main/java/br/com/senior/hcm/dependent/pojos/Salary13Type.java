/*
 * Dependentes
 * HCM - Gestão de dependentes
 *
 * OpenAPI spec version: 6.2.0
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
 * Gets or Sets salary13Type
 */
@JsonAdapter(Salary13Type.Adapter.class)
public enum Salary13Type {
  
  YES("YES"),
  
  NO("NO"),
  
  PARTIAL("PARTIAL");

  private String value;

  Salary13Type(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Salary13Type fromValue(String text) {
    for (Salary13Type b : Salary13Type.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Salary13Type> {
    @Override
    public void write(final JsonWriter jsonWriter, final Salary13Type enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Salary13Type read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Salary13Type.fromValue(String.valueOf(value));
    }
  }
}

