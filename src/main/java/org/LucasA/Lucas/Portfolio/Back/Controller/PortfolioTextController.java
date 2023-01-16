package org.LucasA.Lucas.Portfolio.Back.Controller;

import java.util.List;
import org.LucasA.Lucas.Portfolio.Back.Model.PortfolioText;
import org.LucasA.Lucas.Portfolio.Back.Service.IPortfolioTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PortfolioTextController {
    
    @Autowired
    private IPortfolioTextService portfolioTextService;
    
    @DeleteMapping(value = "/PortfolioText/Delete")
    public ResponseEntity<Boolean> DeletePortfolioTextType (@RequestParam int id){
        portfolioTextService.DeletePortfolioText(id);
        return new ResponseEntity<>(true,HttpStatus.ACCEPTED);
    }
    
    @CrossOrigin
    @PostMapping(value = "/PortfolioText/Add")
    public ResponseEntity<Boolean> AddCredential (@RequestBody PortfolioText port){
        portfolioTextService.AddPortfolioText(port);
        return new ResponseEntity<>(true,HttpStatus.ACCEPTED);
    }    
    
    @GetMapping("/getData/PortfolioText/GetAll")
    public ResponseEntity<List<PortfolioText>> GetPortfolioText (){
        return new ResponseEntity<>(portfolioTextService.GetPortfolioText(),HttpStatus.OK);
    }    
    
    @GetMapping("/getData/PortfolioText/GetByTypeId")
    public ResponseEntity<List<PortfolioText>> GetPortfolioTextByType(@RequestParam int id){
        return new ResponseEntity<>(portfolioTextService.GetPortfolioTextByType(id),HttpStatus.OK);
    }
    
}
