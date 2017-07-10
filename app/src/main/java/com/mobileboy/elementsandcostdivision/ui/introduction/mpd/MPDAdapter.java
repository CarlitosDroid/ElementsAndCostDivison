package com.mobileboy.elementsandcostdivision.ui.introduction.mpd;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mobileboy.elementsandcostdivision.R;

import java.util.List;

/**
 * Created by Carlos Leonardo Camilo Vargas Huamán on 7/9/17.
 */

public class MPDAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Object> objectList;

    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ITEM = 1;

    public MPDAdapter(List<Object> objectList) {
        this.objectList = objectList;
    }

    @Override
    public int getItemViewType(int position) {
        if (objectList.get(position) instanceof MPDHeaderEntity) {
            return TYPE_HEADER;
        } else {
            return TYPE_ITEM;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        if (viewType == TYPE_HEADER) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_header_mpd, parent, false);
            return new HeaderViewHolder(view);
        } else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mpd, parent, false);
            return new ItemViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }

    class HeaderViewHolder extends RecyclerView.ViewHolder {
        private HeaderViewHolder(View itemView) {
            super(itemView);
        }
    }

    class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView lblDescription;
        TextView lblQuantity;
        TextView lblDimension;
        TextView lblUnitPrice;
        TextView lblTotalPrice;

        ItemViewHolder(View itemView) {
            super(itemView);
            lblDescription = itemView.findViewById(R.id.lblDescription);
            lblQuantity = itemView.findViewById(R.id.lblQuantity);
            lblDimension = itemView.findViewById(R.id.lblDimension);
            lblUnitPrice = itemView.findViewById(R.id.lblUnitPrice);
            lblTotalPrice = itemView.findViewById(R.id.lblTotalPrice);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
