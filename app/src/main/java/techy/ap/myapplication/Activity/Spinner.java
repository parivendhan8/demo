package techy.ap.myapplication.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.jaredrummler.materialspinner.MaterialSpinner;

import java.util.ArrayList;

import techy.ap.myapplication.R;

public class Spinner extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dummy);

//        MaterialSpinner spinner = (MaterialSpinner) findViewById(R.id.dropdown);
//
//        ArrayList<Model> models = new ArrayList<Model>();
//        models.add(new Model("one"));
//        models.add(new Model("two"));
//        models.add(new Model("three"));
//        models.add(new Model("four"));
//        models.add(new Model("five"));
//
//        SpinnerAdapter spinnerAdapter = new SpinnerAdapter(Spinner.this, models);
//        spinner.setAdapter(spinnerAdapter);

    }
}
