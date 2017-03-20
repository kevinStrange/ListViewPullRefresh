package com.example.huanghongfa.listviewpullrefresh;

import android.view.View;

/**
 * Created by huanghongfa on 2017/3/20.
 */

public interface EmptyViewMethodAccessor {
    /**
     * Calls upto AdapterView.setEmptyView()
     *
     * @param emptyView - to set as Empty View
     */
    public void setEmptyViewInternal(View emptyView);

    /**
     * Should call PullToRefreshBase.setEmptyView() which will then
     * automatically call through to setEmptyViewInternal()
     *
     * @param emptyView - to set as Empty View
     */
    public void setEmptyView(View emptyView);

}
