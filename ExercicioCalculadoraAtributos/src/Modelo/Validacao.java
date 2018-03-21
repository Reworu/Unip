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
public class Validacao extends absPropriedades
{
    
    
    public void Validar()
    {
        this.setMensagem("");
        try
        {
            this.setN1((Double) Double.parseDouble(this.getNum1()));
            
        }
        catch (Exception e)
        {
            this.setMensagem("Erro no campo 1 \n");
        }
        try
        {
            this.setN2((Double) Double.parseDouble(this.getNum2()));
        }
        catch (Exception e)
        {
            this.setMensagem(this.getMensagem() + "Erro no campo 2 \n");
        
        }
        if (this.getNum2().equals("0") && this.getOp().equals("/"))
        {
            this.setMensagem(this.getMensagem() + "Divisão por 0");
        }
        
    }
}
