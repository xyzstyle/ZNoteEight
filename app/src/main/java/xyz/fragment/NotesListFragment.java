package xyz.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import xyz.note1.R;

/**
 * My File Created by xyz on 2018/4/9.
 */

public class NotesListFragment extends ListFragment {


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        SimpleAdapter adapter = new SimpleAdapter(getActivity(), getData(), R.layout.note_list_item,
                new String[]{"title", "info", "date"},
                new int[]{R.id.title, R.id.info, R.id.date});
        setListAdapter(adapter);
    }


    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<>();

        Map<String, Object> map = new HashMap<>();
        map.put("title", "G1");
        map.put("info", "google 1");
        map.put("date", "2017 7 23");
        list.add(map);

        map = new HashMap<>();
        map.put("title", "G2");
        map.put("info", "google 2");
        map.put("date", "2017 8 23");
        list.add(map);

        map = new HashMap<>();
        map.put("title", "G3");
        map.put("info", "google 3");
        map.put("date", "2017 9 23");
        list.add(map);

        return list;
    }
}
