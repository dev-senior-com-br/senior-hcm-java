package br.com.senior.hcm.dependent.pojo;

import lombok.Data;

import java.util.Date;

/**
 * Controles do dependente para plano de saúde
 */
@Data
public class DependentHealthInsuranceData {
    /**
     * Id da entidade
     */
    String id;
    /**
     * Matrícula
     */
    int registration;
    /**
     * Data da inclusão
     */
    Date startDate;
    /**
     * Data da exclusão
     */
    Date endDate;
}
