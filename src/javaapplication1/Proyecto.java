
package javaapplication1;


import java.util.*;
public class Proyecto {
    

    int franja=0,diae=0,dias=0,j=0,codr=0;
    int pm=2,am=1,q=0,q2=0,cod120=0;
    double h=0,h2=0,w=0,z=0;
    double m,m2=0;
    double ht1=0;
    int m11,mt1,mt11,u=3480,zz=0;
    double dia1t=0,mdia1=0,dia1m=0,tt=0.5;
    int pp=0;

    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in); 
    
//Salidas de menus    
    boolean salir= false;
    boolean salir2= false;
    double salarb=0,salar= 3356;
    double subtrans= 88211;
    double totalsal1=0;
    double tm;
    int q=0,q2=0;
    double w=0,z=0,m=0;
    int diae=0,dias=0,j=0,codr=0;
    int zz=0,ja=0;
    int pp=0;

//Importes de Clases
    //importe de registro
    registro horarios =new registro();
//Importe de nomina
    nomina nom=new nomina(); 

//Configuracion de los arreglos    
    horarios.dia_de_entrada=new int [31];
    horarios.dia_de_salida=new int [31];
    horarios.hora_de_entrada=new double [31];
    horarios.hora_de_salida=new double [31];
    
    
//Calendario y Reloj del menu principal
        int d=0, p=0,dd=0,ddd=0,dddd=0,ddddd=0;
        Calendar now = Calendar.getInstance();
        d = now.get(Calendar.HOUR_OF_DAY);
        dd =now.get(Calendar.MINUTE);
        ddd= now.get(Calendar.DAY_OF_MONTH);
        dddd=now.get(Calendar.MONTH);
        ddddd=now.get(Calendar.YEAR);

//empleados base segun clase personas
    Personas datos1= new Personas("Javier Torres",85684568,"Auxiliar",1000000,120,"Contabilidad");
    
//Inicio de menu     
while (!salir){ 
        pp=0;
//Codigo de empleado=120
//Contraseña de administrador=123
        
        System.out.println("");
        System.out.println("------------------------------------------------------");
        System.out.println("Sistema de seguridad empresa: Pepito Torres");
        System.out.println("Son las "+d+":"+dd+" del "+ddd+"/"+dddd+"/"+ddddd);
        System.out.println("");
        System.out.println("Digite el numero segun el tipo de usuario que sea");
        System.out.println("");
        System.out.println("*Si es empleado digite su codigo de empleado*");
        System.out.println("2.Usuario Externo");
        System.out.println("3.Entrar a revision del sistema");
        System.out.println("4.Salir");
        System.out.println("");
        p=sc.nextInt();

//Menu switch principal        
switch (p){
            
//empleado
        case 120:
            
        horarios.escogerdia();
        do {        
            ja=ja+1;
            
            System.out.println("-------------");
                    System.out.println("Bienvenido:"+datos1.nombre);
                    System.out.println("Cargo:"+datos1.puesto);
                    System.out.println("");
                   
                
            if (horarios.cod120==1){    
                            
                  while (q<2){  
//hora y fecha              
                    horarios.cadenaE();
                    q2=0;
                    w=0;
                    
                System.out.println("");
            
                    System.out.println("Su hora de entrada se registrara como :"+horarios.hora_de_entrada[horarios.diae-1]);
                    System.out.println("Es correcto,DIGITE EL NUMERO:");
                    System.out.println("1.No");
                    System.out.println("2.SI");
                    q=sc.nextInt();
                    
                    if (q==2){
           
                    System.out.println("");
                    System.out.println("Hora registrada, disfrute su trabajo");
                    w=1;
                    break;        
                    }
                    }
            }     
            if (horarios.cod120==2&&w==1){
                  
                while (q2<2){
                      q=0;
                    System.out.println("");
                    System.out.println("Bienvenido:"+datos1.nombre);
                    System.out.println("Cargo:"+datos1.puesto);
                    System.out.println("");
                    //hora
                    horarios.cadenaS();
                    System.out.println("Su hora de salida se registrara como :"+horarios.hora_de_salida[horarios.diae-1]);
                    System.out.println("Es correcto,DIGITE EL NUMERO:");
                    System.out.println("1.No");
                    System.out.println("2.SI");
                    q2=sc.nextInt();
                    
                  if (q2==2){
                  System.out.println(""); 
                  System.out.println("Hora registrada, que tenga un buen camino a casa");
                  horarios.cod120=0;
                  w=0;
                  dias=0;
                      break;
                  }  
                    
                  }
            } 
        }        while (ja==32);          
                ja=0;
                m=0;
                break;

//Usuario externo
            case 2:
             System.out.println("Son las "+d+":"+dd+" del "+ddd+"/"+dddd+"/"+ddddd);
             System.out.println("-----------------");
             datos1.ext();
            
                break;
                
            case 3:
 //administrador
                zz=0;
                j=0;
                salir2=false;
                System.out.println("Digite contraseña de administrador..... ");
                j=sc.nextInt();
   
                codr=0;
                if (j==123){
                    System.out.println("Codigo del empleado a revisar");
                 codr=sc.nextInt();
                 
                if (codr==120){ 
                   
            System.out.println("");        
            System.out.println("Empleado:"+datos1.nombre);
            System.out.println("Cargo:"+datos1.puesto); 
            
            m=horarios.tm;
            System.out.println("-----------");
            System.out.println("Total de horas acumuladas en el mes:"+horarios.tm);
            
            while (!salir2) {
                    zz=0;
                    System.out.println("");
                    System.out.println("Seleccione la opcion a realizar"); 
                    System.out.println("1.Calcular salario");
                    System.out.println("2.Revisar horas de entradas");
                    System.out.println("3.Revisar salidas");
                    System.out.println("4.Resumen de total de horas del mes");
                    System.out.println("5.Revisar entrada y salida (tarde/temprano) ");
                    System.out.println("6.Salir de administrar");
                    zz=sc.nextInt();
             switch (zz){
                 
                 case 1: 
                   nom.salario();
                break;
                
                 case 2:
                     System.out.println("Revisar horas de entrada");
                     System.out.println("....");
                     horarios.mostrarentradas();
                     
               break;
               
                 case 3:
                     System.out.println("Revisar horas de salidas");
                     System.out.println(".....");
                     horarios.mostrarsalidas();
               break;
//Control resumido
               
                 case 4:
                     horarios.totaldia();
                     break;
                     
                 case 5:
                    horarios.et();
                    horarios.st();
                     
                     break;
                 case 6:     
                     salir2=true;
                     
                     if (salir2==true){
                         break;
                     }
               break;      
default: System.out.println("NUMERO INVALIDO:Por seguridad se reiniciara el sistema");
             }       
            }       
                } 
                
        else {
        System.out.println("REVISE CODIGO");
    }
                }
                break;
            
            case 4: 
                salir=true;
                
                if (salir==true){
                         break;
                     }
                
            default: System.out.println("Error en digitacion se vuelve a iniciar sistema.");
                
                     
}   
}
       
    }
    }
