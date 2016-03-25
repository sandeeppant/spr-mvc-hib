package com.sprhib.restclient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import com.sprhib.pojo.livematches.LiveMatches;
import com.sprhib.pojo.livematches.Match;

public class LiveMatchesClient
{
    public static int PRETTY_PRINT_INDENT_FACTOR = 4;

    public static void main(String[] args)
    {
        /*LiveMatches liveMatches = getLiveMatches();
        System.out.println(liveMatches);*/
        readLiveScore();
    }
    public static LiveMatches getLiveMatches()
    {
        String urlString = "";
        LiveMatches liveMatches = null;
        try
        {
            URL url = new URL("http://synd.cricbuzz.com/j2me/1.0/livematches.xml");
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
            liveMatches = mapper.readValue(jsonPrettyPrintString, LiveMatches.class);
            int numberofMatches = liveMatches.getMchdata().getMatch().length;
            Match[] mch = liveMatches.getMchdata().getMatch();
            System.out.println("id"+"\t"+"type"+"\t"+"srs"+"\t"+"mchDesc"+"\t"+"mnum"+"\t"+"vcity");
            for(int i=0;i<numberofMatches;i++)
            {
                String id = mch[i].getId();
                String type = mch[i].getType();
                String srs = mch[i].getSrs();
                String mchDesc = mch[i].getMchdesc();
                String mnum = mch[i].getMnum();
                String vcity = mch[i].getVcity();
                System.out.println(id+"\t"+type+"\t"+srs+"\t"+mchDesc+"\t"+mnum+"\t"+vcity);
            }
            System.out.println(liveMatches);
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
        return liveMatches;
    }
    
    
    public static void readLiveScore()
    {
        LiveMatches liveMatches = null;
        try
        {
            File f = new File("D:\\Apache Software Foundation\\Tomcat 8.0\\filename.txt");
            ObjectMapper mapper = new ObjectMapper();
            liveMatches = mapper.readValue(f, LiveMatches.class);
            int numberofMatches = liveMatches.getMchdata().getMatch().length;
            Match[] mch = liveMatches.getMchdata().getMatch();
            System.out.println("id"+"\t"+"type"+"\t"+"srs"+"\t"+"mchDesc"+"\t"+"mnum"+"\t"+"vcity");
            for(int i=0;i<numberofMatches;i++)
            {
                String id = mch[i].getId();
                String type = mch[i].getType();
                String srs = mch[i].getSrs();
                String mchDesc = mch[i].getMchdesc();
                String mnum = mch[i].getMnum();
                String vcity = mch[i].getVcity();
                System.out.println(id+"\t"+type+"\t"+srs+"\t"+mchDesc+"\t"+mnum+"\t"+vcity);
            }
            System.out.println(liveMatches);
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
    }
}

