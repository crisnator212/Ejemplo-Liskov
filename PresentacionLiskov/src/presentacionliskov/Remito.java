/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacionliskov;

/**
 *
 * @author omen
 */
public class Remito {
    //contiene una variable agregada
    int bultos;
    String sigla;
    int numero;
    String fecha;

    public Remito() {
    }

    public Remito(int bultos, String sigla, int numero, String fecha) {
        this.bultos = bultos;
        this.sigla = sigla;
        this.numero = numero;
        this.fecha = fecha;
    }


    
    //el remito modifica un metodo original de la clase padre, violando el principio de liskov
    //se esta rescribiendo el metodo toString del padre 
    
    @Override
    public String toString(){
        return "Sigla del Remito "+ sigla +" numero del documento "+numero+"  fecha del documento "+fecha+" Numero de bultos "+bultos;
    }
}
