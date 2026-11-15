package com.bytedance.adsdk.oq.csi;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class rjo implements tvh<Integer> {
    public static final rjo kq = new rjo();

    private rjo() {
    }

    @Override // com.bytedance.adsdk.oq.csi.tvh
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public Integer oq(JsonReader jsonReader, float f10) throws IOException {
        boolean z9 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z9) {
            jsonReader.beginArray();
        }
        double dNextDouble = jsonReader.nextDouble();
        double dNextDouble2 = jsonReader.nextDouble();
        double dNextDouble3 = jsonReader.nextDouble();
        double dNextDouble4 = jsonReader.peek() == JsonToken.NUMBER ? jsonReader.nextDouble() : 1.0d;
        if (z9) {
            jsonReader.endArray();
        }
        if (dNextDouble <= 1.0d && dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d) {
            dNextDouble *= 255.0d;
            dNextDouble2 *= 255.0d;
            dNextDouble3 *= 255.0d;
            if (dNextDouble4 <= 1.0d) {
                dNextDouble4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dNextDouble4, (int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3));
    }
}
