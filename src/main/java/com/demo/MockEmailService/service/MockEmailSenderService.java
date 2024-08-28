package com.demo.MockEmailService.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MockEmailSenderService {

	@Async("asyncTaskExecutor")
	public CompletableFuture<String> sendEmail() {
		return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000); // Simulate a delay in the service call
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Email sent successfully!!";
        });
	}
}
