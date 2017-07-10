package com.mobileboy.elementsandcostdivision.ui.introduction.mpd;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.mobileboy.elementsandcostdivision.R;

/**
 * Created by carlosleonardocamilovargashuaman on 6/21/17.
 */

public class MPDDialogFragment extends DialogFragment implements View.OnClickListener {

    OnSelectOptionListener onSelectOptionListener;

    private EditText txtDescription;
    private EditText txtQuantity;
    private EditText txtDimension;
    private EditText txtUnitPrice;
    private EditText txtTotalPrice;

    private Button btnAccept;
    private Button btnCancel;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity;
        if (context instanceof Activity) {
            activity = (Activity) context;
            onSelectOptionListener = (OnSelectOptionListener) activity;
        }
    }

    @Override
    public void onDetach() {
        onSelectOptionListener = null;
        super.onDetach();
    }

    public static MPDDialogFragment newInstance() {
        return new MPDDialogFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_fragment_mpd2, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        txtDescription = view.findViewById(R.id.txtDescription);
        txtQuantity = view.findViewById(R.id.txtQuantity);
        txtDimension = view.findViewById(R.id.txtDimension);
        txtUnitPrice = view.findViewById(R.id.txtUnitPrice);
        txtTotalPrice = view.findViewById(R.id.txtTotalPrice);

        btnAccept = view.findViewById(R.id.btnAccept);
        btnCancel = view.findViewById(R.id.btnCancel);

        btnAccept.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnAccept) {
            String description = txtDescription.getText().toString();
            int quantity = Integer.parseInt(txtQuantity.getText().toString());
            String dimension = txtDimension.getText().toString();
            int unitPrice = Integer.parseInt(txtUnitPrice.getText().toString());
            int totalPrice = Integer.parseInt(txtTotalPrice.getText().toString());
            onSelectOptionListener.onAccept(description, quantity, dimension, unitPrice, totalPrice);
        }
        getDialog().dismiss();
    }

    public interface OnSelectOptionListener {
        void onAccept(String description, int quantity, String dimension, int unitPrice, int totalPrice);
    }
}
