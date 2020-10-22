package br.com.senior.examples.pontomobile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import br.com.senior.core.base.ServiceException;
import br.com.senior.examples.Authentication;
import br.com.senior.hcm.pontomobile.PontoMobileClient;
import br.com.senior.hcm.pontomobile.pojos.BlobServiceCommitUploadedFileIn;
import br.com.senior.hcm.pontomobile.pojos.BlobServiceRequestUploadFileOut;
import br.com.senior.hcm.pontomobile.pojos.ClockingEventExportByPeriodIn;
import br.com.senior.hcm.pontomobile.pojos.ClockingEventExportOut;
import br.com.senior.hcm.pontomobile.pojos.ClockingEventPeriod;

public class PontoMobileClientExample {

    private static PontoMobileClient client;
    private static final String filename = "pontomobile.txt";
    private static String filePath = "examples/src/main/resources";

    public static void main(String[] args) throws ServiceException, IOException {
        client = new PontoMobileClient(Authentication.login());
        final BlobServiceRequestUploadFileOut blobDetails = client.blobServiceRequestUploadFile(filename);
        System.out.println("Requested upload file");
        final Path path = Paths.get(filePath, filename);
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            HttpPost post = new HttpPost(blobDetails.getLocationURI());
            post.setHeader("Content-Type", "text/plain");
            post.setEntity(new StringEntity(Files.readString(path)));
            final CloseableHttpResponse response = httpClient.execute(post);
            response.close();
            System.out.println("Uploaded file");
        } finally {
            httpClient.close();
        }
        client.blobServiceCommitUploadedFile(new BlobServiceCommitUploadedFileIn(blobDetails.getFileId(), blobDetails.getVersion()));
        System.out.println("Commited file");
        client.employeesImportByFileId(blobDetails.getFileId());
        System.out.println("Employee imported!");

        final ClockingEventExportOut byPeriod = client.clockingEventExportByPeriod(
                new ClockingEventExportByPeriodIn("TXT",
                        new ClockingEventPeriod("2020-10-10", "2020-10-15")));
        System.out.println("Exported by period: " + byPeriod.getLocationURI());

        final ClockingEventExportOut eventExport = client.clockingEventExport();
        System.out.println("Exported by period: " + eventExport.getLocationURI());
    }
}
