/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t9p1_mar;
import tiposDeColas.*;

//---------------------------------------------------------------------------------------------------------------------------------------------------

public class lista  implements pila, colaDoble{//no hace falta implementar pila porque está heredada en coladoble
    
    
 //---------------------------------------------------------------------------------------------------------------------------------------------------
    
  public   int [] listado;//como atributo unicamente una lista de enteros
    
    
  public lista()  //esto vendría a ser el constructor de lista, inicializa la lista que luego iremos rellenando/modificando
  {
     int listado[]= new int[0];
      
  }  
   
 //--------------------------------------------------------------------------------------------------------------------------------------------------- 
  
 public void anadirfinal(int numero)
 {
     System.out.println("\n▂▃▅▇█▓▒░ anadirfinal  ░▒▓█▇▅▃▂\n");

System.out.println("✎✐✎✐✎ Añadir al final: "+numero+ "✐✎✐✎✐\n");
      
      
     int listadoauxi[];  
     
     if(listado==null) //si el listado es nulo, creamos un array auxiliar de una posición con el elemento que nos dan y lo igualamos al nuestro.
     {
        listadoauxi=new int[1]; 
        listadoauxi[0]=numero;
     }
 
     else  //si no es nulo; se crea un array auxiliar con una posición más , la última posición será el número que me dan  y lo demás lo relleno con el resto del array principal, luego lo igualo
     {
        listadoauxi=new int[listado.length+1];
        listadoauxi[listado.length]=numero;
        
        for(int i=0; i<listado.length; i++)
        {
            listadoauxi[i]=listado[i];
        
        }   
            
            
     }
 
    listado=listadoauxi; 
    
      mostrarListado(); //en cada función llamo a la función para mostrar los datos
    }
  

 
//----------------------------------------------------------------------------------------------------------------  
public void elementoslista()//esta función la tengo apuntada que había que hacerla del primer día que se explicó el ejercicio
{int elementoslista=0;

    System.out.println("\n▂▃▅▇█▓▒░ elementoslista  ░▒▓█▇▅▃▂\n");
 
 if(this.listado!=null)
 {
     elementoslista=this.listado.length;
     System.out.println("✎✐✎✐✎ La lista contiene "+elementoslista+ "✐✎✐✎✐\n");
 }

 else{System.out.println("✎✐✎✐✎ La lista es nula ✐✎✐✎✐\n");
 }
 
 mostrarListado();
   
}
//-----------------------------------------------------------------------------------------------------------------

 public void anadirprincipio(int numero)
 {
      System.out.println("\n▂▃▅▇█▓▒░ anadirprincipio ░▒▓█▇▅▃▂\n");
     
    //si es nulo creo un array auxi con una posición y meto el entero ahí, luego lo igualo
    //si no es nulo creo un array auxiliar con una posición más, meto en la posición primera el entero y lo demás lo relleno con el principal, luego igualo
     
     System.out.println("✎✐✎✐✎ Añadir al principio: "+numero+ "✐✎✐✎✐\n");
     
    int listadoauxi[];
     
     if(listado==null)
     {
        listadoauxi=new int[1]; 
        listadoauxi[0]=numero;
     }
 
     else
     {
        listadoauxi=new int[listado.length+1];
        listadoauxi[0]=numero;
        
        
        for(int i=0; i<listado.length; i++)
        {
            listadoauxi[i+1]=listado[i];
        
        }   
            
     }
 
   listado=listadoauxi;  
   
    mostrarListado();
     
 }
//-----------------------------------------------------------------------------------------------------------------------------------------------------

 public void anadirdondequeramos(int numero, int posicion)//
 {
     //para ello necesito que me digan la posición y el entero a introducir.
     
     //si el listado es nulo, se crea un auxiliar con una posición y guardamos el entero e igualamos.
     //s
      
     int listadoauxi[]; 
     System.out.println("▂▃▅▇█▓▒░  anadirdondequeramos  ░▒▓█▇▅▃▂\n");
     System.out.println("✎✐✎✐✎ Añadir el número: "+numero+ " ↦↦ en la posición: "+posicion+"✐✎✐✎✐\n");
     
     if(listado==null)//si es nulo pues simplemente creo un array de una posi, hago esto para q no pete
     { System.out.println("La lista no contenía elementos, hemos introducido ese elemento");
        listadoauxi=new int[1]; 
        listadoauxi[0]=numero;
     }
 
     if (listado.length>=posicion) //si la posición concuerda con la longitud del array , metemos el número donde nos dice (sustituyendo al que había) el resto se rellena primero la parte
                                   //anterior al entero y luego la otra. utilizamos un array auxiliar para operar y luego lo igualamos
     {
         
        listadoauxi=new int[listado.length+1];
        
        listadoauxi[posicion]=numero;
        
         for(int i=0; i<posicion;i++   )//rellenamos la parte antes del entero que nos dan
         {
             listadoauxi[i]=listado[i];
             
         }    
             
  
          for(int i=posicion+1; i<listadoauxi.length;i++   ) //rellenamos la parte de después
         {
             listadoauxi[i]=listado[i-1];
             
         }       
         
          listado=listadoauxi; 
     
         mostrarListado();
     }
 
    
     if (listado.length<posicion) //si le damos una posición mayor que la del listado ..no podemos hacerlo
     {
         System.out.println("No existe esa posición en el array Listado");
     
     
     }
   
 }
 //----------------------------------------------------
 
 public void apilar(int numero) //ya tenemos un método que hace eso
 {   
     System.out.println("▂▃▅▇█▓▒░  apilar (llama a anadirprincipio) ░▒▓█▇▅▃▂\n");
     
  
    anadirprincipio(numero);        
   
 }
 //------------------------------------------------------------------------------------
 
 
 public void desapilar() 
         
   {
       //se crea un array auxiliar con una posición menos y lo rellenamos desde la segunda posición, luego igualamos
       
       
       
        System.out.println("▂▃▅▇█▓▒░  desapilar ░▒▓█▇▅▃▂\n");
        
      
       int listadoauxi[];
     
     if(listado==null)
     {   
         System.out.println("No hay nada para desapilarlo");//gestión de errores por si fuese nulo
     }
 
     else
     {
        listadoauxi=new int[listado.length-1];
        
        
        
        for(int i=1; i<listado.length; i++)
        {
            listadoauxi[i-1]=listado[i];
        
        }   
          
       listado=listadoauxi;   
     }
 
     mostrarListado();
      
   
   }
    
 //----------------------------------------------------------------------------------------------------------
 
public void encolar(int numero) //ya tenemos un método que hace eso
    { System.out.println("▂▃▅▇█▓▒░  encolar (llama a anadirfinal) ░▒▓█▇▅▃▂\n");   
        anadirfinal(numero);
      
    }
    
 //-----------------------------------------------------------------------------------
 
  public void desencolar()  //se crea un array auxiliar con una posición menos y lo rellenamos sin meter la primera posición del principal, luego igualamos
  {
     System.out.println("▂▃▅▇█▓▒░  desencolar-llama a desapilar ░▒▓█▇▅▃▂\n"); 
      
    desapilar();
  
  }




  //------------------------------------------------------------------------------------------------------------------------------

public void encolarReves(int numero)//encolar a la cabeza //ya tenemos un método que hace eso
    { 
      System.out.println("▂▃▅▇█▓▒░  encolarReves (encola a la cabeza, llama a anadirprincipio)░▒▓█▇▅▃▂\n");
    
       anadirprincipio(numero);
    }
  //-----------------------------------------------------------------
public void desencolarReves()//quito del final    //
   {
        System.out.println("▂▃▅▇█▓▒░  desencolarReves(quito del final░▒▓█▇▅▃▂\n");
        
       int listadoauxi[];
    
        
       if(listado!=null)   
       { 
            listadoauxi=new int[listado.length-1];
            
        
        for(int i=0; i<listado.length-1; i++)
        {
            listadoauxi[i]=listado[i];
        
        }   
         
             listado=listadoauxi; 
       }
 
     else
           
       {
           System.out.println("No tienes elementos para desencolar");   //si fuese nulo no se puede 
       }
    
       
       mostrarListado();
       
     
   }

//-------------------------------------------------------------
public void mostrarListado() //recorremos el listado mostrando el elemento y la posición
{
    System.out.println("■━■ELEMENTOS DE LA LISTA■━■\n"); 
    
  for  (int x=0; x<listado.length; x++)
  {
      
       System.out.println("Posición: "+x+"   ▄▄▄   Número: " + listado[x]);
  }
  
    System.out.println("\n\n\n\n");
}  

//---------------------------------------------------------

public void apilarmultiple(int numero, int veces) //apila el mismo múmero X veces
{   
    
      System.out.println("▂▃▅▇█▓▒░  apilarmultiple(llama a apilar las veces que le digamos)░▒▓█▇▅▃▂\n");
      System.out.println("✎✐✎✐✎ Añadir el número: "+numero+ " ↦↦" +veces+" veces ✐✎✐✎✐\n");
      
      
   for(int i=0;i<veces;i++)
   {    
     apilar(numero);
   
   }

}
 //-------------------------------------------------------------------------- 
}/////////
