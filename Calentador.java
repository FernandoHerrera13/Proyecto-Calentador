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
        temperatura=temperatura+5;
        System.out.println("La temperatura aumentó 5 grados");
        System.out.println("La temperatura actual es de: "+temperatura + " grados");
    }
    
    public void enfriar()
    {
        temperatura=temperatura-5;
        System.out.println("La temperatura disminuyó 5 grados");
        System.out.println("La temperatura actual es de: "+temperatura + " grados");
    }
}