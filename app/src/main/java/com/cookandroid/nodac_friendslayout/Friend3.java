package com.cookandroid.nodac_friendslayout;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class Friend3 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_friend3); //friend3_xml과 연결
    }

    private final OnItemClickListener mMessageClicked = new OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View v, int position,
                                long id) {
            // TODO Auto-generated method stub
            Toast.makeText(Friend3.this, "선택한 그림은 " + Long.toString(id),
                    Toast.LENGTH_LONG).show();
        }
    };

    public class ImageAdapter extends BaseAdapter {

        public ImageAdapter(Context c) {
            mContext = c;
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return mThumbIds.length;
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            ImageView imageView;
            if (convertView == null) {
                imageView = new ImageView(mContext);
                imageView.setLayoutParams(new GridView.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT));
                imageView.setAdjustViewBounds(false);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(8, 8, 8, 8);
            } else {
                imageView = (ImageView) convertView;
            }
            imageView.setImageResource(mThumbIds[position]);
            return imageView;
        }

        private final Context mContext;

        private final Integer[] mThumbIds = { R.drawable.profile,
                R.drawable.profile,R.drawable.profile, R.drawable.profile,
                R.drawable.profile,R.drawable.profile, R.drawable.profile,
                R.drawable.profile,R.drawable.profile, R.drawable.profile,
                R.drawable.profile,R.drawable.profile, R.drawable.profile,
                R.drawable.profile,R.drawable.profile, R.drawable.profile,
                R.drawable.profile,R.drawable.profile, R.drawable.profile,
                R.drawable.profile,R.drawable.profile, R.drawable.profile,
                R.drawable.profile,R.drawable.profile, R.drawable.profile,
                R.drawable.profile,R.drawable.profile, R.drawable.profile, };
    }
}
