package mc.hdx.com.day_19tablayout1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/11/24.
 */

public class MyFragment extends Fragment {
    private int str;

    public MyFragment() {
    }

    public static MyFragment newInstance(int str) {
        Bundle args = new Bundle();
        args.putInt("sj",str);
        MyFragment fragment = new MyFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
           str= getArguments().getInt("sj");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmenta,container,false);
        TextView tv= (TextView) view.findViewById(R.id.tv);
        tv.setText("这是第"+str+"页");
        return view;
    }
}
