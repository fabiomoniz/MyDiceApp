package com.example.diceroll;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<String> {

    String [] numbers;
    int [] dices;
    Context mContext;

    public MyAdapter(Context context, String[] rollNumbers, int[] die) {
        super(context, R.layout.listview_item);
        this.numbers = rollNumbers;
        this.dices = die;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return numbers.length;
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
        if(numbers[position].length() > 1){
            mViewHolder.mDice.setImageResource(R.drawable.click);
            mViewHolder.mName.setText("You rolled a group of " + numbers[position].length() + " die");
        }else {
            mViewHolder.mDice.setImageResource(dices[position]);
            mViewHolder.mName.setText("You rolled a " + numbers[position]);
        }
        return convertView;
    }

    static class ViewHolder{
        ImageView mDice;
        TextView mName;
    }
}
