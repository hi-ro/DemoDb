package com.example.db.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "COD")
public class Cod implements Serializable
{
    //
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private CodPK pk;

    @Column(name = "COD_NAME")
    private String codName;

    @Column(name = "COD_ORDER")
    private BigDecimal codOrder;

    public Cod()
    {
        super();
    }

    public CodPK getPk()
    {
        return this.pk;
    }

    public void setPk(CodPK pk)
    {
        this.pk = pk;
    }

    public String getCodName()
    {
        return this.codName;
    }

    public void setCodName(String codName)
    {
        this.codName = codName;
    }

    public BigDecimal getCodOrder()
    {
        return this.codOrder;
    }

    public void setCodOrder(BigDecimal codOrder)
    {
        this.codOrder = codOrder;
    }

}
