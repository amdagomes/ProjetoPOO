package pagamento;

import java.time.LocalDate;
import servico.Servico;

/**
 *
 * @author Amanda
 */
public class RealizaPagamento {
    private LocalDate data;
    private Servico[] servico;

    public RealizaPagamento(LocalDate data) {
        this.data = data;
        servico = new Servico[10];
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Servico[] getServico() {
        return servico;
    }

    public void setServico(Servico[] servico) {
        this.servico = servico;
    }
    
    
    
    
}
