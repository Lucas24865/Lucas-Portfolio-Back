
package org.LucasA.Lucas.Portfolio.Back.Repository;

import org.LucasA.Lucas.Portfolio.Back.Model.PortfolioTextType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PortfolioTextTypeRepository extends JpaRepository<PortfolioTextType, Integer>{
    
}
