/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.saaes.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author tefi
 */
@Entity
@Table(name = "t500biografia")
@NamedQueries({
    @NamedQuery(name = "T500biografia.findAll", query = "SELECT t FROM T500biografia t")})
public class T500biografia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "media_basica")
    private Integer mediaBasica;
    @Column(name = "media_completa")
    private Integer mediaCompleta;
    @Column(name = "qnt_disciplina")
    private Integer qntDisciplina;
    @Column(name = "qnt_basica")
    private Integer qntBasica;
    @Column(name = "qnt_completa")
    private Integer qntCompleta;
    @Column(name = "periodico")
    private Integer periodico;
    @Column(name = "usuario_cadastro")
    private Integer usuarioCadastro;
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCadastro;
    @JoinColumn(name = "id_curso", referencedColumnName = "id")
    @ManyToOne
    private T400cursos idCurso;

    public T500biografia() {
    }

    public T500biografia(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMediaBasica() {
        return mediaBasica;
    }

    public void setMediaBasica(Integer mediaBasica) {
        this.mediaBasica = mediaBasica;
    }

    public Integer getMediaCompleta() {
        return mediaCompleta;
    }

    public void setMediaCompleta(Integer mediaCompleta) {
        this.mediaCompleta = mediaCompleta;
    }

    public Integer getQntDisciplina() {
        return qntDisciplina;
    }

    public void setQntDisciplina(Integer qntDisciplina) {
        this.qntDisciplina = qntDisciplina;
    }

    public Integer getQntBasica() {
        return qntBasica;
    }

    public void setQntBasica(Integer qntBasica) {
        this.qntBasica = qntBasica;
    }

    public Integer getQntCompleta() {
        return qntCompleta;
    }

    public void setQntCompleta(Integer qntCompleta) {
        this.qntCompleta = qntCompleta;
    }

    public Integer getPeriodico() {
        return periodico;
    }

    public void setPeriodico(Integer periodico) {
        this.periodico = periodico;
    }

    public Integer getUsuarioCadastro() {
        return usuarioCadastro;
    }

    public void setUsuarioCadastro(Integer usuarioCadastro) {
        this.usuarioCadastro = usuarioCadastro;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public T400cursos getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(T400cursos idCurso) {
        this.idCurso = idCurso;
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
        if (!(object instanceof T500biografia)) {
            return false;
        }
        T500biografia other = (T500biografia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T500biografia[ id=" + id + " ]";
    }
    
}
