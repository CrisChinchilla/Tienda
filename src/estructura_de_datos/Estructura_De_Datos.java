
package estructura_de_datos;


public class Estructura_De_Datos {

/**
* el metodo recursivo debe tener
* condición de parada/base, que nos permoita devolver un valor 
* 
**/
    public static int factorial(int n) {
            if (n==0){
                return 1;
                
            }
            else {
                return (n*factorial(n-1)); 
            //3*2*1*1    
    public static void main(String[] args) {
        
        System.out.println(recursion.factorial(3));
        
    }
    
}
/**
* metodo que logra buscar un valor X en un array
**/
 public static int buscarElemento(int arr[],int n, int f, int i) { 
if (f<1) { 
return -1;
}
if (arr [1]==n) {
return 1;
}
if (arr[f]==n){
return n;
}
else{
return buscarElemento(arr,1+i,n,f-1);

}


        