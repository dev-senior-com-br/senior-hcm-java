package br.com.senior.hcm.payroll.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Dados da paginação
 */
@Data
@AllArgsConstructor
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

    public Pagination(int current, int size) {
        this.size = size;
        this.current = current;
    }
}
