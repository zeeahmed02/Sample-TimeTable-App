package ctz.com.timetable;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity_home extends AppCompatActivity {

    private AppBarLayout mAppBarLayout;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    String dayOfTheWeek;
    int date_no =99;


    boolean stat=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_home);


        SimpleDateFormat sdf = new SimpleDateFormat("EEE");
        Date d = new Date();
        dayOfTheWeek = sdf.format(d);


        switch (dayOfTheWeek)
        {
            case "Mon":
                date_no =0;
                break;
            case "Tue":
                date_no =1;
                break;
            case "Wed":
                date_no =2;
                break;
            case "Thu":
                date_no =3;
                break;
            case "Fri":
                date_no =4;
                break;
            case "Sat":
                date_no =5;
                break;
            default:
                date_no =0;
                break;
        }

       // Toast.makeText(getApplicationContext(),String.valueOf(date_no),Toast.LENGTH_SHORT).show();

        mAppBarLayout=findViewById(R.id.app_bar_layout);
        mAppBarLayout.setElevation(0);

        Drawable drawable=getDrawable(R.drawable.tit);

        viewPager = findViewById(R.id.viewpager);
        viewPager.setOffscreenPageLimit(6);
        setupViewPager(viewPager);
        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);



    }





private void setupViewPager(final ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new mon(), "Mon");
        adapter.addFragment(new tues(), "Tues");
        adapter.addFragment(new wed(), "Wed");
        adapter.addFragment(new thurs(), "Thur");
        adapter.addFragment(new fri(), "Fri");
        adapter.addFragment(new sat(), "Sat");
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);

    viewPager.postDelayed(new Runnable()
    {
        @Override
        public void run()
        {
            viewPager.setCurrentItem(date_no, true);
        }
    }, 800);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_home, menu);
        return true;
    }

    @Override
    public void onBackPressed() {

        if (date_no==0)
        {
            stat=true;
            new AlertDialog.Builder(Activity_home.this)
                    .setMessage("Are you sure you want to exit?")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    }).show();
        }

       else if (!stat) {
            viewPager.postDelayed(new Runnable() {
                @Override
                public void run() {
                    viewPager.setCurrentItem(0, true);

                }
            }, 200);

            stat=true;

        }else{

            new AlertDialog.Builder(Activity_home.this)
                    .setMessage("Are you sure you want to exit?")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    }).show();

        }
    }
}
