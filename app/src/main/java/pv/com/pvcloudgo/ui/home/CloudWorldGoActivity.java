package pv.com.pvcloudgo.ui.home;

import android.os.Bundle;

import butterknife.ButterKnife;
import pv.com.pvcloudgo.BaseActivity;
import pv.com.pvcloudgo.R;

/**
 * Created by stefan on 16/12/13.
 */

public class CloudWorldGoActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloudworld_go);
        ButterKnife.bind(this);


    }




}
