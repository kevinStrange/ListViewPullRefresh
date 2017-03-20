package com.example.huanghongfa.listviewpullrefresh;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements PullToRefreshBase.OnRefreshListener2<ListView> {
    private PullToRefreshListView listview;
    private int mCurrentPage = 1;//当前页数
    private int mTotalPage = 4;//总页数
    private ListViewAdapter mListViewAdapter;
    private List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (PullToRefreshListView) findViewById(R.id.listview);
        mListViewAdapter = new ListViewAdapter(this, getListData());
        listview.setAdapter(mListViewAdapter);
        listview.setOnRefreshListener(this);
        setListViewMode();
    }

    private List<String> getListData() {
        for (int i = 0; i < 20; i++) {
            list.add("一品鲜");
        }
        return list;
    }

    /**
     * 关闭刷新或者加载更多的状态
     */
    private void reFreshCompleted(int code) {
        listview.onRefreshComplete();
    }

    @Override
    public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
        mCurrentPage--;
    }

    @Override
    public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
        mCurrentPage++;
    }

    /**
     * 设置listView的加载模式
     */
    private void setListViewMode() {
        //页数从1开始
        if ((mCurrentPage + 1) == mTotalPage) {//如果总页数相等，那么状态就设置为下拉的
            listview.setMode(PullToRefreshBase.Mode.PULL_FROM_START);
        } else {//不相等
            listview.setMode(PullToRefreshBase.Mode.BOTH);
        }
    }
}
