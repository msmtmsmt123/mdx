package com.erdemorman.mdx.ui.about;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;

import com.afollestad.materialdialogs.MaterialDialog;
import com.erdemorman.mdx.R;

public class AboutDialog extends DialogFragment {

    public static void show(AppCompatActivity context) {
        AboutDialog dialog = new AboutDialog();
        dialog.show(context.getSupportFragmentManager(), "AboutDialog");
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new MaterialDialog.Builder(getActivity())
                .title(R.string.about)
                .positiveText(R.string.dismiss)
                .content(Html.fromHtml(getString(R.string.about_content_html)))
                .build();
    }
}