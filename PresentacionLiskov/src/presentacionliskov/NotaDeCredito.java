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
public class NotaDeCredito extends Documento{
   

    public NotaDeCredito() {
    }

    public NotaDeCredito( String sigla, int numero, String fecha) {
        super(sigla, numero, fecha);
        
    }
   
}
