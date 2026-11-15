package com.bytedance.adsdk.oq.csi;

import android.util.JsonReader;

/* JADX INFO: loaded from: classes.dex */
public class vvw implements tvh<Float> {
    public static final vvw kq = new vvw();

    private vvw() {
    }

    @Override // com.bytedance.adsdk.oq.csi.tvh
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public Float oq(JsonReader jsonReader, float f10) {
        return Float.valueOf(gm.oq(jsonReader) * f10);
    }
}
