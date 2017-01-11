package mc.hdx.com.day_19tablayout1;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fragment> list=new ArrayList<>();
    private TabLayout tl;
    private ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tl= (TabLayout) findViewById(R.id.tl);
        vp= (ViewPager) findViewById(R.id.vp);
        initList();
        MyPagerAdapter adapter=new MyPagerAdapter(getSupportFragmentManager(),list);
        vp.setAdapter(adapter);
        tl.setTabMode(TabLayout.MODE_SCROLLABLE);
        tl.setupWithViewPager(vp);
    }

    private void initList() {
        for (int i=1;i<=6;i++){
            list.add(MyFragment.newInstance(i));
        }
    }
}
