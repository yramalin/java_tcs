package com.example.demo.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TBL_CUENTAS")
@Getter
@Setter
@NoArgsConstructor
public class Cuentas implements Serializable{
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 private String accName;
	 
     private String accNo;
	
     @OneToMany(mappedBy = "cuentas", fetch = FetchType.LAZY,
             cascade = CascadeType.ALL)
     private Set<Movimientos> movimientos;
}
