package br.com.senior.hcm.payroll.pojos;

import lombok.Data;

@Data
public class Paged {

    /**
     * Quantidade de registros encontrados
     */
    int countResult;

    /**
     * Quantidade de páginas da consulta (incluindo a atual)
     */
    int numberPages;

}
