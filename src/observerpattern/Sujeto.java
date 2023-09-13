/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observerpattern;

/**
 *
 * @author david
 */
public interface Sujeto {
    abstract void agregar(Observador observador);
    abstract void eliminar(Observador observador);
    abstract void notificar();
}
