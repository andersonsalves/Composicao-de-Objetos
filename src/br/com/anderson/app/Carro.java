package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public class Carro {

    private String fabricante;
    private String modelo;
    private String cor;
    private int ano;

    private Proprietario proprietario;
    
    /**
     * Construtor.
     * @param proprietario 
     */    
    public Carro(Proprietario proprietario) {
        this.proprietario = proprietario;        
    }
    
    // Getters e Setters 

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }
}
