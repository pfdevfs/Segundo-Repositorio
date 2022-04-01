package Banco;

public class Cliente extends Cuenta{
    int dni;
    int sueldo;
    
    public Cliente() {
        
    }
    
    public Cliente(int dni, int saldo) {
       super.numCuenta = dni;
       super.contraseña = dni;
       this.saldo = saldo;
    }
    
    public int getDni(){
        return this.dni;
    }
    
    public int getSueldo() {
        return this.sueldo;
    }
    
    public void setDni(int nuevoDni) {
      this.dni = nuevoDni;
  }     
    
   public void setSueldo(int nuevoSueldo) {
       this.sueldo = nuevoSueldo;
   }
   
   public void ingresar_nomina() {
       super.saldo = this.saldo+this.sueldo;
   }
   
   public void sacar_dinero(int dni, int contraseña) {
       System.out.println("Introduzca contraseña: ");
       contraseña = Entrada.entero();
       if(contraseña != super.contraseña) {
           do{
               System.out.println("Contraseña incorrecta");
               System.out.println("Introduzcala de nuevo: ");
                contraseña = Entrada.entero();
           }while(contraseña != super.contraseña);
       } 
       System.out.println("Introduzca su dni: ");
       dni = Entrada.entero();
       
       if(dni != this.dni) {
           do{
                System.out.println("Dni incorrecta");
               System.out.println("Introduzcalo de nuevo: ");
                dni = Entrada.entero();
           }while(dni != this.dni);
       }
       System.out.println("Cuanto dinero quiere sacar: ");
       int sacar = Entrada.entero();
       super.saldo = super.saldo - sacar;
   }
    
    
    
    
    
}
