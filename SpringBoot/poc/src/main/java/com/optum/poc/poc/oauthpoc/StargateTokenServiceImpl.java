package com.optum.poc.poc.oauthpoc;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import org.springframework.web.util.UriComponentsBuilder;

@Service
public class StargateTokenServiceImpl {
	@Autowired
	BaseRestTemplate restTemplate;

	public AccessTokenResponse getNewToken() {

//        String postbody = getPostBody(appSettings.getStargateDmz().getAuthToken().getClientId(),
//                appSettings.getStargateDmz().getAuthToken().getClientSecret());
		
		StringBuilder requestBody = new StringBuilder();
		
		requestBody.append("******");
//	    return requestBody.toString();

		
//     String postbody = getPostBody( "S2q1BwYxyCqJr8UIoA35OVrY39xwFA0V",
//       "K8vh5vG6PtevScjPPuoxxhNE0qr7IKuN");		
//	    String postbody 	=  	requestBody.toString();
//        HttpHeaders headers = 	new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
//        AccessTokenResponse accessToken = restTemplate.post(postbody, headers,
//                appSettings.getStargateDmz().getBaseUrl() + appSettings.getStargateDmz().getAuthToken().getTokenServiceEndpoint(),
//                ConvertUtil.emptyMap(), AccessTokenResponse.class);

        
//      AccessTokenResponse accessToken = restTemplate.post(postbody, headers,
//      "https://gateway-stage.optum.com/auth/oauth2/cached/token",
//      new LinkedMultiValueMap(), AccessTokenResponse.class);
//      
      
      
 //     ResponseDetails<Response> responseDetails = getPostResponseDetails(request, headers, url, queryParams, responseClass);
      
 //     HttpEntity<Request> requestHttpEntity = getRequestHttpEntity(request, headers);
 /*     
      public (@Qualifier("baseRestTemplate") BaseRestTemplate<String, AccessTokenStargateResponse> restTemplate,
              @Qualifier("AppSettings") AppSettings appSettings) {
              
        public class BaseRestTemplate<Request, Response>      
       
     public class ResponseDetails<R> {
	
	    private R response;
	    private HttpStatus httpStatus;
	    private HttpHeaders httpHeaders;
	              
    
      HttpEntity<Request> requestHttpEntity = new HttpEntity<>(request, headers)
 */ 
		    String postbody 	=  	requestBody.toString();
	        HttpHeaders headers = 	new HttpHeaders();
	        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
	        
	        HttpEntity<String> requestHttpEntity = new HttpEntity<>(postbody, headers);
      
//      return execute(url, queryParams, HttpMethod.POST, requestHttpEntity, responseClass );
      
//      String completeUrl = getUriString(url, queryParams);
      
 //     String completeUrl = getUriString(url, queryParams); 
      
      String encodedString = UriComponentsBuilder.fromUriString("https://gateway-stage.optum.com/auth/oauth2/cached/token")
    		  .queryParams(new LinkedMultiValueMap()).toUriString();
 
  
      String completeUrl;
	try {
		completeUrl = URLDecoder.decode(encodedString, "UTF-8");
		System.out.println("completeUrl : "+ completeUrl );
		System.out.println(" requestHttpEntity : "+  requestHttpEntity.toString() );
		
		  String AUTHENTICATION_URL = "https://gateway-stage.optum.com/auth/oauth2/cached/token";
		
 
		
		
//		this.restTemplate.exchange(completeUrl, HttpMethod.POST, requestHttpEntity, AStrccessTokenResponse.class);
//		ResponseEntity<String> respEntity = this.restTemplate.exchange(completeUrl, HttpMethod.POST, requestHttpEntity, String.class);
		  
	
		 
		RestTemplate restt = new RestTemplate();
		System.out.println("RestTempate :"  + restt.toString()) ; 
		
		ResponseEntity<AccessTokenResponse> respEntity =  
				restt.exchange(completeUrl, HttpMethod.POST, requestHttpEntity, AccessTokenResponse.class);
		
		 
	 
		 System.out.println( "Res Entity :" + respEntity.toString() );
		 System.out.println( "Res Entity status :" + respEntity.getStatusCodeValue()  );
		 System.out.println( "Res Entity Body access token :" + respEntity.getBody().getAccess_token()  );
		 System.out.println( "Res Entity Body access Exp :" + respEntity.getBody().getExpires_in()  );
		 System.out.println( "Res Entity Body access token typ :" + respEntity.getBody().getToken_type()  );
		 System.out.println( "Res Entity Body String :" + respEntity.getBody().toString()  );
		 System.out.println( "Res Entity Headers :" + respEntity.getHeaders()  );
		 System.out.println( "Res Entity Status Code:" + respEntity.getStatusCode()  );
 
		 
	        HttpHeaders headers2 = 	new HttpHeaders();
	        headers2.setContentType(MediaType.APPLICATION_JSON);
	        headers2.setBearerAuth( respEntity.getBody().getAccess_token()  );

	        String postbody2 	=" [{\r\n" + 
	        		"  \"address\": {\r\n" + 
	        		"    \"physicalAddress\": {\r\n" + 
	        		"      \"addressLine1\": \"357 Aurora Road\",\r\n" + 
	        		"      \"addressLine2\": \"Suite 613\",\r\n" + 
	        		"      \"city\": \"CLIFFORD\",\r\n" + 
	        		"      \"stateProvince\": \"ND\",\r\n" + 
	        		"      \"zip\": {\r\n" + 
	        		"        \"zip5\": \"58016\"\r\n" + 
	        		"      },\r\n" + 
	        		"      \"country\": \"US\",\r\n" + 
	        		"      \"street\": \"ND\"\r\n" + 
	        		"    }\r\n" + 
	        		"  },\r\n" + 
	        		"  \"companyGroup\": [],\r\n" + 
	        		"  \"contractNumber\": [],\r\n" + 
	        		"  \"identifiers\": [\r\n" + 
	        		"    {\r\n" + 
	        		"      \"type\": \"Parent ID Match\",\r\n" + 
	        		"      \"id\": \"Raja 2\"\r\n" + 
	        		"    }\r\n" + 
	        		"  ],\r\n" + 
	        		"  \"dunsNumber\": [],\r\n" + 
	        		"  \"industry\": [],\r\n" + 
	        		"  \"name\": [\r\n" + 
	        		"    {\r\n" + 
	        		"      \"type\": \"Legal Name\",\r\n" + 
	        		"      \"name\": \"Test_Prime5 20210713121309\"\r\n" + 
	        		"    }\r\n" + 
	        		"  ],\r\n" + 
	        		"  \"phone\": [],\r\n" + 
	        		"  \"sourceIdentifiers\": [\r\n" + 
	        		"    {\r\n" + 
	        		"      \"id\": \"Raja 2\",\r\n" + 
	        		"      \"sourceSystem\": \"Cirrus\"\r\n" + 
	        		"    }\r\n" + 
	        		"  ],\r\n" + 
	        		"  \"hierarchy\": []\r\n" + 
	        		"}\r\n" + 
	        		"]";
	        
	        HttpEntity<String> requestHttpEntity2 = new HttpEntity<>(postbody2, headers2);

	        String encodedString2 = UriComponentsBuilder.fromUriString("https://gateway-stage.optum.com/api/qa/cdm/cust/mdm-company-bulkpost/v1")
	      		  .queryParams(new LinkedMultiValueMap()).toUriString();
	   
	    
	        String completeUrl2;
	 
	  		completeUrl2 = URLDecoder.decode(encodedString2, "UTF-8");
	  		System.out.println("completeUrl : "+ completeUrl2 );
	  		System.out.println(" requestHttpEntity : "+  requestHttpEntity2.toString() );
	  		 
	   
	  		
	  		
//	  		this.restTemplate.exchange(completeUrl, HttpMethod.POST, requestHttpEntity, AStrccessTokenResponse.class);
//	  		ResponseEntity<String> respEntity = this.restTemplate.exchange(completeUrl, HttpMethod.POST, requestHttpEntity, String.class);
	  		  
	  	
	  		 
	  		RestTemplate restt2 = new RestTemplate();
	  		System.out.println("RestTempate :"  + restt2.toString()) ; 
	  		
	  		ResponseEntity<String> respEntity2 =  
	  				restt2.exchange(completeUrl2, HttpMethod.POST, requestHttpEntity2, String.class);
	  		
	  		 
	  	 
	  		 System.out.println( "Res Entity :" + respEntity2.toString() );
	  		 System.out.println( "Res Entity status :" + respEntity2.getStatusCodeValue()  );
	  	 	 System.out.println( "Res Entity Body String :" + respEntity2.getBody().toString()  );
	  		 System.out.println( "Res Entity Headers :" + respEntity2.getHeaders()  );
	  		 System.out.println( "Res Entity Status Code:" + respEntity2.getStatusCode()  );
	   
	        
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
 
        
       
        // get current time in seconds
        long currentTimeInSeconds = System.currentTimeMillis() / 1000;
/*        long expirationTimeInSeconds = currentTimeInSeconds + Long.valueOf(accessToken.getExpires_in());
        accessToken.setExpiryTime(expirationTimeInSeconds);

        LOGGER.info("Stargate: getAccessToken: obtained a new access token OK.");
        LOGGER.info("Stargate: Adding Access Token in cache");
*/
        return  new AccessTokenResponse();
	} 
	private String getPostBody(String clientId, String clientSecret) {

        StringBuilder requestBody = new StringBuilder();

//        requestBody.append(client_id=clientId.append(AMP_STR)
//                .append(CLIENTSECRET_PARAMETER).append(AppConstants.EQUALS_TO).append(clientSecret).append(AMP_STR)
//                .append(AppConstants.GRANT_TYPE_PARAMETER).append(AppConstants.EQUALS_TO).append(AppConstants.GRANT_TYPE_PARAMETER_VALUE);
//        
        requestBody.append("client_id=S2q1BwYxyCqJr8UIoA35OVrY39xwFA0V&client_secret=K8vh5vG6PtevScjPPuoxxhNE0qr7IKuN&grant_type=client_credentials");
        return requestBody.toString();
    }
	
}
