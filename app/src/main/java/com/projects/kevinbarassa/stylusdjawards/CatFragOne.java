package com.projects.kevinbarassa.stylusdjawards;

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

import static com.projects.kevinbarassa.stylusdjawards.R.id.radioGroup;
import static com.projects.kevinbarassa.stylusdjawards.R.id.voteBtn;

/**
 * Created by Kevin Barassa on 21-Nov-16.
 */

public class CatFragOne extends Fragment{
    private RadioGroup rGroup;
    private  Button vBtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.cat_one, container, false);
        /* Initialize Radio Group and attach click handler */
        rGroup = (RadioGroup) rootView.findViewById(radioGroup);
        rGroup.clearCheck();
        vBtn = (Button) rootView.findViewById(voteBtn);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        /* Attach CheckedChangeListener to radio group */
        rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if(null!=rb && checkedId > -1){
                    Toast.makeText(getActivity(), rb.getText(), Toast.LENGTH_SHORT).show();
                }

            }
        });
        vBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton rb = (RadioButton) rGroup.findViewById(rGroup.getCheckedRadioButtonId());
                Toast.makeText(getActivity(), "Thank you for voting "+ rb.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
