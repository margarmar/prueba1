/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t9p1_mar;
import java.util.*;
import tiposDeColas.*;

/**
 *
 * @author daw1
 */
public class T9P1_Mar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

 Scanner teclado= new Scanner(System.in);
      

//-----------anónima----------------------------------------------------------------------------------------------------------------------------------

cola colaanonima = new cola(){
  lista  listaanonima= new lista();     //meto los números , lo uso como almacen, podría crear un array pero uso un objeto lista que es uno
  
  
  public void encolar (int numero) //definimos las funciones abstractas
  {System.out.println("\n▂▃▅▇█▓▒░ encolar de anónima  (llama a anadirfinal de lista)░▒▓█▇▅▃▂");
    listaanonima.anadirfinal(numero);
  
  }
  
  
public void desencolar()//lo modifico para que meta números hasta introducir un negativo, aunque se llame igual la he usado en esta clase anónima para que haga lo que yo quiero
  {  
      System.out.println("▂▃▅▇█▓▒░ desencolar de anónima (llama a encolar para meter los números) ░▒▓█▇▅▃▂");
      System.out.println("♧■♧■♧■♧■♧■♧■♧Este sería nuestro método para introducir números hasta que introduzcamos uno negativo♧■♧■♧■♧■♧■♧■♧\n--A su vez llama a encolar  definida en la anónima también (para meter los números que le damos en cola), y esta llama a anadirfinal para no escribir lo mismo--");

      int[] intArray = new int[]{ 1,2,3,4,-1,6,7,8,9,10 }; //listado de números para meterlos, no los pido por pantalla para que salga al usuario todo escrito en el main sin que haga nada

      int i=0;//contador
      
      System.out.println("\n✎✐✎✐✎Este es el listado que recorrerá { 1,2,3,4,-1,6,7,8,9,10 }✎✐✎✐✎\n");
while(intArray[i]>=0)
 {  
        System.out.println("✎Número a introducir:  " +intArray[i]);              
        this.encolar(intArray[i]);//los meto en cola

            if(i<intArray.length)  
            {
                i++;
            }
 
        
            
    }

      System.out.println("Ahora vamos desencolando llamando a desapilar , el mismo número de veces que números hemos metido");
    for(int z=i; z>0; z--) //desencolamos ese número de veces
    {
      listaanonima.desapilar();
    }   

 }
    
  
};

System.out.println("---------CREAMOS la  cola anónima Y llamamos a su método de introducir números y parar cuando sea negativo. ----He usado desencolar, la he definido para que haga eso----------------------------------------------------------------------------------------------------------------\n");
colaanonima.desencolar();


 
 //--------------------------------------------------------------------------------------------------
 
 //creamos dos objetos tipo lista
 System.out.println("---------CREAMOS la lista listaOne Y LLAMAMOS A LOS MÉTODOS PARA MODIFICAR EL LISTADO A NUESTRO GUSTO----------------------------------------------------------------------------------------------------------------\n\n");
 
 lista listaOne =new lista();
 

listaOne.encolar(41);

listaOne.encolar(6);
 
listaOne.encolarReves(22);

listaOne.encolarReves(98);

listaOne.apilar(10);

listaOne.anadirprincipio(77);

listaOne.apilar(9);

listaOne.anadirprincipio(65);

listaOne.desencolar();

listaOne.desapilar();

listaOne.desencolarReves();

listaOne.anadirdondequeramos(33, 2);

listaOne.apilarmultiple(3, 2);


System.out.println("\n\n---------CREAMOS la lista listaTwo LLAMAMOS A LOS MÉTODOS PARA MODIFICAR EL LISTADO A NUESTRO GUSTO----------------------------------------------------------------------------------------------------------------\n\n");

 lista listaTwo =new lista();


listaTwo.encolar(369);

listaTwo.encolar(99);
 
listaTwo.encolarReves(36);

listaTwo.encolarReves(43);

listaTwo.apilar(6);

listaTwo.anadirprincipio(2);

listaTwo.apilar(55);

listaTwo.anadirprincipio(14);

listaTwo.desencolar();

listaTwo.desapilar();

listaTwo.desencolarReves();

listaTwo.anadirdondequeramos(25, 4);
 
listaTwo.apilarmultiple(5, 3);


    }//--
    
  





  
}///////////

