package com.example.IconPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.IconPager.R;

public class GroupFragment extends Fragment {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.group_fragment,container,false);

    }
}
