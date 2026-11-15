package com.bytedance.adsdk.oq.csi;

import android.util.JsonReader;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    static com.bytedance.adsdk.oq.bob.kq.rhi bob(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) {
        return new com.bytedance.adsdk.oq.bob.kq.rhi(mq.kq(jsonReader, rjoVar, com.bytedance.adsdk.oq.rhi.rhi.kq(), rs.kq, true));
    }

    static com.bytedance.adsdk.oq.bob.kq.syt csi(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) {
        return new com.bytedance.adsdk.oq.bob.kq.syt(kq(jsonReader, com.bytedance.adsdk.oq.rhi.rhi.kq(), rjoVar, xn.kq));
    }

    static com.bytedance.adsdk.oq.bob.kq.rjo fou(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) {
        return new com.bytedance.adsdk.oq.bob.kq.rjo(kq(jsonReader, rjoVar, wf.kq));
    }

    public static com.bytedance.adsdk.oq.bob.kq.oq kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) {
        return kq(jsonReader, rjoVar, true);
    }

    static com.bytedance.adsdk.oq.bob.kq.fou oq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) {
        return new com.bytedance.adsdk.oq.bob.kq.fou(kq(jsonReader, rjoVar, wcx.kq));
    }

    static com.bytedance.adsdk.oq.bob.kq.nn rhi(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) {
        return new com.bytedance.adsdk.oq.bob.kq.nn(kq(jsonReader, com.bytedance.adsdk.oq.rhi.rhi.kq(), rjoVar, dgq.kq));
    }

    static com.bytedance.adsdk.oq.bob.kq.kq rjo(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) {
        return new com.bytedance.adsdk.oq.bob.kq.kq(kq(jsonReader, rjoVar, rjo.kq));
    }

    public static com.bytedance.adsdk.oq.bob.kq.oq kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar, boolean z9) {
        return new com.bytedance.adsdk.oq.bob.kq.oq(kq(jsonReader, z9 ? com.bytedance.adsdk.oq.rhi.rhi.kq() : 1.0f, rjoVar, vvw.kq));
    }

    static com.bytedance.adsdk.oq.bob.kq.bob kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar, int i10) {
        return new com.bytedance.adsdk.oq.bob.kq.bob(kq(jsonReader, rjoVar, new nze(i10)));
    }

    private static <T> List<com.bytedance.adsdk.oq.rjo.kq<T>> kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar, tvh<T> tvhVar) {
        return mq.kq(jsonReader, rjoVar, 1.0f, tvhVar, false);
    }

    private static <T> List<com.bytedance.adsdk.oq.rjo.kq<T>> kq(JsonReader jsonReader, float f10, com.bytedance.adsdk.oq.rjo rjoVar, tvh<T> tvhVar) {
        return mq.kq(jsonReader, rjoVar, f10, tvhVar, false);
    }
}
