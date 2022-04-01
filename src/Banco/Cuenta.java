package Banco;


public class Cuenta {
    int numCuenta;
    int saldo;
    int contraseña;
    
    public Cuenta() {
        
    }
    
    public Cuenta(int numCuenta, int saldo, int contraseña) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.contraseña = contraseña;
    }
    
    public int getNumCuenta() {
        return this.numCuenta;
    }
    
    public int getSaldo() {
        return this.saldo;
    }
    
    protected void modificar_saldo(int nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }
    
    public void generar_contraseña() {
        this.contraseña = (int) (Math.random()*9999+1000);
        
    }
    
    public void modificar_contraseña() {
        int nuevaContraseña;
        int compararContraseña;
        System.out.println("Introduzca su contraseña actual: ");
        compararContraseña = Entrada.entero();
        if(compararContraseña != this.contraseña) {
            do{
                System.out.println("Contraseña incorrecta");
                System.out.println("Introduzcala de nuevo: ");
                compararContraseña = Entrada.entero();
            }while(compararContraseña != this.contraseña);
            
        } else{
            System.out.println("Contraseña correcta");
        }

        System.out.println("La nueva contraseña es: " +this.contraseña);
    }
    
    public boolean validar_contraseña(int contraseña) {
        boolean validar = false;
        System.out.println("Introduzca contraseña: ");
        contraseña = Entrada.entero();
        if(contraseña != this.contraseña) {
            validar = false;
            do{
                System.out.println("Contraseña incorrecta");
                System.out.println("Introduzcala de nuevo: ");
                contraseña = Entrada.entero(); 
            }while(contraseña != this.contraseña);
            if(contraseña == this.contraseña) {
                validar = true;
            }
        }
        return validar;
    }
    
    public void mostrar_datos() {
        int contraeña;
         System.out.println("Introduzca su contraseña actual: ");
        contraeña = Entrada.entero();
        if(validar_contraseña(this.contraseña) == false) {
            do{
                System.out.println("Contraseña incorrecta");
                System.out.println("Introduzcala de nuevo: ");
                contraeña = Entrada.entero();
            }while(validar_contraseña(contraseña) == false);
            
        } else{
            System.out.println("Contraseña correcta");
            System.out.println(" ");
            System.out.println("Datos del cliente: ");
            System.out.println("--------------------");
            System.out.println("-Número de cuenta: " +this.numCuenta);
            System.out.println("-Saldo: " +this.saldo);
    }
  }
}
