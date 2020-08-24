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
 * Gets or Sets credentialOwner
 */
@JsonAdapter(CredentialOwner.Adapter.class)
public enum CredentialOwner {
  
  PERSON("PERSON"),
  
  VEHICLE("VEHICLE");

  private String value;

  CredentialOwner(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CredentialOwner fromValue(String text) {
    for (CredentialOwner b : CredentialOwner.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CredentialOwner> {
    @Override
    public void write(final JsonWriter jsonWriter, final CredentialOwner enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CredentialOwner read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CredentialOwner.fromValue(String.valueOf(value));
    }
  }
}

