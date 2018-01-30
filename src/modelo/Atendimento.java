package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Atendimento {
    
    private LocalDate data;
    private LocalTime hora;
    private String descricao;
    private Cliente cliente;
    private Assalariado tecnico;

    public Atendimento(LocalDate data, LocalTime hora, String descricao, Cliente cliente) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
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

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Assalariado getTecnico() {
        return tecnico;
    }
    public void setTecnico(Assalariado tecnico) {
        this.tecnico = tecnico;
    }

}