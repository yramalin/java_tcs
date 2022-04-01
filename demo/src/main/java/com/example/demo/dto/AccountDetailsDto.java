package com.example.demo.dto;

import com.example.demo.entity.Movimientos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDetailsDto {
	
	 private Integer idAcc;

     private String accName;
	 
     private String accNo;
     
     private Movimientos movimientos;
}
