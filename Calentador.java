public class Calentador
{
    private int temperatura;
    private int incremento;
    
    public Calentador()
    {
        temperatura=15;
        incremento=3;
    }
    
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