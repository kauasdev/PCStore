package br.com.joaocarloslima.store.model;

public class Fonte extends Componente {
    protected int potencia;

    public Fonte(Long id, String nome, int consumo, double preco, int potencia) {
        this.id = id;
        this.nome = nome;
        this.consumo = consumo;
        this.preco = preco;
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

}
