package com.optum.poc.poc;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.SSLContext;


import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.TrustStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.optum.poc.poc.dependencypoc.Customer;
import com.optum.poc.poc.oauthpoc.StargateTokenServiceImpl;
import com.optum.poc.poc.oauthpoc.util.RestTemplateInterceptor;



@SpringBootApplication
@ComponentScan({"com.optum.poc", "com.optum.poc.poc"})
public class PocApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PocApplication.class, args);
		
		
		System.out.println( "Application started !!");
		
		
		Customer c = context.getBean( Customer.class);
		c.display();  
		
		StargateTokenServiceImpl sgt = new StargateTokenServiceImpl();
		sgt.getNewToken();
	}
	
	  /**
     * Rest template rest template.
     *
     * @return the rest template
     * @throws KeyStoreException        the key store exception
     * @throws NoSuchAlgorithmException the no such algorithm exception
     * @throws KeyManagementException   the key management exception
     */
    @Bean("restTemplate")
    public RestTemplate restTemplate() throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
/*        TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;
        SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom()
                .loadTrustMaterial(null, acceptingTrustStrategy)
                .build();
        SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);
        CloseableHttpClient httpClient = HttpClients.custom()
                .setSSLSocketFactory(csf)
                .build();
        HttpComponentsClientHttpRequestFactory requestFactory =
                new HttpComponentsClientHttpRequestFactory();
        requestFactory.setHttpClient(httpClient);
        BufferingClientHttpRequestFactory bufferingClientHttpRequestFactory = new BufferingClientHttpRequestFactory(requestFactory);
        RestTemplate restTemplate = new RestTemplate(bufferingClientHttpRequestFactory);

        ByteArrayHttpMessageConverter byteArrayHttpMessageConverter = new ByteArrayHttpMessageConverter();
        List<MediaType> supportedApplicationTypes = new ArrayList<>();
        MediaType pdfApplication = new MediaType("application", "pdf");
        supportedApplicationTypes.add(pdfApplication);

        byteArrayHttpMessageConverter.setSupportedMediaTypes(supportedApplicationTypes);
        List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
        messageConverters.add(byteArrayHttpMessageConverter);
        restTemplate.setMessageConverters(messageConverters);
        List<ClientHttpRequestInterceptor> interceptors
                = restTemplate.getInterceptors();
        interceptors.add(new RestTemplateInterceptor());
        restTemplate.setInterceptors(interceptors);
        return restTemplate;
*/
    	RestTemplate restTemplate = new RestTemplate();
    	return restTemplate ;
    }

}
