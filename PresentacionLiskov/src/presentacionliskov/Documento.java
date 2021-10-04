/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacionliskov;

import java.util.Date;

/**
 *
 * @author omen
 */
public abstract class Documento {
    
    protected String sigla;
    int numero;
    String fecha;

    public Documento() {
    }

    public Documento(String sigla, int numero, String fecha) {
        this.sigla = sigla;
        this.numero = numero;
        this.fecha = fecha;
    }
    
    @Override
    public String toString(){
     return "Sigla del documento "+ sigla +" numero del documento "+numero+"  fecha del documento "+fecha;   
    }
}
