package com.bytedance.adsdk.oq.csi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ubx {
    private com.bytedance.adsdk.oq.bob.kq.oq bob;
    private com.bytedance.adsdk.oq.bob.kq.oq csi;
    private com.bytedance.adsdk.oq.bob.kq.oq fou;
    private com.bytedance.adsdk.oq.bob.kq.kq kq;
    private com.bytedance.adsdk.oq.bob.kq.oq oq;

    private void oq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) throws IOException {
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("v")) {
                strNextString.getClass();
                switch (strNextString) {
                    case "Distance":
                        this.fou = fou.kq(jsonReader, rjoVar);
                        break;
                    case "Opacity":
                        this.oq = fou.kq(jsonReader, rjoVar, false);
                        break;
                    case "Direction":
                        this.bob = fou.kq(jsonReader, rjoVar, false);
                        break;
                    case "Shadow Color":
                        this.kq = fou.rjo(jsonReader, rjoVar);
                        break;
                    case "Softness":
                        this.csi = fou.kq(jsonReader, rjoVar);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else if (strNextName.equals("nm")) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    nn kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) throws IOException {
        com.bytedance.adsdk.oq.bob.kq.oq oqVar;
        com.bytedance.adsdk.oq.bob.kq.oq oqVar2;
        com.bytedance.adsdk.oq.bob.kq.oq oqVar3;
        com.bytedance.adsdk.oq.bob.kq.oq oqVar4;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    oq(jsonReader, rjoVar);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        com.bytedance.adsdk.oq.bob.kq.kq kqVar = this.kq;
        if (kqVar == null || (oqVar = this.oq) == null || (oqVar2 = this.bob) == null || (oqVar3 = this.fou) == null || (oqVar4 = this.csi) == null) {
            return null;
        }
        return new nn(kqVar, oqVar, oqVar2, oqVar3, oqVar4);
    }
}
