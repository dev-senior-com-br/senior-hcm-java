package br.com.senior.hcm.dependent.pojos;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class DependentQueryInput {
    /**
     * Id do dependente
     */
    @NonNull
    String dependentId;
}
