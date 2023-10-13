package br.com.douglas.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class minhaPrimeiraController {
    /**
     * GET - Buscar uma informação
     * POST - Adicionar um dado/informação
     * PUT - Alterar um dado/info
     * DELETE - Remover um dado
     * PATCH - Alterar somente uma parte da informação
     */
    @GetMapping("/mensagem")
    public String minhaMensagem(){
        return "Hello, World!";
    }
}
