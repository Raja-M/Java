package com.telanganainfo.contentmanager.config;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;



@Component
@Endpoint(id = "features")
public class FeatureEndpint {
	
	private final Map<String, Feature> featureMap = new ConcurrentHashMap<>();
 		
	public FeatureEndpint() {
			featureMap.put( "Content" , new Feature( true));
			featureMap.put( "User" , new Feature( false));
			featureMap.put( "Authenticated" , new Feature( false));
	}
	
	@ReadOperation
	public Map<String, Feature> features(){
		return featureMap;
	}
	@ReadOperation
	public Feature feature(@Selector String featureName) {
		return featureMap.get( featureName ); 
	}
	
	
	
 
			
	private static class Feature{
		
		private boolean isEnabled;
		
		
		
		public Feature() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Feature(boolean isEnabled) {
			super();
			this.isEnabled = isEnabled;
		}

		public boolean isEnabled() {
			return isEnabled;
		}

		public void setEnabled(boolean isEnabled) {
			this.isEnabled = isEnabled;
		}
	}
	
}
