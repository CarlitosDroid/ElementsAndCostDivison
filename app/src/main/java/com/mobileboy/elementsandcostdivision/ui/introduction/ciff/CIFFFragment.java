package com.mobileboy.elementsandcostdivision.ui.introduction.ciff;

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

public class CIFFFragment extends Fragment {
    public static CIFFFragment newInstance() {
        return new CIFFFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ciff, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //init();
    }
}
