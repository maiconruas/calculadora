package br.com.treinaweb.calculador.classes;

import br.com.treinaweb.calculadora.interfaces.CalculadorMatematico;

public abstract class CalculoMatematico implements CalculadorMatematico {
    protected int numero1;
    protected int numero2;

    public CalculoMatematico(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public boolean validar() {
        return numero1 >= 0 && numero2 >= 0;
    }

    @Override
    /* template methodNão pode ser sobrescrito // */
    public int calcular() {
        if (validar()) {
            return doCalcular();
        } else {
            return -1;
        }
    }
    protected  abstract int doCalcular();;

}

