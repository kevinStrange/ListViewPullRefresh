package com.example.huanghongfa.listviewpullrefresh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by huanghongfa on 2017/3/20.
 */

public class ListViewAdapter extends BaseAdapter {

    private List<String> stringList;
    private LayoutInflater mInflater = null;

    ListViewAdapter(Context context, List<String> list) {
        this.mInflater = LayoutInflater.from(context);
        stringList = list;
    }

    @Override
    public int getCount() {
        return stringList == null ? 0 : stringList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(R.layout.activity_main_adapter, null);
        return convertView;
    }
}
