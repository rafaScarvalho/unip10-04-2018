package Modelo;

import java.text.DecimalFormat;

public class Imc extends absPropriedades implements intMetodos
{

    
    public Imc(Double Dpeso, Double Daltura)
    {
        super(Dpeso, Daltura);
        Executar();
    }

    @Override
    public void Executar()
    {
        Double Dimc;
        Dimc =this.Dpeso/(this.Daltura*this.Daltura);
        DecimalFormat df = new DecimalFormat("0.##");     
        this.imc=df.format(Dimc);
        
        if(Dimc<16)
        {
           this.classificacao="Magreza grave";
           this.consequencia="Insuficiência cardíaca,anemia grave,enfrequecimento do sistema imunológico";
        }
        if(Dimc>=16 && Dimc<17)
        {
            this.classificacao="Magreza moderada";
            this.consequencia="Infertilidade,queda de cabelo,falta de menstruação";
        }
        if(Dimc>=17 && Dimc<18.5)
        {
            this.classificacao="Magreza leve";
            this.consequencia="Estressem,ansiedade, fadiga";
        }
        if(Dimc>=18.5 && Dimc<25)
        {
            this.classificacao="Saudável";
            this.consequencia="Menor risco de doenças";
        }
        if(Dimc>=25 && Dimc<30)
        {
           this.classificacao="Sobrepeso";
           this.consequencia="Fadiga,varizes,má circulação";
        }
        if(Dimc>=30 && Dimc<35)
        {
            this.classificacao="Obesidade Grau I";
            this.consequencia="Diabetes,infarto,angina,aterosclerose";
        }
            
        if(Dimc>=35 && Dimc<40)
        {
           this.classificacao="Obesidade Grau II(severa)";
           this.consequencia="Apneia do sono,falta de ar";
        }
        if(Dimc>40)
        {
            this.classificacao="Obesidade Grau III(Mórbida)";
            this.consequencia="Refluxo,infarto,AVC,dificuldade de locomoção,escaras";
        }
        
        
        
    }
    
}
