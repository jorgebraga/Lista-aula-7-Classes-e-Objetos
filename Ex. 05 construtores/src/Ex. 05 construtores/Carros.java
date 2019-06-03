/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricipal;

/**
 *
 * @author djens
 */
public class Carros {

    int precototal;

    Pneus NissanP = new Pneus(2400, "Esportivo", "Yokohama");
    Pneus HondaP = new Pneus(2000, "Esportivo", "Firestone");
    Pneus SubaruP = new Pneus(2400, "Esportivo", "Toyotires");

    Motor NissanM = new Motor(40000, 608, "Nissam Turbo 3.8 Otto V");
    Motor HondaM = new Motor(30000, 270, "Honda Turbo 2.5 Otto V");
    Motor SubaruM = new Motor(46000, 155, "Subaro Turbo 3.4 Box");

    Bancos NissanB = new Bancos(1500, "Esportivo 4 pontos", "Sparco");
    Bancos HondaB = new Bancos(1500, "Esportivo 4 pontos", "Sparco");
    Bancos SubaruB = new Bancos(1500, "Esportivo 4 pontos", "Sparco");

    /**
     *
     * @return
     */
    public int precototal() {
        if () {
            precototal = NissanP.preco + NissanM.preco + NissanB.preco;
            return precototal;
        }
        if () {
            precototal = HondaP.preco + HondaM.preco + HondaB.preco;
            return precototal;
        }

        if () {
            precototal = SubaruP.preco + SubaruM.preco + SubaruB.preco;
            return precototal;
        }
        return 0;

    }
}
