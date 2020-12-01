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
 * Gets or Sets hireType
 */
@JsonAdapter(HireType.Adapter.class)
public enum HireType {
  
  EMPTY("Empty"),
  
  FIRSTJOB("FirstJob"),
  
  REEMPREGO("Reemprego"),
  
  TRANSFERWITHONUS("TransferWithOnus"),
  
  TRANSFERWITHOUTONUS("TransferWithoutOnus"),
  
  INCORPORATION("Incorporation"),
  
  REINTEGRATION("Reintegration"),
  
  RECONSTRUCTION("Reconstruction"),
  
  REVERSAL("Reversal"),
  
  PROVISIONAL("Provisional"),
  
  REQUEST("Request"),
  
  REDISTRIBUTION("Redistribution"),
  
  DECENTRALIZED("Decentralized"),
  
  REMOVAL("Removal"),
  
  READAPTATION("Readaptation");

  private String value;

  HireType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static HireType fromValue(String text) {
    for (HireType b : HireType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<HireType> {
    @Override
    public void write(final JsonWriter jsonWriter, final HireType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public HireType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return HireType.fromValue(String.valueOf(value));
    }
  }
}

