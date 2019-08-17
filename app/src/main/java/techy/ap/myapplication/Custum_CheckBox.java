package techy.ap.myapplication;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;

public class Custum_CheckBox extends BaseAcitvity {

    private static final String TAG = "Custum_CheckBox";
    private ArrayList<View> list;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_checkbox);


        final Button button = (Button) findViewById(R.id.chekc_button);
        final Button button2 = (Button) findViewById(R.id.chekc_button2);

        customBackground(button, button2);



    }




}
