package br.com.senior.hcm.payroll.pojos;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class EmployeeQueryInput {

    /**
     * Id do colaborador
     */
    @NonNull
    String employeeId;

    /**
     * Data de referência
     */
    @NonNull
    String referenceDate;
}
