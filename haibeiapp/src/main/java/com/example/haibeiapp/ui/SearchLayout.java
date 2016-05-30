package com.example.haibeiapp.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/5/23 0023.
 */
public class SearchLayout extends ViewGroup {
    public SearchLayout(Context context) {
        this(context,null);
    }

    public SearchLayout(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SearchLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //测量每一个子控件的大小
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            //测量子控件大小
            view.measure(MeasureSpec.UNSPECIFIED,MeasureSpec.UNSPECIFIED);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int childCount = getChildCount();
        int totalWidth = 0;
        int higerHeight = 0;
        int row = 0;
        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            view.setTag(i);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            higerHeight = higerHeight<measuredHeight?measuredHeight:higerHeight;
            int left = 10;
            int right= left+measuredWidth;
            totalWidth += right;
            if (totalWidth>=r){
                row++;
                totalWidth = measuredWidth+10;
            }
            int top = 10+row*(higerHeight+10);
            int bottom = top +measuredHeight;
            view.layout(totalWidth-measuredWidth,top,totalWidth,bottom);
        }
    }
}
