package org.LucasA.Lucas.Portfolio.Back.Service;
import org.LucasA.Lucas.Portfolio.Back.Model.Credentials;

public interface ICredentialsService {
    public void AddCredentials(Credentials cred);
    public void DeleteCredentials(int id);
    public boolean CheckCredentials(Credentials cred);
    public Credentials CheckUser(String user);
}
