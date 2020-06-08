package br.com.senior.hcm.dependent.pojo;

import lombok.Data;

@Data
public class Person {
    /**
     * Id da pessoa
     */
    String id;

    /**
     * Primeiro nome
     */
    String firstname;

    /**
     * Segundo nome
     */
    String middlename;

    /**
     * Último nome
     */
    String lastname;

    /**
     * Id do upload da foto da g7
     */
    String attachment;
}
