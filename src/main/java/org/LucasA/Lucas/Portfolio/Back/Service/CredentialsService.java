package org.LucasA.Lucas.Portfolio.Back.Service;

import org.LucasA.Lucas.Portfolio.Back.Model.Credentials;
import org.LucasA.Lucas.Portfolio.Back.Repository.CredentialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CredentialsService implements ICredentialsService {
    @Autowired
    public CredentialsRepository credentialsRepo;

    @Override
    public void AddCredentials(Credentials cred) {
        credentialsRepo.save(cred); 
    }

    @Override
    public void DeleteCredentials(int id) {
         credentialsRepo.deleteById(id);
    }

    @Override
    public boolean CheckCredentials(Credentials cred) {
        return credentialsRepo.findByUserAndPass(cred.getUser(),cred.getPass()).isEmpty();        
    }
    
    @Override
    public Credentials CheckUser(String user) {
        return credentialsRepo.findByUser(user);        
    }
    
}
