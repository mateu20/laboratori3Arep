package edu.escuelaing.arep.calentamiento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.MalformedURLException;
import java.net.URL;
import static java.time.Clock.system;

/**
 *
 * @author david.gonzalez-g
 */
public class Ejercicio1 {
    public static void main(String[] args) throws MalformedURLException{
    
    URL n = new URL("https://es.wikipedia.org:80/wiki/Roger_Federer?b=2#/2004:_N%C3%BAmero_1_del_mundo,_Tres_Grand_Slam_y_segundo_Torneo_de_Maestros");
    
    
   System.out.println(n.getProtocol());
   System.out.println(n.getAuthority());
   System.out.println(n.getHost());
   System.out.println(n.getPort());
   System.out.println(n.getPath());
   System.out.println(n.getQuery());
   System.out.println(n.getFile());
   System.out.println(n.getRef());
   }
        
}

