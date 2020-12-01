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
 * Gets or Sets stabilityType
 */
@JsonAdapter(StabilityType.Adapter.class)
public enum StabilityType {
  
  NOT_STABLE("NOT_STABLE"),
  
  ELECTED_CIPA("ELECTED_CIPA"),
  
  WORK_ACCIDENT("WORK_ACCIDENT"),
  
  MATERNITY_ASSISTANCE("MATERNITY_ASSISTANCE"),
  
  MILITARY_SERVICE("MILITARY_SERVICE"),
  
  UNION_MANDATE("UNION_MANDATE"),
  
  GOVERNMENT_EMPLOYEE("GOVERNMENT_EMPLOYEE"),
  
  RETURN_HOLIDAYS("RETURN_HOLIDAYS"),
  
  SICK_PAY("SICK_PAY"),
  
  NEAR_RETIREMENT("NEAR_RETIREMENT"),
  
  COLLECTIVE_AGREEMENT("COLLECTIVE_AGREEMENT"),
  
  PREVIOUS_TIME_FGTS_OPTION("PREVIOUS_TIME_FGTS_OPTION"),
  
  NOT_OPTING_FGTS("NOT_OPTING_FGTS"),
  
  CIPA_EMPLOYER("CIPA_EMPLOYER"),
  
  MEMBER_OF_COMMISSION_FOR_PRIOR_CONCILIATION("MEMBER_OF_COMMISSION_FOR_PRIOR_CONCILIATION"),
  
  MEMBER_OF_FGTS_CURATOR_COUNCIL("MEMBER_OF_FGTS_CURATOR_COUNCIL"),
  
  MEMBER_OF_NATIONAL_COUNCIL_OF_SOCIAL_SECURITY("MEMBER_OF_NATIONAL_COUNCIL_OF_SOCIAL_SECURITY"),
  
  EDUCATION_AID("EDUCATION_AID"),
  
  CONSUMER_COOPERATIVE("CONSUMER_COOPERATIVE"),
  
  CREDIT_UNION("CREDIT_UNION"),
  
  PERSON_WITH_DISABILITY("PERSON_WITH_DISABILITY"),
  
  COOPERATIVE_OF_SYNDICATE("COOPERATIVE_OF_SYNDICATE"),
  
  CIPATR("CIPATR"),
  
  PATERNITY_LEAVE("PATERNITY_LEAVE"),
  
  ELECTORAL_MANDATE("ELECTORAL_MANDATE"),
  
  CIPA_CANDIDATE("CIPA_CANDIDATE"),
  
  ELECT_ALTERNATE_CIPA("ELECT_ALTERNATE_CIPA"),
  
  OTHER("OTHER"),
  
  ELECTED_EMPLOYEE_REPRESENTATIVES_COMMITTEE("ELECTED_EMPLOYEE_REPRESENTATIVES_COMMITTEE"),
  
  JOURNEY_REDUCTION_LAW_14_020_2020_25_50("JOURNEY_REDUCTION_LAW_14_020_2020_25_50"),
  
  JOURNEY_REDUCTION_LAW_14_020_2020_50_70("JOURNEY_REDUCTION_LAW_14_020_2020_50_70"),
  
  JOURNEY_REDUCTION_LAW_14_020_2020_70("JOURNEY_REDUCTION_LAW_14_020_2020_70"),
  
  TEMPORARY_SUSPENSION_LAW_14_020_2020("TEMPORARY_SUSPENSION_LAW_14_020_2020"),
  
  GESTATION_PERIOD("GESTATION_PERIOD");

  private String value;

  StabilityType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StabilityType fromValue(String text) {
    for (StabilityType b : StabilityType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StabilityType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StabilityType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StabilityType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StabilityType.fromValue(String.valueOf(value));
    }
  }
}

