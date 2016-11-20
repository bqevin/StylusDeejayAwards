package com.projects.kevinbarassa.stylusdjawards;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Kevin Barassa on 03-Nov-16.
 */

public class VoteCategoriesFragment extends Fragment {
    private RadioGroup radioGroup;
    private Button mButton;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         View rootView =  inflater.inflate(R.layout.vote_categories_layout,container, false);
        /* Initialize Radio Group and attach click handler */
        radioGroup = (RadioGroup) rootView.findViewById(R.id.radioGroup);
        radioGroup.clearCheck();

        /* Attach CheckedChangeListener to radio group */
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if(null!=rb && checkedId > -1){
                    Toast.makeText(getActivity(), rb.getText(), Toast.LENGTH_SHORT).show();
                }

            }
        });
        mButton = (Button) rootView.findViewById(R.id.voteBtn);
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                RadioButton rb = (RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
                Toast.makeText(getActivity(), "You have voted for " + rb.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }




}