package com.demo.MockEmailService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateCredentials {

	private String canidateEmail;
    private String password;
}
