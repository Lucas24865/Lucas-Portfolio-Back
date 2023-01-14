package org.LucasA.Lucas.Portfolio.Back.Service;

import java.util.List;
import org.LucasA.Lucas.Portfolio.Back.Model.PortfolioTextType;
import org.LucasA.Lucas.Portfolio.Back.Repository.PortfolioTextTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortfolioTextTypeService implements IPortfolioTextTypeService{

    @Autowired
    public PortfolioTextTypeRepository portfolioTextTyperepo;
    
    @Override
    public List<PortfolioTextType> GetPortfolioTextType() {
        return portfolioTextTyperepo.findAll();
    }

    @Override
    public void AddPortfolioTextType(PortfolioTextType port) {
        portfolioTextTyperepo.save(port);
    }

    @Override
    public void DeletePortfolioTextType(int id) {
        portfolioTextTyperepo.deleteById(id);
    }
    
}
