/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorytransporte;

/**
 *
 * @author lucas
 */
public class FactoryTransporte {
    public static void main(String[] args) {
        Transporte camion = new Camion();
        Transporte bicicleta = new Bicicleta();

        int cp = 12345;
        System.out.println("Total camion: " + camion.costeTotal(cp));
        System.out.println("Total bicicleta: " + bicicleta.costeTotal(cp));

        float x = 0.5f, y = 0.5f, z = 0.5f, peso = 10;
        System.out.println("Tipo de embalaje de camion: " + camion.tipoEmbalaje(x, y, z, peso));
        System.out.println("Tipo de embalaje de bicicleta: " + bicicleta.tipoEmbalaje(x, y, z, peso));
    }
}

