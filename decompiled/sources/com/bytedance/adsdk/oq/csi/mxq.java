package com.bytedance.adsdk.oq.csi;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
class mxq {
    static com.bytedance.adsdk.oq.bob.oq.csi kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) throws IOException {
        com.bytedance.adsdk.oq.bob.kq.fou fouVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strNextString = null;
        com.bytedance.adsdk.oq.bob.oq.rjo rjoVar2 = null;
        com.bytedance.adsdk.oq.bob.kq.bob bobVarKq = null;
        com.bytedance.adsdk.oq.bob.kq.rhi rhiVarBob = null;
        com.bytedance.adsdk.oq.bob.kq.rhi rhiVarBob2 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            int iNextInt = -1;
            switch (strNextName) {
                case "e":
                    rhiVarBob2 = fou.bob(jsonReader, rjoVar);
                    break;
                case "g":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("k")) {
                            bobVarKq = fou.kq(jsonReader, rjoVar, iNextInt);
                        } else if (strNextName2.equals("p")) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "o":
                    fouVar = fou.oq(jsonReader, rjoVar);
                    break;
                case "r":
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case "s":
                    rhiVarBob = fou.bob(jsonReader, rjoVar);
                    break;
                case "t":
                    rjoVar2 = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.oq.bob.oq.rjo.LINEAR : com.bytedance.adsdk.oq.bob.oq.rjo.RADIAL;
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
        if (fouVar == null) {
            fouVar = new com.bytedance.adsdk.oq.bob.kq.fou(Collections.singletonList(new com.bytedance.adsdk.oq.rjo.kq(100)));
        }
        return new com.bytedance.adsdk.oq.bob.oq.csi(strNextString, rjoVar2, fillType, bobVarKq, fouVar, rhiVarBob, rhiVarBob2, null, null, zNextBoolean);
    }
}
