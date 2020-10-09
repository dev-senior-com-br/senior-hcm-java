/*
 * Dependentes
 * HCM - Gestão de dependentes
 *
 * OpenAPI spec version: 6.4.0
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
 * Gets or Sets accountType
 */
@JsonAdapter(AccountType.Adapter.class)
public enum AccountType {
  
  CURRENT_ACCOUNT("CURRENT_ACCOUNT"),
  
  SAVING_ACCOUNT("SAVING_ACCOUNT"),
  
  SALARY_ACCOUNT("SALARY_ACCOUNT"),
  
  OTHER("OTHER");

  private String value;

  AccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccountType fromValue(String text) {
    for (AccountType b : AccountType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccountType.fromValue(String.valueOf(value));
    }
  }
}

