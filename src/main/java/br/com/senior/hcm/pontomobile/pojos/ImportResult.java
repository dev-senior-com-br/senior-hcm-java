package br.com.senior.hcm.pontomobile.pojos;

import java.util.List;

import lombok.Data;

@Data
public class ImportResult {
    private List<ImportError> importErros;
}
