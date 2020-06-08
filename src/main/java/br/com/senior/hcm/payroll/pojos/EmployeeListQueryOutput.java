package br.com.senior.hcm.payroll.pojos;

import lombok.Data;

@Data
public class EmployeeListQueryOutput {

    /**
     * Retorno da consulta
     */
    PagedEmployeeListQuery result;

}