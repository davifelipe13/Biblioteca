/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceções;

/**
 *
 * @author Leonardo
 */
public class CampoVazioException extends Exception{
    
    public CampoVazioException(){
        this("Todos os campos devem estar preenchidos");
    }
    
    public CampoVazioException(String message){
        super(message);
    }
    
    
    
    
}
