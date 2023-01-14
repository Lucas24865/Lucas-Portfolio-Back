
package org.LucasA.Lucas.Portfolio.Back.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter  
@Entity
public class PortfolioText {  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private int id;
    private String description;
    private String text;
    private String url;
    private int type;
    
    public PortfolioText(){
    }

    public PortfolioText(int id, String description,String text, String url, int type) {
        this.id = id;
        this.text = text;
        this.description = description;
        this.url = url;
        this.type = type;
    }
    
}
