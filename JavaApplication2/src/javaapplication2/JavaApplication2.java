/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ***PRIMER EJERCICIO:***
        /*
        int edad;
        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
        if (edad >= 18){
            JOptionPane.showMessageDialog(null, "Puedes votar");
        }else{
        JOptionPane.showMessageDialog(null, "No Puedes votar");
        } */

        // ***SEGUNDO EJERCICIO:***
        /*
        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota de la prueba anterior"));
        if (nota >= 70) {
            JOptionPane.showMessageDialog(null, "Aprobado");
        } else {
            JOptionPane.showMessageDialog(null, "Reprobado");
        } */

        //***TERCER EJERCICIO (IF):***
        /*
        int diaSemana;
        diaSemana = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del dia de la semana"));
        if (diaSemana == 1){
            JOptionPane.showMessageDialog(null, "Lunes");
        }else if (diaSemana == 2) {
            JOptionPane.showMessageDialog(null, "Martes");
        }else if (diaSemana == 3) {
            JOptionPane.showMessageDialog(null, "Miercoles");
        }else if (diaSemana == 4){
            JOptionPane.showMessageDialog(null, "Jueves");
        }else if (diaSemana == 5){
            JOptionPane.showMessageDialog(null, "Viernes");
        }else if (diaSemana == 6){
            JOptionPane.showMessageDialog(null, "Sabado");
        }else if (diaSemana == 7){
            JOptionPane.showMessageDialog(null, "Domingo");
        }else {
            JOptionPane.showMessageDialog(null, "Dia invalido");
        }
*/
        //***TERCER EJERCICIO (SWITCH)***:
        /*
        int diaSemana;
        diaSemana = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del dia de la semana"));
        switch (diaSemana) {
            case 1:
                JOptionPane.showMessageDialog(null, "Lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Martes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Miercoles");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Jueves");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Viernes");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sabado");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Dia invalido");
        } */
        
        //***CUARTO EJERCICIO:***
        /*
        int diaSemana;
        diaSemana = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del dia de la semana"));
        switch (diaSemana) {
            case 1:
                JOptionPane.showMessageDialog(null, "Lunes");
                JOptionPane.showMessageDialog(null, "Dia laboral");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Martes");
                JOptionPane.showMessageDialog(null, "Dia laboral");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Miercoles");
                JOptionPane.showMessageDialog(null, "Dia laboral");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Jueves");
                JOptionPane.showMessageDialog(null, "Dia laboral");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Viernes");
                JOptionPane.showMessageDialog(null, "Dia laboral");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sabado");
                JOptionPane.showMessageDialog(null, "No es Dia laboral");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Domingo");
                JOptionPane.showMessageDialog(null, "No es Dia laboral");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Dia invalido");
        } */
        // ***QUINTO EJERCICIO:***
        int primerNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        int segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Segundo numero"));
        int tercerNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Tercer numero"));
        int cuartoNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Cuarto numero"));
        
        if (primerNumero > segundoNumero && primerNumero > tercerNumero && primerNumero > cuartoNumero) {
            JOptionPane.showMessageDialog(null, "El numero mayor es " + primerNumero);
        }else if (segundoNumero > primerNumero && segundoNumero > tercerNumero && segundoNumero > cuartoNumero) {
            JOptionPane.showMessageDialog(null, "El numero mayor es " + segundoNumero);
        }else if (tercerNumero > primerNumero && tercerNumero > segundoNumero && tercerNumero > cuartoNumero) {
            JOptionPane.showMessageDialog(null, "El numero mayor es " + tercerNumero);
        }else if (cuartoNumero > primerNumero && cuartoNumero > segundoNumero && cuartoNumero > tercerNumero) {
            JOptionPane.showMessageDialog(null, "El numero mayor es " + cuartoNumero);
        }
    }

}
