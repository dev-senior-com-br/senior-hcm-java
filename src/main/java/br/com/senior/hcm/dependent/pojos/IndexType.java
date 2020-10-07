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
 * Gets or Sets indexType
 */
@JsonAdapter(IndexType.Adapter.class)
public enum IndexType {
  
  OTHER("OTHER"),
  
  UFIR("UFIR"),
  
  URV("URV"),
  
  ITRD("ITRD"),
  
  SELIC("SELIC"),
  
  CONTRIBUTION_SALARY_CORRECTION("CONTRIBUTION_SALARY_CORRECTION"),
  
  SAVINGS_CORRECTION("SAVINGS_CORRECTION"),
  
  CURRENCY("CURRENCY");

  private String value;

  IndexType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IndexType fromValue(String text) {
    for (IndexType b : IndexType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<IndexType> {
    @Override
    public void write(final JsonWriter jsonWriter, final IndexType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IndexType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IndexType.fromValue(String.valueOf(value));
    }
  }
}

