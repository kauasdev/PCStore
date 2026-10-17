package br.com.joaocarloslima.store.model;

public class PlacaMae extends Componente{
    protected Socket socket;
    protected TipoMemoria tipoMemoria;

    public PlacaMae(Long id, String nome, int consumo, double preco, Socket socket, TipoMemoria tipoMemoria) {
        this.socket = socket;
        this.tipoMemoria = tipoMemoria;
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.consumo = consumo;
    }

    public boolean compativel(Cpu cpu){
        return this.socket == cpu.socket;
    }

    public boolean compativel(Ram ram){
        return this.tipoMemoria == ram.tipo;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public TipoMemoria getTipoMemoria() {
        return tipoMemoria;
    }

    public void setTipoMemoria(TipoMemoria tipoMemoria) {
        this.tipoMemoria = tipoMemoria;
    }
}
