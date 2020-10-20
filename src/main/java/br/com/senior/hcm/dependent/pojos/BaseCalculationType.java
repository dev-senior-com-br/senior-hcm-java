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
 * Gets or Sets baseCalculationType
 */
@JsonAdapter(BaseCalculationType.Adapter.class)
public enum BaseCalculationType {
  
  FIXED("FIXED"),
  
  VARIABLE("VARIABLE");

  private String value;

  BaseCalculationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BaseCalculationType fromValue(String text) {
    for (BaseCalculationType b : BaseCalculationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BaseCalculationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BaseCalculationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BaseCalculationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BaseCalculationType.fromValue(String.valueOf(value));
    }
  }
}

