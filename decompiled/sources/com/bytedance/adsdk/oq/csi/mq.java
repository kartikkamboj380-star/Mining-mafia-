package com.bytedance.adsdk.oq.csi;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class mq {
    static <T> List<com.bytedance.adsdk.oq.rjo.kq<T>> kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar, float f10, tvh<T> tvhVar, boolean z9) throws IOException {
        JsonReader jsonReader2;
        com.bytedance.adsdk.oq.rjo rjoVar2;
        float f11;
        tvh<T> tvhVar2;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            rjoVar.kq("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("k")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    com.bytedance.adsdk.oq.rjo rjoVar3 = rjoVar;
                    float f12 = f10;
                    tvh<T> tvhVar3 = tvhVar;
                    boolean z11 = z9;
                    com.bytedance.adsdk.oq.rjo.kq kqVarKq = fax.kq(jsonReader3, rjoVar3, f12, tvhVar3, false, z11);
                    jsonReader2 = jsonReader3;
                    rjoVar2 = rjoVar3;
                    f11 = f12;
                    tvhVar2 = tvhVar3;
                    z10 = z11;
                    arrayList.add(kqVarKq);
                } else {
                    jsonReader2 = jsonReader;
                    rjoVar2 = rjoVar;
                    f11 = f10;
                    tvhVar2 = tvhVar;
                    z10 = z9;
                    while (jsonReader2.hasNext()) {
                        arrayList.add(fax.kq(jsonReader2, rjoVar2, f11, tvhVar2, true, z10));
                    }
                }
                jsonReader2.endArray();
                jsonReader = jsonReader2;
                rjoVar = rjoVar2;
                f10 = f11;
                tvhVar = tvhVar2;
                z9 = z10;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(fax.kq(jsonReader4, rjoVar, f10, tvhVar, false, z9));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.endObject();
        kq(arrayList);
        return arrayList;
    }

    public static <T> void kq(List<? extends com.bytedance.adsdk.oq.rjo.kq<T>> list) {
        int i10;
        T t10;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            com.bytedance.adsdk.oq.rjo.kq<T> kqVar = list.get(i11);
            i11++;
            com.bytedance.adsdk.oq.rjo.kq<T> kqVar2 = list.get(i11);
            kqVar.rjo = Float.valueOf(kqVar2.rhi);
            if (kqVar.oq == null && (t10 = kqVar2.kq) != null) {
                kqVar.oq = t10;
                if (kqVar instanceof com.bytedance.adsdk.oq.kq.oq.dgq) {
                    ((com.bytedance.adsdk.oq.kq.oq.dgq) kqVar).kq();
                }
            }
        }
        com.bytedance.adsdk.oq.rjo.kq<T> kqVar3 = list.get(i10);
        if ((kqVar3.kq == null || kqVar3.oq == null) && list.size() > 1) {
            list.remove(kqVar3);
        }
    }
}
