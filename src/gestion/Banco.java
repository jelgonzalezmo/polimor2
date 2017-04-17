/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Banco {

    //              cllave    valor
    private HashMap<String, Cliente> clientes;

    public Banco() {
        this.clientes = new HashMap<>();
    }

    public void addClientes(Cliente Cliente) {
        this.clientes.put(Cliente.getCorreo(), Cliente);
    }

    public double getAllMarketValue() {
        double total = 0;
        for (Cliente cliente : this.clientes.values()) {
            for (Asset asset : cliente.getAssets()) {
                total += asset.getMarketvalue();
            }

        }
        return total;
    }

    public double getAllprofit() {
        double total = 0;
        for (Cliente cliente : this.clientes.values()) {
            for (Asset asset : cliente.getAssets()) {
                total += asset.getProfit();
            }

        }
        return total;
    }

    public HashMap getAllByTypesAssets() {
        HashMap<String, Double> total = new HashMap();
        for (Cliente cliente : this.clientes.values()) {
            for (Asset asset : cliente.getAssets()) {
                if (asset instanceof Cash) {
                    if (total.containsKey("cash")) {
                        total.put("cash", asset.getMarketvalue());
                    } else {
                        Double valoractual = total.get("cash");
                        Double nuevovalor = valoractual + asset.getMarketvalue();
                        total.put("cash", nuevovalor);
                    }
                } else if (asset instanceof Mutualfund) {
                    if (total.containsKey("cash")) {
                        total.put("cash", asset.getMarketvalue());
                    } else {
                        Double valoractual = total.get("cash");
                        Double nuevovalor = valoractual + asset.getMarketvalue();
                        total.put("cash", nuevovalor);
                    }
                } else if (asset instanceof DividensStock) {
                    if (total.containsKey("cash")) {
                        total.put("cash", asset.getMarketvalue());
                    } else {
                        Double valoractual = total.get("cash");
                        Double nuevovalor = valoractual + asset.getMarketvalue();
                        total.put("cash", nuevovalor);
                    }
                } else if (asset instanceof Stock) {
                    if (total.containsKey("cash")) {
                        total.put("cash", asset.getMarketvalue());
                    } else {
                        Double valoractual = total.get("cash");
                        Double nuevovalor = valoractual + asset.getMarketvalue();
                        total.put("cash", nuevovalor);
                    }
                }
            }

        }
        return total;
    }

    /*public Cliente getMaxProfit() {
        for (Cliente cliente : this.clientes.values()) {
            for (int i = 0; i < cliente.getAssets().size(); i++) {
                         }

            return null;
        }}*/
}
    

