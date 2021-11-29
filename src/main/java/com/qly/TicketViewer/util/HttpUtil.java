package com.qly.TicketViewer.util;

import org.apache.commons.codec.binary.Base64;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class HttpUtil {
    public static String httpRequest(String requestUrl) throws FileNotFoundException, ConnectException {
        StringBuilder buffer = new StringBuilder();
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();
            httpUrlConn.setDoInput(true);
            httpUrlConn.setRequestMethod("GET");

            String auth = "liq13@pitt.edu/token" + ":" + "ZlKElRU0xYvGm6jPXcE8UrXxERsY3rPCp42byPAi";
            byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(StandardCharsets.UTF_8));
            String authHeaderValue = "Basic " + new String(encodedAuth);
            httpUrlConn.setRequestProperty("Authorization", authHeaderValue);
            httpUrlConn.connect();

            InputStream inputStream = httpUrlConn.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
            inputStream = null;
            httpUrlConn.disconnect();

        } catch (FileNotFoundException e) {
            throw e;
        } catch (Exception e){
            throw new ConnectException();
        }

        return buffer.toString();
    }

}
