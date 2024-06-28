
package javaapplication1;

public class Carnet extends Personas{
       int ID;
       int codigodebarras;
       
    public Carnet(String nombre, String Cargo, int ID) {
        this.ID = ID;
    }

    public Carnet(int codigodebarras) {
        this.codigodebarras = codigodebarras;
    }

    public int getID() {
        return ID;
    }

    public int getCodigodebarras() {
        return codigodebarras;
    }
    

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCodigodebarras(int codigodebarras) {
        this.codigodebarras = codigodebarras;
    }
    
    
}
