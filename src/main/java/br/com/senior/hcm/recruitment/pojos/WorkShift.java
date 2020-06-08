package br.com.senior.hcm.recruitment.pojos;

import lombok.Data;

@Data
public class WorkShift {
    /**
     * Identificador do turno de trabalho
     */
    String id;
    /**
     * Código do turno de trabalho
     */
    int code;
    /**
     * Descrição do turno
     */
    String description;

    /**
     * Turno
     */
    ShiftDto shift;
}
