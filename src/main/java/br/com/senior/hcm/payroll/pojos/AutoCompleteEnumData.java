package br.com.senior.hcm.payroll.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AutoCompleteEnumData {

    /**
     * Chave do enum
     */
    String key;

    /**
     * Valor do enum
     */
    String value;

}
