package com.example.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CodPK implements Serializable
{
    //
    private static final long serialVersionUID = 3054312000558567132L;

    @Column(name = "COD_KBN")
    private String codKbn;

    @Column(name = "COD_VALUE")
    private String codValue;

    public CodPK()
    {
        super();
    }

    public String getCodKbn()
    {
        return this.codKbn;
    }

    public void setCodKbn(String codKbn)
    {
        this.codKbn = codKbn;
    }

    public String getCodValue()
    {
        return this.codValue;
    }

    public void setCodValue(String codValue)
    {
        this.codValue = codValue;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == this)
        {
            return true;
        }
        if (!(o instanceof CodPK))
        {
            return false;
        }
        CodPK other = (CodPK) o;
        return this.codKbn.equals(other.codKbn) && this.codValue.equals(other.codValue);
    }

    @Override
    public int hashCode()
    {
        return this.codKbn.hashCode() ^ this.codValue.hashCode();
    }

}
