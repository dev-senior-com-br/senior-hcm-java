package br.com.senior.hcm.recruitment.pojos;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class VacancyDetailsSummaryInput {
    /**
     * ID da vaga
     */
    @NonNull
    String vacancyId;
}
