/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hernandez_fernando_lab2;
import java.util.Scanner;
/**
 *
 * @author fdhg0
 */
public class Hernandez_fernando_Notaslab {
    public static void main(String [] args) {
      Scanner lea=new Scanner(System.in);  
    while(true){
        System.out.println("BIENVENIDO INGENIERO ERICK_AMAYA");
        System.out.println("1: Cadena");
        System.out.println("2: Notas");
        System.out.println("3: Cadena");
        System.out.println("4: salir");
        
        int opcion=lea.nextInt();
    
        
        if(opcion==1){
           
            
            System.out.println("Ingrese la cadena: ");
            String cadena=lea.next();
            
            int maxFrec= 0;
            char caracMfrec=' ';
            
            int contador= 0;
            while (contador < cadena.length()){
                char caracAct = cadena.charAt(contador);
                int frecAct = 0;
                
            int contador2 = 0;
            while (contador2< cadena.length()){
                if (cadena.charAt(contador2)== caracAct){
                    frecAct=frecAct+1;
                }
                contador2+=1;
            }
            if (frecAct > maxFrec){
                maxFrec = frecAct;
                caracMfrec = caracAct;
            }
            contador+=1;
          }
            
        System.out.println("Caracter mas frecuente es: '"+caracMfrec +
                "' con frecuencia de: " + maxFrec);
    }
        
        
        
        
        if(opcion==2){
        
        

        
        double nota= 0;
        double sumT= 0;
        int notasT= 0;
        int contador=1;
        double prom=0;
        double notaMa=0;
        double notaMe=100;
    
            System.out.println("Ingrese cantidad de notas: ");
            notasT=lea.nextInt();
            
            while (notasT>=contador){
            System.out.println("Ingrese la cantidad de notas: "+contador+": ");
            nota=lea.nextDouble();
            
                if (nota>=0 && nota<=100){
                    contador+=1;
                    sumT+=nota;
                 
                    while(nota>notaMa){
                        notaMa=nota;
                }
                
                    while (nota<notaMe){
                        notaMe=nota;
                }
                
                
                prom=sumT/contador;
                
            
            }
        }
        
        System.out.println("""
                            BOLETA NOTAS 
                            El promedio es: """+prom+
                            "\n Nota Mayor: "+notaMa+
                            "\n Nota Menor: "+notaMe);
    
    
        }
        if (opcion==3){
            
        }
        if (opcion==4){
            break;
        }
    }
        
        
   }     
}
