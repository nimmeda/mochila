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
    public String GetUtilidadMochila(){
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
}