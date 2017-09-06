/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Nicolas
 */
public class PedagioCadastro {
    final int pracasP = 50; 
    private int cod;
    private static int registro = 0;
    private String NomeConcessionaria;
    private String Endereco;
    private float valor_pedagio=0;
    private int quant =0;
    private PedagioCadastro [] pracas = new PedagioCadastro[pracasP];

    public PedagioCadastro(int cod, String NomeConcessionaria, String Endereco) {
        this.cod = cod;
        this.NomeConcessionaria = NomeConcessionaria;
        this.Endereco = Endereco;
        registro++;
        this.cod=registro;
    }
    
    
   public boolean Inserir_Dados_Pedagio(PedagioCadastro Cadpracas){
        if(pracas.length<quant){
        pracas[quant]=  Cadpracas;
        quant++;
        
        return true;
        }
    return false;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNomeConcessionaria() {
        return NomeConcessionaria;
    }

    public void setNomeConcessionaria(String NomeConcessionaria) {
        this.NomeConcessionaria = NomeConcessionaria;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public float getValor_pedagio() {
        return valor_pedagio;
    }

    public void setValor_pedagio(float valor_pedagio) {
        this.valor_pedagio = valor_pedagio;
    }
    
    
     public boolean Alterar_Dados_Pedagio(String nome,int valorAlterado, PedagioCadastro alteracaoValor){
        for(int i=0; i<quant;i++){
            if(nome.equalsIgnoreCase(pracas[i].getNomeConcessionaria())){
                switch(valorAlterado){
                    case 1:
                        pracas[i].setNomeConcessionaria(alteracaoValor.getNomeConcessionaria());
                        System.out.println("\n--------------------------------------------------------------------------------\n");
                        System.out.println("\n---------- Alteracao do Nome da Concessionaria Efetuado com Sucesso! -----------\n");
                        System.out.println("\n--------------------------------------------------------------------------------\n");
                    break;
                    
                    case 2:
                        pracas[i].setValor_pedagio(alteracaoValor.getValor_pedagio());
                        System.out.println("\n--------------------------------------------------------------------------------\n");
                        System.out.println("\n-------- Alteracao do Valor da Praça de Pedagio Efetuado com Sucesso! ----------\n");
                        System.out.println("\n--------------------------------------------------------------------------------\n");
                        
                        break;
                    
                    case 3:
                        pracas[i].setEndereco(alteracaoValor.getEndereco());
                        System.out.println("\n--------------------------------------------------------------------------------\n");
                        System.out.println("\n-------- Alteracao do Endereco da Praça de Pedagio Efetuado com Sucesso! -------\n");
                        System.out.println("\n--------------------------------------------------------------------------------\n");
                
                
                }return true;
            
            }
        
        }return false;
    
    }

    /**
     *
     * @return
     */
    
    public String ToString(){
        StringBuilder pracasT = new StringBuilder();
        for(int i=0;i<quant;i++){
        
            pracasT.append(pracas[i].getCod()).append(pracas[i].getNomeConcessionaria()).append(pracas[i].getEndereco()).append(pracas[i].getValor_pedagio());
        }
        return pracasT.toString();
    }

    public PedagioCadastro[] getPracas() {
        return pracas;
    }

    
    
    
    
}
