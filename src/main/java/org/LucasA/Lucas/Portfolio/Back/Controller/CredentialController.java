package org.LucasA.Lucas.Portfolio.Back.Controller;

import org.LucasA.Lucas.Portfolio.Back.Model.AuthenticationResponse;
import org.LucasA.Lucas.Portfolio.Back.Model.RegisterRequest;
import org.LucasA.Lucas.Portfolio.Back.Service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class CredentialController {

    @Autowired
    private AuthenticationService service;
    
    @PostMapping("/check")
    public ResponseEntity<AuthenticationResponse> CheckCredential(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(service.authenticate(request));
    }

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> AddCredential(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(service.register(request));
    }

}
