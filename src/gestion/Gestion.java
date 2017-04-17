/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

/**
 *
 * @author Estudiante
 */
public class Gestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Banco bank=new Banco();
    Cliente cliente1=new Cliente ("ramiro","ramirez",4566496, 45, "rara@hgsz.com" );
    Cliente cliente2=new Cliente ("rami","ramir",4566496, 45, "rara@hgsz.com" );
    Asset activo1 =new Cash (100);
    Asset activo2 =new Stock(44, "google",100,20);
    cliente1.addAsset(activo1);
    cliente1.addAsset(activo2);
    bank.addClientes(cliente1);
    
    Asset activo3= new Mutualfund(2,"motorola",20,40 );
    cliente2.addAsset(activo3);
    bank.addClientes(cliente2);
    double totalMercado=bank.getAllMarketValue();
        System.out.println("Total"+ totalMercado);
    
    
    
    
    }
    
}
