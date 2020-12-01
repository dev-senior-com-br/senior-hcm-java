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
 * Gets or Sets additionalPaymentType
 */
@JsonAdapter(AdditionalPaymentType.Adapter.class)
public enum AdditionalPaymentType {
  
  _0("TYPE_0"),
  
  _1("TYPE_1"),
  
  _2("TYPE_2"),
  
  _3("TYPE_3"),
  
  _4("TYPE_4"),
  
  _5("TYPE_5"),
  
  _6("TYPE_6"),
  
  _7("TYPE_7"),
  
  _8("TYPE_8"),
  
  _9("TYPE_9");

  private String value;

  AdditionalPaymentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdditionalPaymentType fromValue(String text) {
    for (AdditionalPaymentType b : AdditionalPaymentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdditionalPaymentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdditionalPaymentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdditionalPaymentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdditionalPaymentType.fromValue(String.valueOf(value));
    }
  }
}

