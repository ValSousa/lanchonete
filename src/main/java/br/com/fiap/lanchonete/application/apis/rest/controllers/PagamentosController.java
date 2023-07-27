package br.com.fiap.lanchonete.application.apis.rest.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagamentosController {

    // endpoint consultar
    public String ver(String codigoPedido) {}

    // endpoint confirmar (receber do mock)
    @PostMapping("/api/pagamento/processar")
    public String processar() {
        // notificar usuário
    }
}
