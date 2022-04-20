
package com.mycompany.lab2;
import javax.swing.JOptionPane;

public class Lab2 {

    public static void main(String[] args) {
        /**
        //PREGUNTA 1
        String saludo="HM";
        //Mensaje de cuadro alerta
        JOptionPane.showMessageDialog(null,saludo,"AVISO",0);
        //Mensaje de cuadro aviso
        JOptionPane.showMessageDialog(null,saludo,"AVISO",JOptionPane.INFORMATION_MESSAGE);
        //Ventana de tipeo de datos
        **/
        
        //PREGUNTA 2
        String a1,a2;
        int edad;
        /**
        a1=JOptionPane.showInputDialog(null,"ENTRE SU AÑO DE NACIMIENTO","Aviso",JOptionPane.QUESTION_MESSAGE);
        a2=JOptionPane.showInputDialog(null,"ENTRE AÑO ACTUAL","Aviso",JOptionPane.QUESTION_MESSAGE);
        edad=Integer.parseInt(a2)-Integer.parseInt(a1);
        JOptionPane.showMessageDialog(null,"EDAD="+edad,"Aviso",JOptionPane.INFORMATION_MESSAGE);
        **/
        //VARIANTE.v1 PARA ASEGURAR QUE LAS ENTRADAS NO SEAN null (OBS: no garantiza entrada de enteros)
        while(true){
            a1=JOptionPane.showInputDialog(null,"ENTRE SU AÑO DE NACIMIENTO","Aviso",JOptionPane.QUESTION_MESSAGE);
            if (a1!=null){
                break;
            }
            else{
                continue;
            }
        }
        while(true){
            a2=JOptionPane.showInputDialog(null,"ENTRE AÑO ACTUAL","Aviso",JOptionPane.QUESTION_MESSAGE);
            if (a2!=null){
                break;
            }
            else{
                continue; 
            }
        }
        edad=Integer.parseInt(a2)-Integer.parseInt(a1);
        JOptionPane.showMessageDialog(null,"EDAD="+edad,"Aviso",JOptionPane.INFORMATION_MESSAGE);
    }
}
