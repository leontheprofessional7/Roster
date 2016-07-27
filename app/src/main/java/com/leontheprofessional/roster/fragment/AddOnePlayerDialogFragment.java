package com.leontheprofessional.roster.fragment;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.leontheprofessional.roster.R;

/**
 * Created by yangl on 7/5/2016.
 */
public class AddOnePlayerDialogFragment extends DialogFragment{


    public static AddOnePlayerDialogFragment newInstance(){
        AddOnePlayerDialogFragment addOnePlayerDialogFragment = new AddOnePlayerDialogFragment();

        return addOnePlayerDialogFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.add_one_player_dialog_fragment, container, false);

        return view;
    }

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage("Yes")
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.M)
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getContext(), "No players added", Toast.LENGTH_SHORT).show();
            }
        });

        return super.onCreateDialog(savedInstanceState);
    }
}
