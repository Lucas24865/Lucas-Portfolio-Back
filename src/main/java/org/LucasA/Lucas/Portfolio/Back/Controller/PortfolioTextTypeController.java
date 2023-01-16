package org.LucasA.Lucas.Portfolio.Back.Controller;

import java.util.List;
import org.LucasA.Lucas.Portfolio.Back.Model.PortfolioTextType;
import org.LucasA.Lucas.Portfolio.Back.Service.PortfolioTextTypeService;
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
public class PortfolioTextTypeController {
    @Autowired
    private PortfolioTextTypeService portfolioTextTypeService;
    
    @DeleteMapping("/PortfolioTextType/Delete")
    public ResponseEntity<Boolean> DeletePortfolioTextType (@RequestParam int id){
        portfolioTextTypeService.DeletePortfolioTextType(id);
        return new ResponseEntity<>(true,HttpStatus.ACCEPTED);
    }
    
    @GetMapping("/getData/PortfolioTextType/Get")
    public ResponseEntity<List<PortfolioTextType>> GetPortfolioTextType (){
        return new ResponseEntity<>(portfolioTextTypeService.GetPortfolioTextType(),HttpStatus.OK);
    }
    
    @PostMapping("/PortfolioTextType/Add")
    public ResponseEntity<Boolean> AddCredential (@RequestBody PortfolioTextType port){
        portfolioTextTypeService.AddPortfolioTextType(port);
        return new ResponseEntity<>(true,HttpStatus.ACCEPTED);
    }
}
