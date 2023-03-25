import javax.swing.*;

public class Carro {
    Main main = new Main();
    private boolean ligado = false;
    private byte marcha = 1;
    private String marca;
    private String modelo;
    private double motorizacao;

    public Carro(byte marcha, String marca, String modelo, double motorizacao) {

        this.marcha = marcha;
        this.marca = marca;
        this.modelo = modelo;
        this.motorizacao = motorizacao;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public byte getMarcha() {
        return marcha;
    }

    public void setMarcha(byte marcha) {
        this.marcha = marcha;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(double motorizacao) {
        this.motorizacao = motorizacao;
    }

    public void ligarCarro(){
        setLigado(true);

        JOptionPane.showMessageDialog(null,"Carro ligado com sucesso!!");

    }
    public void desligarCarro(){
        setLigado(false);
        marcha = 1;
        setMarcha(marcha);
        JOptionPane.showMessageDialog(null,"Carro desligado com sucesso!!");

    }
    public void adicinarMarchar(){
        if(getMarcha() <6 && getMarcha() >-1) {
            marcha++;
            setMarcha(marcha);
            JOptionPane.showMessageDialog(null, "A marcha está em: " + getMarcha());
        }
        else{
            JOptionPane.showMessageDialog(null,"A marcha está em " + getMarcha() + " por favor diminua");
        }
    }
    public void reduzirMarcha(){
        if(marcha <=6 && marcha >0) {
            marcha--;
            setMarcha(marcha);
            JOptionPane.showMessageDialog(null, "A marcha está em: " + getMarcha());
        }
        else{
            JOptionPane.showMessageDialog(null,"A marcha está em " + getMarcha() + " por favor aumente");
        }
    }

    public double velocidade(){
        if(isLigado() == true){
            double v = (10 + (getMarcha() * getMotorizacao())*Math.random());
            return  v;
        }
        else {
            return 0;
        }

    }
}
