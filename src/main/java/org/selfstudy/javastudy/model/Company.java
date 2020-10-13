package org.selfstudy.javastudy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {

   @NotNull
   private String name;
   private Address address;
   private Long cid;
}
