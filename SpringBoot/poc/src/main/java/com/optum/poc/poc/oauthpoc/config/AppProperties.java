package com.optum.poc.poc.oauthpoc.config;

import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * The type App properties.
 */
public class AppProperties {

    /**
     * Instantiates a new App properties.
     */
    public AppProperties() {
        // do nothing...
    }

//    @NestedConfigurationProperty
//    private Env env = new Env();
//    @NestedConfigurationProperty
//    private OptumIdSoapServices optumIdSoapServices = new OptumIdSoapServices();
//    @NestedConfigurationProperty
//    private FootnotesService footnotesService = new FootnotesService();
//    @NestedConfigurationProperty
//    private Oil oil = new Oil();
//    @NestedConfigurationProperty
//    private Esso esso = new Esso();
//    @NestedConfigurationProperty
//    private CirrusServices cirrusServices = new CirrusServices();
//    @NestedConfigurationProperty
//    private OxfordServices oxfordServices = new OxfordServices();
//    @NestedConfigurationProperty
//    private ProducerGatewayService producerGatewayService = new ProducerGatewayService();
//    @NestedConfigurationProperty
//    private MemberListService memberListService = new MemberListService();
//    @NestedConfigurationProperty
//    private UserSearchService userSearchService = new UserSearchService();
//    @NestedConfigurationProperty
//    private MemberIdCardService memberIdCardService = new MemberIdCardService();
//    @NestedConfigurationProperty
//    private UserInvitationService userInvitationService = new UserInvitationService();
//    @NestedConfigurationProperty
//    private UserMigrationInvitationService userMigrationInvitationService = new UserMigrationInvitationService();
//    @NestedConfigurationProperty
//    private UserWarning30DaysEmailService userWarning30DaysEmailService = new UserWarning30DaysEmailService();
//    @NestedConfigurationProperty
//    private UserWarning10DaysEmailService userWarning10DaysEmailService = new UserWarning10DaysEmailService();
//    @NestedConfigurationProperty
//    private UserDeactivationEmailService userDeactivationEmailService = new UserDeactivationEmailService();
//    @NestedConfigurationProperty
//    private InternalUserWarning80DaysEmailService internalUserWarning80DaysEmailService = new InternalUserWarning80DaysEmailService();
//    @NestedConfigurationProperty
//    private InternalUserWarning60DaysEmailService internalUserWarning60DaysEmailService = new InternalUserWarning60DaysEmailService();
//    @NestedConfigurationProperty
//    private InternalUserDeactivationEmailService internalUserDeactivationEmailService = new InternalUserDeactivationEmailService();
//    @NestedConfigurationProperty
//    private InvitationReminder30DaysEmailService invitationReminder30DaysEmailService = new InvitationReminder30DaysEmailService();
//    @NestedConfigurationProperty
//    private InvitationReminder45DaysEmailService invitationReminder45DaysEmailService = new InvitationReminder45DaysEmailService();
//    @NestedConfigurationProperty
//    private ContractOptionService contractOptionService = new ContractOptionService();
//    @NestedConfigurationProperty
//    private DbServices dbServices = new DbServices();
//    @NestedConfigurationProperty
//    private AcceptedDocuments acceptedDocuments = new AcceptedDocuments();
//    @NestedConfigurationProperty
//    private Clients clients = new Clients();
//    @NestedConfigurationProperty
//    private EmailConfig emailConfig = new EmailConfig();
//    @NestedConfigurationProperty
//    private AuditEvent auditEvent = new AuditEvent();
//    @NestedConfigurationProperty
//    private EncryptDecryptConfig encryptDecryptConfig = new EncryptDecryptConfig();
//    @NestedConfigurationProperty
//    private AemService aemService = new AemService();
//    @NestedConfigurationProperty
//    private Cache cache = new Cache();
//    @NestedConfigurationProperty
//    private MigrationEmailConfig migrationEmailConfig = new MigrationEmailConfig();
//    @NestedConfigurationProperty
//    private InternalAPIAuthConfig internalAPIAuthConfig = new InternalAPIAuthConfig();
//    @NestedConfigurationProperty
//    private StargateDmz stargateDmz = new StargateDmz();
//    @NestedConfigurationProperty
//    private JwtAuthConfig jwtAuthConfig = new JwtAuthConfig();
//    @NestedConfigurationProperty
//    private VirusScan virusScan = new VirusScan();
//    private StargateCore stargateCore = new StargateCore();
//    @NestedConfigurationProperty
//    private UesUserInvitationService uesUserInvitationService = new UesUserInvitationService();
//    private CsvCreate csvCreate = new CsvCreate();
//    @NestedConfigurationProperty
//    private FileUploadSecure fileUploadSecure = new FileUploadSecure();
//    @NestedConfigurationProperty
//    private Eaip eaip = new Eaip();
//    @NestedConfigurationProperty
//    private BenefitIdCardService benefitIdCardService = new BenefitIdCardService();
//    @NestedConfigurationProperty
//    private SecureApi secureApi = new SecureApi();
//    @NestedConfigurationProperty
//    private UesService uesService = new UesService();
//    @NestedConfigurationProperty
//    private UserUpdateEmailService updateEmailService = new UserUpdateEmailService();
//    @NestedConfigurationProperty
//    private BusinessNotificationEmailService businessNotificationEmailService = new BusinessNotificationEmailService();
//    @NestedConfigurationProperty
//    private LevelFundedBrokerInvitationEmailService levelFundedBrokerInvitationEmailService = new LevelFundedBrokerInvitationEmailService();
//    @NestedConfigurationProperty
//    private LevelFundedEmployerInvitationEmailService levelFundedEmployerInvitationEmailService = new LevelFundedEmployerInvitationEmailService();
//    @NestedConfigurationProperty
//    private LevelFundedBrokerMigrationEmailService levelFundedBrokerMigrationEmailService = new LevelFundedBrokerMigrationEmailService();
//    @NestedConfigurationProperty
//    private UserInvitationServiceUIBroker userInvitationServiceUIBroker = new UserInvitationServiceUIBroker();
//    @NestedConfigurationProperty
//    private UserInvitationService niceInvitationService = new UserInvitationService();
//    /**
//     * MyAllSavers system services access Object.
//     */
//    @NestedConfigurationProperty
//    private MyAllSaversApi myAllSaversApi = new MyAllSaversApi();
//
//    @NestedConfigurationProperty
//    private OptumIdAuthenticate optumIdAuthenticate = new OptumIdAuthenticate();
//    
//    @NestedConfigurationProperty
//    private OptumIdAuthenticateV2 optumIdAuthenticateV2 = new OptumIdAuthenticateV2();
//    
//    @Value("overrideStates")
//    private String overrideStates;
//
//    @Value("skipBuildPermissionMap")
//    private String skipBuildPermissionMap;
//
//    @Value("skipNiceCommissions")
//    private String skipNiceCommissions;
//
//    @NestedConfigurationProperty
//    private Reports reports = new Reports();
//    @NestedConfigurationProperty
//    private StaticResource staticResource = new StaticResource();
//
//    /**
//     * Identifies the property section that holds those Services that require a TOGGLE between two end points.<br>
//     * First of these types of services is the UploadDocument service that will Toggle between Edms and Doc360.
//     */
//    @NestedConfigurationProperty
//    private ServiceEndPointChoice serviceEndPointChoice = new ServiceEndPointChoice();
//    
//    @NestedConfigurationProperty
//    private EEP eep = new EEP();
//
//    @NestedConfigurationProperty
//    private OIDConfig oidConfig = new OIDConfig();
//
//    @NestedConfigurationProperty
//    private RedisAccessConfig redisAccessConfig = new RedisAccessConfig();
//    /**
//     * Gets optum id soap services.
//     *
//     * @return the optum id soap services
//     */
//    public OptumIdSoapServices getOptumIdSoapServices() {
//        return optumIdSoapServices;
//    }
//
//
//    /**
//     * Gets footnotes service.
//     *
//     * @return the footnotes service
//     */
//    public FootnotesService getFootnotesService() {
//        return footnotesService;
//    }
//
//    /**
//     * Gets oil.
//     *
//     * @return the oil
//     */
//    public Oil getOil() {
//        return oil;
//    }
//
//    /**
//     * Gets esso.
//     *
//     * @return the esso
//     */
//    public Esso getEsso() {
//        return esso;
//    }
//
//    /**
//     * Gets cirrus services.
//     *
//     * @return the cirrus services
//     */
//    public CirrusServices getCirrusServices() {
//        return cirrusServices;
//    }
//
//    /**
//     * Gets producer gateway service.
//     *
//     * @return the producer gateway service
//     */
//    public ProducerGatewayService getProducerGatewayService() {
//        return producerGatewayService;
//    }
//
//    /**
//     * Gets member list service.
//     *
//     * @return the member list service
//     */
//    public MemberListService getMemberListService() {
//        return memberListService;
//    }
//
//    /**
//     * Gets user search service.
//     *
//     * @return the user search service
//     */
//    public UserSearchService getUserSearchService() {
//        return userSearchService;
//    }
//
//    /**
//     * Gets member id card service.
//     *
//     * @return the member id card service
//     */
//    public MemberIdCardService getMemberIdCardService() {
//        return memberIdCardService;
//    }
//
//    /**
//     * Gets user invitation service.
//     *
//     * @return the user invitation service
//     */
//    public UserInvitationService getUserInvitationService() {
//        return userInvitationService;
//    }
//
//    /**
//     * Gets user migration invitation service.
//     *
//     * @return the user migration invitation service
//     */
//    public UserMigrationInvitationService getUserMigrationInvitationService() {
//        return userMigrationInvitationService;
//    }
//
//    /**
//     * Gets contract option service.
//     *
//     * @return the contract option service
//     */
//    public ContractOptionService getContractOptionService() {
//        return contractOptionService;
//    }
//
//    /**
//     * Gets db services.
//     *
//     * @return the db services
//     */
//    public DbServices getDbServices() {
//        return dbServices;
//    }
//
//    /**
//     * Gets accepted documents.
//     *
//     * @return the accepted documents
//     */
//    public AcceptedDocuments getAcceptedDocuments() {
//        return acceptedDocuments;
//    }
//
//    /**
//     * Gets clients.
//     *
//     * @return the clients
//     */
//    public Clients getClients() {
//        return clients;
//    }
//
//    /**
//     * Gets env.
//     *
//     * @return the env
//     */
//    public Env getEnv() {
//        return env;
//    }
//
//    /**
//     * Gets email config.
//     *
//     * @return the email config
//     */
//    public EmailConfig getEmailConfig() {
//        return emailConfig;
//    }
//
//    /**
//     * Gets audit event.
//     *
//     * @return the audit event
//     */
//    public AuditEvent getAuditEvent() {
//        return auditEvent;
//    }
//
//    /**
//     * Gets encrypt decrypt config.
//     *
//     * @return the encrypt decrypt config
//     */
//    public EncryptDecryptConfig getEncryptDecryptConfig() {
//        return encryptDecryptConfig;
//    }
//
//    /**
//     * Gets aem service.
//     *
//     * @return the aem service
//     */
//    public AemService getAemService() {
//        return aemService;
//    }
//
//    /**
//     * Gets cache.
//     *
//     * @return the cache
//     */
//    public Cache getCache() {
//        return cache;
//    }
//
//    /**
//     * Gets migration email config.
//     *
//     * @return the migration email config
//     */
//    public MigrationEmailConfig getMigrationEmailConfig() {
//        return migrationEmailConfig;
//    }
//
//    /**
//     * Gets internal api auth config.
//     *
//     * @return the internal api auth config
//     */
//    public InternalAPIAuthConfig getInternalAPIAuthConfig() {
//        return internalAPIAuthConfig;
//    }
//
//    /**
//     * Gets stargate dmz.
//     *
//     * @return the stargate dmz
//     */
//    public StargateDmz getStargateDmz() {
//        return stargateDmz;
//    }
//
//    /**
//     * Gets jwt auth config.
//     *
//     * @return the jwt auth config
//     */
//    public JwtAuthConfig getJwtAuthConfig() {
//        return jwtAuthConfig;
//    }
//
//    /**
//     * Gets virus scan.
//     *
//     * @return the virus scan
//     */
//    public VirusScan getVirusScan() {
//        return virusScan;
//    }
//
//    /**
//     * Gets stargate core.
//     *
//     * @return the stargate core
//     */
//    public StargateCore getStargateCore() {
//        return stargateCore;
//    }
//
//    /**
//     * Gets oxford services.
//     *
//     * @return the oxford services
//     */
//    public OxfordServices getOxfordServices() {
//        return oxfordServices;
//    }
//
//    /**
//     * Gets csv create.
//     *
//     * @return the csv create
//     */
//    public CsvCreate getCsvCreate() {
//        return csvCreate;
//    }
//
//    /**
//     * Gets user UeS invitation service.
//     *
//     * @return the UeS user invitation service
//     */
//    public UesUserInvitationService getUesUserInvitationService() {
//        return uesUserInvitationService;
//    }
//
//    /**
//     * Gets file upload secure.
//     *
//     * @return the file upload secure
//     */
//    public FileUploadSecure getFileUploadSecure() {
//        return fileUploadSecure;
//    }
//
//    /**
//     * Gets eaip.
//     *
//     * @return the eaip
//     */
//    public Eaip getEaip() {
//        return eaip;
//    }
//
//    /**
//     * Gets benefit id card service.
//     *
//     * @return the benefit id card service
//     */
//    public BenefitIdCardService getBenefitIdCardService() {
//        return benefitIdCardService;
//    }
//
//    /**
//     * Gets secure api.
//     *
//     * @return the secure api
//     */
//    public SecureApi getSecureApi() {
//        return secureApi;
//    }
//
//    /**
//     * Gets ues service.
//     *
//     * @return the ues service
//     */
//    public UesService getUesService() {
//        return uesService;
//    }
//    
//    /**
//  	 * @return the optumIdAuthenticate
//	   */
//    public OptumIdAuthenticate getOptumIdAuthenticate() {
//       return optumIdAuthenticate;
//    }
//    
//    /**
//  	 * @return the optumIdAuthenticatev2
//	   */
//    public OptumIdAuthenticateV2 getOptumIdAuthenticateV2() {
//       return optumIdAuthenticateV2;
//    }
//
//
//    /* Gets inactive user warning email service.
//     * Gets user warning 30 days email service.
//     * @return the user warning 30 days email service
//     */
//    public UserWarning30DaysEmailService getUserWarning30DaysEmailService() {
//        return userWarning30DaysEmailService;
//    }
//
//    /**
//     * Gets override states.
//     *
//     * @return the override states
//     */
//    public String getOverrideStates() {
//        return overrideStates;
//    }
//
//    /**
//     * Sets override states.
//     *
//     * @param overrideStates the override states
//     */
//    public void setOverrideStates(String overrideStates) {
//        this.overrideStates = overrideStates;
//    }
//
//    /**
//     * Gets user warning 10 days email service.
//     *
//     * @return the user warning 10 days email service
//     */
//    public UserWarning10DaysEmailService getUserWarning10DaysEmailService() {
//        return userWarning10DaysEmailService;
//    }
//
//    /**
//     * Gets user deactivation email service.
//     *
//     * @return the user deactivation email service
//     */
//    public UserDeactivationEmailService getUserDeactivationEmailService() {
//        return userDeactivationEmailService;
//    }
//
//    /**
//     * Gets reports.
//     *
//     * @return the reports
//     */
//    public Reports getReports() {
//        return reports;
//    }
//
//    /**
//     * Gets update email service.
//     *
//     * @return the update email service
//     */
//    public UserUpdateEmailService getUpdateEmailService() {
//        return updateEmailService;
//    }
//
//    /**
//     * Gets static resource.
//     *
//     * @return the static resource
//     */
//    public StaticResource getStaticResource() {
//        return staticResource;
//    }
//
//
//    public OIDConfig getOidConfig() { 
//      return oidConfig; 
//    }
//
//
//    /**
//     * Gets {@link #serviceEndPointChoice}
//     * @return com.optum.cirrus.gateway.bne.config.ServiceEndPointChoice
//     */
//    public ServiceEndPointChoice getServiceEndPointChoice() {
//        return this.serviceEndPointChoice;
//    }
//
//    /**
//     * Gets internal user warning 80 days email service.
//     *
//     * @return the internal user warning 80 days email service
//     */
//    public InternalUserWarning80DaysEmailService getInternalUserWarning80DaysEmailService() {
//        return internalUserWarning80DaysEmailService;
//    }
//
//    /**
//     * Gets internal user warning 60 days email service.
//     *
//     * @return the internal user warning 60 days email service
//     */
//    public InternalUserWarning60DaysEmailService getInternalUserWarning60DaysEmailService() {
//        return internalUserWarning60DaysEmailService;
//    }
//
//    /**
//     * Gets internal user deactivation email service.
//     *
//     * @return the internal user deactivation email service
//     */
//    public InternalUserDeactivationEmailService getInternalUserDeactivationEmailService() {
//        return internalUserDeactivationEmailService;
//    }
//
//    public BusinessNotificationEmailService getBusinessNotificationEmailService() {
//        return businessNotificationEmailService;
//    }
//
//    public InvitationReminder30DaysEmailService getInvitationReminder30DaysEmailService() {
//        return invitationReminder30DaysEmailService;
//    }
//
//    public InvitationReminder45DaysEmailService getInvitationReminder45DaysEmailService() {
//        return invitationReminder45DaysEmailService;
//    }
//
//    /**
//     * Gets {@link #myAllSaversApi}.
//     *
//     * @return com.optum.cirrus.gateway.bne.config.MyAllSaversApi
//     */
//    public MyAllSaversApi getMyAllSaversApi() {
//        return this.myAllSaversApi;
//    }
//
//    public LevelFundedBrokerInvitationEmailService getLevelFundedBrokerInvitationEmailService() {
//        return levelFundedBrokerInvitationEmailService;
//    }
//
//    public LevelFundedEmployerInvitationEmailService getLevelFundedEmployerInvitationEmailService() {
//        return levelFundedEmployerInvitationEmailService;
//    }
//
//    public LevelFundedBrokerMigrationEmailService getLevelFundedBrokerMigrationEmailService() {
//        return levelFundedBrokerMigrationEmailService;
//    }
//
//    public UserInvitationServiceUIBroker getUserInvitationServiceUIBroker() {
//        return userInvitationServiceUIBroker;
//    }
//
//    public String getSkipBuildPermissionMap() {
//        return skipBuildPermissionMap;
//    }
//
//    public void setSkipBuildPermissionMap(String skipBuildPermissionMap) {
//        this.skipBuildPermissionMap = skipBuildPermissionMap;
//    }
//
//	public UserInvitationService getNiceInvitationService() {
//		return niceInvitationService;
//	}
//
//	public void setNiceInvitationService(UserInvitationService niceInvitationService) {
//		this.niceInvitationService = niceInvitationService;
//	}
//
//    public String getSkipNiceCommissions() {
//        return skipNiceCommissions;
//    }
//
//    public void setSkipNiceCommissions(String skipNiceCommissions) {
//        this.skipNiceCommissions = skipNiceCommissions;
//    }
//
//	public EEP getEep() {
//		return eep;
//	}
//
//    public RedisAccessConfig getRedisAccessConfig() {
//        return redisAccessConfig;
//    }

}