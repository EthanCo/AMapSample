package com.heiko.amaptest.clusterv2;

import android.graphics.drawable.Drawable;

/**
 * Created by yiyi.qi on 16/10/10.
 */

public interface ClusterRenderV2 {
    /**
     * 根据聚合点的元素数目返回渲染背景样式
     *
     * @param clusterNum
     * @return
     */
     Drawable getDrawAble(int clusterNum);
}
