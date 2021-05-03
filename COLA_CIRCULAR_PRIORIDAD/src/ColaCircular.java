public class ColaCircular extends ColaSimple {

    public ColaCircular(int tamano) {
        super(tamano);
    }
    public boolean insertar(char dato, int nivel){
        if(modoCircular()){
        if (EstaLlena())return false;
            fin++;
            vector[fin]=new Prioridad(dato,nivel);
            return true;
        }
        if(EstaLlena())return false;
        if(porFin()){
         fin=0;
         vector[fin]=new Prioridad(dato,nivel);
        }
        else{
            return super.insertar(dato,nivel);
        }
            return true;
    }
    
    public boolean Elminar(){
        if(EspacioDisp()){
            ini=0;
            return true;
        }  
        return super.eliminar();
    }
    
    public void ordenarPorPrioridad(){
        for(int i=ini; i<fin; i++){
            for(int j=ini; j<fin; j++){
                if(vector[j].nivel < vector[i+1].nivel){
                    Prioridad vectorP = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = vectorP;
                }
            }
        }
    }
    
    public boolean EstaLlena(){
        return (ini == 0 && fin == vector.length-1) || (fin+1) == ini;
    }
    
    public boolean porFin(){
        return fin==vector.length-1 && ini!=0;
    }
    
    public boolean modoCircular(){
        return fin<ini;
    }
    
    public boolean EspacioDisp(){
        return fin!=vector.length-1 && ini==vector.length-1;
    }

}
