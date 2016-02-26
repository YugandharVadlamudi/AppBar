package com.example.kiran.appbar;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Kiran on 11-02-2016.
 */
public class MyAdapterRecycleView extends RecyclerView.Adapter<MyAdapterRecycleView.Holder> {
    String[] icon_names;
    int[] icons;

    public MyAdapterRecycleView(String[] icon_names, int[] icons) {
        this.icon_names = icon_names;
        this.icons = icons;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.drawmenustuff, parent);
        return (new Holder(v));
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.tvIcon.setText(icon_names[position]);
        holder.ivIcon.setImageResource(icons[position]);
    }

    @Override
    public int getItemCount() {
        return icon_names.length;
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView tvIcon;
        ImageView ivIcon;

        public Holder(View itemView) {
            super(itemView);
            tvIcon = (TextView) itemView.findViewById(R.id.tv_menu);
            ivIcon = (ImageView) itemView.findViewById(R.id.iv_menu);
        }
    }
}
