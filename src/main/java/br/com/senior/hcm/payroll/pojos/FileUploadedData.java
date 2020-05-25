package br.com.senior.hcm.payroll.pojos;

import lombok.Data;

@Data
public class FileUploadedData {
    /**
     * Id do anexo na base de dados
     */
    String attachmentId;

    /**
     * O identificador único do arquivo.
     * Composto pelo ID + o nome do arquivo, separados por /
     */
    String fileId;

    /**
     * Versão do arquivo
     */
    String version;

    /**
     * Se for verdadeiro, entende que o arquivo é uma foto,
     * e que deve ser criada a foto e seu Thumbnail(128X128px)
     */
    String thumbnail;

    /**
     * Url do arquivo permanente
     */
    String permanentUrl;

}
