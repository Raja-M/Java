package com.optum.poc.poc.oauthpoc.config;

import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * The type Stargate dmz.
 */
public class StargateDmz {

    private String baseUrl;
    private String actor;
    private String benefitLanguageV5;
    private String commissionsDocumentListSearch;
    private String documentImagePDF;
    private String findDocumentV4;
    private String installDemographicsEndpointV3;
    private String repositoryId;
    private String userName;
    private String getDocumentV4;
    private String uploadDocumentV4;
    private String processFulfillment;
    private String benefitCodesV6;
    private String memberListV4;
    private String memberListV5;
    /**
     * Version 7 of the Cirrus Get Member List Service created 07/2021.
     */
    private String memberListV7;
    private String memberGroupV2;
    private String memberIndividualV4;
    /**
     * Version 6 of the Cirrus Get Member Individual Service created 07/2021.
     */
    private String memberIndividualV6;
    private String installFamilyV5;
    private String producerV1;
    private String producerV2;
    private String callBackUrlV5;
    private String contractOptionsEndpointV3;
    private String memberGroupTreeExtension;
    private String printMedicalIdCardV4;
    private String installDemographicsEndpointV4;
    private String installFamilyV7;
    private String callBackUrlV7;
//    @NestedConfigurationProperty
//    private StargateAuthToken authToken = new StargateAuthToken();
//    @NestedConfigurationProperty
//    private EssoService essoService = new EssoService();
//    @NestedConfigurationProperty
//    private StargateJWTToken jwtToken = new StargateJWTToken();
//    
//    private String findMedicalIdCard;
//    private String readMedicalIdCard;
//    private String subscriptionBenefitsV1;
//
//    /**
//     * Instantiates a new Stargate dmz.
//     *
//     * @param baseUrl                         the base url
//     * @param authToken                       the auth token
//     * @param benefitLanguageV5               the benefit language v 5
//     * @param commissionsDocumentListSearch   the commissions document list search
//     * @param actor                           the actor
//     * @param documentImagePDF                the document image pdf
//     * @param findDocumentV4                  the find document v 4
//     * @param getDocumentV4                   the get document v 4
//     * @param uploadDocumentV4                the upload document v 4
//     * @param processFulfillment              the process fulfillment
//     * @param essoService                     the esso service
//     * @param repositoryId                    the repository id
//     * @param userName                        the user name
//     * @param benefitCodesV6                  the benefit codes v 6
//     * @param jwtToken                        the jwt token
//     * @param memberListV4                    the member list v 4
//     * @param memberListV5                    the member list v 5
//     * @param inMemberListV7                  Get Member List Version 7
//     * @param inInstallDemographicsEndpointV3 Install Demographics End Point value for Version 3 of the service
//     * @param memberGroupV2                   the member group v 2
//     * @param memberIndividualV4              the member individual v 4
//     * @param inMemberIndividualV6            Get Member Individual Version 6
//     * @param installFamilyV5                 the install family v 5
//     * @param producerV1                      the producer v 1
//     * @param producerV2                      the producer v 2
//     * @param callBackUrlV5                   the call back url v 5
//     * @param contractOptionsEndpointV3       all contract Options url v 3
//     * @param memberGroupTreeExtension        the member group tree extension
//     * @param subscriptionBenefitsV1         the subscriptionBenefits
//     *
//     */
//    public StargateDmz(String baseUrl, StargateAuthToken authToken, String benefitLanguageV5, String commissionsDocumentListSearch, String actor,
//                       String documentImagePDF, String findDocumentV4, String getDocumentV4, String uploadDocumentV4, String processFulfillment,
//                       EssoService essoService, String repositoryId, String userName, String benefitCodesV6, StargateJWTToken jwtToken,
//                       String memberListV4, String memberListV5, String inMemberListV7, String inInstallDemographicsEndpointV3, String memberGroupV2,
//                       String memberIndividualV4, String inMemberIndividualV6, String installFamilyV5, String producerV1, String producerV2,
//                       String callBackUrlV5, String contractOptionsEndpointV3, String memberGroupTreeExtension, String printMedicalIdCardV4, String installDemographicsEndpointV4,
//                       String installFamilyV7, String callBackUrlV7, String subscriptionBenefitsV1) {
//
//        this.baseUrl = baseUrl;
//        this.authToken = authToken;
//        this.benefitLanguageV5 = benefitLanguageV5;
//        this.commissionsDocumentListSearch = commissionsDocumentListSearch;
//        this.actor = actor;
//        this.documentImagePDF = documentImagePDF;
//        this.findDocumentV4 = findDocumentV4;
//        this.processFulfillment = processFulfillment;
//        this.getDocumentV4 = getDocumentV4;
//        this.uploadDocumentV4 = uploadDocumentV4;
//        this.benefitCodesV6 = benefitCodesV6;
//        this.essoService = essoService;
//        this.repositoryId = repositoryId;
//        this.userName = userName;
//        this.jwtToken = jwtToken;
//        this.memberGroupV2 = memberGroupV2;
//        this.memberGroupTreeExtension = memberGroupTreeExtension;
//        this.memberListV4 = memberListV4;
//        this.memberListV5 = memberListV5;
//        this.memberListV7 = inMemberListV7;
//        this.installDemographicsEndpointV3 = inInstallDemographicsEndpointV3;
//        this.memberIndividualV4 = memberIndividualV4;
//        this.memberIndividualV6 = inMemberIndividualV6;
//        this.installFamilyV5 = installFamilyV5;
//        this.producerV1 = producerV1;
//        this.producerV2 = producerV2;
//        this.callBackUrlV5 = callBackUrlV5;
//        this.contractOptionsEndpointV3 = contractOptionsEndpointV3;
//        this.printMedicalIdCardV4 = printMedicalIdCardV4;
//        this.installDemographicsEndpointV4 = installDemographicsEndpointV4;
//        this.installFamilyV7 = installFamilyV7;
//        this.callBackUrlV7 = callBackUrlV7;
//        this.subscriptionBenefitsV1=subscriptionBenefitsV1;
//    }
//
//    public StargateDmz() {
//    }
//
//    public String getBaseUrl() {
//        return baseUrl;
//    }
//
//    public void setBaseUrl(String baseUrl) {
//        this.baseUrl = baseUrl;
//    }
//
//    public String getActor() {
//        return actor;
//    }
//
//    public void setActor(String actor) {
//        this.actor = actor;
//    }
//
//    public String getBenefitLanguageV5() {
//        return benefitLanguageV5;
//    }
//
//    public void setBenefitLanguageV5(String benefitLanguageV5) {
//        this.benefitLanguageV5 = benefitLanguageV5;
//    }
//
//    public String getCommissionsDocumentListSearch() {
//        return commissionsDocumentListSearch;
//    }
//
//    public void setCommissionsDocumentListSearch(String commissionsDocumentListSearch) {
//        this.commissionsDocumentListSearch = commissionsDocumentListSearch;
//    }
//
//    public String getDocumentImagePDF() {
//        return documentImagePDF;
//    }
//
//    public void setDocumentImagePDF(String documentImagePDF) {
//        this.documentImagePDF = documentImagePDF;
//    }
//
//    public String getFindDocumentV4() {
//        return findDocumentV4;
//    }
//
//    public void setFindDocumentV4(String findDocumentV4) {
//        this.findDocumentV4 = findDocumentV4;
//    }
//
//    public String getInstallDemographicsEndpointV3() {
//        return installDemographicsEndpointV3;
//    }
//
//    public void setInstallDemographicsEndpointV3(String installDemographicsEndpointV3) {
//        this.installDemographicsEndpointV3 = installDemographicsEndpointV3;
//    }
//
//    public String getRepositoryId() {
//        return repositoryId;
//    }
//
//    public void setRepositoryId(String repositoryId) {
//        this.repositoryId = repositoryId;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getGetDocumentV4() {
//        return getDocumentV4;
//    }
//
//    public void setGetDocumentV4(String getDocumentV4) {
//        this.getDocumentV4 = getDocumentV4;
//    }
//
//    public String getUploadDocumentV4() {
//        return uploadDocumentV4;
//    }
//
//    public void setUploadDocumentV4(String uploadDocumentV4) {
//        this.uploadDocumentV4 = uploadDocumentV4;
//    }
//
//    public String getProcessFulfillment() {
//        return processFulfillment;
//    }
//
//    public void setProcessFulfillment(String processFulfillment) {
//        this.processFulfillment = processFulfillment;
//    }
//
//    public String getBenefitCodesV6() {
//        return benefitCodesV6;
//    }
//
//    public void setBenefitCodesV6(String benefitCodesV6) {
//        this.benefitCodesV6 = benefitCodesV6;
//    }
//
//    public String getMemberListV4() {
//        return memberListV4;
//    }
//
//    public void setMemberListV4(String memberListV4) {
//        this.memberListV4 = memberListV4;
//    }
//
//    public String getMemberListV5() {
//        return memberListV5;
//    }
//
//    public void setMemberListV5(String memberListV5) {
//        this.memberListV5 = memberListV5;
//    }
//
//    /**
//     * Gets {@link #memberListV7}
//     * @return String
//     */
//    public String getMemberListV7() {
//        return this.memberListV7;
//    }
//
//    /**
//     * Sets {@link #memberListV7}
//     * @param inMemberListV7 String
//     */
//    public void setMemberListV7(String inMemberListV7) {
//        this.memberListV7 = inMemberListV7;
//    }
//
//    public String getMemberGroupV2() {
//        return memberGroupV2;
//    }
//
//    public void setMemberGroupV2(String memberGroupV2) {
//        this.memberGroupV2 = memberGroupV2;
//    }
//
//    public String getMemberIndividualV4() {
//        return memberIndividualV4;
//    }
//
//    public void setMemberIndividualV4(String memberIndividualV4) {
//        this.memberIndividualV4 = memberIndividualV4;
//    }
//
//    /**
//     * Gets {@link #memberIndividualV6}.
//     * @return String
//     */
//    public String getMemberIndividualV6() {
//        return this.memberIndividualV6;
//    }
//
//    /**
//     * Sets {@link #memberIndividualV6}.
//     * @param inMemberIndividualV6 String
//     */
//    public void setMemberIndividualV6(String inMemberIndividualV6) {
//        this.memberIndividualV6 = inMemberIndividualV6;
//    }
//
//    public String getInstallFamilyV5() {
//        return installFamilyV5;
//    }
//
//    public void setInstallFamilyV5(String installFamilyV5) {
//        this.installFamilyV5 = installFamilyV5;
//    }
//
//    public String getProducerV1() {
//        return producerV1;
//    }
//
//    public void setProducerV1(String producerV1) {
//        this.producerV1 = producerV1;
//    }
//
//    public String getProducerV2() {
//        return producerV2;
//    }
//
//    public void setProducerV2(String producerV2) {
//        this.producerV2 = producerV2;
//    }
//
//    public String getCallBackUrlV5() {
//        return callBackUrlV5;
//    }
//
//    public void setCallBackUrlV5(String callBackUrlV5) {
//        this.callBackUrlV5 = callBackUrlV5;
//    }
//
//    public String getContractOptionsEndpointV3() {
//        return contractOptionsEndpointV3;
//    }
//
//    public void setContractOptionsEndpointV3(String contractOptionsEndpointV3) {
//        this.contractOptionsEndpointV3 = contractOptionsEndpointV3;
//    }
//
//    public String getMemberGroupTreeExtension() {
//        return memberGroupTreeExtension;
//    }
//
//    public void setMemberGroupTreeExtension(String memberGroupTreeExtension) {
//        this.memberGroupTreeExtension = memberGroupTreeExtension;
//    }
//
//    public String getPrintMedicalIdCardV4() {
//        return printMedicalIdCardV4;
//    }
//
//    public void setPrintMedicalIdCardV4(String printMedicalIdCardV4) {
//        this.printMedicalIdCardV4 = printMedicalIdCardV4;
//    }
//
//    public StargateAuthToken getAuthToken() {
//        return authToken;
//    }
//
//    public void setAuthToken(StargateAuthToken authToken) {
//        this.authToken = authToken;
//    }
//
//    public EssoService getEssoService() {
//        return essoService;
//    }
//
//    public void setEssoService(EssoService essoService) {
//        this.essoService = essoService;
//    }
//
//    public StargateJWTToken getJwtToken() {
//        return jwtToken;
//    }
//
//    public void setJwtToken(StargateJWTToken jwtToken) {
//        this.jwtToken = jwtToken;
//    }
//
//	public String getFindMedicalIdCard() {
//		return findMedicalIdCard;
//	}
//
//	public void setFindMedicalIdCard(String findMedicalIdCard) {
//		this.findMedicalIdCard = findMedicalIdCard;
//	}
//
//	public String getReadMedicalIdCard() {
//		return readMedicalIdCard;
//	}
//
//	public void setReadMedicalIdCard(String readMedicalIdCard) {
//		this.readMedicalIdCard = readMedicalIdCard;
//	}
//    
//    public String getInstallDemographicsEndpointV4() {
//        return installDemographicsEndpointV4;
//    }
//
//    public void setInstallDemographicsEndpointV4(String installDemographicsEndpointV4) {
//        this.installDemographicsEndpointV4 = installDemographicsEndpointV4;
//    }
//
//    public String getInstallFamilyV7() {
//        return installFamilyV7;
//    }
//
//    public void setInstallFamilyV7(String installFamilyV7) {
//        this.installFamilyV7 = installFamilyV7;
//    }
//
//    public String getCallBackUrlV7() {
//        return callBackUrlV7;
//    }
//
//    public void setCallBackUrlV7(String callBackUrlV7) {
//        this.callBackUrlV7 = callBackUrlV7;
//    }
//
//    public String getSubscriptionBenefitsV1() {
//        return subscriptionBenefitsV1;
//    }
//
//    public void setSubscriptionBenefitsV1(String subscriptionBenefitsV1) {
//        this.subscriptionBenefitsV1 = subscriptionBenefitsV1;
//    }
}