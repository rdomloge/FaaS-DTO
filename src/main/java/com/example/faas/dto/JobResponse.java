package com.example.faas.dto;

public class JobResponse {
	
	private JobRequest jobRequest;
	
	private Object payload;
	
	private Outcome outcome;

	
	public JobResponse(JobRequest jobRequest, Object payload, Outcome outcome) {
		this.jobRequest = jobRequest;
		this.payload = payload;
		this.outcome = outcome;
	}

	public JobResponse() {

	}

	public JobRequest getJobRequest() {
		return jobRequest;
	}

	public Object getPayload() {
		return payload;
	}

	public Outcome getOutcome() {
		return outcome;
	}
}
