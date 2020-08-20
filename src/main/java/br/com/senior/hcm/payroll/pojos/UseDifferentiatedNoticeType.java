/*
 * Folha de Pagamento
 * HCM - Folha de pagamento
 *
 * OpenAPI spec version: 9.0.3
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.hcm.payroll.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets useDifferentiatedNoticeType
 */
@JsonAdapter(UseDifferentiatedNoticeType.Adapter.class)
public enum UseDifferentiatedNoticeType {
  
  _1("TYPE_1"),
  
  _2("TYPE_2"),
  
  _3("TYPE_3"),
  
  _4("TYPE_4"),
  
  _5("TYPE_5");

  private String value;

  UseDifferentiatedNoticeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UseDifferentiatedNoticeType fromValue(String text) {
    for (UseDifferentiatedNoticeType b : UseDifferentiatedNoticeType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<UseDifferentiatedNoticeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final UseDifferentiatedNoticeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UseDifferentiatedNoticeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UseDifferentiatedNoticeType.fromValue(String.valueOf(value));
    }
  }
}

