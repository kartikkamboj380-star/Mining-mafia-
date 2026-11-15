package com.bytedance.adsdk.oq.csi;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class rhi {
    static com.bytedance.adsdk.oq.bob.oq.oq kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar, int i10) throws IOException {
        boolean z9 = i10 == 3;
        boolean zNextBoolean = false;
        String strNextString = null;
        com.bytedance.adsdk.oq.bob.kq.wki<PointF, PointF> wkiVarOq = null;
        com.bytedance.adsdk.oq.bob.kq.rhi rhiVarBob = null;
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
                case "s":
                    rhiVarBob = fou.bob(jsonReader, rjoVar);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.oq.bob.oq.oq(strNextString, wkiVarOq, rhiVarBob, z9, zNextBoolean);
    }
}
