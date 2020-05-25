package br.com.senior.hcm.recruitment.pojos;

import lombok.Data;

import java.util.List;

@Data
public class SearchPersonsOutput {

    /**
     * Lista de pessoas que atendem os filtrosnome
     * completo de acordo com a à expressão informada
     */
    List<Person> people;

}
