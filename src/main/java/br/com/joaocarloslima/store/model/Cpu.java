package br.com.joaocarloslima.store.model;

public class Cpu extends Componente{
    protected Socket socket;


    public Cpu(Long id, String nome, int consumo, double preco, Socket socket) {
        this.socket = socket;
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.consumo = consumo;
    }

    public Socket getSocket() {
        return socket;
    }
}
