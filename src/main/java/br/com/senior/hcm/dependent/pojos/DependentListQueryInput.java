package br.com.senior.hcm.dependent.pojos;

import br.com.senior.hcm.payroll.pojos.Pagination;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class DependentListQueryInput {
    /**
     * Id do colaborador
     */
    @NonNull
    String employeeId;

    /**
     * Paginação da busca
     */
    Pagination page = new Pagination(1, 20);

}
