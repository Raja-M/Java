package om.optum.poc.poc.oauthpoc;

/**
* The type Access token  response.
*/
public class AccessTokenResponse {

   private String access_token;
   private String token_type;
   private String expires_in;
   private String scope;

   private long expiryTime;

   /**
    * Instantiates a new Access token stargate response.
    *
    * @param access_token the access token
    * @param token_type   the token type
    * @param expires_in   the expires in
    * @param scope        the scope
    * @param expiryTime   the expiry time
    */
   public AccessTokenResponse(String access_token, String token_type, String expires_in, String scope, long expiryTime) {
       this.access_token = access_token;
       this.token_type = token_type;
       this.expires_in = expires_in;
       this.scope = scope;
       this.expiryTime = expiryTime;
   }

   /**
    * Instantiates a new Access token stargate response.
    */
   public AccessTokenResponse() {
   }

   /**
    * Gets access token.
    *
    * @return the access_token
    */
   public String getAccess_token() {
       return access_token;
   }

   /**
    * Sets access token.
    *
    * @param access_token the access_token to set
    */
   public void setAccess_token(String access_token) {
       this.access_token = access_token;
   }

   /**
    * Gets token type.
    *
    * @return the token_type
    */
   public String getToken_type() {
       return token_type;
   }

   /**
    * Sets token type.
    *
    * @param token_type the token_type to set
    */
   public void setToken_type(String token_type) {
       this.token_type = token_type;
   }

   /**
    * Gets expires in.
    *
    * @return the expires_in
    */
   public String getExpires_in() {
       return expires_in;
   }

   /**
    * Sets expires in.
    *
    * @param expires_in the expires_in to set
    */
   public void setExpires_in(String expires_in) {
       this.expires_in = expires_in;
   }

   /**
    * Gets scope.
    *
    * @return the scope
    */
   public String getScope() {
       return scope;
   }

   /**
    * Sets scope.
    *
    * @param scope the scope to set
    */
   public void setScope(String scope) {
       this.scope = scope;
   }

   /**
    * Gets expiry time.
    *
    * @return the expiry time
    */
   public long getExpiryTime() {
       return expiryTime;
   }

   /**
    * Sets expiry time.
    *
    * @param expiryTime the expiry time
    */
   public void setExpiryTime(long expiryTime) {
       this.expiryTime = expiryTime;
   }
}
