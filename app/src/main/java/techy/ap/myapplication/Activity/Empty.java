package techy.ap.myapplication.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

import techy.ap.myapplication.Activity.Custum_CheckBox.Dummy;
import techy.ap.myapplication.R;

public class Empty extends BaseAcitvity {


    private static final String TAG = "Empty";
    
    LinearLayout container;

    ArrayList<Dummy> dummies;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.empty);

        container = findViewById(R.id.container);


        Type type = new TypeToken<Object>(){}.getType();

        String key = getIntent().getStringExtra("key");

//        ArrayList<Dummy> obj = (ArrayList<Dummy>) new Gson().fromJson(key, type);



        ArrayList<Dummy> d = stringToArray(key, dummies);;

        Object[] list = d.toArray();

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

//        TypeToken.getParameterized()





    }

    public static <T> T stringToArray(String s, T clazz) {
        Type type = new TypeToken<T>(){}.getRawType();
       T arr = new Gson().fromJson(s, type);
        return arr; //or return Arrays.asList(new Gson().fromJson(s, clazz)); for a one-liner
    }




}
