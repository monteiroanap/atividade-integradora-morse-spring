package br.com.morse.morse.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Mensagem implements Serializable {

    @JsonProperty("texto_cifrado")
    public String textoCifrado;
}
