package com.example.winscoringdemoapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.winscoringdemoapplication.databinding.DialogfragmentRosterABinding;
import com.example.winscoringdemoapplication.databinding.FragmentGeneralInfoBinding;

public class RosterADialogFragment extends DialogFragment {
    public @NonNull DialogfragmentRosterABinding binding;

    static RosterADialogFragment newInstance() {
        RosterADialogFragment instance = new RosterADialogFragment();

        return instance;
    }



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = DialogfragmentRosterABinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    void showDialog() {
        // DialogFragment.show() will take care of adding the fragment
        // in a transaction.  We also want to remove any currently showing
        // dialog, so make our own transaction and take care of that here.
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        Fragment prev = getFragmentManager().findFragmentByTag("rostera");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);

        // Create and show the dialog.
        DialogFragment newFragment = RosterADialogFragment.newInstance();
        newFragment.show(ft, "rostera");
    }

}
