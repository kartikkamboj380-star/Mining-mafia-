package com.bytedance.adsdk.oq.csi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class ou {
    static com.bytedance.adsdk.oq.bob.oq.dgq kq(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.oq.bob.oq.dgq.kq kqVarKq = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mm":
                    kqVarKq = com.bytedance.adsdk.oq.bob.oq.dgq.kq.kq(jsonReader.nextInt());
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.oq.bob.oq.dgq(strNextString, kqVarKq, zNextBoolean);
    }
}
