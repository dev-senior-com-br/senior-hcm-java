package br.com.senior.hcm.payroll.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class BlobServiceRequestAccessInput {

    /**
     * O identificador único do arquivo.
     * Composto pelo ID + o nome do arquivo (separados por /)
     **/
    @NonNull
    String fileId;

    /**
     * Tempo em minutos que o arquivo deve ficar disponível
     * para download no link que será retornado (padrão 30 minutos)
     */
    long ttl;

    /**
     * Se for verdadeiro, entende que o arquivo é uma foto
     * e que deve ser retornado seu Thumbnail(128X128px)
     */
    boolean thumbnail;
}
