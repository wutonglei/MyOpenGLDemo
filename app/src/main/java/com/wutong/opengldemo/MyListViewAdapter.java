package com.wutong.opengldemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.wutong.opengldemo.ListViewData.fcuntionName;


/**
 * Created by HP on 2019/3/23.
 */

public class MyListViewAdapter extends BaseAdapter {
    Context context;

    public MyListViewAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return fcuntionName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LinearLayout ll = null;
        if (convertView != null) {
            ll = (LinearLayout) convertView;
        } else {
            ll=(LinearLayout) LayoutInflater.from(context).inflate(R.layout.list_item,null);
        }

        TextView tv= ll.findViewById(R.id.item_tv);
        tv.setText(fcuntionName[position]);
        return ll;
    }
}