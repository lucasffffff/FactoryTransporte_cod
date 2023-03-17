/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorytransporte;

/**
 *
 * @author lucas
 */
public interface Transporte {
    float costeTotal(int cp);
    int tipoEmbalaje(float x, float y, float z, float peso);
}

