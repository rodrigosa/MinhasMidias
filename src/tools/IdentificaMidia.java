/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

/**
 *
 * @author Rodrigo
 */
public class IdentificaMidia {

    public Boolean isVideo(String caminho) throws IOException {

        Path uri = Paths.get(caminho);

        if (Objects.nonNull(Files.probeContentType(uri))) {
            return Files.probeContentType(uri).contains("video");
        } else {
            return false;

        }

    }

}
