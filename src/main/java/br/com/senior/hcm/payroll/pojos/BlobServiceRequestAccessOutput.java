package br.com.senior.hcm.payroll.pojos;

import lombok.Data;

@Data
public class BlobServiceRequestAccessOutput {

    /**
     * URI onde o arquivo está disponível para download
     */
    String locationURI;

    /**
     * Flag para indicar sucesso
     */
    boolean ok;

    /**
     * Flag para indicar sucesso com alerta
     */
    boolean warning;

    /**
     * Mensagem de retorno
     */
    String message;
}
