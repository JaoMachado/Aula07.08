package entidades;
public class Carro {
    // atributos, caracteristicas ou propriedades
    String cor;
    String modelo;
    double torque;
    int velocidade;

    // comportamentos
    void acelerar(){
        velocidade += 10;
    }

    String converteParaTexto(){
        return "O " + modelo + " " + cor + " está a " + velocidade + "km/h";
    }
}
