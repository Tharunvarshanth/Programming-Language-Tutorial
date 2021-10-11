import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class HttpGet{
  
  public void downloadAndReadFile(String fileUrl, String username, String password) throws IOException {

        HttpGet httpGet = new HttpGet(fileUrl);
        System.out.println(httpGet.getURI());
        String auth = username  + ":" + password;
        byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(StandardCharsets.UTF_8));
        String authHeader = "BASIC" + new String(encodedAuth, StandardCharsets.UTF_8);
        httpGet.setHeader(HttpHeaders.AUTHORIZATION, authHeader);

        int numberOfAttempts = 0;
        do {
            ++numberOfAttempts;
            try (CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
                 CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute(httpGet)) {
                int responseCode = closeableHttpResponse.getStatusLine().getStatusCode();
                InputStream inputStream = closeableHttpResponse.getEntity().getContent();
                File file = new File("output.txt");
                FileOutputStream fileOutputStream = new FileOutputStream(file);

                int inByte;
                while ((inByte = inputStream.read()) != -1) {
                    fileOutputStream.write(inByte);
                }
               
            } catch (IOException e) {
               System.out.println(e);
            }
        } while (numberOfAttempts < 3);
        String fileData = readFileAsString("output.txt");
        System.out.println(fileData);
        file.delete();

    }
}
