package br.com.senior.hcm.pontomobile.pojos;

import java.util.Date;

import lombok.Data;

@Data
public class Company {
    private String id;
    private String cnpj;
    private String name;
    private Date dataOrigin;
}
