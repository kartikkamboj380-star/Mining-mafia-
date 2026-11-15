package com.bytedance.adsdk.ugeno.csi;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
interface kq {
    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<bob> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    int kq(int i10, int i11, int i12);

    int kq(View view);

    int kq(View view, int i10, int i11);

    View kq(int i10);

    void kq(View view, int i10, int i11, bob bobVar);

    void kq(bob bobVar);

    boolean kq();

    int oq(int i10, int i11, int i12);

    View oq(int i10);

    void setFlexLines(List<bob> list);
}
