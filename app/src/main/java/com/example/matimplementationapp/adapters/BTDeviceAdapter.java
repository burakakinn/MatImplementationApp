package com.example.matimplementationapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.matimplementationapp.R;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

//public class BTDeviceAdapter extends RecyclerView.Adapter {
//
//    ArrayList<String> deviceNames;
//    private CardviewBtdeviceBinding binding;
//
//    public BTDeviceAdapter(ArrayList<String> deviceNames) {
//        this.deviceNames = deviceNames;
//    }
//
//    class BTViewHolder {
//
//    }
//
//    @NonNull
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        binding = CardviewBtdeviceBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
//        return null;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return deviceNames.size();
//    }
//}

public class BTDeviceAdapter extends RecyclerView.Adapter<BTDeviceAdapter.ViewHolder> {

    private ArrayList<String> deviceNames;
    private Context context;

    public BTDeviceAdapter(Context context, ArrayList<String> deviceNames) {
        this.deviceNames = deviceNames;
        this.context = context;
    }

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            textView = (TextView) view.findViewById(R.id.btcardDeviceName);
        }

        public TextView getTextView() {
            return textView;
        }
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardview_btdevice, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.getTextView().setText(deviceNames.get(position));
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return deviceNames.size();
    }
}

