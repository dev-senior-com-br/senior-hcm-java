package br.com.senior.hcm.dependent.pojo;

import br.com.senior.hcm.payroll.pojos.Paged;
import lombok.Data;

import java.util.List;

@Data
public class DependentListQueryData extends Paged {
    /**
     * Lista de dependentes
     */
    List<DependentData> dependents;

}
