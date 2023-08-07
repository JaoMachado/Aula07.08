package entidades;
public class App {
    public static void main(String[] args){
        Carro fusca = new Carro();
        Carro uno = new Carro();

        fusca.cor = "Preto";
        fusca.modelo = "Fuscão";
        fusca.torque = 100;
        fusca.velocidade = 20;

        uno.cor = "Prata";
        uno.modelo = " Uno Mille/Escadado e Adesivado";
        uno.torque = 5600;
        uno.velocidade = 800;
        

        for(int i = 0; i < 10; i++){
            fusca.acelerar();
            System.out.println(fusca.converteParaTexto());
        }

        for(int i = 0; i < 10; i++){
            uno.acelerar();
            System.out.println(uno.converteParaTexto());
        }
        
    }
}
