# ClimaVista - App Meteorológica

ClimaVista es una aplicación web desarrollada con Spring Boot MVC y Thymeleaf para el motor de plantillas. Proporciona información meteorológica detallada para una ciudad dada, incluyendo temperatura, pronóstico del clima, velocidad del viento, humedad, cobertura de nubes, sensación térmica, hora del día y si es de día o de noche.

## Características

- **Obtención de Datos Meteorológicos:** Utiliza la API de Weatherstack para obtener datos meteorológicos precisos.
- **Traducción de Datos:** La información se traduce utilizando la API de Google Translate para mejorar la accesibilidad.
- **Diseño Responsive:** El diseño de la aplicación utiliza Bootstrap para garantizar una experiencia de usuario consistente en diferentes dispositivos.
- **Funcionalidad Interactiva:** Parte de la funcionalidad está implementada con JavaScript para una experiencia de usuario más dinámica.

## Uso

1. Ingresa el nombre de la ciudad en el campo correspondiente.
2. Haz clic en el botón "Obtener Clima".
3. Observa los detalles meteorológicos proporcionados para la ciudad seleccionada.

## Tecnologías Utilizadas

- **Spring Boot:** Marco de desarrollo para aplicaciones Java.
- **Thymeleaf:** Motor de plantillas para la generación de vistas en el lado del servidor.
- **Bootstrap:** Framework de diseño para desarrollo web.
- **JavaScript:** Utilizado para implementar funcionalidades interactivas.

## Instalación

1. Clona el repositorio: `git clone https://github.com/tu-usuario/climavista.git`
2. Abre el proyecto en tu entorno de desarrollo preferido.
3. Configura las claves de acceso a las APIs de Weatherstack y Google Translate en el archivo de configuración.

## Capturas de Pantalla

### Ingresar Ciudad
![Ingresar Ciudad](/ruta-a-tu-imagenes/ingresar_ciudad.png)

### Datos Meteorológicos
![Datos Meteorológicos](/ruta-a-tu-imagenes/datos_meteorologicos.png)


...


## Configuración

En el archivo `application.yaml`:

```yaml
# Configuración de Weatherstack API
weatherstack:
  api:
    key: tu_clave_de_api_weatherstack

