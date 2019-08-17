package techy.ap.myapplication;

import android.databinding.DataBindingUtil;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Constraints;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.Toast;

import techy.ap.myapplication.databinding.ActivityPopupBinding;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    ActivityPopupBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);

        binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_popup);

        binding.spinnerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                View viewById = findViewById(R.id.spinnerView);

                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();

//                View view = getLayoutInflater().inflate(R.layout.popup_child, null);
//                PopupWindow popupWindow = new PopupWindow(view, viewById.getWidth(), ViewGroup.LayoutParams.WRAP_CONTENT);
//                popupWindow.showAsDropDown(viewById);

                LayoutInflater layoutInflater = getLayoutInflater();
                View popupView = layoutInflater.inflate(R.layout.popup_child, null);
                final PopupWindow popupWindow = new PopupWindow(popupView, viewById.getWidth(), ViewGroup.LayoutParams.WRAP_CONTENT);
                popupWindow.showAsDropDown(viewById);

//                popupWindow.showAtLocation(viewById, Gravity.CENTER, 0, 0);


            }



        });




    }
}
