package xyz.note1;


import android.support.v4.app.Fragment;
import xyz.fragment.WelcomeFragment;


/**
 * My File Created by xyz on 2018/4/9.
 */

public class WelcomeActivity extends SingleFragmentActivity {



    @Override
    protected Fragment getFragment() {
       return new WelcomeFragment();
    }
}
