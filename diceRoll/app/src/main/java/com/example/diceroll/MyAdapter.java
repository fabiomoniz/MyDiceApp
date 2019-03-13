package com.example.diceroll;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<String> {

    ArrayList<ArrayList<String>> numbers;
    int [] dices;
    Context mContext;

    public MyAdapter(Context context, ArrayList<ArrayList<String>> rollNumbers, int[] die) {
        super(context, R.layout.listview_item);
        this.numbers = rollNumbers;
        this.dices = die;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return numbers.size();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();
        if(convertView == null) {
            LayoutInflater mInflator = (LayoutInflater) mContext.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflator.inflate(R.layout.listview_item, parent, false);
            mViewHolder.mDice = (ImageView) convertView.findViewById(R.id.imageView);
            mViewHolder.mName = (TextView) convertView.findViewById(R.id.textView2);
            convertView.setTag(mViewHolder);
        }else{
            mViewHolder = (ViewHolder) convertView.getTag();
        }
        if(numbers.get(position).size() > 1){
            mViewHolder.mDice.setImageResource(R.drawable.click);
            mViewHolder.mName.setText("You rolled a group of " + numbers.get(position).size() + " dice");
        }else {
            mViewHolder.mDice.setImageResource(dices[position]);
            mViewHolder.mName.setText("You rolled a " + numbers.get(position).get(0) + "                        ");
        }
        return convertView;
    }

    static class ViewHolder{
        ImageView mDice;
        TextView mName;
    }
}
