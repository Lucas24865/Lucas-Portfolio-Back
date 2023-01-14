
package org.LucasA.Lucas.Portfolio.Back.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor 
public class RegisterRequest {
    private String user;
    private String pass;
}
