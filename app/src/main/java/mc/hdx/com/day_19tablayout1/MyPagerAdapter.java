package mc.hdx.com.day_19tablayout1;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/11/24.
 */

public class MyPagerAdapter extends FragmentPagerAdapter{
    private String[] str={"第一页","第二页","第三页","第四页","第五页","第六页"};
    private List<Fragment>  list;
    public MyPagerAdapter(FragmentManager fm,List<Fragment> list) {
        super(fm);
        this.list=list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return str[position];
    }
}
