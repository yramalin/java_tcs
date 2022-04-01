package com.example.demo.entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TBL_MOVIMIENTOS")
@Getter
@Setter
@NoArgsConstructor
public class Movimientos  implements Serializable{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dateTrx;
    
    private String typeTrx;
    
    private String amtTrx;

    @ManyToOne
    @JoinColumn(name = "ACC_ID", nullable = false)
    private Cuentas cuentas;

}
