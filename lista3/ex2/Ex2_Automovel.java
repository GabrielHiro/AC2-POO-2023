
package lista3.ex2;

public class Ex2_Automovel {
    String marca, modelo;

    public Ex2_Automovel() {

    }

    public Ex2_Automovel(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
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
    public String imprimir() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
          
}
