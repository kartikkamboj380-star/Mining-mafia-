package com.bytedance.adsdk.oq.csi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class wol {
    static com.bytedance.adsdk.oq.bob.oq.sns kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.oq.bob.kq.syt sytVarCsi = null;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ks":
                    sytVarCsi = fou.csi(jsonReader, rjoVar);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "ind":
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.oq.bob.oq.sns(strNextString, iNextInt, sytVarCsi, zNextBoolean);
    }
}
