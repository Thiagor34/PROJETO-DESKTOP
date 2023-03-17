package br.com.suportempt.entidade;

import bt.com.suportempt.exceptions.ChamadoAtivoException;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.Session;

@Entity
@Table(name = "chamado")
public class Chamado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;
    
    @Column(nullable = false)
    private String patrimonio;

    @Column(nullable = false)
    private String equipamento;

    @Column(nullable = false)
    private String sala;

    @Column(nullable = false)
    private String problema;
    
    @Column(nullable = true)
    private String solucao;

    private boolean ativo;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_abertura", nullable = false)
    private Date dtAbertura;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_fechamento")
    private Date dtFechamento;

    public Chamado() {
    }

    public Chamado(String email, String patrimonio, String equipamento, String sala, String problema) throws ChamadoAtivoException{
        Session sessao = null;
        this.email = email;
        this.patrimonio = patrimonio;
        this.equipamento = equipamento;
        this.sala = sala;
        this.problema = problema;
        this.ativo = true;
        this.dtAbertura = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }


    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Date getDtAbertura() {
        return dtAbertura;
    }

    public void setDtAbertura(Date dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

    public Date getDtFechamento() {
        return dtFechamento;
    }

    public void setDtFechamento(Date dtFechamento) {
        this.dtFechamento = dtFechamento;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chamado)) {
            return false;
        }
        Chamado other = (Chamado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.suportempt.entidade.Chamado[ id=" + id + " ]";
    }

}
