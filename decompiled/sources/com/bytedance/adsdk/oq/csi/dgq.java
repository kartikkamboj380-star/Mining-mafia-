package com.bytedance.adsdk.oq.csi;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class dgq implements tvh<com.bytedance.adsdk.oq.bob.oq> {
    public static final dgq kq = new dgq();

    private dgq() {
    }

    @Override // com.bytedance.adsdk.oq.csi.tvh
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.oq.bob.oq oq(JsonReader jsonReader, float f10) throws IOException {
        com.bytedance.adsdk.oq.bob.oq.kq kqVar = com.bytedance.adsdk.oq.bob.oq.kq.CENTER;
        jsonReader.beginObject();
        com.bytedance.adsdk.oq.bob.oq.kq kqVar2 = kqVar;
        String strNextString = null;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iKq = 0;
        int iKq2 = 0;
        boolean zNextBoolean = true;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "f":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "j":
                    int iNextInt2 = jsonReader.nextInt();
                    kqVar2 = com.bytedance.adsdk.oq.bob.oq.kq.CENTER;
                    if (iNextInt2 <= kqVar2.ordinal() && iNextInt2 >= 0) {
                        kqVar2 = com.bytedance.adsdk.oq.bob.oq.kq.values()[iNextInt2];
                        break;
                    } else {
                        break;
                    }
                    break;
                case "s":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "t":
                    strNextString = jsonReader.nextString();
                    break;
                case "fc":
                    iKq = gm.kq(jsonReader);
                    break;
                case "lh":
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case "ls":
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case "of":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ps":
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case "sc":
                    iKq2 = gm.kq(jsonReader);
                    break;
                case "sw":
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case "sz":
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case "tr":
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.oq.bob.oq(strNextString, strNextString2, fNextDouble, kqVar2, iNextInt, fNextDouble2, fNextDouble3, iKq, iKq2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }
}
