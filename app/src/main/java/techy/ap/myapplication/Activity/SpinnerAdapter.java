package techy.ap.myapplication.Activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jaredrummler.materialspinner.MaterialSpinnerAdapter;

import java.util.List;

import techy.ap.myapplication.R;

public class SpinnerAdapter extends MaterialSpinnerAdapter<Model> {

    List<Model> items;
    Context context;

    public SpinnerAdapter(Context context, List<Model> items) {
        super(context, items);

        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.child, null);

        return view;



         /*super.getView(position, convertView, parent);*/
    }
}
