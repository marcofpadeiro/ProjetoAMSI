package com.projeto.airbender.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.projeto.airbender.R;
import com.projeto.airbender.models.BalanceReq;

import java.util.ArrayList;

public class BalanceReqAdapter extends RecyclerView.Adapter<BalanceReqAdapter.ViewHolder> {

    private ArrayList<BalanceReq> localDataSet;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView value, status;
        private final View colorBar;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            value = (TextView) view.findViewById(R.id.tvValue);
            status = (TextView) view.findViewById(R.id.tvStatus);
            colorBar = (View) view.findViewById(R.id.colorBar);
        }

        public TextView getValue() {
            return value;
        }

        public TextView getStatus() {
            return status;
        }

        public View getColorBar() {
            return colorBar;
        }

    }

    public BalanceReqAdapter(ArrayList<BalanceReq> dataSet) {
        localDataSet = dataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.balance_req_item, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.getValue().setText(localDataSet.get(position).getAmount() + "€");
        viewHolder.getStatus().setText(localDataSet.get(position).getStatus());
        if (localDataSet.get(position).getStatus().equals("Accepted")) {
            viewHolder.getColorBar().setBackgroundColor(Color.GREEN);
        } else if(localDataSet.get(position).getStatus().equals("Declined")){
            viewHolder.getColorBar().setBackgroundColor(Color.RED);
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return localDataSet.size();
    }
}
