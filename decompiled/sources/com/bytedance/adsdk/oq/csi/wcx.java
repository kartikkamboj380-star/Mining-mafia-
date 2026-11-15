package com.bytedance.adsdk.oq.csi;

import android.util.JsonReader;

/* JADX INFO: loaded from: classes.dex */
public class wcx implements tvh<Integer> {
    public static final wcx kq = new wcx();

    private wcx() {
    }

    @Override // com.bytedance.adsdk.oq.csi.tvh
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public Integer oq(JsonReader jsonReader, float f10) {
        return Integer.valueOf(Math.round(gm.oq(jsonReader) * f10));
    }
}
