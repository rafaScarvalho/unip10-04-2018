package Modelo;

public class Validacao extends absPropriedades implements intMetodos
{

    public Validacao(String peso, String altura)
    {
        super(peso, altura);
        this.Executar();
    }

    @Override
    public void Executar()
    {
        this.mensagem="";  
        try
        {
            this.Dpeso=Double.parseDouble(this.peso);
            this.Daltura=Double.parseDouble(this.altura);
        }
        catch (Exception e)
        {
            this.mensagem = "Os valores digitados não são numéricos";
        }
        
    }
    
}
