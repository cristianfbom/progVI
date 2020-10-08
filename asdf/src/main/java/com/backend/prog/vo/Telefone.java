package main.java.com.backend.prog.vo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "telefone")
public class Telefone {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    private String modelo;
    
    @ManyToOne
    private Fabricante fabrincate;
    
    private BigDecimal valor;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_fabricacao;

    public Date getData_fabricacao() {
        return data_fabricacao;
    }

    public void setData_fabricacao(Date data_fabricacao) {
        this.data_fabricacao = data_fabricacao;
    }
    
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the fabrincate
     */
    public Fabricante getFabrincate() {
        return fabrincate;
    }

    /**
     * @param fabrincate the fabrincate to set
     */
    public void setFabrincate(Fabricante fabrincate) {
        this.fabrincate = fabrincate;
    }

    /**
     * @return the valor
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
    
    
    
            

}
