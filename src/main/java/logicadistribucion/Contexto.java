/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicadistribucion;

/**
 *
 * @author jaira
 */
public class Contexto {
    private Estrategia estrategia;
    public void setEstrategia(Estrategia estrategia){
        this.estrategia = estrategia;
    }
    
    public void ejecutar(){
        if(estrategia != null){
            estrategia.distribuir();
        } else {
            System.out.println("No hay estrategia de distribución");
        }
    }
}
