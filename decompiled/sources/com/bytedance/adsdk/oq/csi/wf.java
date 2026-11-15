package com.bytedance.adsdk.oq.csi;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class wf implements tvh<com.bytedance.adsdk.oq.rjo.bob> {
    public static final wf kq = new wf();

    private wf() {
    }

    @Override // com.bytedance.adsdk.oq.csi.tvh
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.oq.rjo.bob oq(JsonReader jsonReader, float f10) throws IOException {
        boolean z9 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z9) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z9) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.oq.rjo.bob((fNextDouble / 100.0f) * f10, (fNextDouble2 / 100.0f) * f10);
    }
}
