/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep2;

import edu.unb.fga.dadosabertos.Camara;
import edu.unb.fga.dadosabertos.Deputado;
import edu.unb.fga.dadosabertos.Detalhes;
import edu.unb.fga.dadosabertos.Partido;
import java.io.IOException;
import java.util.List;
import javax.xml.bind.JAXBException;


/**
 *
 * @author lucas
 */
public class EP2 {

    /**
     * @param args the command line arguments
     * @throws javax.xml.bind.JAXBException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws JAXBException, IOException {
       Camara camara = new Camara();
       camara.obterDados();
       List<Deputado> deputados = camara.getDeputados();
       Deputado deputado = deputados.get(0);
       deputado.obterDetalhes();
       Detalhes detalhes = deputado.getDetalhes();
       Partido partido = detalhes.getPartido();
       
       System.out.println(partido.getNome() + " " + partido.getSigla());
    }
    
}
