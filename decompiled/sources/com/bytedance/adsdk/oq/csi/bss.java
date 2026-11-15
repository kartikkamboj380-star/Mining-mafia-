package com.bytedance.adsdk.oq.csi;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
class bss {
    static com.bytedance.adsdk.oq.bob.oq.wcx kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) throws IOException {
        int i10;
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        com.bytedance.adsdk.oq.bob.kq.fou fouVar = null;
        String strNextString = null;
        com.bytedance.adsdk.oq.bob.kq.oq oqVar = null;
        com.bytedance.adsdk.oq.bob.kq.kq kqVarRjo = null;
        com.bytedance.adsdk.oq.bob.kq.oq oqVarKq = null;
        com.bytedance.adsdk.oq.bob.oq.wcx.kq kqVar = null;
        com.bytedance.adsdk.oq.bob.oq.wcx.oq oqVar2 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            int i11 = 1;
            switch (strNextName) {
                case "c":
                    kqVarRjo = fou.rjo(jsonReader, rjoVar);
                    continue;
                    break;
                case "d":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String strNextString2 = null;
                        com.bytedance.adsdk.oq.bob.kq.oq oqVarKq2 = null;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            if (strNextName2.equals("n")) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                oqVarKq2 = fou.kq(jsonReader, rjoVar);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        strNextString2.getClass();
                        switch (strNextString2) {
                            case "d":
                            case "g":
                                i10 = 1;
                                rjoVar.kq(true);
                                arrayList.add(oqVarKq2);
                                i11 = i10;
                                break;
                            case "o":
                                oqVar = oqVarKq2;
                                i11 = 1;
                                break;
                            default:
                                i10 = 1;
                                i11 = i10;
                                break;
                        }
                    }
                    int i12 = i11;
                    jsonReader.endArray();
                    if (arrayList.size() != i12) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                    }
                    break;
                case "o":
                    fouVar = fou.oq(jsonReader, rjoVar);
                    continue;
                    break;
                case "w":
                    oqVarKq = fou.kq(jsonReader, rjoVar);
                    continue;
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    continue;
                    break;
                case "lc":
                    kqVar = com.bytedance.adsdk.oq.bob.oq.wcx.kq.values()[jsonReader.nextInt() - 1];
                    continue;
                    break;
                case "lj":
                    oqVar2 = com.bytedance.adsdk.oq.bob.oq.wcx.oq.values()[jsonReader.nextInt() - 1];
                    continue;
                    break;
                case "ml":
                    fNextDouble = (float) jsonReader.nextDouble();
                    continue;
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    continue;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (fouVar == null) {
            fouVar = new com.bytedance.adsdk.oq.bob.kq.fou(Collections.singletonList(new com.bytedance.adsdk.oq.rjo.kq(100)));
        }
        return new com.bytedance.adsdk.oq.bob.oq.wcx(strNextString, oqVar, arrayList, kqVarRjo, fouVar, oqVarKq, kqVar, oqVar2, fNextDouble, zNextBoolean);
    }
}
