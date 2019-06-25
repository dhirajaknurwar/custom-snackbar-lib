package com.ojas.customsanckbar;

import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

public class CustomSnackBar {

    public static void showSnackBarError(View rootView, String msg, int padding) {
        Snackbar snackbar = Snackbar.make(rootView, msg, Snackbar.LENGTH_LONG);
        View sbView = snackbar.getView();
        sbView.setBackgroundColor(Color.RED);
        TextView textView = sbView.findViewById(R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_alert_circle_outline, 0, 0, 0);
        textView.setCompoundDrawablePadding(padding);
        textView.setGravity(Gravity.CENTER_VERTICAL);
        snackbar.show();
    }

    public static void showSnackBarSuccess(View rootView, Context context, String msg, int padding) {
        Snackbar snackbar = Snackbar.make(rootView, msg, Snackbar.LENGTH_LONG);
        View sbView = snackbar.getView();
        sbView.setBackgroundColor(context.getResources().getColor(R.color.color_green));
        TextView textView = sbView.findViewById(R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_check_bold, 0, 0, 0);
        textView.setCompoundDrawablePadding(padding);
        textView.setGravity(Gravity.CENTER_VERTICAL);
        snackbar.show();
    }


}
