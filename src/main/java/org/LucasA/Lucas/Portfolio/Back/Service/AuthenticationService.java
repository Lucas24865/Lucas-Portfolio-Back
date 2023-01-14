/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.LucasA.Lucas.Portfolio.Back.Service;

import lombok.RequiredArgsConstructor;
import org.LucasA.Lucas.Portfolio.Back.Model.AuthenticationResponse;
import org.LucasA.Lucas.Portfolio.Back.Model.Credentials;
import org.LucasA.Lucas.Portfolio.Back.Model.RegisterRequest;
import org.LucasA.Lucas.Portfolio.Back.Model.Role;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    
    private final CredentialsService repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    
    public AuthenticationResponse register(RegisterRequest request){
        Credentials cred = new Credentials(
                     request.getUser(),
                     passwordEncoder.encode(request.getPass()),
                     Role.USER
             );
     repository.AddCredentials(cred);
     var jwtToken = jwtService.generateToken(cred);
             
        return AuthenticationResponse.builder().token(jwtToken).build();
    }
    public AuthenticationResponse authenticate(RegisterRequest request){
         authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(
            request.getUser(),
            request.getPass()
        )
    );
    var user = repository.CheckUser(request.getUser());
    var jwtToken = jwtService.generateToken(user);
    return AuthenticationResponse.builder()
        .token(jwtToken)
        .build();
  }  
}
