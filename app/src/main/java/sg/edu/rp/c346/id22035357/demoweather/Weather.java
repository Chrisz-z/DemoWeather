package sg.edu.rp.c346.id22035357.demoweather;
public class Weather {

    private String area;
    private String forecast;

    @Override
    public String toString() {
        return "WEATHER \n" +
                "Area:" + area + "\n" +
                "Forecast:" + forecast;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public Weather(String area, String forecast) {
        this.area = area;
        this.forecast = forecast;
    }
}
