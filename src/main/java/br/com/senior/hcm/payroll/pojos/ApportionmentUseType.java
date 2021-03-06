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
 * Gets or Sets apportionmentUseType
 */
@JsonAdapter(ApportionmentUseType.Adapter.class)
public enum ApportionmentUseType {
  
  DONT_USE_APPORTIONMENT("DONT_USE_APPORTIONMENT"),
  
  APPORTIONMENT_BY_DEPARTMENT("APPORTIONMENT_BY_DEPARTMENT"),
  
  APPORTIONMENT_BY_COST_CENTER("APPORTIONMENT_BY_COST_CENTER");

  private String value;

  ApportionmentUseType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ApportionmentUseType fromValue(String text) {
    for (ApportionmentUseType b : ApportionmentUseType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ApportionmentUseType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ApportionmentUseType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ApportionmentUseType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ApportionmentUseType.fromValue(String.valueOf(value));
    }
  }
}

