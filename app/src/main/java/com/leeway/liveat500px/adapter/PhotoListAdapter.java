package com.leeway.liveat500px.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.leeway.liveat500px.view.PhotoListItem;

/**
 * Created by Lee Lorz on 1/14/2017.
 */

public class PhotoListAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return 10000;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        PhotoListItem item;
        if (view != null) {
            item = (PhotoListItem) view;
        } else {
            item = new PhotoListItem(viewGroup.getContext());
        }
        return item;
    }
}