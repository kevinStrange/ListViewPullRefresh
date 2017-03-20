package com.example.huanghongfa.listviewpullrefresh;

import android.util.Log;

/**
 * Created by huanghongfa on 2017/3/20.
 */

public class Utils {
    static final String LOG_TAG = "PullToRefresh";

    public static void warnDeprecation(String depreacted, String replacement) {
        Log.w(LOG_TAG, "You're using the deprecated " + depreacted + " attr, please switch over to " + replacement);
    }
}
