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
public class Veiculo {
    private String Placa;
    private int Categoria;

    public Veiculo(String Placa, int Categoria) {
        this.Placa = Placa;
        this.Categoria = Categoria;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public int getCategoria() {
        return Categoria;
    }

    public void setCategoria(int Categoria) {
        this.Categoria = Categoria;
    }
    
    
    public String ToString(){ 
    try{
        StringBuilder veiculosImprmi = new StringBuilder();
        veiculosImprmi.append("Placa");
    
    return veiculosImprmi.toString();
    }catch(Error e){
        System.out.println("Nao foi posssivel Imprimir os dados solicitados sobre veiculos");
    }
        
        return null;
    }
    
}
