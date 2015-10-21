/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonprofit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Base64;

import org.json.JSONArray;
import org.json.JSONObject;
/**
 *
 * @author Mark's PC
 */
public class collectURLS {
    
    public void Run() throws Exception{
    
        
        final String accountKey = "gkvtwBiDdEponeetMHPuo4vp+ty3ZiA7eDi46GIWXas";
        final String bingUrlPattern = "https://api.datamarket.azure.com/Bing/Search/Web?Query=%%27%s%%27&$format=JSON";

        final String query = URLEncoder.encode("'what      is omonoia'", Charset.defaultCharset().name());
        final String bingUrl = String.format(bingUrlPattern, query);

        final String accountKeyEnc = Base64.getEncoder().encodeToString((accountKey + ":" + accountKey).getBytes());

        final URL url = new URL(bingUrl);
        final URLConnection connection = url.openConnection();
        connection.setRequestProperty("Authorization", "Basic " + accountKeyEnc);

        try (final BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String inputLine;
            final StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            
            String finalResponse = response.toString();
            final JSONObject json = new JSONObject(finalResponse);
            final JSONObject d = json.getJSONObject("d");
            final JSONArray results = d.getJSONArray("results");
            final int resultsLength = results.length();
            for (int i = 0; i < resultsLength; i++) {
                final JSONObject aResult = results.getJSONObject(i);
                System.out.println(aResult.get("Url"));
            }
        }
    
        
        
        
        
        
        
        
    }
    
    
}
