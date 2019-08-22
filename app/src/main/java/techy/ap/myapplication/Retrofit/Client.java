package techy.ap.myapplication.Retrofit;

import android.util.Log;



import org.jetbrains.annotations.NotNull;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@SuppressWarnings("ALL")
public class Client {

    private static final String TAG = "Client";

    public static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
    public static final String BASE_URL_1 = "https://reqres.in/";

    public static Retrofit retrofit = null;

    public static Retrofit getClient()
    {
        if (retrofit == null)
        {

            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                @Override
                public void log(@NotNull String s) {

                    Log.d(TAG, "log: " + s);

                }
            });
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(interceptor)
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL_1)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();

        }

        return retrofit;
    }



}
