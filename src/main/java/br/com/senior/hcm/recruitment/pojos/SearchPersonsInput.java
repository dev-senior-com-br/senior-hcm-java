package br.com.senior.hcm.recruitment.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class SearchPersonsInput {
    /**
     * Expressão a ser encontrada,
     * a busca é efetuada no nome completo do colaborador.
     */
    String q;

    /**
     * Data de referência da pesquisa
     */
    @NonNull
    String referenceDate;
}
