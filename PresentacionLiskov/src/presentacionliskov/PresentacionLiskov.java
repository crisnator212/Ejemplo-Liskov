/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacionliskov;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author omen
 */
public class PresentacionLiskov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Impresora impresora = new Impresora();
        Factura fac = new Factura("fj",331, "22 de octubre");
        NotaDeCredito ndc = new NotaDeCredito("hhw",331, "12 de noviebre");
        Remito rem = new Remito(2, "f", 567, "30 de diciembre");
        
         impresora.ImprimirFactura(fac);
         impresora.ImprimirNotDeCredito(ndc);
         impresora.ImprimirRemito(rem);
    }
    
}
