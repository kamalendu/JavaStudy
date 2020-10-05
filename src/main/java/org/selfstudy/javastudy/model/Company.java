package org.selfstudy.javastudy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {

   private String name;
   private Address address;
   private Long cid;
}