package com.bignerdranch.android.pharmsampleproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by thomasnewell on 10/3/16.
 */
public class ListItemsActivity extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_items_frag, container, false);

        Toast.makeText(getActivity(), "this is where a list will go", Toast.LENGTH_LONG).show();
        return view;
    }


}
