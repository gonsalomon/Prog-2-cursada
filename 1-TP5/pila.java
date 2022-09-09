import java.util.ArrayList;

class Pila{
    //atributos
    private ArrayList<Object> pila = new ArrayList<Object>();
    //constructor
    public Pila(){
        this.pila = new ArrayList<Object>();
    }
    public Pila(ArrayList<Object> pila){
        this.pila = pila;
    }
    //métodos
    public void push(Object o){
        this.pila.add(o);
    }
    public Object pop(){
        Object last = this.pila.get(pila.size()-1);
        pila.remove(pila.size()-1);
        return last;
    }
    public Object top(){
        return pila.get(pila.size()-1);
    }
    public int size(){
        return pila.size();
    }
    public ArrayList<Object> copiar(){
        ArrayList<Object> copia = new ArrayList<Object>(pila);
        return copia;
    }
    public ArrayList<Object> reverse(){
        ArrayList<Object> aux = new ArrayList<Object>();
        for(int i = 0; i < pila.size(); i++){
            aux.add(pila.get(pila.size()-(i+1)));
            /*pila.size() devuelve sin indexar en 0, por eso le resto 1. i arranca en 0, así que en la primera iteración, i=0 y get(pila.size-(0+1)) devuelve en efecto el tope.
            la segunda iteración i=1 get(pila.size-(1+1) ahora devuelvo el anteúltimo)
            la última iteración i=pila.size-1 get(pila.size-(pila.size-1+1)) se cancelan -1+1 y hago pila.size-pila.size=0: el primer elemento de la pila*/
        }
        return aux;
    }
}