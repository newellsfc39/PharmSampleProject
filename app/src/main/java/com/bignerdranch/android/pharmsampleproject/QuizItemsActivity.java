package com.bignerdranch.android.pharmsampleproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * Created by thomasnewell on 9/30/16.
 */
public class QuizItemsActivity extends Fragment {

    private Button mQuiz;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.quiz_frag, container, false);

        mQuiz = (Button)view.findViewById(R.id.quiz_fragment_button_id);
        mQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quizNow();
            }
        });
        return view;
    }


    private void quizNow(){
        getToast("a menu of quiz options will pop up");
    }

    private void getToast(String message){
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }
}
