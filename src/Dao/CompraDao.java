package Dao;

import java.util.ArrayList;
import java.util.List;
import modelo.Compra;

public class CompraDao implements Dao<Compra> {

    private List<Compra> compras;

    public CompraDao() {
        compras = new ArrayList<>();
    }

    @Override
    public boolean salvar(Compra obj) {
        return compras.add(obj);
    }

    @Override
    public boolean remover(Compra obj) {
        return compras.remove(obj);
    }

    @Override
    public Compra buscar(int codigo) {
        for (Compra e : compras) {
            if (e.getCodigo() == codigo) {
                return e;
            }

        }
        return null;

    }
}
