package org.LucasA.Lucas.Portfolio.Back.Service;

import java.util.List;
import org.LucasA.Lucas.Portfolio.Back.Model.PortfolioText;
import org.LucasA.Lucas.Portfolio.Back.Repository.PortfolioTextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortfolioTextService implements IPortfolioTextService{
    
    @Autowired
    public PortfolioTextRepository portfolioTextRepo;

    @Override
    public List<PortfolioText> GetPortfolioText() {
        return portfolioTextRepo.findAll();
    }

    @Override
    public void AddPortfolioText(PortfolioText port) {
        portfolioTextRepo.save(port);
    }

    @Override
    public void DeletePortfolioText(int id) {
        portfolioTextRepo.deleteById(id);
    }

    @Override
    public PortfolioText GetPortfolioTextByID(int id) {
        return portfolioTextRepo.findById(id).orElse(null);
    }


    @Override
    public List<PortfolioText> GetPortfolioTextByType(int typeId) {
        return portfolioTextRepo.findByType(typeId);
    }
    
}
