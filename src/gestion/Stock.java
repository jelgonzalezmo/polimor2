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
public class Stock extends ShareAsset {

    protected int totalshares;

    public int getTotalshares() {
        return totalshares;
    }

    public void setTotalshares(int totalshares) {
        this.totalshares = totalshares;
    }

    public Stock(int totalshares,String symbol, double totalcost, double currentprice) {
                super(symbol, totalcost, currentprice);
                this.totalshares=totalshares;
    }

    @Override
    public double getMarketvalue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getProfit() {
        return (this.totalshares * this.currentprice) - this.totalcost;
    }
}
