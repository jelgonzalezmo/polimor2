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
public class DividensStock extends Stock {

    private double dividends;

    public double getDividends() {
        return dividends;
    }

    public void setDividends(double dividends) {
        this.dividends = dividends;
    }

    public DividensStock(double dividends, int totalshares, String symbol, double totalcost, double currentprice) {
        super(totalshares, symbol, totalcost, currentprice);
        this.dividends = dividends;
    }

    

    public double getMarketvalue() {
        return (this.totalshares * this.currentprice) + this.dividends;
    }
}
