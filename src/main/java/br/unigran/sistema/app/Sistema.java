package br.unigran.sistema.app;

import br.unigran.sistema.model.Pessoa.Pessoa;
import br.unigran.sistema.persistencia.Dados;

public class Sistema {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Andre");
        Dados dados = new Dados();
        dados.salvar(p);
        
    }
}
