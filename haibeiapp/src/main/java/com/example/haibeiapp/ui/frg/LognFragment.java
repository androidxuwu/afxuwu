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
public class LognFragment extends Fragment {


    public LognFragment() {
    }

    public static LognFragment newInstance() {
        Bundle args = new Bundle();
        LognFragment fragment = new LognFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_logn, container, false);
        return view;
    }

}
