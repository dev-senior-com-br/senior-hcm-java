package br.com.senior.hcm.pontomobile.pojos;

import java.util.List;

import lombok.Data;

@Data
public class ImportError {
    private List<String> errors;
    private Employee employee;
}
