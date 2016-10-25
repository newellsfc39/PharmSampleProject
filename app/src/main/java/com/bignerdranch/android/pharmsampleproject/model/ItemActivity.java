package com.bignerdranch.android.pharmsampleproject.model;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.bignerdranch.android.pharmsampleproject.R;


/**
 * Created by thomasnewell on 9/30/16.
 */
public class ItemActivity extends Fragment {

    private Button mStudy;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.item_frag, container, false);

        mStudy = (Button)view.findViewById(R.id.study_fragment_button_id);
        mStudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showList();
            }
        });


        return view;
    }

    private void showList(){
        getToast("showing a list of drugs here");
    }

    private void getToast(String message){
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }

}
