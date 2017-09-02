/**Clase que nos permite simular un calentador: Aumentar o Disminuir la temperatura del mismo*/
public class Calentador
{
    private int temperatura;
    private int incremento;
    
    public Calentador()
    {
        temperatura=15;
        incremento=3;
    }
    
    /**Valida que sea menor a 30 y si lo es la va a incrementar de 3 en 3 hasta llegar a los 30 grados que es la temperatura maxima*/
    public void calentar()
    {
        if(temperatura<=30)
        {
           temperatura=temperatura+incremento;
           System.out.println("La temperatura aumentó 3 grados");
           System.out.println("La temperatura actual es de: "+temperatura + " grados");
           
            if(temperatura>=30)
            {
                System.out.println("Se ha llegado a la máxima temperatura permitida");
            } 
        }   
    }
    /**Valida que sea mayor a -10 y si lo es la va a disminuir de 3 en 3 hasta llegar a los - 10 grados que es la temperatura minima*/
    public void enfriar()
    {
        if(temperatura>=-10)
        {
           temperatura=temperatura-incremento;
           System.out.println("La temperatura disminuyó 3 grados");
           System.out.println("La temperatura actual es de: "+temperatura + " grados");
           
            if(temperatura<-9)
            {
                System.out.println("Se ha llegado a la mínima temperatura permitida");
            } 
        }   
    }
}