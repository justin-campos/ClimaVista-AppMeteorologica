package com.metereologica.appmetereologica.controllers;

import com.metereologica.appmetereologica.models.WeatherstackResponse;
import com.metereologica.appmetereologica.services.WeatherstackService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClimaController {

    private final WeatherstackService weatherstackService;

    public ClimaController(WeatherstackService weatherstackService) {
        this.weatherstackService = weatherstackService;
    }

    @GetMapping("/")
    public String climaVista(Model model) {
        // Puedes agregar lógica aquí para mostrar información predeterminada en la vista
        model.addAttribute("weatherData", new WeatherstackResponse());
        return "index";
    }

    @PostMapping("/ciudad")
    public String procesarFormulario(@RequestParam String ciudad, Model model) {
        // Aquí puedes procesar los datos del formulario si es necesario

        // Llama a un método en weatherstackService para obtener datos reales
        WeatherstackResponse weatherResponse = weatherstackService.getWeather(ciudad);

        // Verifica si se obtuvieron datos reales antes de agregar al modelo
        if (weatherResponse != null) {
            // Pasa los datos a la vista usando el objeto Model
            model.addAttribute("weatherData", weatherResponse);
            model.addAttribute("current", weatherResponse.getCurrent());
            model.addAttribute("request", weatherResponse.getRequest());
            model.addAttribute("location", weatherResponse.getLocation());
        }

        // Devuelve el nombre de la vista
        return "clima";
    }
}


