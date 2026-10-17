package br.com.joaocarloslima.store.model;

public class Computador {
    protected PlacaMae placaMae;
    protected Cpu cpu;
    protected Ram ram;
    protected Fonte fonte;

    public String status(){
        if(placaMae == null || cpu == null || ram == null || fonte == null){
            return "Computador incompleto!";
        }

        if(!placaMae.compativel(cpu)){
            return "Incompatibilidade entre CPU e Placa Mãe!";
        }

        if(!placaMae.compativel(ram)){
            return "Incompatibilidade entre RAM e Placa Mãe";
        }

        if((cpu.getConsumo() + ram.getConsumo() + placaMae.getConsumo() + fonte.getConsumo()) > fonte.getPotencia()){
            return "Fonte insuficiente para o sistema";
        }


        return"Computador completo e Funcionando!";
    }

    public double precoTotal(){
        double total = 0;

        if(placaMae!= null){
            total += placaMae.getPreco();
        }

        if(cpu!= null){
            total += cpu.getPreco();
        }

        if(ram!= null){
            total += ram.getPreco();
        }

        if(fonte!= null){
            total += fonte.getPreco();
        }

        return total;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Fonte getFonte() {
        return fonte;
    }

    public void setFonte(Fonte fonte) {
        this.fonte = fonte;
    }
}
