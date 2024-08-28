package com.demo.MockEmailService.controller;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.MockEmailService.dto.CandidateCredentials;
import com.demo.MockEmailService.service.MockEmailSenderService;

@RestController
public class MockEmailController {

	@Autowired
	private MockEmailSenderService emailSenderService;
	
	@PostMapping("/register")
	public CompletableFuture<String> sendNewCandidateMail(@RequestBody(required = true) CandidateCredentials candidateCredentials) {
		CompletableFuture<String> result = emailSenderService.sendEmail();
        return result.thenApply(response -> "Hello HR, Candidate Registration Email sent successfully");
        
	}
}
