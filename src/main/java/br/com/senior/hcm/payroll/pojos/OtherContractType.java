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
 * Gets or Sets otherContractType
 */
@JsonAdapter(OtherContractType.Adapter.class)
public enum OtherContractType {
  
  SINGLE_CONTRACT("SINGLE_CONTRACT"),
  
  OTHER_CONTRACT_OFF_SYSTEM("OTHER_CONTRACT_OFF_SYSTEM"),
  
  OTHER_CONTRACT_WITHIN_SYSTEM("OTHER_CONTRACT_WITHIN_SYSTEM"),
  
  CONTRACT_OUT_SAME_CPF("CONTRACT_OUT_SAME_CPF");

  private String value;

  OtherContractType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OtherContractType fromValue(String text) {
    for (OtherContractType b : OtherContractType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OtherContractType> {
    @Override
    public void write(final JsonWriter jsonWriter, final OtherContractType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OtherContractType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OtherContractType.fromValue(String.valueOf(value));
    }
  }
}

