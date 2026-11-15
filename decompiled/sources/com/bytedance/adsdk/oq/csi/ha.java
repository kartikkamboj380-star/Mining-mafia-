package com.bytedance.adsdk.oq.csi;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class ha {
    static com.bytedance.adsdk.oq.bob.oq.nn kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar, int i10) throws IOException {
        boolean zNextBoolean = false;
        boolean z9 = i10 == 3;
        String strNextString = null;
        com.bytedance.adsdk.oq.bob.oq.nn.kq kqVarKq = null;
        com.bytedance.adsdk.oq.bob.kq.oq oqVarKq = null;
        com.bytedance.adsdk.oq.bob.kq.wki<PointF, PointF> wkiVarOq = null;
        com.bytedance.adsdk.oq.bob.kq.oq oqVarKq2 = null;
        com.bytedance.adsdk.oq.bob.kq.oq oqVarKq3 = null;
        com.bytedance.adsdk.oq.bob.kq.oq oqVarKq4 = null;
        com.bytedance.adsdk.oq.bob.kq.oq oqVarKq5 = null;
        com.bytedance.adsdk.oq.bob.kq.oq oqVarKq6 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z9 = false;
                        break;
                    } else {
                        z9 = true;
                        break;
                    }
                    break;
                case "p":
                    wkiVarOq = kq.oq(jsonReader, rjoVar);
                    break;
                case "r":
                    oqVarKq2 = fou.kq(jsonReader, rjoVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ir":
                    oqVarKq3 = fou.kq(jsonReader, rjoVar);
                    break;
                case "is":
                    oqVarKq5 = fou.kq(jsonReader, rjoVar, false);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "or":
                    oqVarKq4 = fou.kq(jsonReader, rjoVar);
                    break;
                case "os":
                    oqVarKq6 = fou.kq(jsonReader, rjoVar, false);
                    break;
                case "pt":
                    oqVarKq = fou.kq(jsonReader, rjoVar, false);
                    break;
                case "sy":
                    kqVarKq = com.bytedance.adsdk.oq.bob.oq.nn.kq.kq(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.oq.bob.oq.nn(strNextString, kqVarKq, oqVarKq, wkiVarOq, oqVarKq2, oqVarKq3, oqVarKq4, oqVarKq5, oqVarKq6, zNextBoolean, z9);
    }
}
