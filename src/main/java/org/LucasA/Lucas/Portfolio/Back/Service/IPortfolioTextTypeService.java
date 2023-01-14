package org.LucasA.Lucas.Portfolio.Back.Service;

import java.util.List;
import org.LucasA.Lucas.Portfolio.Back.Model.PortfolioTextType;

/**
 *
 * @author Lucas
 */
public interface IPortfolioTextTypeService {
    public List<PortfolioTextType> GetPortfolioTextType();
    public void AddPortfolioTextType(PortfolioTextType port);
    public void DeletePortfolioTextType (int id);
    
}
