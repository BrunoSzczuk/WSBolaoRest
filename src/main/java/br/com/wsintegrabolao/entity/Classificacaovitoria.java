package br.com.wsintegrabolao.entity;
// Generated 25/03/2018 00:53:08 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Classificacaovitoria generated by hbm2java
 */
@Entity
@Table(name="classificacaovitoria"
    ,schema="public"
)
public class Classificacaovitoria  implements java.io.Serializable {


     private String cdEquipe;
     private Integer qtMandante;
     private Integer qtTotal;
     private Integer qtVisitante;

    public Classificacaovitoria() {
    }

	
    public Classificacaovitoria(Integer qtMandante, Integer qtTotal, Integer qtVisitante) {

       this.qtMandante = qtMandante;
       this.qtTotal = qtTotal;
       this.qtVisitante = qtVisitante;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="equipe"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="cd_equipe", nullable=false, length=10)
    public String getCdEquipe() {
        return this.cdEquipe;
    }
    
    public void setCdEquipe(String cdEquipe) {
        this.cdEquipe = cdEquipe;
    }

    @Column(name="qt_mandante")
    public Integer getQtMandante() {
        return this.qtMandante;
    }
    
    public void setQtMandante(Integer qtMandante) {
        this.qtMandante = qtMandante;
    }

    
    @Column(name="qt_total")
    public Integer getQtTotal() {
        return this.qtTotal;
    }
    
    public void setQtTotal(Integer qtTotal) {
        this.qtTotal = qtTotal;
    }

    
    @Column(name="qt_visitante")
    public Integer getQtVisitante() {
        return this.qtVisitante;
    }
    
    public void setQtVisitante(Integer qtVisitante) {
        this.qtVisitante = qtVisitante;
    }




}


