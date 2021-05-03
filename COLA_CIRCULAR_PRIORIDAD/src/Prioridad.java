public class Prioridad {
    protected char dato;
    protected int nivel;

    public Prioridad(char dato, int nivel) {
        this.dato = dato;
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return  "Valor:" + dato + ", Nivel: " + nivel + '}';
    }
    
    
}
