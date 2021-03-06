package com.aserbao.aserbaosandroid.ui.recyclerView.scale_smooth_slide.scale_smooth_slide_one_method.library;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * 功能:
 * author aserbao
 * date : On 2018/12/25
 * email: 1142803753@qq.com
 */
public class CardLinearSnapHelper extends LinearSnapHelper{
    public boolean mNoNeedToScroll = false;

    @Override
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View targetView) {
        if (mNoNeedToScroll) {
            return new int[]{0, 0};
        } else {
            return super.calculateDistanceToFinalSnap(layoutManager, targetView);
        }
    }

}
