package br.com.senior.hcm.pontomobile.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class BlobServiceCommitUploadedFileIn {

    @NonNull
    private String fileId;

    @NonNull
    private String version;
}
