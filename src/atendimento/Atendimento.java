package atendimento;

import cliente.Cliente;

import java.time.LocalDate;
import java.time.LocalTime;

public class Atendimento {
    
    private LocalDate data;
    private LocalTime hora;
    private String descricao;
    private Cliente cliente[];

    public Atendimento(LocalDate data, LocalTime hora, String descricao) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        cliente = new Cliente[10];
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }
    

}