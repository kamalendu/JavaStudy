package org.selfstudy.javastudy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    
    private String street;
    private String city;
    private State state;
    private Integer zip;

}
