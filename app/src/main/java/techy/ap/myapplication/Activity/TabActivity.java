package techy.ap.myapplication.Activity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import techy.ap.myapplication.R;

public class TabActivity extends AppCompatActivity {

    private static final String TAG = "TabActivity";

    private TabLayout tabLayout;
    private ViewPager viewPager;
    List<String> stringArrayList = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        getSupportActionBar().hide();
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout.setupWithViewPager(viewPager);
        setViewPager(viewPager);
        custIcon();

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {


                Log.d(TAG, "onTabSelected: ");

                for (int i = 0 ; i < tabLayout.getTabCount(); i++)
                {
                    if (tabLayout.getTabAt(i) != tab)
                    {
                        TextView textView = (TextView) tabLayout.getTabAt(i).getCustomView();
                        textView.setText(stringArrayList.get(i));
                        textView.setTextColor(Color.BLACK);
                    }
                    else
                    {
                        TextView textView = (TextView) tab.getCustomView();
                        textView.setTextColor(Color.GRAY);
                    }



                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

//                for (int i = 0 ; i < tabLayout.getTabCount(); i++)
//                {
//                    TextView textView = (TextView) LayoutInflater.from(getApplicationContext()).inflate(R.layout.tab_text, null);
//                    textView.setText(stringArrayList.get(i));
//                    textView.setTextColor(Color.BLACK);
//                    tabLayout.getTabAt(i).setCustomView(textView);
//                }

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {



            }
        });

    }
    public void custIcon()
    {
        for (int i = 0 ; i < tabLayout.getTabCount(); i++ )
        {
            TextView textView = (TextView) LayoutInflater.from(getApplicationContext()).inflate(R.layout.tab_text, null);
            textView.setText(stringArrayList.get(i));
            tabLayout.getTabAt(i).setCustomView(textView);

        }
    }


    public class ViewPageAdapter extends FragmentPagerAdapter
    {
        List<Fragment> fragmentList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        Context context;

        public ViewPageAdapter(FragmentManager fm, Context  context) {
            super(fm);
            this.context = context;
        }


        @Override
        public Fragment getItem(int i) {
            return fragmentList.get(i);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        public void addFragment(Fragment fragment, String title)
        {
            fragmentList.add(fragment);
            stringList.add(title);
        }



        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return stringList.get(position);
        }
    }

    public void setViewPager(ViewPager viewPager)
    {
        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager(), TabActivity.this);
        adapter.addFragment(new second_fragment(), "first");
        adapter.addFragment(new second_fragment(), "Second");
        adapter.addFragment(new third_fragment(), "Third");
        adapter.addFragment(new third_fragment(), "fourth");
        adapter.addFragment(new third_fragment(), "fifth");
        adapter.addFragment(new third_fragment(), "six");
        viewPager.setAdapter(adapter);
    }




}


