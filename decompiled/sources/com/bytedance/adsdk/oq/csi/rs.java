package com.bytedance.adsdk.oq.csi;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class rs implements tvh<PointF> {
    public static final rs kq = new rs();

    private rs() {
    }

    @Override // com.bytedance.adsdk.oq.csi.tvh
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public PointF oq(JsonReader jsonReader, float f10) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
            return gm.oq(jsonReader, f10);
        }
        if (jsonTokenPeek == JsonToken.BEGIN_OBJECT) {
            return gm.oq(jsonReader, f10);
        }
        if (jsonTokenPeek != JsonToken.NUMBER) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(jsonTokenPeek)));
        }
        PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return pointF;
    }
}
