/*
 * Recrutamento e Seleção
 * Serviço do Gestão de Recrutamento e Seleção.
 *
 * OpenAPI spec version: develop-SNAPSHOT
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.hcm.recruitment.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets educationStatusDto
 */
@JsonAdapter(EducationStatusDto.Adapter.class)
public enum EducationStatusDto {
  
  IN_PROGRESS("IN_PROGRESS"),
  
  DONE("DONE");

  private String value;

  EducationStatusDto(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EducationStatusDto fromValue(String text) {
    for (EducationStatusDto b : EducationStatusDto.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EducationStatusDto> {
    @Override
    public void write(final JsonWriter jsonWriter, final EducationStatusDto enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EducationStatusDto read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EducationStatusDto.fromValue(String.valueOf(value));
    }
  }
}
