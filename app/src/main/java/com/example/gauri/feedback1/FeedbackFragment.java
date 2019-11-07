package com.example.gauri.feedback1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

import com.firebase.client.Firebase;

public class FeedbackFragment extends Fragment {

    EditText namedata ,emaildata,messagedata,rating;
    Button send,details,quiz;
    Firebase firebase;
    RatingBar ratingi,ratingp;

    public FeedbackFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_feedback,container,false);
        namedata = v.findViewById(R.id.namedata);
        emaildata = v.findViewById(R.id.emaildata);
        messagedata = v.findViewById(R.id.messagedata);
        ratingi =v. findViewById(R.id.ratingi);
        ratingp =v. findViewById(R.id.ratingp);
        send = v.findViewById(R.id.btn_send);
        details = v.findViewById(R.id.btn_details);
        return  v;

    }
}
