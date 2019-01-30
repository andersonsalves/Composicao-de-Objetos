package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public class Main {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        Proprietario proprietario = new Proprietario();
        proprietario.setNome("Anderson");
        proprietario.setCpf("567.713.269.61");
        proprietario.setIdade(32);
        proprietario.setCidade("Santo André");
        proprietario.setBairro("Presidente");
        proprietario.setLogradouro("Antoni Cruz");
        
        Carro carro = new Carro(proprietario);
        carro.setFabricante("Honda");
        carro.setModelo("Fit");
        carro.setCor("Preto");
        carro.setAno(2014);
        
        System.out.println("Dados do Carro...... " + "\n");
        System.out.println("Fabricante: " + carro.getFabricante());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Ano: " + carro.getAno()); 
        
        System.out.println("\nDados do Proprietario...... " + "\n");
        System.out.println("Nome: " + carro.getProprietario().getNome());
        System.out.println("CPF: " + carro.getProprietario().getCpf());
        System.out.println("Idade: " + carro.getProprietario().getIdade());
        System.out.println("Cidade: " + carro.getProprietario().getCidade());
        System.out.println("Bairro: " + carro.getProprietario().getBairro());
        System.out.println("Logradouro: " + carro.getProprietario().getLogradouro());           
    }    
}
