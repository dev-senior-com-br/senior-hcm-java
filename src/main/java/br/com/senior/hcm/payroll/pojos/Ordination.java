package br.com.senior.hcm.payroll.pojos;

import lombok.Data;

/**
 * Dados da ordenação
 */
@Data
public class Ordination {
    /**
     * Campo que será ordenado
     */
    String field;

    /**
     * Tipo da ordenação
     */
    DirectionType direction;
}
