package br.com.senior.hcm.recruitment.pojos;

import br.com.senior.hcm.payroll.pojos.Paged;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Retorno paginado das vagas
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ListVacanciesOutput extends Paged {

    /**
     * Vagas ordenadas
     */
    List<VacancyCard> vacancies;

}
