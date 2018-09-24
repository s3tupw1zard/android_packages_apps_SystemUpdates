package com.dotos.updater.ui;

import android.annotation.NonNull;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import com.dotos.updater.R;

public class RoundedSheetFragment extends BottomSheetDialogFragment {

    @Override
    public int getTheme() {
        return R.style.BottomSheetDialogTheme;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle bundle) {
        return new BottomSheetDialog(requireContext(), getTheme());
    }


}
