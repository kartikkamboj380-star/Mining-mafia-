package com.bytedance.adsdk.oq.csi;

import android.util.JsonReader;

/* JADX INFO: loaded from: classes.dex */
class syt {
    static com.bytedance.adsdk.oq.bob.oq.bob kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar) {
        com.bytedance.adsdk.oq.bob.oq.bob bobVarKq;
        String strNextString;
        jsonReader.beginObject();
        byte b10 = 2;
        int iNextInt = 2;
        while (true) {
            bobVarKq = null;
            if (!jsonReader.hasNext()) {
                strNextString = null;
                break;
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("d")) {
                if (strNextName.equals("ty")) {
                    strNextString = jsonReader.nextString();
                    break;
                }
                jsonReader.skipValue();
            } else {
                iNextInt = jsonReader.nextInt();
            }
        }
        if (strNextString == null) {
            return null;
        }
        switch (strNextString.hashCode()) {
            case 3239:
                b10 = !strNextString.equals("el") ? (byte) -1 : (byte) 0;
                break;
            case 3270:
                b10 = !strNextString.equals("fl") ? (byte) -1 : (byte) 1;
                break;
            case 3295:
                if (!strNextString.equals("gf")) {
                    b10 = -1;
                }
                break;
            case 3307:
                b10 = !strNextString.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case 3308:
                b10 = !strNextString.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case 3488:
                b10 = !strNextString.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case 3633:
                b10 = !strNextString.equals("rc") ? (byte) -1 : (byte) 6;
                break;
            case 3634:
                b10 = !strNextString.equals("rd") ? (byte) -1 : (byte) 7;
                break;
            case 3646:
                b10 = !strNextString.equals("rp") ? (byte) -1 : (byte) 8;
                break;
            case 3669:
                b10 = !strNextString.equals("sh") ? (byte) -1 : (byte) 9;
                break;
            case 3679:
                b10 = !strNextString.equals("sr") ? (byte) -1 : (byte) 10;
                break;
            case 3681:
                b10 = !strNextString.equals("st") ? (byte) -1 : (byte) 11;
                break;
            case 3705:
                b10 = !strNextString.equals("tm") ? (byte) -1 : (byte) 12;
                break;
            case 3710:
                b10 = !strNextString.equals("tr") ? (byte) -1 : (byte) 13;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                bobVarKq = rhi.kq(jsonReader, rjoVar, iNextInt);
                break;
            case 1:
                bobVarKq = nz.kq(jsonReader, rjoVar);
                break;
            case 2:
                bobVarKq = mxq.kq(jsonReader, rjoVar);
                break;
            case 3:
                bobVarKq = yyl.kq(jsonReader, rjoVar);
                break;
            case 4:
                bobVarKq = sns.kq(jsonReader, rjoVar);
                break;
            case 5:
                bobVarKq = ou.kq(jsonReader);
                rjoVar.kq("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                bobVarKq = fgm.kq(jsonReader, rjoVar);
                break;
            case 7:
                bobVarKq = ktb.kq(jsonReader, rjoVar);
                break;
            case 8:
                bobVarKq = zfx.kq(jsonReader, rjoVar);
                break;
            case 9:
                bobVarKq = wol.kq(jsonReader, rjoVar);
                break;
            case 10:
                bobVarKq = ha.kq(jsonReader, rjoVar, iNextInt);
                break;
            case 11:
                bobVarKq = bss.kq(jsonReader, rjoVar);
                break;
            case 12:
                bobVarKq = wee.kq(jsonReader, rjoVar);
                break;
            case 13:
                bobVarKq = bob.kq(jsonReader, rjoVar);
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return bobVarKq;
    }
}
