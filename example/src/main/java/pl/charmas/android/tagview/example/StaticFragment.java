package pl.charmas.android.tagview.example;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pl.charmas.android.tagview.R;
import pl.charmas.android.tagview.TagView;

public class StaticFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.static_layout, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TagView tv = (TagView) getView().findViewById(R.id.tags_view);
        tv.setTags(((MainActivity) getActivity()).createTagList(), " ");
    }
}