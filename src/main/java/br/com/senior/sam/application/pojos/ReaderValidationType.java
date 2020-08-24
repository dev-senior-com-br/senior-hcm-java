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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets readerValidationType
 */
@JsonAdapter(ReaderValidationType.Adapter.class)
public enum ReaderValidationType {
  
  BLOCK_ACCESS("BLOCK_ACCESS"),
  
  CARD("CARD"),
  
  CARD_OR_PIN("CARD_OR_PIN"),
  
  CARD_AND_PIN("CARD_AND_PIN"),
  
  ALLOW_ACCESS("ALLOW_ACCESS"),
  
  FACILITY_CODE("FACILITY_CODE");

  private String value;

  ReaderValidationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReaderValidationType fromValue(String text) {
    for (ReaderValidationType b : ReaderValidationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ReaderValidationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReaderValidationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReaderValidationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReaderValidationType.fromValue(String.valueOf(value));
    }
  }
}

