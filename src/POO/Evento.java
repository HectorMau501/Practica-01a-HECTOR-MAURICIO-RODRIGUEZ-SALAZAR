
package POO;


public class Evento {
    
    //Atributos -
    private String fecha;
    private String hora;
    private String lugar;
    private int capacidad;
    private double costoBoleto;
    
    //Metodos Setters y Getters 

    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }
    public String getFecha()
    {
        return  fecha;
    }
    
    public void setHora(String hora)
    {
        this.hora = hora;
    }
    public String getHora()
    {
        return hora;
    }
    
    public void setlugar(String lugar)
    {
        this.lugar = lugar;
    }
    public String getLugar()
    {
        return lugar;
    }
    
    public void setCapacidad(int capacidad)
    {
        this.capacidad = capacidad;
    }
    public int getCapacidad()
    {
        return capacidad;
    }
    
    public void setCostoBoleto(double costoBoleto) 
    {
        this.costoBoleto = costoBoleto;
    }
    public double getCostoBoleto() 
    {
        return costoBoleto;
    }
    
    //Metodo Constructor vacio
    
    public Evento() {}
    
    //NOTA: Solo me permite definir un constructor
    /*
    public Evento()
    {
    fecha = "20 de Agosto del 2022";
    hora = "10:30";
    lugar = "Cocierto";
    capacidad = 5000;
    costoBoleto = 299.99;
    }
    */

    
}
