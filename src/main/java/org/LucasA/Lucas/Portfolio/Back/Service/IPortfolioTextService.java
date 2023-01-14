package org.LucasA.Lucas.Portfolio.Back.Service;

import java.util.List;
import org.LucasA.Lucas.Portfolio.Back.Model.PortfolioText;

public interface IPortfolioTextService {
    public List<PortfolioText> GetPortfolioText();
    public void AddPortfolioText(PortfolioText port);
    public void DeletePortfolioText (int id);
    public PortfolioText GetPortfolioTextByID(int id);
    public List<PortfolioText> GetPortfolioTextByType(int typeId);    
}
