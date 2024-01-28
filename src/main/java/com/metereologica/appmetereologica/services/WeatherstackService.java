package com.metereologica.appmetereologica.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.metereologica.appmetereologica.models.WeatherstackResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherstackService {

    private final RestTemplate restTemplate;

    @Autowired
    public WeatherstackService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Value("${weatherstack.api.key}")
    private String apiKey;  // Configura clave API en el archivo application.yaml

    private final String apiUrl = "http://api.weatherstack.com/forecast";

    public WeatherstackResponse getWeather(String ciudad) {
        String url = apiUrl + "?access_key=" + apiKey + "&query=" + ciudad;
        String jsonResponse = restTemplate.getForObject(url, String.class);

        // Imprime la respuesta JSON para revisarla
        System.out.println("Respuesta JSON: " + jsonResponse);


        // Configurar ObjectMapper para no fallar en propiedades desconocidas
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);



        // Intenta convertir la respuesta JSON en un objeto WeatherstackResponse utilizando un ObjectMapper
        try {
            return objectMapper.readValue(jsonResponse, WeatherstackResponse.class);
        } catch (JsonProcessingException e) {
            // Manejar la excepción en caso de que la conversión falle
            e.printStackTrace();
            return null; // O lanzar una excepción personalizada, según tus necesidades
        }
    }
}
