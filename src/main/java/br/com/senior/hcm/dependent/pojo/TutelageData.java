package br.com.senior.hcm.dependent.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class TutelageData {
    /**
     * Id do tutelado
     */
    String id;

    /**
     * Data de inicio da tutela
     */
    Date startDate;

    /**
     * Data final da tutela
     */
    Date endDate;
}
