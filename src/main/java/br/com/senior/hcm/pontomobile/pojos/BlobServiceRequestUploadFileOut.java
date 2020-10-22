package br.com.senior.hcm.pontomobile.pojos;

import lombok.Data;

@Data
public class BlobServiceRequestUploadFileOut {

    private String fileId;
    private String version;
    private String locationURI;
}
