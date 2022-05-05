package br.com.dio.exceptions;

public class DivisaoPorZeroException extends Exception{

    private int numerado;
    private int denominador;

    public DivisaoPorZeroException(String message, int numerado, int denominador) {
        super(message);
        this.numerado = numerado;
        this.denominador = denominador;
    }
}
