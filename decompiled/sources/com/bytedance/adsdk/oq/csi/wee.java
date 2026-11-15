package com.bytedance.adsdk.oq.csi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class wee {
    static com.bytedance.adsdk.oq.bob.oq.gm kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.oq.bob.oq.gm.kq kqVarKq = null;
        com.bytedance.adsdk.oq.bob.kq.oq oqVarKq = null;
        com.bytedance.adsdk.oq.bob.kq.oq oqVarKq2 = null;
        com.bytedance.adsdk.oq.bob.kq.oq oqVarKq3 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    oqVarKq2 = fou.kq(jsonReader, rjoVar, false);
                    break;
                case "m":
                    kqVarKq = com.bytedance.adsdk.oq.bob.oq.gm.kq.kq(jsonReader.nextInt());
                    break;
                case "o":
                    oqVarKq3 = fou.kq(jsonReader, rjoVar, false);
                    break;
                case "s":
                    oqVarKq = fou.kq(jsonReader, rjoVar, false);
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
        return new com.bytedance.adsdk.oq.bob.oq.gm(strNextString, kqVarKq, oqVarKq, oqVarKq2, oqVarKq3, zNextBoolean);
    }
}
