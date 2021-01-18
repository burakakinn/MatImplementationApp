package com.example.matimplementationapp.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.example.matimplementationapp.R;

import java.util.ArrayList;

public class BTDeviceAdapter extends RecyclerView.Adapter<BTDeviceAdapter.ViewHolder> {

    private ArrayList<String> deviceNames;
    private Context context;
    private int bluetoothDeviceIndex;
    public MutableLiveData<Integer> selectedDeviceLiveData ;
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
        private CardView card;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            textView = (TextView) view.findViewById(R.id.btcardDeviceName);
            card = (CardView) view.findViewById(R.id.card);
        }

        public TextView getTextView() {
            return textView;
        }
        public CardView getCardView() {
            return card;
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
        viewHolder.getCardView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedDeviceLiveData.setValue(position);
                bluetoothDeviceIndex = position;
                Log.i("btscan",deviceNames.get(position) + " is selected");
            }
        });
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return deviceNames.size();
    }

    public int getBluetoothDeviceIndex() {
        return bluetoothDeviceIndex;
    }

    public MutableLiveData<Integer> getSelectedDeviceLiveData(){
        if(selectedDeviceLiveData == null){
            selectedDeviceLiveData = new MutableLiveData<Integer>();
        }
        return selectedDeviceLiveData;
    }
}

