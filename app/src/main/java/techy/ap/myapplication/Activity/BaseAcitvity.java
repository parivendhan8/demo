package techy.ap.myapplication.Activity;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

import androidx.annotation.RequiresApi;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

import techy.ap.myapplication.Retrofit.ApiClient;
import techy.ap.myapplication.Retrofit.Client;

public class BaseAcitvity<T> extends AppCompatActivity {

    CustCheckChange change;

    private ArrayList<View> list;
    private OnClickListener onClickListener;
    ApiClient client;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        change = new custom(this);
        client = Client.getClient().create(ApiClient.class);


    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void customBackground(View... view) {

        change.checkChange(view);
    }

    public String toJson(Object o)
    {
        Gson gson = new Gson();
        return gson.toJson(o);
    }

    public T toObject(String s, T t)
    {
        Gson gson = new Gson();

        Type type = new TypeToken<T>(){}.getType();
        T o = gson.fromJson(s, type);

        return o;
    }

    public ApiClient getClient() {
        return client;
    }
}
