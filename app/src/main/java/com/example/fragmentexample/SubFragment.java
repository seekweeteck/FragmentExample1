package com.example.fragmentexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SubFragment extends Fragment{
	private TextView textViewTitle;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_sub, container, false);
		textViewTitle = (TextView)view.findViewById(R.id.textViewTitle);
		return view;
	}

	public interface OnAssignTitle {
		public void setTitle(String string);
	}

	public void assignTitle(String title){
		textViewTitle.setText(title);
	}
		@Override
	public void onPause() {
		super.onPause();
	}
}
