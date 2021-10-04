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
public class Impresora {

    public Impresora() {
    }
    
    
    public void ImprimirFactura(Factura factura){
        System.out.println(factura.toString());
    }
    
    public void ImprimirNotDeCredito(NotaDeCredito notaDeCredito){
        System.out.println(notaDeCredito.toString());
    }
    
    public void ImprimirRemito(Remito remito){
        System.out.println(remito.toString());
    }
}
