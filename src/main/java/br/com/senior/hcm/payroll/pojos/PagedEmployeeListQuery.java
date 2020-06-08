package br.com.senior.hcm.payroll.pojos;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PagedEmployeeListQuery extends Paged {
    /**
     * Colaboradores
     */
    List<EmployeeListQueryData> employees;
}
