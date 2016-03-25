package com.sprhib.restclient;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sprhib.pojo.calender.Calender;
import com.sprhib.pojo.calender.Mch;
import com.sprhib.pojo.livematches.LiveMatches;
import com.sprhib.pojo.livematches.Match;

public class FeaturesClient
{
    public static int PRETTY_PRINT_INDENT_FACTOR = 4;

    public static void main(String[] args)
    {
        Calender featureMatches = getFeatureMatches();
        System.out.println(featureMatches);
    }
    public static Calender getFeatureMatches()
    {
        String urlString = "";
        Calender featureMatches = null;
        try
        {
            URL url = new URL("http://synd.cricbuzz.com/j2me/1.0/sch_calender.xml");
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection connection = null;
            if (urlConnection instanceof HttpURLConnection)
            {
                connection = (HttpURLConnection) urlConnection;
            }
            else
            {
                System.out.println("Please enter an HTTP URL.");
                return null;
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String current;
            while ((current = in.readLine()) != null)
            {
                urlString += current;
            }
            //System.out.println(urlString);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            PrintWriter out = new PrintWriter("filename.txt");
            JSONObject xmlJSONObj = XML.toJSONObject(urlString);
            String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
            //System.out.println(jsonPrettyPrintString);
            out.println(jsonPrettyPrintString);
            out.close();
            
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            featureMatches = mapper.readValue(jsonPrettyPrintString, Calender.class);
            int numberofMatches = Integer.parseInt(featureMatches.getSch().getMth().getMchs());
            Mch[] mch = featureMatches.getSch().getMth().getMch();
            System.out.println("desc"+"\t"+"srs"+"\t"+"ddt"+"\t"+"vnu"+"\t"+"tm"+"\t"+"mnth_yr");
            for(int i=0;i<numberofMatches;i++)
            {
                String tm = mch[i].getTm();
                String desc = mch[i].getDesc();
                String ddt = mch[i].getDdt();
                String mnth_yr = mch[i].getMnth_yr();
                String vnu = mch[i].getVnu();
                String srs = mch[i].getSrs();
                System.out.println(desc+"\t"+srs+"\t"+ddt+"\t"+vnu+"\t"+tm+"\t"+mnth_yr);
            }
            System.out.println(featureMatches);
        }
        catch (JSONException e)
        {
            System.out.println(e.toString());
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.toString());
        }
        catch (IOException e)
        {
            System.out.println(e.toString());
        }
        return featureMatches;
    }

}
