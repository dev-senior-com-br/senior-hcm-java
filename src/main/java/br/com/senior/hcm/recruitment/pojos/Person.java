package br.com.senior.hcm.recruitment.pojos;

import lombok.Data;

/**
 * Pessoa
 */
@Data
public class Person {
    /**
     * Identificador único da entidade
     */
    String id;

    /**
     * Nome completo da pessoa
     */
    String fullName;

    /**
     * Nome de usuário da pessoa
     */
    String username;

    /**
     * Link foto
     */
    String photoLink;

    /**
     * Link foto miniatura
     */
    String photoThumbnailLink;
}
