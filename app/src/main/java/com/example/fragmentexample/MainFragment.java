package com.example.fragmentexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

//import android.support.v4.app.Fragment;

public class MainFragment extends Fragment implements View.OnClickListener {
    OnMainTitleListener mCallback;
    private Button buttonFirst, buttonSecond;

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.buttonFirst:
                mCallback.getTitle("First");
                break;
            case R.id.buttonSecond:
                mCallback.getTitle("Second");
                break;
        }
    }

    public interface OnMainTitleListener {
       void getTitle(String title);
    }


    @Override
    public void onAttach(Activity activity) {
        // TODO Auto-generated method stub
        super.onAttach(activity);

        try {
            mCallback = (OnMainTitleListener) activity;
        } catch (ClassCastException a) {
            throw new ClassCastException(activity.toString() + " must implement OnHeadlineSelectedListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        buttonFirst = (Button) view.findViewById(R.id.buttonFirst);
        buttonFirst.setOnClickListener(this);
        buttonSecond = (Button) view.findViewById(R.id.buttonSecond);
        buttonSecond.setOnClickListener(this);
        return view;
    }

    @Override
    public void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
    }

}
