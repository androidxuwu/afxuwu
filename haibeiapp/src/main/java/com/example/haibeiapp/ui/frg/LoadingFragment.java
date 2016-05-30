package com.example.haibeiapp.ui.frg;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.haibeiapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoadingFragment extends Fragment {


    public LoadingFragment() {
    }

    public static LoadingFragment newInstance() {
        Bundle args = new Bundle();
        LoadingFragment fragment = new LoadingFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_loading, container, false);
        return view ;
    }

}
