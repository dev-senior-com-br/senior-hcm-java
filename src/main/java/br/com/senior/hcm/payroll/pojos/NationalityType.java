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
 * Gets or Sets nationalityType
 */
@JsonAdapter(NationalityType.Adapter.class)
public enum NationalityType {
  
  BRAZILIAN("BRAZILIAN"),
  
  NATURALIZED_BRAZILIAN("NATURALIZED_BRAZILIAN"),
  
  ARGENTINE("ARGENTINE"),
  
  BOLIVIAN("BOLIVIAN"),
  
  CHILEAN("CHILEAN"),
  
  PARAGUAYAN("PARAGUAYAN"),
  
  URUGUAYAN("URUGUAYAN"),
  
  VENEZULAN("VENEZULAN"),
  
  COLOMBIAN("COLOMBIAN"),
  
  PERUVIAN("PERUVIAN"),
  
  EQUATORIAN("EQUATORIAN"),
  
  GERMAN("GERMAN"),
  
  BELGIAN("BELGIAN"),
  
  BRITISH("BRITISH"),
  
  CANADIAN("CANADIAN"),
  
  SPANISH("SPANISH"),
  
  NORTH_AMERICAN("NORTH_AMERICAN"),
  
  FRENCH("FRENCH"),
  
  SWISS("SWISS"),
  
  ITALIAN("ITALIAN"),
  
  HAITIAN("HAITIAN"),
  
  JAPANESE("JAPANESE"),
  
  CHINESE("CHINESE"),
  
  KOREAN("KOREAN"),
  
  RUSSIAN("RUSSIAN"),
  
  PORTUGUESE("PORTUGUESE"),
  
  SWENDISH("SWENDISH"),
  
  FINNISH("FINNISH"),
  
  OTHER_LATIN_AMERICANS("OTHER_LATIN_AMERICANS"),
  
  OTHER_ASIANS("OTHER_ASIANS"),
  
  ENGALIAN("ENGALIAN"),
  
  OTHER_EUROPEAN("OTHER_EUROPEAN"),
  
  ANGOLAN("ANGOLAN"),
  
  CONGOLES("CONGOLES"),
  
  SOUTH_AFRICAN("SOUTH_AFRICAN"),
  
  PAKISTANI("PAKISTANI"),
  
  INDIAN("INDIAN"),
  
  GANES("GANES"),
  
  SENEGALESE("SENEGALESE"),
  
  OTHER_AMERICANS("OTHER_AMERICANS"),
  
  OTHERS("OTHERS");

  private String value;

  NationalityType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NationalityType fromValue(String text) {
    for (NationalityType b : NationalityType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<NationalityType> {
    @Override
    public void write(final JsonWriter jsonWriter, final NationalityType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NationalityType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NationalityType.fromValue(String.valueOf(value));
    }
  }
}

