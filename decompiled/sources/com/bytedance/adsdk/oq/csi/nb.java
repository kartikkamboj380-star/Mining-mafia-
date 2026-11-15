package com.bytedance.adsdk.oq.csi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class nb {
    static com.bytedance.adsdk.oq.bob.oq.syt kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.oq.bob.oq.syt.kq kqVar = null;
        com.bytedance.adsdk.oq.bob.kq.syt sytVarCsi = null;
        com.bytedance.adsdk.oq.bob.kq.fou fouVarOq = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "o":
                    fouVarOq = fou.oq(jsonReader, rjoVar);
                    break;
                case "pt":
                    sytVarCsi = fou.csi(jsonReader, rjoVar);
                    break;
                case "inv":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mode":
                    String strNextString = jsonReader.nextString();
                    strNextString.getClass();
                    switch (strNextString) {
                        case "a":
                            kqVar = com.bytedance.adsdk.oq.bob.oq.syt.kq.MASK_MODE_ADD;
                            break;
                        case "i":
                            rjoVar.kq("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            kqVar = com.bytedance.adsdk.oq.bob.oq.syt.kq.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            kqVar = com.bytedance.adsdk.oq.bob.oq.syt.kq.MASK_MODE_NONE;
                            break;
                        case "s":
                            kqVar = com.bytedance.adsdk.oq.bob.oq.syt.kq.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            kqVar = com.bytedance.adsdk.oq.bob.oq.syt.kq.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.oq.bob.oq.syt(kqVar, sytVarCsi, fouVarOq, zNextBoolean);
    }
}
