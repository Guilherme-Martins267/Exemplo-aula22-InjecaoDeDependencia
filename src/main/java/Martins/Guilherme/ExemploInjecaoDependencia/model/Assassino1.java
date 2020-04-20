package Martins.Guilherme.ExemploInjecaoDependencia.model;

import Martins.Guilherme.ExemploInjecaoDependencia.Intarfaces.IAssassins;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

    @Component
    @Qualifier("John Wick")
    public class Assassino1 implements IAssassins {

        @Override
        public void assassinar() {
            System.out.println("Modo furtivo");
        }
    }
