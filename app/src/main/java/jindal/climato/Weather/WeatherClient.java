package jindal.climato.Weather;




        import jindal.climato.Weather.Models.WeatherApiResponseModel;

        import retrofit2.Call;
        import retrofit2.http.GET;
        import retrofit2.http.Url;

public interface WeatherClient {

    @GET
    Call<WeatherApiResponseModel> fetchProducts(@Url String url);
}
