package com.projects.kevinbarassa.stylusdjawards;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Kevin Barassa on 03-Nov-16.
 */

public class VoteCategoriesFragment extends Fragment {
    Button launchVoting;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         View rootView = inflater.inflate(R.layout.vote_category_layout,container, false);
        launchVoting = (Button) rootView.findViewById(R.id.voteBtn);
        return rootView;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        launchVoting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voting = new Intent(getActivity(), VotingActivity.class);
                startActivity(voting);
            }
        });
    }
}