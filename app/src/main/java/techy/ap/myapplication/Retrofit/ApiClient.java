package techy.ap.myapplication.Retrofit;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import techy.ap.myapplication.Retrofit.Model.RequestMethod;
import techy.ap.myapplication.Retrofit.Model.Responses;

public interface ApiClient {

    @POST("posts")
    Call<Object> getData(@Body RequestMethod method);

    @GET("/api/users")
    Call<Object> page(@Query("page") String id);


    @FormUrlEncoded
    @POST("api/register")
    Call<Object> register(
            @Field("email") String email,
            @Field("password") String password
            );



    @FormUrlEncoded
    @POST("posts")
    Call<Object> getData(

            @Field("user_id") String user_id,
            @Field("name") String name,
            @Field("loaction") String loaction

    );

}
