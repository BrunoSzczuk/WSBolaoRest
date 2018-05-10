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
 * Classificacao generated by hbm2java
 */
@Entity
@Table(name="classificacao"
    ,schema="public"
)
public class Classificacao  implements java.io.Serializable {


     private String cdEquipe;
     private Equipe equipe;
     private Float pcAproveitamento;
     private String gaPosicao;
     private Integer goContra;
     private Integer goPro;
     private String psEquipe;
     private Integer sdGols;

    public Classificacao() {
    }

	
    public Classificacao(Equipe equipe) {
        this.equipe = equipe;
    }
    public Classificacao(Equipe equipe, Float pcAproveitamento, String gaPosicao, Integer goContra, Integer goPro, String psEquipe, Integer sdGols) {
       this.equipe = equipe;
       this.pcAproveitamento = pcAproveitamento;
       this.gaPosicao = gaPosicao;
       this.goContra = goContra;
       this.goPro = goPro;
       this.psEquipe = psEquipe;
       this.sdGols = sdGols;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="equipe"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="cd_equipe", nullable=false, length=10)
    public String getCdEquipe() {
        return this.cdEquipe;
    }
    
    public void setCdEquipe(String cdEquipe) {
        this.cdEquipe = cdEquipe;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public Equipe getEquipe() {
        return this.equipe;
    }
    
    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    
    @Column(name="pc_aproveitamento", precision=8, scale=8)
    public Float getPcAproveitamento() {
        return this.pcAproveitamento;
    }
    
    public void setPcAproveitamento(Float pcAproveitamento) {
        this.pcAproveitamento = pcAproveitamento;
    }

    
    @Column(name="ga_posicao", length=3)
    public String getGaPosicao() {
        return this.gaPosicao;
    }
    
    public void setGaPosicao(String gaPosicao) {
        this.gaPosicao = gaPosicao;
    }

    
    @Column(name="go_contra")
    public Integer getGoContra() {
        return this.goContra;
    }
    
    public void setGoContra(Integer goContra) {
        this.goContra = goContra;
    }

    
    @Column(name="go_pro")
    public Integer getGoPro() {
        return this.goPro;
    }
    
    public void setGoPro(Integer goPro) {
        this.goPro = goPro;
    }

    
    @Column(name="ps_equipe", length=3)
    public String getPsEquipe() {
        return this.psEquipe;
    }
    
    public void setPsEquipe(String psEquipe) {
        this.psEquipe = psEquipe;
    }

    
    @Column(name="sd_gols")
    public Integer getSdGols() {
        return this.sdGols;
    }
    
    public void setSdGols(Integer sdGols) {
        this.sdGols = sdGols;
    }




}

