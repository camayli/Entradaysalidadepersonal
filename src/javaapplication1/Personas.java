
package javaapplication1;
import java.util.*;
public class Personas extends Proyecto{

    String nombre;
    int documento;
    String puesto;
    double sueldo;
    String area_de_trabajo;
    String area_a_la_que_va;

 public Personas(){
    this.nombre ="";
    this.documento = 0;
    this.puesto = "";
    this.area_de_trabajo = "";
}   
 public Personas (String nombre, int documento, String puesto, double sueldo, int ID, String area_de_trabajo){
    this.nombre = nombre;
    this.documento = documento;
    this.puesto = puesto;
    this.sueldo= sueldo;
  
    this.area_de_trabajo = area_de_trabajo; 
 }

    public String getNombre() {
        return nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getArea_de_trabajo() {
        return area_de_trabajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setArea_de_trabajo(String area_de_trabajo) {
        this.area_de_trabajo = area_de_trabajo;
    }
    
    //Externo  
    int b=0,b1=0;
    public Personas(String nombre, double documento, String fecha_de_entrada, String area_a_la_que_va) {
        this.nombre = nombre;
        this.area_a_la_que_va = area_a_la_que_va;
    }

    public void setArea_a_la_que_va(String area_a_la_que_va) {
        this.area_a_la_que_va = area_a_la_que_va;
    }


    public String getArea_a_la_que_va() {
        return area_a_la_que_va;
    }
    
//metodo cliente externo
public void ext(){
        Scanner sc= new Scanner (System.in);
        String aa;
        String nombrecliente;
        String documento;
        String area_a_la_que_va1;
        int pp=0, contraseña=123,m=0;
        boolean salir=false;

        
while (!salir)        {
        System.out.println("");
        System.out.println("Seleccione");
        System.out.println("1 Cliente");
        System.out.println("2. Administrar");
        System.out.println("3. Volver a menu principal");
        pp=sc.nextInt();
    
        
 if (pp==1){
    System.out.println("Bienvenido a la empresa: Pepito Torres");
    
    System.out.println("Ingrese numero documento");
    documento=sc.next();
    
    System.out.println("Digite su primer apellido");
    nombrecliente=sc.next();
    
    System.out.println("Escriba el servicio a que se dirije (asesoria)");
    area_a_la_que_va1=sc.next();
    
    {
    StringBuffer nombree=new StringBuffer("Bienvenido Sr/Sra ");
    nombree.insert(18,nombrecliente);
    System.out.print(nombree.toString());

    
    StringBuffer area=new StringBuffer(" usted se dirige al area de ");
    area.insert(28,area_a_la_que_va1);
    System.out.print(area.toString());
    }
    
    System.out.println("");
    
    String palabra="";
    String a1="asesoria";
    
    for (int x=0;x<area_a_la_que_va1.length();x++){
    
    palabra=palabra+area_a_la_que_va1.charAt(x);
     
     if( a1.length()==palabra.length()&&palabra.equalsIgnoreCase(a1) ){
      b=b+1;   
     }
    }
 }
 
 if (pp==2){
     System.out.println("Ingrese contraseña de administrador");
     m=sc.nextInt();
     
 if (contraseña==m){

   System.out.println("Personas que han usado el servicio de asesoria: "+b);

     }
         salir= true;  
                if (salir==true){
                         break;
  }
 }
 
 if (pp==3){
     salir= true;  
                if (salir==true){
                         break;
                     }
 }
 
    }

    }
    }
    
    