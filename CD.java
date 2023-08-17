
public class CD extends Elemento
{
    // instance variables - replace the example below with your own
    private String autor;
    private int numeroDePistas;


    public CD(String elTitulo, String elAutor, int pistas, int tiempo)
    {
        // initialise instance variables
        super(elTitulo, tiempo);
        autor = elAutor;
        numeroDePistas = pistas;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getNumeroDePistas(){
        return numeroDePistas;
    }
    
    public void print(){
        System.out.println("CD");
        System.out.println("Titulo: "+ super.getTitulo());
        System.out.println("Autor: "+ autor);
        System.out.println("Num pistas: "+ numeroDePistas);
    }
}
