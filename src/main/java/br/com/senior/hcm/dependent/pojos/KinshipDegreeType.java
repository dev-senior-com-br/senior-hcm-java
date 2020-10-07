/*
 * Dependentes
 * HCM - Gestão de dependentes
 *
 * OpenAPI spec version: 6.2.1
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
 * Gets or Sets kinshipDegreeType
 */
@JsonAdapter(KinshipDegreeType.Adapter.class)
public enum KinshipDegreeType {
  
  ADOPTED("Adopted"),
  
  CHILD("Child"),
  
  CONCUBINE("Concubine"),
  
  EXSPOUSE("ExSpouse"),
  
  EXPARTNER("ExPartner"),
  
  GRANDPARENT("Grandparent"),
  
  GRANDCHILD("Grandchild"),
  
  GREATGRANDPARENT("GreatGrandparent"),
  
  GREATGRANDCHILD("GreatGrandchild"),
  
  GUARDIANSHIP("Guardianship"),
  
  NEPHEWNIECE("NephewNiece"),
  
  OTHER("Other"),
  
  PARENT("Parent"),
  
  FATHERINLAW("FatherInLaw"),
  
  PARTNER("Partner"),
  
  PENSIONERS("Pensioners"),
  
  PUPIL("Pupil"),
  
  SIBLING("Sibling"),
  
  SONDAUGHTERINLAW("SonDaughterInLaw"),
  
  SPOUSE("Spouse"),
  
  STEPFATHER("Stepfather"),
  
  STEPMOTHER("Stepmother"),
  
  STEPCHILD("Stepchild"),
  
  TRUSTED("Trusted"),
  
  UNCLEAUNT("UncleAunt"),
  
  TUTOR("Tutor");

  private String value;

  KinshipDegreeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static KinshipDegreeType fromValue(String text) {
    for (KinshipDegreeType b : KinshipDegreeType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<KinshipDegreeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final KinshipDegreeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public KinshipDegreeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return KinshipDegreeType.fromValue(String.valueOf(value));
    }
  }
}

