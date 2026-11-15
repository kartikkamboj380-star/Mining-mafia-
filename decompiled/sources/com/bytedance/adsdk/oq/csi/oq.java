package com.bytedance.adsdk.oq.csi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    public static com.bytedance.adsdk.oq.bob.kq.ubx kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.oq.bob.kq.ubx ubxVarOq = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("a")) {
                ubxVarOq = oq(jsonReader, rjoVar);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return ubxVarOq == null ? new com.bytedance.adsdk.oq.bob.kq.ubx(null, null, null, null) : ubxVarOq;
    }

    private static com.bytedance.adsdk.oq.bob.kq.ubx oq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.oq.bob.kq.kq kqVarRjo = null;
        com.bytedance.adsdk.oq.bob.kq.kq kqVarRjo2 = null;
        com.bytedance.adsdk.oq.bob.kq.oq oqVarKq = null;
        com.bytedance.adsdk.oq.bob.kq.oq oqVarKq2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "t":
                    oqVarKq2 = fou.kq(jsonReader, rjoVar);
                    break;
                case "fc":
                    kqVarRjo = fou.rjo(jsonReader, rjoVar);
                    break;
                case "sc":
                    kqVarRjo2 = fou.rjo(jsonReader, rjoVar);
                    break;
                case "sw":
                    oqVarKq = fou.kq(jsonReader, rjoVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.oq.bob.kq.ubx(kqVarRjo, kqVarRjo2, oqVarKq, oqVarKq2);
    }
}
