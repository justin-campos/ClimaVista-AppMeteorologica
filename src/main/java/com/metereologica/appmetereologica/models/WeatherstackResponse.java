package com.metereologica.appmetereologica.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.stream.Location;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherstackResponse {
    private ForecastData forecastData;

    public ForecastData getForecastData() {
        return forecastData;
    }

    public void setForecastData(ForecastData forecastData) {
        this.forecastData = forecastData;
    }

    private String city;
    private double temperature;
    private String description;
    private Request request;
    private Location location;
    private CurrentWeather current;

    // Constructor vacío necesario para Thymeleaf
    public WeatherstackResponse() {
    }

    // Getters y setters

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public CurrentWeather getCurrent() {
        return current;
    }

    public void setCurrent(CurrentWeather current) {
        this.current = current;
    }

    // Clase interna Request
    public static class Request {
        private String type;
        private String query;
        private String language;
        private String unit;

        // Constructor vacío necesario para la deserialización
        public Request() {
        }

        // Getters y setters

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        @Override
        public String toString() {
            return "Request{" +
                    "type='" + type + '\'' +
                    ", query='" + query + '\'' +
                    ", language='" + language + '\'' +
                    ", unit='" + unit + '\'' +
                    '}';
        }


    }

    // Clase interna Location
    public static class Location {
        private String name;
        private String country;
        private String region;
        private String lat;  // Agregado
        private String lon;  // Agregado
        private String timezone_id;
        private String localtime;
        private long localtime_epoch;
        private String utc_offset;

        // Constructor vacío necesario para la deserialización
        public Location() {
        }

        // Getters y setters

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLon() {
            return lon;
        }

        public void setLon(String lon) {
            this.lon = lon;
        }

        public String getTimezone_id() {
            return timezone_id;
        }

        public void setTimezone_id(String timezone_id) {
            this.timezone_id = timezone_id;
        }

        public String getLocaltime() {
            return localtime;
        }

        public void setLocaltime(String localtime) {
            this.localtime = localtime;
        }

        public long getLocaltime_epoch() {
            return localtime_epoch;
        }

        public void setLocaltime_epoch(long localtime_epoch) {
            this.localtime_epoch = localtime_epoch;
        }

        public String getUtc_offset() {
            return utc_offset;
        }

        public void setUtc_offset(String utc_offset) {
            this.utc_offset = utc_offset;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "name='" + name + '\'' +
                    ", country='" + country + '\'' +
                    ", region='" + region + '\'' +
                    ", lat='" + lat + '\'' +
                    ", lon='" + lon + '\'' +
                    ", timezone_id='" + timezone_id + '\'' +
                    ", localtime='" + localtime + '\'' +
                    ", localtime_epoch=" + localtime_epoch +
                    ", utc_offset='" + utc_offset + '\'' +
                    '}';
        }

    }

    // Clase interna CurrentWeather
    public static class CurrentWeather {
        private String observation_time;
        private int temperature;
        private int weather_code;  // Agregado
        private List<String> weather_icons;
        private String description;

        private List<String> weather_descriptions;

        private double wind_speed;

        private int wind_degree;

        private String wind_dir;  // Agregado
        private int pressure;
        private String precip;
        private int humidity;      // Agregado
        private int cloudcover;    // Agregado
        private int feelslike;     // Agregado
        private int uv_index;      // Agregado
        private int visibility;    // Agregado


        // Constructor vacío necesario para la deserialización
        public CurrentWeather() {
        }

        // Getters y setters


        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public int getCloudcover() {
            return cloudcover;
        }

        public void setCloudcover(int cloudcover) {
            this.cloudcover = cloudcover;
        }

        public int getFeelslike() {
            return feelslike;
        }

        public void setFeelslike(int feelslike) {
            this.feelslike = feelslike;
        }

        public int getUv_index() {
            return uv_index;
        }

        public void setUv_index(int uv_index) {
            this.uv_index = uv_index;
        }

        public int getVisibility() {
            return visibility;
        }

        public void setVisibility(int visibility) {
            this.visibility = visibility;
        }

        public String getPrecip() {
            return precip;
        }

        public void setPrecip(String precip) {
            this.precip = precip;
        }
        public int getPressure() {
            return pressure;
        }

        public void setPressure(int pressure) {
            this.pressure = pressure;
        }

        public String getWind_dir() {
            return wind_dir;
        }

        public void setWind_dir(String wind_dir) {
            this.wind_dir = wind_dir;
        }

        public int getWind_degree() {
            return wind_degree;
        }

        public void setWind_degree(int wind_degree) {
            this.wind_degree = wind_degree;
        }

        public double getWind_speed() {
            return wind_speed;
        }

        public void setWind_speed(double wind_speed) {
            this.wind_speed = wind_speed;
        }

        public List<String> getWeather_descriptions() {
            return weather_descriptions;
        }

        public void setWeather_descriptions(List<String> weather_descriptions) {
            this.weather_descriptions = weather_descriptions;
        }

        public int getWeather_code() {
            return weather_code;
        }

        public void setWeather_code(int weather_code) {
            this.weather_code = weather_code;
        }

        public List<String> getWeather_icons() {
            return weather_icons;
        }

        public void setWeather_icons(List<String> weather_icons) {
            this.weather_icons = weather_icons;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getObservation_time() {
            return observation_time;
        }

        public void setObservation_time(String observation_time) {
            this.observation_time = observation_time;
        }

        public int getTemperature() {
            return temperature;
        }

        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }

        @Override
        public String toString() {
            return "CurrentWeather{" +
                    "observation_time='" + observation_time + '\'' +
                    ", temperature=" + temperature +
                    ", weather_code=" + weather_code +
                    ", weather_icons=" + weather_icons +
                    ", description='" + description + '\'' +
                    ", weather_descriptions=" + weather_descriptions +
                    ", wind_speed=" + wind_speed +
                    ", wind_degree=" + wind_degree +
                    ", wind_dir='" + wind_dir + '\'' +
                    ", pressure=" + pressure +
                    ", precip='" + precip + '\'' +
                    '}';
        }


    }
    @Override
    public String toString() {
        return "WeatherstackResponse{" +
                "city='" + city + '\'' +
                ", temperature=" + temperature +
                ", description='" + description + '\'' +
                ", request=" + request +
                ", location=" + location +
                ", current=" + current +
                // Agrega más campos según sea necesario
                '}';
    }
    public class ForecastData {
        private String date;
        private long dateEpoch;
        private AstroData astro;
        private int mintemp;
        private int maxtemp;
        private int avgtemp;
        private int totalsnow;
        private double sunhour;
        private int uvIndex;

        // Getter and Setter methods

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public long getDateEpoch() {
            return dateEpoch;
        }

        public void setDateEpoch(long dateEpoch) {
            this.dateEpoch = dateEpoch;
        }

        public AstroData getAstro() {
            return astro;
        }

        public void setAstro(AstroData astro) {
            this.astro = astro;
        }

        public int getMintemp() {
            return mintemp;
        }

        public void setMintemp(int mintemp) {
            this.mintemp = mintemp;
        }

        public int getMaxtemp() {
            return maxtemp;
        }

        public void setMaxtemp(int maxtemp) {
            this.maxtemp = maxtemp;
        }

        public int getAvgtemp() {
            return avgtemp;
        }

        public void setAvgtemp(int avgtemp) {
            this.avgtemp = avgtemp;
        }

        public int getTotalsnow() {
            return totalsnow;
        }

        public void setTotalsnow(int totalsnow) {
            this.totalsnow = totalsnow;
        }

        public double getSunhour() {
            return sunhour;
        }

        public void setSunhour(double sunhour) {
            this.sunhour = sunhour;
        }

        public int getUvIndex() {
            return uvIndex;
        }

        public void setUvIndex(int uvIndex) {
            this.uvIndex = uvIndex;
        }

        // toString method to represent the data as a string

        @Override
        public String toString() {
            return "ForecastData{" +
                    "date='" + date + '\'' +
                    ", dateEpoch=" + dateEpoch +
                    ", astro=" + astro +
                    ", mintemp=" + mintemp +
                    ", maxtemp=" + maxtemp +
                    ", avgtemp=" + avgtemp +
                    ", totalsnow=" + totalsnow +
                    ", sunhour=" + sunhour +
                    ", uvIndex=" + uvIndex +
                    '}';
        }
        public class AstroData {
            private String sunrise;
            private String sunset;
            private String moonrise;
            private String moonset;
            private String moonPhase;
            private int moonIllumination;

            // Getter and Setter methods

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public String getMoonrise() {
                return moonrise;
            }

            public void setMoonrise(String moonrise) {
                this.moonrise = moonrise;
            }

            public String getMoonset() {
                return moonset;
            }

            public void setMoonset(String moonset) {
                this.moonset = moonset;
            }

            public String getMoonPhase() {
                return moonPhase;
            }

            public void setMoonPhase(String moonPhase) {
                this.moonPhase = moonPhase;
            }

            public int getMoonIllumination() {
                return moonIllumination;
            }

            public void setMoonIllumination(int moonIllumination) {
                this.moonIllumination = moonIllumination;
            }

            // toString method to represent the data as a string

            @Override
            public String toString() {
                return "AstroData{" +
                        "sunrise='" + sunrise + '\'' +
                        ", sunset='" + sunset + '\'' +
                        ", moonrise='" + moonrise + '\'' +
                        ", moonset='" + moonset + '\'' +
                        ", moonPhase='" + moonPhase + '\'' +
                        ", moonIllumination=" + moonIllumination +
                        '}';
            }
        }

    }

}
