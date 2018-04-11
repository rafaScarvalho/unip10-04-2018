package Modelo;

import javax.swing.JOptionPane;

public class Controle extends absPropriedades implements intMetodos
{

    public Controle(String peso, String altura)
    {
        super(peso, altura);
        Executar();
    }
    

    @Override
    public void Executar()
    {
        this.mensagem="";
        Validacao validacao = new  Validacao(this.peso,this.altura);
        
       if(validacao.mensagem.equals(""))
       {
            Imc IMC = new Imc(validacao.Dpeso, validacao.Daltura);           
            this.imc=IMC.imc;
            this.classificacao=IMC.classificacao;
            this.consequencia=IMC.consequencia;
       }
       else
       {
           JOptionPane.showMessageDialog(null, validacao.mensagem);
       }
    }
    
}
