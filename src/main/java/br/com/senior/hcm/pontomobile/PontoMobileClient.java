package br.com.senior.hcm.pontomobile;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import br.com.senior.core.base.BaseClient;
import br.com.senior.core.base.Environment;
import br.com.senior.core.base.ServiceException;
import br.com.senior.hcm.pontomobile.pojos.BlobServiceCommitUploadedFileIn;
import br.com.senior.hcm.pontomobile.pojos.BlobServiceCommitUploadedFileOut;
import br.com.senior.hcm.pontomobile.pojos.BlobServiceRequestUploadFileOut;
import br.com.senior.hcm.pontomobile.pojos.ClockingEventExportByPeriodIn;
import br.com.senior.hcm.pontomobile.pojos.ClockingEventExportOut;
import br.com.senior.hcm.pontomobile.pojos.EmployeesImportByFileId;

public class PontoMobileClient extends BaseClient {

    String token;

    public PontoMobileClient(String token) {
        super("hcm", "pontomobile");
        this.token = token;
    }

    public PontoMobileClient(String token, Environment env) {
        super("hcm", "pontomobile", env);
        this.token = token;
    }

    public EmployeesImportByFileId employeesImportByFileId(String fileId) throws ServiceException {
        JsonObject payload = new JsonObject();
        payload.addProperty("fileId", fileId);
        return execute(getActionsUrl("employeesImportByFileId"), payload, token, EmployeesImportByFileId.class);
    }

    public BlobServiceRequestUploadFileOut blobServiceRequestUploadFile(String fileName) throws ServiceException {
        JsonObject payload = new JsonObject();
        payload.addProperty("fileName", fileName);
        return execute(getActionsUrl("blobServiceRequestUploadFile"), payload, token, BlobServiceRequestUploadFileOut.class);
    }

    public BlobServiceCommitUploadedFileOut blobServiceCommitUploadedFile(BlobServiceCommitUploadedFileIn input) throws ServiceException {
        return execute(getActionsUrl("blobServiceCommitUploadedFile"), input, token, BlobServiceCommitUploadedFileOut.class);
    }

    public ClockingEventExportOut clockingEventExport() throws ServiceException {
        return execute(getActionsUrl("clockingEventExport"), null, token, ClockingEventExportOut.class);
    }

    public ClockingEventExportOut clockingEventExportByPeriod(ClockingEventExportByPeriodIn input) throws ServiceException {
        return execute(getActionsUrl("clockingEventExport"), input, token, ClockingEventExportOut.class);
    }

}
