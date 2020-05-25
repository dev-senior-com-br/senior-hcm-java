package br.com.senior.hcm.recruitment.pojos;

import lombok.Data;

import java.util.Date;

/**
 * Departamento
 */
@Data
public class Department {
    /**
     * Identificador único da entidade
     */
    String id;
    /**
     * Nome
     */
    String name;
    /**
     * Endereço do departamento
     */
    String place;
    /**
     * Codigo do departamento
     */
    String code;
    /**
     * Posicao do departamento
     */
    String position;
    /**
     * Data de Criação
     */
    Date createDate;
    /**
     * Data de Expiração
     */
    Date experitionDate;
}
