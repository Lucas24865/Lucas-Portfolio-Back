package org.LucasA.Lucas.Portfolio.Back.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
public class PortfolioTextType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private int id;
    private String description;

    public PortfolioTextType() {
    }

    public PortfolioTextType(int id, String description) {
        this.id = id;
        this.description = description;
    }
    
}
