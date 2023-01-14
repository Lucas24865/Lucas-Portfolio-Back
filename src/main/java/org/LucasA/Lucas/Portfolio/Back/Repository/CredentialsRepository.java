
package org.LucasA.Lucas.Portfolio.Back.Repository;

import java.util.List;
import java.util.Optional;
import org.LucasA.Lucas.Portfolio.Back.Model.Credentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CredentialsRepository extends JpaRepository<Credentials, Integer>{

    public List<Credentials> findByUserAndPass(String user, String pass);
    public Credentials findByUser(String user);
    
}
