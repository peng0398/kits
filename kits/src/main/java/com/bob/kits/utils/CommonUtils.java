package com.bob.kits.utils;

import android.content.Context;
import android.support.annotation.StringRes;
import android.widget.Toast;

/**
 * Author: baobo.peng
 * Date:   2017/10/23.
 */

public class CommonUtils {

    public static void showToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public static void showToast(Context context, @StringRes int id) {
        Toast.makeText(context, context.getResources().getText(id), Toast.LENGTH_SHORT).show();
    }
}
