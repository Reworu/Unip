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
public class Controle extends absPropriedades
{
    
    
    public void Calcular()
    {
       setMensagem("");
       
       Validacao validacao = new Validacao();
       validacao.setNum1(this.getNum1());
       validacao.setNum2(this.getNum2());
       validacao.setOp(this.getOp());
       validacao.Validar();
       if (validacao.getMensagem().equals(""))
       {
           Calculos calculos = new Calculos();
           calculos.setN1(validacao.getN1());
           calculos.setN2(validacao.getN2());
           calculos.setOp(this.getOp());
           calculos.Calcular();
           setResultado(calculos.getResultado());
       }
       else
       {
           setMensagem(validacao.getMensagem());
       }
    }
}
