package org.example;

public class RefeicaoBuilder {
    private Refeicao refeicao;
    public RefeicaoBuilder(){
        refeicao = new Refeicao();
    }

    public Refeicao build() {
        if (refeicao.getPratoPrincipal().equals("")) {
            throw new IllegalArgumentException("Refeição sem prato principal");
        }
        if (refeicao.getValor() == 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        return refeicao;
    }

    public RefeicaoBuilder setPratoPricipal(String pratoPricipal){
        refeicao.setPratoPrincipal(pratoPricipal);
        return this;
    }
    public RefeicaoBuilder setAcompanhamento(String acompanhamento){
        refeicao.setAcompanhamento(acompanhamento);
        return this;
    }
    public RefeicaoBuilder setBebida(String bebida){
        refeicao.setBebida(bebida);
        return this;
    }
    public RefeicaoBuilder setSobremesa(String sobremesa){
        refeicao.setSobremesa(sobremesa);
        return this;
    }
    public RefeicaoBuilder setValor(Double valor){
        refeicao.setValor(valor);
        return this;
    }

}
