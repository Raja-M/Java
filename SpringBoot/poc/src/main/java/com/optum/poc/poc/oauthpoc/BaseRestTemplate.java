package com.optum.poc.poc.oauthpoc;

 

import com.fasterxml.jackson.databind.ObjectMapper;
 
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.NTCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.UnknownHttpStatusCodeException;
import org.springframework.web.util.UriComponentsBuilder;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Optional;

/**
 * The type Base rest template.
 *
 * @param <Request>  the type parameter
 * @param <Response> the type parameter
 */
@Component
@Qualifier("baseRestTemplate")
public class BaseRestTemplate {
//public class BaseRestTemplate<Request, Response> {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseRestTemplate.class);
    
    @Autowired
    public  RestTemplate restTemplate; 
    
    
	ResponseEntity<AccessTokenResponse> postReq ( String completeUrl ,   HttpEntity<String> requestHttpEntity ){
	
		System.out.println("auto resttempate : " + restTemplate.toString() );
		ResponseEntity<AccessTokenResponse> respEntity = 	restTemplate.exchange(completeUrl, HttpMethod.POST, requestHttpEntity, AccessTokenResponse.class);

	return respEntity;
	}
    
    
//    /**
//     * The Rest template.
//     */
//    RestTemplate restTemplate;
//    private EnvConfigService envConfigService;
//
//
//    /**
//     * Instantiates a new Base rest template.
//     */
//    BaseRestTemplate() {
//    }
//
//    /**
//     * Instantiates a new Base rest template.
//     *
//     * @param restTemplate     the rest template
//     * @param envConfigService the env config service
//     */
//    @Autowired
//    public BaseRestTemplate(@Qualifier("restTemplate") RestTemplate restTemplate, EnvConfigService envConfigService) {
//        super();
//
//        this.restTemplate = restTemplate;
//        this.envConfigService = envConfigService;
//    }
//
//
//    private static String getUriString(String url, MultiValueMap<String, String> queryParams) {
//        if (url.contains("brokerstatements/downloadxls/v1") && queryParams.containsKey("columns")) {
//            String encodedString = UriComponentsBuilder.fromUriString(url).queryParams(queryParams).toUriString();
//            return decode(encodedString);
//        }
//        if (url.contains("broker-statements/worksheet-documents/v1") && queryParams.containsKey("columns")) {
//            String encodedString = UriComponentsBuilder.fromUriString(url).queryParams(queryParams).toUriString();
//            return decode(encodedString);
//        }
//        if (url.contains("doc360/document-contents/v1")) {
//            String encodedString = UriComponentsBuilder.fromUriString(url).queryParams(queryParams).toUriString();
//            return decode(encodedString);
//        }
//        if (url.contains("/api/scim/v2/Users/")) {
//            String encodedString = UriComponentsBuilder.fromUriString(url).queryParams(queryParams).toUriString();
//            return decode(encodedString);
//        } else {
//            return UriComponentsBuilder.fromUriString(url).queryParams(queryParams).toUriString();
//        }
//    }
//
//    private static String decode(String url) {
//        try {
//            String prevURL = "";
//            String decodeURL = url;
//            while (!prevURL.equals(decodeURL)) {
//                prevURL = decodeURL;
//                decodeURL = URLDecoder.decode(decodeURL, "UTF-8");
//            }
//            return decodeURL;
//        } catch (UnsupportedEncodingException e) {
//            return "Issue while decoding" + e.getMessage();
//        }
//    }
//
//    /**
//     * Get response details.
//     *
//     * @param headers       the headers
//     * @param url           the url
//     * @param queryParams   the query params
//     * @param responseClass the response class
//     * @return the response details
//     */
//    public ResponseDetails<Response> get(HttpHeaders headers, String url, MultiValueMap<String, String> queryParams, Class<Response> responseClass) {
//
//        HttpEntity entityReq = new HttpEntity(headers);
//        return execute(url, queryParams, HttpMethod.GET, entityReq, responseClass);
//    }
//
//    /**
//     * Put response details.
//     *
//     * @param request       the request
//     * @param headers       the headers
//     * @param url           the url
//     * @param queryParams   the query params
//     * @param responseClass the response class
//     * @return the response details
//     */
//    public ResponseDetails<Response> put(Request request, HttpHeaders headers, String url,
//                                         MultiValueMap<String, String> queryParams, Class<Response> responseClass) {
//
//        HttpEntity<Request> requestHttpEntity = getRequestHttpEntity(request, headers);
//        return execute(url, queryParams, HttpMethod.PUT, requestHttpEntity, responseClass);
//    }
//
//    /**
//     * Post response.
//     *
//     * @param request       the request
//     * @param headers       the headers
//     * @param url           the url
//     * @param queryParams   the query params
//     * @param responseClass the response class
//     * @return the response
//     */
//    public Response post(Request request, HttpHeaders headers, String url, MultiValueMap<String, String> queryParams, Class<Response> responseClass) {
//
//        ResponseDetails<Response> responseDetails = getPostResponseDetails(request, headers, url, queryParams, responseClass);
//        return responseDetails.getResponse();
//    }
//
//    /**
//     * Post with status response details.
//     *
//     * @param request       the request
//     * @param headers       the headers
//     * @param url           the url
//     * @param queryParams   the query params
//     * @param responseClass the response class
//     * @return the response details
//     */
//    public ResponseDetails<Response> postWithStatus(Request request, HttpHeaders headers, String url, MultiValueMap<String, String> queryParams, Class<Response> responseClass) {
//        return getPostResponseDetails(request, headers, url, queryParams, responseClass);
//    }
//
//    /**
//     * Invokes a Post Service process passing File Bytes and any other required key-value pairs in the MultiValueMap argument.<br>
//     * HttpHeaders argument contains any required Http arguments required.
//     * @param headers org.springframework.http.HttpHeader
//     * @param url String
//     * @param body org.springframework.util.MultiValueMap<K, V> - will contain the File bytes being Posted.
//     * @param responseClass com.optum.cirrus.gateway.bne.common.util.template.Response Class instance
//     * @return com.optum.cirrus.gateway.bne.common.model.ResponseDetails<R> for a com.optum.cirrus.gateway.bne.common.util.template.Response Class instance
//     */
//    public ResponseDetails<Response> postFileWithStatus(HttpHeaders headers, String url, MultiValueMap<String, Object> body, Class<Response> responseClass) {
//        return getPostFileResponseDetails(headers, url, body, responseClass);
//    }
//
//    /**
//     * Invokes a Post Service process passing File Bytes and any other required key-value pairs in the MultiValueMap argument.<br>
//     * HttpHeaders argument contains any required Http arguments required.<br>
//     * The inQueryParms argument will contain a MultiValueMap of the Query Parameter(s) required by the invoked Post service.
//     * @param inHeaders org.springframework.http.HttpHeader
//     * @param inUrl String
//     * @param inBody org.springframework.util.MultiValueMap<K, V> will contain at least the File bytes being Posted.
//     * @param inQueryParms org.springframework.util.MultiValueMap<K, V> (Usually a String, String format).
//     * @param inResponseClass com.optum.cirrus.gateway.bne.common.util.template.Response Class instance
//     * @return com.optum.cirrus.gateway.bne.common.model.ResponseDetails<R> for a com.optum.cirrus.gateway.bne.common.util.template.Response Class instance
//     */
//    public ResponseDetails<Response> postFileWithStatus(HttpHeaders inHeaders, String inUrl, MultiValueMap<String, Object> inBody, MultiValueMap<String, String> inQueryParms, Class<Response> inResponseClass) {
//        return getPostFileResponseDetails(inHeaders, inUrl, inBody, inQueryParms, inResponseClass);
//    }
//
//    private ResponseDetails<Response> getPostResponseDetails(Request request, HttpHeaders headers, String url, MultiValueMap<String, String> queryParams,
//                                                             Class<Response> responseClass) {
//        HttpEntity<Request> requestHttpEntity = getRequestHttpEntity(request, headers);
//        return execute(url, queryParams, HttpMethod.POST, requestHttpEntity, responseClass);
//    }
//
//    private ResponseDetails<Response> getPostFileResponseDetails(HttpHeaders headers, String url, MultiValueMap<String, Object> body,
//                                                                 Class<Response> responseClass) {
//        HttpEntity<MultiValueMap<String, Object>> requestEntity
//                = new HttpEntity<>(body, headers);
//        return postFile(url, requestEntity, responseClass);
//    }
//
//    /**
//     * Private method.<br>
//     * @param inHeaders org.springframework.http.HttpHeader
//     * @param inUrl String
//     * @param inBody org.springframework.util.MultiValueMap<K, V> will contain at least the File bytes being Posted.
//     * @param inQueryParms org.springframework.util.MultiValueMap<K, V> (Usually a String, String format).
//     * @param inResponseClass com.optum.cirrus.gateway.bne.common.util.template.Response Class instance
//     * @return com.optum.cirrus.gateway.bne.common.model.ResponseDetails<R> for a com.optum.cirrus.gateway.bne.common.util.template.Response Class instance
//     */
//    private ResponseDetails<Response> getPostFileResponseDetails(HttpHeaders inHeaders, String inUrl, MultiValueMap<String, Object> inBody,  MultiValueMap<String, String> inQueryParms, Class<Response> inResponseClass) {
//        HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(inBody, inHeaders);
//
//        String completeUrl = getUriString(inUrl, inQueryParms);
//
//        return postFile(completeUrl, requestEntity, inResponseClass);
//    }
//
//    /**
//     * Gets request http entity.
//     *
//     * @param request the request
//     * @param headers the headers
//     * @return the request http entity
//     */
//    public HttpEntity<Request> getRequestHttpEntity(Request request, HttpHeaders headers) {
//        return new HttpEntity<>(request, headers);
//    }
//
//    private ResponseDetails<Response> execute(String url, MultiValueMap<String, String> queryParams,
//                                              HttpMethod httpMethod, HttpEntity<Request> entityReq, Class<Response> responseClass) {
//        ResponseDetails<Response> responseDetails = new ResponseDetails<>();
//
//        try {
//            if (!url.contains(getAppSettings().getSecureApi().getBaseUrl())) {
//
//                String completeUrl = getUriString(url, queryParams);
//                ResponseEntity<Response> respEntity = this.restTemplate.exchange(completeUrl, httpMethod, entityReq, responseClass);
//                responseDetails.setHttpStatus(respEntity.getStatusCode());
//                responseDetails.setResponse(respEntity.getBody());
//                responseDetails.setHttpHeaders(respEntity.getHeaders());
//                injectDataIntoDB(entityReq.getBody(), httpMethod.name(), completeUrl, respEntity.getBody());
//
//            } else {
//                this.restTemplate = new RestTemplate(getClientHttpRequestFactory());
//                String completeUrl = getUriString(url, queryParams);
//                ResponseEntity<Response> respEntity = restTemplate.exchange(completeUrl, httpMethod, entityReq, responseClass);
//                responseDetails.setHttpStatus(respEntity.getStatusCode());
//                responseDetails.setResponse(respEntity.getBody());
//                responseDetails.setHttpHeaders(respEntity.getHeaders());
//                injectDataIntoDB(entityReq.getBody(), httpMethod.name(), completeUrl, respEntity.getBody());
//            }
//
//        } catch (HttpClientErrorException e) {
//            responseDetails.setHttpStatus(e.getStatusCode());
//            responseDetails.setResponse(getResponseWhen4xx(responseClass, e));
//
//        } catch (HttpServerErrorException ex) {
//            responseDetails.setHttpStatus(ex.getStatusCode());
//            String errorMsg = String.format("Http Server Error Exception occurred %s:: ", ex);
//            LOGGER.error(errorMsg);
//            if (url.contains("/ecs/doc360/document-results/v1/search")) {
//                responseDetails.setResponse(getResponseWhen5xx(responseClass, ex));
//            } else {
//                throw new BneException(ErrorCode.INTERNAL_ERROR, ErrorCode.INTERNAL_ERROR.getErrorMsg());
//            }
//
//        } catch (UnknownHttpStatusCodeException e) {
//            String errMsg = String.format("Unknown Http StatusCode Exception %s :: ", e);
//            LOGGER.error(errMsg);
//            throw new BneException(ErrorCode.INTERNAL_ERROR, ErrorCode.INTERNAL_ERROR.getErrorMsg());
//        }
//
//        return responseDetails;
//    }
//
//    private ResponseDetails<Response> postFile(String url,
//                                               HttpEntity<MultiValueMap<String, Object>> entityReq, Class<Response> responseClass) {
//        ResponseDetails<Response> responseDetails = new ResponseDetails<>();
//
//        try {
//
//            ResponseEntity<Response> respEntity = restTemplate.postForEntity(url, entityReq, responseClass);
//            responseDetails.setHttpStatus(respEntity.getStatusCode());
//            responseDetails.setResponse(respEntity.getBody());
//
//        } catch (HttpClientErrorException e) {
//            responseDetails.setHttpStatus(e.getStatusCode());
//            responseDetails.setResponse(getResponseWhen4xx(responseClass, e));
//
//        } catch (HttpServerErrorException ex) {
//            responseDetails.setHttpStatus(ex.getStatusCode());
//            String errorMsg = String.format("Http Server Error Exception occurred %s:: ", ex);
//            LOGGER.error(errorMsg);
//            throw new BneException(ErrorCode.INTERNAL_ERROR, ErrorCode.INTERNAL_ERROR.getErrorMsg());
//
//        } catch (UnknownHttpStatusCodeException e) {
//            String errMsg = String.format("Unknown Http StatusCode Exception %s :: ", e);
//            LOGGER.error(errMsg);
//            throw new BneException(ErrorCode.INTERNAL_ERROR, ErrorCode.INTERNAL_ERROR.getErrorMsg());
//        }
//
//        return responseDetails;
//    }
//
//    private Response getResponseWhen4xx(Class<Response> responseClass, HttpClientErrorException e) {
//        Response response;
//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            response = objectMapper.readValue(e.getResponseBodyAsString(),
//                    responseClass);
//        } catch (IOException ioException) {
//            String errorMsg = String.format("Exception while mapping  response %s", ioException);
//            LOGGER.info(errorMsg);
//            throw new BneException(ErrorCode.INTERNAL_ERROR, ErrorCode.INTERNAL_ERROR.getErrorMsg());
//        }
//        return response;
//    }
//
//    private Response getResponseWhen5xx(Class<Response> responseClass, HttpServerErrorException e) {
//        Response response;
//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            response = objectMapper.readValue(e.getResponseBodyAsString(),
//                    responseClass);
//        } catch (IOException ioException) {
//            String errorMsg = String.format("Exception while mapping  response. %s", ioException);
//            LOGGER.info(errorMsg);
//            throw new BneException(ErrorCode.INTERNAL_ERROR, ErrorCode.INTERNAL_ERROR.getErrorMsg());
//        }
//        return response;
//    }
//
//    /**
//     * Gets app settings.
//     *
//     * @return the app settings
//     */
//    public AppSettings getAppSettings() {
//        return envConfigService.getAppSettings();
//    }
//
//    private void injectDataIntoDB(Request request, String requestType, String url, Response response) {
//
//        Optional<Boolean> isWriteEnabled = envConfigService.isWriteEnabled();
//        String mockUrl = envConfigService.getBaseUrl() + "/insert";
//
//        if (isWriteEnabled.isPresent()) {
//            injectData(request, requestType, url, response, isWriteEnabled.get(), mockUrl);
//
//        } else {
//            LOGGER.info("Update is disabled (OR) Read only mode is activated. So data will not be injected into DB");
//
//        }
//
//    }
//
//    private void injectData(Request request, String requestType, String url, Response response, boolean isWriteEnabled, String mockUrl) {
//        MockDetailsDataRequest mockDetailsDataRequest = new MockDetailsDataRequest();
//        mockDetailsDataRequest.setUrl(url);
//        mockDetailsDataRequest.setForceUpdateEnabled(isWriteEnabled);
//        mockDetailsDataRequest.setRequestType(requestType);
//        mockDetailsDataRequest.setServiceRequest(request);
//        mockDetailsDataRequest.setServiceResponse(response);
//        HttpEntity<MockDetailsDataRequest> entityReq = new HttpEntity<>(mockDetailsDataRequest);
//
//        try {
//            ResponseEntity<MockDetailsDataResponse> respEntity = restTemplate.exchange(mockUrl, HttpMethod.POST, entityReq, MockDetailsDataResponse.class);
//            MockDetailsDataResponse mockDetailsDataResponse = respEntity.getBody();
//            String logMsg = String.format("Mock Insert/update message : %s", XssApiUtil.escapeHtml(mockDetailsDataResponse.getMessage()));
//            LOGGER.info(logMsg);
//        } catch (Exception exception) {
//            String logError = String.format("Exception occured during Data Injection into DB %s", exception);
//            LOGGER.error(logError);
//        }
//    }
//
//    private HttpComponentsClientHttpRequestFactory getClientHttpRequestFactory() {
//        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory
//                = new HttpComponentsClientHttpRequestFactory();
//
//        clientHttpRequestFactory.setHttpClient(httpClient());
//
//        return clientHttpRequestFactory;
//    }
//
//    private HttpClient httpClient() {
//        CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
//        SSLContext sc = null;
//
//        try {
//            sc = SSLContext.getInstance("SSL");
//        } catch (NoSuchAlgorithmException e) {
//            LOGGER.error("Exception:", e);
//        }
//
//        TrustManager[] trustAllCerts = new TrustManager[] {
//            new X509TrustManager() {
//                @Override
//                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
//                    return new X509Certificate[0];
//                }
//
//                @Override
//                public void checkClientTrusted(
//                    java.security.cert.X509Certificate[] certs, String authType) {
//                }
//
//                @Override
//                public void checkServerTrusted(
//                    java.security.cert.X509Certificate[] certs, String authType) {
//                }
//            }
//        };
//
//        try {
//            if (null != sc) {
//                sc.init(null, trustAllCerts, new java.security.SecureRandom());
//                HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
//            }
//        } catch (Exception e) {
//            LOGGER.error("Exception:", e);
//        }
//
//        credentialsProvider.setCredentials(AuthScope.ANY,
//                new NTCredentials(envConfigService.getAppSettings().getSecureApi().getUsername(), envConfigService.getAppSettings().getSecureApi().getPassword(), "", "ms"));
//
//        HttpClient client = HttpClients.custom().setSSLContext(sc)
//                .setDefaultCredentialsProvider(credentialsProvider)
//                .build();
//
//        return client;
//    }

}