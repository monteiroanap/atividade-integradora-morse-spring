package br.com.morse.morse.controlller;

import br.com.morse.morse.dtos.Mensagem;
import br.com.morse.morse.util.Codigo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.stream.Collectors;

@RestController
public class DecodeController {
    @PostMapping ("/decifrar")
    public String decifrarMensagem(@RequestBody Mensagem mensagem){
        return Arrays.stream(
                mensagem.textoCifrado
                        .split(" "))
                .map(codigo -> Codigo.decifraCodigo(codigo)).collect(Collectors.toList()).toString();
    }
}
