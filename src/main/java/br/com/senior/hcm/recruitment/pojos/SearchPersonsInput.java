package br.com.senior.hcm.recruitment.pojos;

import lombok.Data;

import java.util.Date;

@Data
public class SearchPersonsInput {
    /**
     * Expressão a ser encontrada,
     * a busca é efetuada no nome completo do colaborador.
     */
    String q;
    /**
     * Data de referência da pesquisa
     */
    Date referenceDate;
}
