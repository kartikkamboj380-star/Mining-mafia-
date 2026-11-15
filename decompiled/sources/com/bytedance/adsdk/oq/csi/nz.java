package com.bytedance.adsdk.oq.csi;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
class nz {
    static com.bytedance.adsdk.oq.bob.oq.nze kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) throws IOException {
        com.bytedance.adsdk.oq.bob.kq.fou fouVar = null;
        String strNextString = null;
        com.bytedance.adsdk.oq.bob.kq.kq kqVarRjo = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        int iNextInt = 1;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "fillEnabled":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "c":
                    kqVarRjo = fou.rjo(jsonReader, rjoVar);
                    break;
                case "o":
                    fouVar = fou.oq(jsonReader, rjoVar);
                    break;
                case "r":
                    iNextInt = jsonReader.nextInt();
                    break;
                case "hd":
                    zNextBoolean2 = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (fouVar == null) {
            fouVar = new com.bytedance.adsdk.oq.bob.kq.fou(Collections.singletonList(new com.bytedance.adsdk.oq.rjo.kq(100)));
        }
        return new com.bytedance.adsdk.oq.bob.oq.nze(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, kqVarRjo, fouVar, zNextBoolean2);
    }
}
