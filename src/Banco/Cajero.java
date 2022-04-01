package Banco;

public class Cajero {
     public static void main(String[] args) {
         Cliente cl1 = new Cliente(987654, 1200);
         Cuenta cu1 = new Cuenta(123456789, 15000, 987654);
         int opc=0, contrasenia=0;
         
         while(opc != 6) {
 
         System.out.println("CAJERO AUTOMATICO");
         System.out.println("------------------");
         System.out.println("1. Consultar/Modificar Datos peronsales");
         System.out.println("2. Ingresar nomina");
         System.out.println("3. Cosultar Datos Bancarios");
         System.out.println("4. Sacar dinero");
         System.out.println("5. Modificar contraseña");
         System.out.println("6. Salir\n");
         
         System.out.println("Elija una opción: ");
         opc = Entrada.entero();
         
           switch(opc) {
               case 1:
                   System.out.println("-Dni: "+cl1.dni);
                   System.out.println("-Sueldo: "+cl1.sueldo+"\n");
                   System.out.println("¿Desea cambiar los datos?");
                   String cambiar = Entrada.cadena();
                   
                   if(cambiar.equals("si")) {
                       System.out.println("Introduzca un nuevo dni: ");
                       int nuevoDni = Entrada.entero();
                       cl1.setDni(nuevoDni);
                       System.out.println("Introduzca un nuevo sueldo: ");
                       int nuevoSueldo = Entrada.entero();
                       cl1.setSueldo(nuevoSueldo);
                   } else
                       if(cambiar.equalsIgnoreCase("no")) {
                           break;
                       }
                break;
               case 2: 
                   cl1.ingresar_nomina();
                break;
               case 3:
                  cu1.validar_contraseña(contrasenia);
                 
                    System.out.println("Datos bancarios: \n");
                    System.out.println("-Número Cuenta: "+cl1.numCuenta);
                    System.out.println("-Saldo: "+cl1.saldo);  
                  
                break;
               case 4:
                cl1.sacar_dinero(cl1.dni, contrasenia);
                break;
               case 5:
                   System.out.println("Generando una nueva contraseña... ");
                   cu1.generar_contraseña();
                   System.out.println("Su nueva contraseña es: " +cu1.contraseña+"\n");             
                break;
               case 6:
                   System.out.println("Hasta luego.");
                break;
           }          
         }      
     }
}
