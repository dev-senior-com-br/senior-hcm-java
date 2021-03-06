/*
 * Recrutamento e Seleção
 * Serviço do Gestão de Recrutamento e Seleção.
 *
 * OpenAPI spec version: 16.0.1
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
 * Gets or Sets employmentContractDto
 */
@JsonAdapter(EmploymentContractDto.Adapter.class)
public enum EmploymentContractDto {
  
  YOUNG_APPRENTICE("YOUNG_APPRENTICE"),
  
  CLT("CLT"),
  
  INTERN("INTERN");

  private String value;

  EmploymentContractDto(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EmploymentContractDto fromValue(String text) {
    for (EmploymentContractDto b : EmploymentContractDto.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EmploymentContractDto> {
    @Override
    public void write(final JsonWriter jsonWriter, final EmploymentContractDto enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EmploymentContractDto read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EmploymentContractDto.fromValue(String.valueOf(value));
    }
  }
}

