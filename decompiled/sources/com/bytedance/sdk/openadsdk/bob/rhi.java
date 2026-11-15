package com.bytedance.sdk.openadsdk.bob;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.bss;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends ScrollView {
    private final nn kq;
    private final com.bytedance.sdk.openadsdk.core.rhi.csi oq;

    public rhi(Context context, nn nnVar) {
        super(context);
        this.kq = nnVar;
        com.bytedance.sdk.openadsdk.core.rhi.csi csiVar = new com.bytedance.sdk.openadsdk.core.rhi.csi(context);
        this.oq = csiVar;
        csiVar.setOrientation(1);
        addView(csiVar, new FrameLayout.LayoutParams(-1, -2));
        if (nnVar.syt() == 0) {
            kq();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setVerticalScrollBarEnabled(false);
    }

    private static List<FilterWord> bob(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i10 = 0;
        int i11 = -1;
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (list.get(i12).hasSecondOptions()) {
                i11 = i12;
            }
        }
        if (i11 != -1 && i11 <= list.size()) {
            i10 = i11;
        }
        FilterWord filterWord = list.get(i10);
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            FilterWord next = it.next();
            if (!next.hasSecondOptions()) {
                filterWord.addOption(next);
                it.remove();
            }
        }
        return list;
    }

    private void kq() {
        if (this.kq.syt() != 0) {
            return;
        }
        this.kq.kq(bss.bob(getContext()), bss.csi(getContext()));
    }

    private void oq(List<FilterWord> list) {
        this.oq.removeAllViews();
        for (int i10 = 0; i10 < list.size(); i10++) {
            FilterWord filterWord = list.get(i10);
            if (filterWord != null) {
                this.oq.addView(new rjo(getContext(), filterWord, this.kq));
            }
            if (i10 < list.size() - 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int iOq = bss.oq(getContext(), this.kq.dgq() ? 16.0f : 8.0f);
                layoutParams.topMargin = iOq;
                layoutParams.bottomMargin = iOq;
                this.oq.addView(new ubx(getContext()), layoutParams);
            }
        }
    }

    public void kq(List<FilterWord> list) {
        List<FilterWord> listBob = bob(list);
        if (listBob == null) {
            return;
        }
        oq(listBob);
    }
}
