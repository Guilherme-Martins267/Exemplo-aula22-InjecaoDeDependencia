package Martins.Guilherme.ExemploInjecaoDependencia;

import Martins.Guilherme.ExemploInjecaoDependencia.Intarfaces.IAssassins;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Continental {

    @Autowired
    @Qualifier("John Wick")
    private IAssassins iAssassins;

    public void execute() {
        iAssassins.assassinar();
    }
}