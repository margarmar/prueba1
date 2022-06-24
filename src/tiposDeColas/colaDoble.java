/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tiposDeColas;


/**
 *
 * @author daw1
 */
public interface colaDoble extends cola{
    //hacer encolar y desencolar(haciendo lo contrario), encolar en la cabeza y desencolar del principio
    
   abstract void encolarReves(int numero);//encolar a la cabeza(como apilar)//no es override

   //-----------------------------------------------------------------------------------------
   
   
   
   abstract void desencolarReves(); //quito del principio(como desapilar)

  //--------------------------------------------------------------------------------- 
   
}
