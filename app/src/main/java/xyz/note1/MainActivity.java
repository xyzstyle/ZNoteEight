package xyz.note1;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import xyz.fragment.NotesListFragment;

public class MainActivity extends SingleFragmentActivity {


    @Override
    protected Fragment getFragment() {
        return new NotesListFragment();
    }
}
