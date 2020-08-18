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
 * Gets or Sets fgtsPensionType
 */
@JsonAdapter(FgtsPensionType.Adapter.class)
public enum FgtsPensionType {
  
  NOT_APPLICABLE("NOT_APPLICABLE"),
  
  VALUE("VALUE"),
  
  PERCENTAGE("PERCENTAGE");

  private String value;

  FgtsPensionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FgtsPensionType fromValue(String text) {
    for (FgtsPensionType b : FgtsPensionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<FgtsPensionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FgtsPensionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FgtsPensionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FgtsPensionType.fromValue(String.valueOf(value));
    }
  }
}
