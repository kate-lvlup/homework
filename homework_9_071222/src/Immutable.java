//1. Создать реализацию Immutable class'a

public final class Immutable {
    private final Integer temperature;
    private final String season;
    private final Weather weather;


    public Immutable(Integer temperature, String season, Weather weather) {
        this.temperature = temperature;
        this.season = season;
        this.weather = new Weather(weather.getNameWeather(), weather.getWindSpeed());
//        this.weather = weather;
    }


    public Integer getTemperature() {
        return temperature;
    }

    public String getSeason() {
        return season;
    }

    public Weather getWeather() {
        return weather;
    }
}
