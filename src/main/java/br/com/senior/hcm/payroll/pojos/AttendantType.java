/*
 * Folha de Pagamento
 * HCM - Folha de pagamento
 *
 *
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
 * Gets or Sets attendantType
 */
@JsonAdapter(AttendantType.Adapter.class)
public enum AttendantType {
  
  INTERNAL("INTERNAL"),
  
  EXTERNAL("EXTERNAL");

  private String value;

  AttendantType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AttendantType fromValue(String text) {
    for (AttendantType b : AttendantType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AttendantType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AttendantType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AttendantType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AttendantType.fromValue(String.valueOf(value));
    }
  }
}

