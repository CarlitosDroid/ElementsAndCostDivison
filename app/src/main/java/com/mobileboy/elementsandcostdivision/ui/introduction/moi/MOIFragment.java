package com.mobileboy.elementsandcostdivision.ui.introduction.moi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobileboy.elementsandcostdivision.R;
import com.mobileboy.elementsandcostdivision.ui.introduction.cif.CIFFragment;

/**
 * Created by Carlos Leonardo Camilo Vargas Huamán on 7/9/17.
 */

public class MOIFragment extends Fragment {
    public static MOIFragment newInstance() {
        return new MOIFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_moi, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //init();
    }
}
