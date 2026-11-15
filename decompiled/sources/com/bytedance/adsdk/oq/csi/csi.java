package com.bytedance.adsdk.oq.csi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class csi {
    static com.bytedance.adsdk.oq.bob.oq.kq kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) throws IOException {
        com.bytedance.adsdk.oq.bob.oq.kq kqVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.oq.bob.oq.kq kqVarOq = oq(jsonReader, rjoVar);
                    if (kqVarOq != null) {
                        kqVar = kqVarOq;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return kqVar;
    }

    private static com.bytedance.adsdk.oq.bob.oq.kq oq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.oq.bob.oq.kq kqVar = null;
        while (true) {
            boolean z9 = false;
            while (true) {
                if (!jsonReader.hasNext()) {
                    jsonReader.endObject();
                    return kqVar;
                }
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("v")) {
                    if (z9) {
                        kqVar = new com.bytedance.adsdk.oq.bob.oq.kq(fou.kq(jsonReader, rjoVar));
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (!strNextName.equals("ty")) {
                    jsonReader.skipValue();
                } else if (jsonReader.nextInt() == 0) {
                    z9 = true;
                }
            }
        }
    }
}
