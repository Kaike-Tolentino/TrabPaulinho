
package model;

public class ContaBancaria {
    
    private int n;
    private double saldo;
    private String titular;

    public ContaBancaria() {
    }

    public ContaBancaria(int n, double saldo, String titular) {
        this.n = n;
        this.saldo = saldo;
        this.titular = titular;
    }

    
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    



}
