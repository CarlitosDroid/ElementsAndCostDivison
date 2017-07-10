package com.mobileboy.elementsandcostdivision.ui.introduction.mpd;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobileboy.elementsandcostdivision.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Carlos Leonardo Camilo Vargas Huamán on 7/9/17.
 */

public class MPDFragment extends Fragment implements View.OnClickListener {

    private static final String TAG_SKIP_DIALOG_FRAGMENT = "TAG_SKIP_DIALOG_FRAGMENT";

    private RecyclerView rcvMPD;
    private List<Object> objectList = new ArrayList<>();

    private MPDAdapter mpdAdapter;
    private FloatingActionButton fabMPD;

    public static MPDFragment newInstance() {
        return new MPDFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mpd, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        rcvMPD = view.findViewById(R.id.rcvMPD);
        fabMPD = view.findViewById(R.id.fabMPD);
        fabMPD.setOnClickListener(this);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        init();
    }

    private void init() {
        mpdAdapter = new MPDAdapter(objectList);
        rcvMPD.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        rcvMPD.setAdapter(mpdAdapter);
        objectList.add(new MPDHeaderEntity());
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.fabMPD) {
            showCancelIntroduction();
        }
    }

    public void showCancelIntroduction() {
        MPDDialogFragment mpdDialogFragment =
                MPDDialogFragment.newInstance();
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        mpdDialogFragment.show(fragmentManager, TAG_SKIP_DIALOG_FRAGMENT);
    }

    public void addMPDItemEntity(String description, int quantity, String dimension, int unitPrice, int totalPrice){
        objectList.add(new MPDItemEntity(description, quantity, dimension, unitPrice, totalPrice));
        mpdAdapter.notifyDataSetChanged();
    }
}
