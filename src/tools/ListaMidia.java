/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author Rodrigo
 */
public class ListaMidia {

    public void listaMidia() throws IOException {

        IdentificaMidia identifica = new IdentificaMidia();

        File file = new File("A:\\Downloads");
        File afile[] = file.listFiles();
        Stream<File> lista = Stream.of(afile);
        
        lista.filter((File midia) -> {
            try {
                return identifica.isVideo(midia.getPath());
            } catch (IOException ex) {
                Logger.getLogger(ListaMidia.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        }
        ).forEach(midia -> System.out.println(midia.getName()));
    }

}
