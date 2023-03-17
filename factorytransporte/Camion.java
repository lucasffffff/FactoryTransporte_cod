/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorytransporte;

/**
 *
 * @author lucas
 */
public class Camion implements Transporte {
    @Override
    public float costeTotal(int cp) {
        // Asumiendo una lógica simple, puedes ajustar según tus necesidades
        return cp * 0.5f;
    }

    @Override
    public int tipoEmbalaje(float x, float y, float z, float peso) {
        if (peso > 100) {
            return 0; // palet
        } else if (peso > 30) {
            return 2; // caja de madera
        } else {
            return 1; // envoltorio cartón
        }
    }
}

