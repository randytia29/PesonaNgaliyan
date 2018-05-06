package com.example.randy.pesonangaliyan.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.randy.pesonangaliyan.R;
import com.example.randy.pesonangaliyan.SnackActivity;

public class FragmentTematik extends Fragment {

    CardView cardView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tematik, container, false);

        cardView = (CardView) v.findViewById(R.id.kampung_snack2);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SnackActivity.class);
                startActivity(intent);
            }
        });
        return v;
    }
}


