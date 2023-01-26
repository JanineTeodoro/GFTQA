/**
 * Classe de exemplo para o exercício da aula 3 de Orientação a Objetos.
 */

public class Carro {

    //atributos
    String cor;
    String modelo;
    int capacidadeTanque;

    //construtor (sempre embaixo dos atributos)
    //vazio
    Carro() {

    }

    //com parâmetros
    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //métodos

    //set serve para colocar um valor em um atributo, método void
    void setCor(String cor) {
        this.cor = cor;
    }

    //get serve para me devolver alguma coisa; "me retorne a cor do carro";
    //o método precisa seguir o mesmo tipo de dado (String, int, char).
    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    //método que enche o tanque do carro
    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}
