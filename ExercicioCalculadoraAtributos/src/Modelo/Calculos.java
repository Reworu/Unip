/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author reverdan.sparinger
 */
public class Calculos extends absPropriedades
{
    
    
    public void Calcular()
    {
        if (getOp().equals("+"))
            this.setRes(this.getN1() + this.getN2());
        if (this.getOp().equals("-"))
            this.setRes(this.getN1() - this.getN2());
        if (this.getOp().equals("*"))
            this.setRes(this.getN1() * this.getN2());
        if (this.getOp().equals("/"))
            this.setRes(this.getN1() / this.getN2());
        this.setResultado(getRes().toString());
    }
}
