package com.example.faas.dto;

public class JobResponse {
	
	private JobRequest jobRequest;
	
	private String jsonResponse;

	public JobResponse(JobRequest jobRequest, String jsonResponse) {
		super();
		this.jobRequest = jobRequest;
		this.jsonResponse = jsonResponse;
	}
	
	public JobResponse() {

	}

	public JobRequest getJobRequest() {
		return jobRequest;
	}

	public String getJsonResponse() {
		return jsonResponse;
	}
	
}
