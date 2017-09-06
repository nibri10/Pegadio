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
public class ControlePedagio {
    int quant=0, aux=0;
    private String hora;
    private String Data;
    private int Cod;
    private int regisControlPedagio =0;
    private Veiculo [] automotores = new Veiculo[50];
    private ControlePedagio [] controlepedagio = new ControlePedagio[50];

    public ControlePedagio(String hora, String Data, int Cod) {
        this.hora = hora;
        this.Data = Data;
        this.Cod = Cod;
    }
    
    public void VeiculosCadastro(Veiculo auto){
    try{
        if(automotores.length<quant){
            automotores[quant] = auto;
            quant++;
        }
        
        System.out.println("Cadastro efetivado com sucesso");   
    
    }catch(Exception e){
        System.out.println("ERRO");
    }
    }
    
    public void CadastroPracasPedagio(Veiculo automotores[],PedagioCadastro pracas[],int cod){
        try{
            if(cod == pracas[pracas.length].getCod()){
                for(int i=0;i < controlepedagio.length;i++){
                    controlepedagio[i] = new [automotores.length + pracas.length];
                
                }
            }
        }catch(Exception e){
            System.out.println("Cadastro na praça nao efetuado");
        }
    
    }
    
    public String ToString(){
        
    StringBuilder veiculosImprmi = new StringBuilder();
    for(int i=0; i<quant; i++){
        veiculosImprmi.append(automotores[i]).append("/n");
    
    
    }
        
        return veiculosImprmi.toString();
    }

    public Veiculo[] getAutomotores() {
        return automotores;
    }

    public void setAutomotores(Veiculo[] automotores) {
        this.automotores = automotores;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public int getCod() {
        return Cod;
    }

    public void setCod(int Cod) {
        this.Cod = Cod;
    }

    public int getRegisControlPedagio() {
        return regisControlPedagio;
    }

    public void setRegisControlPedagio(int regisControlPedagio) {
        this.regisControlPedagio = regisControlPedagio;
    }
    
    
    
    
}
