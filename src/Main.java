import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int op = 1;
        String marca = JOptionPane.showInputDialog(null,"Digite o nome da marca");
        String modelo = JOptionPane.showInputDialog(null,"Digite o nome do modelo");
        Carro carro = new Carro((byte) 1, marca,modelo,1.8);
        while(op != 0){
            op = Integer.parseInt(JOptionPane.showInputDialog
                    (null,"1 - Ligar Carroz\n" +
                    "2 - Desligar carro\n" +
                    "3 - Mostrar informações sobre o veiculo\n" +
                    "4 - Adicionar marcha\n" +
                    "5 - Reduzir marcha\n" +
                    "0 - Sair"));
            Scanner sc = new Scanner(System.in);


            switch (op){
                case 1:
                    carro.ligarCarro();
                    break;
                case 2:
                    carro.desligarCarro();
                    break;
                case 3:
                    String ligado;
                    if(carro.isLigado() == true){ ligado = "  ligado";}else{ ligado = " desligado";}
                    JOptionPane.showMessageDialog(
                            null,"O carro está: " +  ligado +
                            "\n Número da marcha: " + carro.getMarcha() +
                            "\n Motorização: " + carro.getMotorizacao() +
                            "\n Marca: " +  marca +
                            "\n Modelo: " + modelo +
                            "\n Velocidade " + carro.velocidade());

                    break;


                case 4:
                    carro.adicinarMarchar();
                    break;
                case 5:
                    carro.reduzirMarcha();
                    break;
                case 0:
            }
        }






    }
}