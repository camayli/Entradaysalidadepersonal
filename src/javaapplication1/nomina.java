
package javaapplication1;

public class nomina extends registro {
double salarb;
double subtrans=70000;
double totalsal1;
double salar=3344;
double sh [];
double tm;

public void salario(){
sh=new double [31];
int qw=0;
    for (int j=0;j<totald[0].length;j++){    
    sh[j]=totald[1][j]; 
    qw=qw+1;
    
    }

 for (int i=0;i<sh.length;i++){
    tm=tm+sh[i];
    salarb=mt*salar;
    totalsal1=subtrans+salarb;    
 }

System.out.println("Salario Base (Sin subsidio de transporte )= "+salarb);
System.out.println("Salario Total = "+totalsal1);


}
}

