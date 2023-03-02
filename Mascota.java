import java.util.Scanner;

public class Mascota {
    //ATRIBUTOS
    String nombre;
    int edad;
    String raza;
    String sexo;

    public void leeDatos ()
    {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("ingrese el nombre de su mascota");
            nombre=teclado.nextLine();
            System.out.println("ingrese la edad de su mascota");
            edad=teclado.nextInt();
            System.out.println("ingrese la raza de su mascota");
            raza=teclado.nextLine();
            System.out.println("ingrese el sexo de su mascota");
            sexo=teclado.nextLine();
        }
    }
    //MAIN
    public void mostrarDatos()
    {
        System.out.println("el nombre es:"+nombre);
        System.out.println("su edad es:"+edad);
        System.out.println("la raza es:"+raza);
        System.out.println("su sexo es:"+sexo);
    }

    public class Datos {
    public static void main(String[] args){
        Datos ob1=new Datos ();
        ob1.leeDatos();
        ob1.mostrarDatos();

    }

    private void mostrarDatos() {
    }

    private void leeDatos() {
    }
 
    
    }
    
}

//CALVO LOPEZ JONATHAN DAVID ISC-SABADOS