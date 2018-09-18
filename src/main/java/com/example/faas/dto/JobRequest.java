package com.example.faas.dto;

import java.util.Map;
import java.util.Properties;

public class JobRequest {

	private String functionName;
	
	private Properties params;
	
	private String responseRoutingKey;
	
	private String correlationId;

	
	public JobRequest(String functionName, Properties params, String responseRoutingKey,
			String correlationId) {
		this.functionName = functionName;
		this.params = params;
		this.responseRoutingKey = responseRoutingKey;
		this.correlationId = correlationId;
	}
	
	public JobRequest() {
		
	}

	public String getFunctionName() {
		return functionName;
	}

	public Properties getParams() {
		return params;
	}

	public String getResponseRoutingKey() {
		return responseRoutingKey;
	}

	public String getCorrelationId() {
		return correlationId;
	}
}
