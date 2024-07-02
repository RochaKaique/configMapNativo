package br.com.kaiquera.Poc.ConfigMap.Native.Controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class PrintConfigController {

    private final Environment environment;

    public PrintConfigController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping
    public String getConfig() {
        var valor = environment.getProperty("config.test");
        if (valor == null || valor.isEmpty()) {
            return "config não encontrada";
        }
        return valor;
    }
}
