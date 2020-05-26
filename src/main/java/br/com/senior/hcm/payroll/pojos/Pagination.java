package br.com.senior.hcm.payroll.pojos;

import lombok.Data;

/**
 * Dados da paginação
 */
@Data
public class Pagination {
    /**
     * "Página atual, inicia em 1"
     */
    int current;

    /**
     * "Quantidade de páginas, inicia em 1"
     */
    int size;
    /**
     * "Ordenar por"
     */
    Ordination orderBy;
}
