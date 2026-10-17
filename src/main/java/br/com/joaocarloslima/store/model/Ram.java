package br.com.joaocarloslima.store.model;

public class Ram extends Componente{
    protected TipoMemoria tipo;
    protected int tamanhoGb;

    public Ram(Long id, String nome, int consumo, double preco, TipoMemoria tipo, int tamanhoGb) {
        this.id = id;
        this.nome = nome;
        this.consumo = consumo;
        this.preco = preco;
        this.tipo = tipo;
        this.tamanhoGb = tamanhoGb;
    }

    public TipoMemoria getTipo() {
        return tipo;
    }

    public void setTipo(TipoMemoria tipo) {
        this.tipo = tipo;
    }

    public int getTamanhoGb() {
        return tamanhoGb;
    }

    public void setTamanhoGb(int tamanhoGb) {
        this.tamanhoGb = tamanhoGb;
    }
}
