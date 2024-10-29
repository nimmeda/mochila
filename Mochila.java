public class Mochila{
    private String utilidadMochila;
    private int objetosDentro;
    private boolean seUsaHoy;
    
    //Constructor
    public Mochila(String utiMochila, int ObjetosHayDentro){
        utilidadMochila = utiMochila;
        objetosDentro = ObjetosHayDentro;
        seUsaHoy = true;
    }
    
    //Getters
    public String getUtilidadMochila(){
        return utilidadMochila;
    }
    
    public int getObjetosDentro(){
        return objetosDentro;
    }
    
    public boolean seUsaHoy(){
        return seUsaHoy;
    }
    
    public void setUtilidadMochila(String utiMochila){
        utilidadMochila = utiMochila;
    }
    
    public void cuantosObjetos(int numObjetos){
        objetosDentro = numObjetos;
    }
    
    public void cambiarEsUsada(){
        seUsaHoy = !seUsaHoy;
    }
    
    public void imprimirEstadoMochila(){
        System.out.println("La mochila se usa para " + utilidadMochila);
        System.out.println("Contiene " + objetosDentro + " dentro");
        System.out.println("Se va a usar hoy?: " + seUsaHoy);
    }
    
    public String obtenerEstadoMochila(){
        return "uso: " + utilidadMochila + ", objetos dentro: " + objetosDentro + ", se usa hoy?: " + (seUsaHoy ? "sí" : "no");
    }
}