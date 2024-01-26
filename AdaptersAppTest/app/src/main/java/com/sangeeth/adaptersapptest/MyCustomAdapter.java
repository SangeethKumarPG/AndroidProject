package com.sangeeth.adaptersapptest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyCustomAdapter extends BaseAdapter {
    private Context context;
    private String[] items;

    public MyCustomAdapter(Context context, String[] items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null){
            //convertView is a recycled view which you can use to
            //improve the performance of your list (if it is a new view use this)
            convertView = LayoutInflater.from(context).inflate(
                    R.layout.my_list_layout, parent,false
            );
            holder = new ViewHolder();
            holder.textView = convertView.findViewById(R.id.text1);
            convertView.setTag(holder);
        }else{
            // Reusing the view that is recycled. This can be helped to reducing the
            // number of times we inflate the view
            holder = (ViewHolder) convertView.getTag();
        }
        //Setting the text
        holder.textView.setText(items[position]);
        //Binding the data to the views
        return convertView;
    }

    static class ViewHolder{
        //Holds reference to the views within an item layout
        TextView textView;

    }
}
