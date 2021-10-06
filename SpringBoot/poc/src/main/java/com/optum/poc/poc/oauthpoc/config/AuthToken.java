package com.optum.poc.poc.oauthpoc.config;

/**
 * The type Auth token.
 */
public class AuthToken {

    private String tokenServiceEndpoint;
    private String clientId;
    private String clientSecret;

    /**
     * Instantiates a new Auth token.
     *
     * @param tokenServiceEndpoint the token service endpoint
     * @param clientId             the client id
     * @param clientSecret         the client secret
     */
    public AuthToken(String tokenServiceEndpoint, String clientId, String clientSecret) {
        this.tokenServiceEndpoint = tokenServiceEndpoint;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * Instantiates a new Auth token.
     */
    public AuthToken() {
    }

    /**
     * Gets token service endpoint.
     *
     * @return the token service endpoint
     */
    public String getTokenServiceEndpoint() {
        return tokenServiceEndpoint;
    }

    /**
     * Sets token service endpoint.
     *
     * @param tokenServiceEndpoint the token service endpoint
     */
    public void setTokenServiceEndpoint(String tokenServiceEndpoint) {
        this.tokenServiceEndpoint = tokenServiceEndpoint;
    }

    /**
     * Gets client id.
     *
     * @return the client id
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets client id.
     *
     * @param clientId the client id
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * Gets client secret.
     *
     * @return the client secret
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Sets client secret.
     *
     * @param clientSecret the client secret
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

}
