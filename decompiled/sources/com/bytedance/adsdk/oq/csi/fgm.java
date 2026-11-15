package com.bytedance.adsdk.oq.csi;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class fgm {
    static com.bytedance.adsdk.oq.bob.oq.ubx kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.oq.bob.kq.wki<PointF, PointF> wkiVarOq = null;
        com.bytedance.adsdk.oq.bob.kq.rhi rhiVarBob = null;
        com.bytedance.adsdk.oq.bob.kq.oq oqVarKq = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "p":
                    wkiVarOq = kq.oq(jsonReader, rjoVar);
                    break;
                case "r":
                    oqVarKq = fou.kq(jsonReader, rjoVar);
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
        return new com.bytedance.adsdk.oq.bob.oq.ubx(strNextString, wkiVarOq, rhiVarBob, oqVarKq, zNextBoolean);
    }
}
