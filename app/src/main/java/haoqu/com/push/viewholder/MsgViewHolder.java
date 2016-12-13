package haoqu.com.push.viewholder;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import haoqu.com.push.R;
import haoqu.com.push.listener.MsgItemClickListener;

import static android.content.ContentValues.TAG;

/**
 * 消息列表的viewholder
 * Created by apple on 16/12/13.
 */

public class MsgViewHolder extends ViewHolder implements View.OnClickListener {


    private final ImageView mHeadIcon;
    private final TextView mTitle;
    private final TextView mContentTime;
    private final ImageView mPoint;
    private final TextView mText;
    private final RelativeLayout mContent;
    private final Button mMarkedAsRead;
    private final Button mDeleteMsg;
    private final LinearLayout mSwipeView;

    private MsgItemClickListener mMsgItemClickListener;

    public MsgViewHolder(View itemView,MsgItemClickListener msgItemClickListener) {
        super(itemView);
        mHeadIcon = (ImageView) itemView.findViewById(R.id.headIcon);
        mTitle = (TextView) itemView.findViewById(R.id.title);
        mContentTime = (TextView) itemView.findViewById(R.id.Content_time);
        mPoint = (ImageView) itemView.findViewById(R.id.point);
        mText = (TextView) itemView.findViewById(R.id.text);
        mContent = (RelativeLayout) itemView.findViewById(R.id.Content);
        mMarkedAsRead = (Button) itemView.findViewById(R.id.markedAsRead);
        mDeleteMsg = (Button) itemView.findViewById(R.id.deleteMsg);
        mSwipeView = (LinearLayout) itemView.findViewById(R.id.swipeView);

        this.mMsgItemClickListener = msgItemClickListener;
        itemView.setOnClickListener(this);

        mMarkedAsRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: "+v.getId());
            }
        });

    }

    public RelativeLayout getmContent() {
        return mContent;
    }

    public TextView getmContentTime() {
        return mContentTime;
    }

    public Button getmDeleteMsg() {
        return mDeleteMsg;
    }

    public ImageView getmHeadIcon() {
        return mHeadIcon;
    }

    public Button getmMarkedAsRead() {
        return mMarkedAsRead;
    }

    public ImageView getmPoint() {
        return mPoint;
    }

    public LinearLayout getmSwipeView() {
        return mSwipeView;
    }

    public TextView getmText() {
        return mText;
    }

    public TextView getmTitle() {
        return mTitle;
    }








    @Override
    public void onClick(View v) {
        if(null != mMsgItemClickListener){
            mMsgItemClickListener.onItemClick(v,getPosition());
        }
    }



}
