package br.com.senior.hcm.dependent.pojo;

import br.com.senior.hcm.payroll.pojos.Pagination;
import lombok.Data;

@Data
public class DependentListQueryInput {
    /**
     * Id do colaborador
     */
    String employeeId;

    /**
     * Paginação da busca
     */
    Pagination page;

}
