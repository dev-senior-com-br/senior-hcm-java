package br.com.senior.hcm.payroll.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Dados da paginação
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Pagination {
    /**
     * "Página atual, inicia em 1"
     */
    @NonNull
    int current;

    /**
     * "Quantidade de páginas, inicia em 1"
     */
    @NonNull
    int size;
    /**
     * "Ordenar por"
     */
    Ordination orderBy;
}
