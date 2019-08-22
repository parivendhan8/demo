package techy.ap.myapplication.Retrofit;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import techy.ap.myapplication.Activity.BaseAcitvity;
import techy.ap.myapplication.Retrofit.Model.RequestMethod;

public class PostActivity extends BaseAcitvity {


    private static final String TAG = "PostActivity";
    private Callback<Object> objectCall;
    private Callback<Object> callback;
    private Callback<Object> register;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        RequestMethod method = new RequestMethod();
        method.setId(1);
        method.setTitle("retrofit");
        method.setUserId("intercep");



        objectCall = new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {

                Log.d(TAG, "onResponse: " + response.body());

            }

            @Override
            public void onFailure(Call<Object> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.getMessage());

            }
        };


        callback = new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {

                Log.d(TAG, "onResponse: " + response.body());

            }

            @Override
            public void onFailure(Call<Object> call, Throwable t) {

                Log.d(TAG, "onFailure: " + t.getMessage());
            }
        };

        register = new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {

                Log.d(TAG, "onResponse: " + response.body());

            }

            @Override
            public void onFailure(Call<Object> call, Throwable t) {

                Log.d(TAG, "onFailure: " + t.getMessage());

            }
        };

        Map<String, String> map = new HashMap<String, String>();
        map.put("email", "eve.holt@reqres.in");
        map.put("password", "pistol");

        getClient().page("2").enqueue(register);

//        getClient().getData("102","prem", "myLocation").enqueue(callback);

    }
}
