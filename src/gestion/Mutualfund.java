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
public class Mutualfund extends ShareAsset {

    private double totalshares;

    public Mutualfund( double totalshares, String symbol, double totalcost, double currentprice) {
        super(symbol, totalcost, currentprice);
        this.totalshares=totalshares;
    }

    @Override
    public double getMarketvalue() {
        return (this.totalshares * this.currentprice);
    }

    @Override
    public double getProfit() {
        return (this.totalshares * this.currentprice) - this.totalcost;
    }
}
