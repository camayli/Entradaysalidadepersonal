
package javaapplication1;
import java.util.*;


public class registro extends Proyecto {
    double [] hora_de_entrada;
    double [] hora_de_salida;
    int [] dia_de_entrada;
    int [] dia_de_salida;
    double cantidad_horas_trabajadas;
    double fecha;
    double horas_extras;
    int    diae=0,cod120=0;
    double h,h2,tm,mt=31;
    int y=2; int x=31;
    double totald[][]=new double[y][x]; 
    
//metodos   
  public void escogerdia(){      
Scanner sc=new Scanner (System.in); 
      System.out.println("Digite el dia");
      diae=sc.nextInt(); 
    for (int i=diae;diae==i;i++){
        cod120++;
    }
    } 

//Entrada Array     
  public void cadenaE(){    
  Scanner sc=new Scanner (System.in);    
  for (int i=diae-1;i<diae;i++){
  dia_de_entrada [i]=diae;
  System.out.println("Ingrese hora de entrada (Separe minutos con coma)"); 
  hora_de_entrada[i]=sc.nextDouble();
                   
  }    
  }    

//Salida Array  
  public void cadenaS(){
      
  Scanner sc=new Scanner (System.in);      
  
  for (int i=diae-1;i<diae;i++){
  dia_de_salida[i]=diae;
  System.out.println("Ingrese hora de salida (Separe minutos con coma)");
  System.out.println("Formato 24 horas (EJ: 15,30)");
  hora_de_salida[i]=sc.nextDouble();
                   
  }
 
}

//Imprimir Entrada
public void mostrarentradas(){
int a=0;
for (int i=0;i<hora_de_entrada.length;i++){
a++;
System.out.println("Dia "+a+": "+hora_de_entrada[i]); 
      
        }   
}

//Imprimir Salida
public void mostrarsalidas(){
int a=0;
for (int i=0;i<hora_de_salida.length;i++){
a++;
System.out.println("Dia "+a+": "+hora_de_salida[i]); 
}   
}

//horas trabajadas en total durante cada dia
public void totaldia(){
double a=0;
    
 for (int i=0;i<totald.length;i++){
   for (int j=0;j<totald[1].length;j++){
            if (i==0){
            a=a+1;
            totald[i][j]=a;
    }
    if(i==1){
    totald[i][j]=hora_de_salida[j]-hora_de_entrada[j];
    }
            }
        }
        System.out.println("");
        
        for (int i=0;i<y;i++){
            for (int j=0;j<x;j++){
                System.out.print(totald[i][j]+" | ");
            } 
            System.out.println();
    }
}
//Ordenamiento de Entrada mas tarde
public void et(){
int salto, i;
    double aux;
   boolean cambios;
   for(salto=hora_de_entrada.length/2; salto!=0; salto/=2){
    cambios=true;
        while(cambios){ 
        cambios=false;
        for(i=salto; i< hora_de_entrada.length; i++)
            if(hora_de_entrada[i-salto]>hora_de_entrada[i]){ 
            aux=hora_de_entrada[i]; 
            hora_de_entrada[i]=hora_de_entrada[i-salto];
            hora_de_entrada[i-salto]=aux;
            cambios=true;
                               }
}
   }
    System.out.println("La hora que entro mas tarde fue:"+hora_de_entrada[30]);
}
//Ordenamiento de Salida mas temprano
public void st(){
double aux;
for (int i=0;i<hora_de_salida.length-1;i++){
    for (int j=0;j<hora_de_salida.length;j++){
        if (hora_de_salida[i]>hora_de_salida[j]){
            aux=hora_de_salida[i];
            hora_de_salida[i]=hora_de_salida[j];
            hora_de_salida[j]=aux;   
        }
            }
            }
    System.out.println("El dia que salio mas temprano fue:"+hora_de_salida[0]);    
}
}


