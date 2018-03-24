package com.example.shreeghanesh.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by shreeghanesh on 24/3/18.
 */

public class Tab1Fragment extends Fragment {
    private static final String TAG = "TAB1_FRAGMENT";
    private Button button1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab1_fragment, container, false);
        button1=view.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), TAG, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
