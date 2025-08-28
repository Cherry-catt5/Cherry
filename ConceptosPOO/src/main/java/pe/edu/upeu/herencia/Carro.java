package pe.edu.upeu.herencia;

public class Carro extends Vehiculo{

   public static void main (String[] args){
       Carro c = new Carro();
       System.out.println("Cararcteristicas: ");
       c.marca="Toyota";
       System.out.println("Marca"+c.marca);
       System.out.println("Modelo"+c.modelo);
       System.out.println("Color no nse puede agregar por ser privado.");
       c.sonido();
   }
}
