package example.com.xinyuepleayer.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

import example.com.xinyuepleayer.R;

/**
 * 列表点击更多选项，这里暂时写死了，以后在加
 * Created by caobin on 2016/12/23.
 */
public class BottomListAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private List<String> mList;
    private Context mContext;

    public BottomListAdapter(Context context) {
        this.mContext = context;
        mInflater = LayoutInflater.from(context);
        mList = new ArrayList<>();
        mList.add("删除");
        mList.add("取消");
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = mInflater.inflate(R.layout.item_bottom_more_list, parent, false);
        TextView textView = (TextView) view.findViewById(R.id.tv_more_content);
        if (position == 1) {
            textView.setTextColor(ContextCompat.getColor(mContext, R.color.red));
        }
        textView.setText(mList.get(position));
        return view;
    }
}
