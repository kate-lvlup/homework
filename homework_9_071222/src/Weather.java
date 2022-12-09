public class Weather {
    private String nameWeather;
    private Integer windSpeed;

    public Weather(String nameWeather, Integer windSpeed) {
        this.nameWeather = nameWeather;
        this.windSpeed = windSpeed;
    }

    public String getNameWeather() {
        return nameWeather;
    }

    public void setNameWeather(String nameWeather) {
        this.nameWeather = nameWeather;
    }

    public Integer getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
    }
}


