package com.bytedance.adsdk.oq.csi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ktb {
    static com.bytedance.adsdk.oq.bob.oq.wki kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.oq.bob.kq.oq oqVarKq = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "r":
                    oqVarKq = fou.kq(jsonReader, rjoVar, true);
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
        if (zNextBoolean) {
            return null;
        }
        return new com.bytedance.adsdk.oq.bob.oq.wki(strNextString, oqVarKq);
    }
}
