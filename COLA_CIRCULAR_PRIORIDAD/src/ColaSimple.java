public class ColaSimple {
    protected Prioridad[] vector;
    protected int ini, fin;
    
    /**
    Constructor  
     */
    public ColaSimple(int tamano){
        vector = new Prioridad[tamano];
        ini = -1;
        fin = -1;
    }
    
    public boolean insertar(char dato,int nivel){
        if(estaColaLlena()){
            return false;
        }
        fin++;
        vector[fin] = new Prioridad(dato, nivel);
        if(ini == -1){
            ini=0;
        }
        return true;
    }
    
    public boolean eliminar(){
        if(colaVacia()) return false;
        //Cuando hay un sólo elemento INI y FIN estan JUNTOS
        if(hayUnSoloDato()){
            ini =-1;
            fin =-1;
            return true;
        }
        ini++;
        return true; 
    }
    
    protected boolean estaColaLlena(){
        return fin == vector.length-1;
    }
    
    protected boolean colaVacia(){
        return (ini== -1 && fin == -1);
    }
    protected boolean hayUnSoloDato(){
        return ini == fin;
    }
    
    public int getIni(){
        return ini;
    }
    
    public int getFin(){
        return fin;
    }
      
    public Prioridad getVector(int posicion){
        return vector[posicion];
    }  
    
     
    
}
