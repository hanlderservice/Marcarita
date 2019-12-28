package com.yang.moyu.marcarita.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.yang.moyu.marcarita.R;

import java.util.List;

/**
 * Description : 照片选择
 * Created by 10296 on 2019/12/12
 */
public class PictureSelectAdapter extends BaseAdapter {

    private Context context;
    private List datas;

    public PictureSelectAdapter(Context context, List list) {
        this.context = context;
        this.datas = list;
    }

    @Override
    public int getCount() {
        return datas.size() + 1;

    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_picture_select_item, null);
            viewHolder.ic_img_pic = (ImageView) convertView.findViewById(R.id.ic_img_pic);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        if (position < datas.size()) {
            BitmapFactory.Options opts = new BitmapFactory.Options();
            opts.inSampleSize = 2;
            Bitmap iconBm = BitmapFactory.decodeFile(datas.get(position).toString(), opts);

            viewHolder.ic_img_pic.setScaleType(ImageView.ScaleType.CENTER_CROP);
            viewHolder.ic_img_pic.setPadding(5, 5, 5, 5);

            viewHolder.ic_img_pic.setImageBitmap(iconBm);
            viewHolder.ic_img_pic.setBackgroundResource(0);
        } else {

            viewHolder.ic_img_pic.setImageBitmap(null);
            viewHolder.ic_img_pic.setBackgroundResource(R.mipmap.take_photo_ico);

        }

        return convertView;
    }


    private class ViewHolder {
        private ImageView ic_img_pic;

    }

}
