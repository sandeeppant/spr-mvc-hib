package com.sprhib.restclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class ApacheHttpClientGet
{

    public static String getCurrentMatches(String id)
    {
        StringBuffer outputBuffer = new StringBuffer(); 
        try
        {

            DefaultHttpClient httpClient = new DefaultHttpClient();
            
            String URL = "https://cricscore-api.appspot.com/csa";
            if(id!=null)
            {
                URL = "https://cricscore-api.appspot.com/csa?id="+id;
            }
            HttpGet getRequest = new HttpGet(URL);
            getRequest.addHeader("accept", "application/json");

            HttpResponse response = httpClient.execute(getRequest);

            if (response.getStatusLine().getStatusCode() != 200) { throw new RuntimeException(
                "Failed : HTTP error code : " + response.getStatusLine().getStatusCode()); }

            BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

            
            System.out.println("Output from Server .... \n");
            String output;
            while ((output = br.readLine()) != null)
            {
                System.out.println(output);
                outputBuffer = outputBuffer.append(output.trim());
            }

            httpClient.getConnectionManager().shutdown();

        }
        catch (ClientProtocolException e)
        {

            e.printStackTrace();

        }
        catch (IOException e)
        {

            e.printStackTrace();
        }
        return outputBuffer.toString();
    }

}
