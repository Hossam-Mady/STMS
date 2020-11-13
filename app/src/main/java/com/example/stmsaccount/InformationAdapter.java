package com.example.stmsaccount;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class InformationAdapter extends ArrayAdapter<Information> {

    // constructor because there is no default constructor
    public InformationAdapter (Context context, ArrayList<Information> Informations){ super(context,0,Informations);
}

@Override
    public View getView(int position, View convertView, ViewGroup parent){
    View listItemView = convertView;

    if (listItemView == null){
        listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
    }

    Information currentInformation = getItem(position);

    TextView street = (TextView) listItemView.findViewById(R.id.street);
    street.setText(currentInformation.getStreet());

    TextView percentage = (TextView) listItemView.findViewById(R.id.percentage);
    percentage.setText(currentInformation.getPercentage());

return listItemView;
}
}
