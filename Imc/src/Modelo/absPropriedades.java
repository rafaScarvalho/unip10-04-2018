package Modelo;

public abstract class absPropriedades 
{
   public String peso;
   public String altura;
   public String mensagem;
   public String imc;
   public String classificacao;
   public String consequencia;
   public Double Dpeso;
   public Double Daltura;

    public absPropriedades(String peso, String altura)
    {
        this.peso = peso;
        this.altura = altura;
    }

    public absPropriedades(Double Dpeso, Double Daltura)
    {
        this.Dpeso = Dpeso;
        this.Daltura = Daltura;
    }
    
    
            
}
