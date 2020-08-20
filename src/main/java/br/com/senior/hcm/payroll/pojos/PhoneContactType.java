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
 * Gets or Sets phoneContactType
 */
@JsonAdapter(PhoneContactType.Adapter.class)
public enum PhoneContactType {
  
  PERSONAL("Personal"),
  
  PROFESSIONAL("Professional"),
  
  MOBILE("Mobile"),
  
  BUSINESSFAX("BusinessFax"),
  
  PERSONALFAX("PersonalFax"),
  
  OTHER("Other");

  private String value;

  PhoneContactType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PhoneContactType fromValue(String text) {
    for (PhoneContactType b : PhoneContactType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PhoneContactType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PhoneContactType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PhoneContactType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PhoneContactType.fromValue(String.valueOf(value));
    }
  }
}

