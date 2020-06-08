package br.com.senior.hcm.payroll.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AutoCompleteData {
    /**
     * Id da tabela
     */
    String tableId;

    /**
     * Descrição da tabela
     */
    String name;
}
