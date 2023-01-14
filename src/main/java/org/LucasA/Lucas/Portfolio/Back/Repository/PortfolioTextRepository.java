
package org.LucasA.Lucas.Portfolio.Back.Repository;

import java.util.List;
import org.LucasA.Lucas.Portfolio.Back.Model.PortfolioText;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PortfolioTextRepository extends JpaRepository<PortfolioText, Integer>{

    public List<PortfolioText> findByType(int typeId);
    
}
