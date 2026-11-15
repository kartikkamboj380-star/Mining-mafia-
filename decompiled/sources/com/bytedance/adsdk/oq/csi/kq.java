package com.bytedance.adsdk.oq.csi;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    public static com.bytedance.adsdk.oq.bob.kq.csi kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(ebt.kq(jsonReader, rjoVar));
            }
            jsonReader.endArray();
            mq.kq(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.oq.rjo.kq(gm.oq(jsonReader, com.bytedance.adsdk.oq.rhi.rhi.kq())));
        }
        return new com.bytedance.adsdk.oq.bob.kq.csi(arrayList);
    }

    static com.bytedance.adsdk.oq.bob.kq.wki<PointF, PointF> oq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) {
        jsonReader.beginObject();
        com.bytedance.adsdk.oq.bob.kq.csi csiVarKq = null;
        com.bytedance.adsdk.oq.bob.kq.oq oqVarKq = null;
        com.bytedance.adsdk.oq.bob.kq.oq oqVarKq2 = null;
        boolean z9 = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "k":
                    csiVarKq = kq(jsonReader, rjoVar);
                    break;
                case "x":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        oqVarKq = fou.kq(jsonReader, rjoVar);
                        break;
                    } else {
                        z9 = true;
                        jsonReader.skipValue();
                        break;
                    }
                    break;
                case "y":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        oqVarKq2 = fou.kq(jsonReader, rjoVar);
                        break;
                    } else {
                        z9 = true;
                        jsonReader.skipValue();
                        break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z9) {
            rjoVar.kq("Lottie doesn't support expressions.");
        }
        return csiVarKq != null ? csiVarKq : new com.bytedance.adsdk.oq.bob.kq.dgq(oqVarKq, oqVarKq2);
    }
}
