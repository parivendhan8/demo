package techy.ap.myapplication;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;

public class custom extends AppCompatActivity implements CustCheckChange
{

    private ArrayList<View> list;
    private View.OnClickListener onClickListener;
    Context context;

    public custom(Context context) {
        this.context = context;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void checkChange(View... view) {

        list = new ArrayList<View>();
        BackgroundModel model = new BackgroundModel();

        for (View v : view)
        {
            list.add(v);
            v.setTag(false);
            Button button = (Button) v;
            button.setBackground(context.getDrawable(R.drawable.gray_box));
            v.setOnClickListener(new CustClicklistener(list));
        }

        onClickListener = new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {

                Button button = (Button) v;

                int id = button.getId();

                for (int i = 0; i < list.size(); i++) {

                    View view = list.get(i);
                    if (id == view.getId())
                    {
                        boolean enabled = (boolean) button.getTag();
                        if (enabled)
                        {
                            button.setBackground(context.getDrawable(R.drawable.gray_box));
                            button.setTag(false);
                            list.get(i).setTag(false);
                        }
                        else
                        {
                            button.setBackground(context.getDrawable(R.drawable.red_box));
                            button.setTag(true);
                            list.get(i).setTag(true);
                        }
                    }
                    else
                    {
                        list.get(i).setTag(false);
                        Button button1 = (Button) view;
                        button1.setBackground(context.getDrawable(R.drawable.gray_box));
                    }

                }

            }
        };


    }
}