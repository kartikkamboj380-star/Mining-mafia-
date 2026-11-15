package com.bytedance.adsdk.oq.csi;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class xn implements tvh<com.bytedance.adsdk.oq.bob.oq.suf> {
    public static final xn kq = new xn();

    private xn() {
    }

    @Override // com.bytedance.adsdk.oq.csi.tvh
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.oq.bob.oq.suf oq(JsonReader jsonReader, float f10) throws IOException {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> listKq = null;
        List<PointF> listKq2 = null;
        List<PointF> listKq3 = null;
        boolean zNextBoolean = false;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (jsonReader.peek() == JsonToken.END_ARRAY) {
                    jsonReader.endArray();
                }
                if (listKq == null || listKq2 == null || listKq3 == null) {
                    throw new IllegalArgumentException("Shape data was missing information.");
                }
                if (listKq.isEmpty()) {
                    return new com.bytedance.adsdk.oq.bob.oq.suf(new PointF(), false, Collections.EMPTY_LIST);
                }
                int size = listKq.size();
                PointF pointF = listKq.get(0);
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 1; i10 < size; i10++) {
                    PointF pointF2 = listKq.get(i10);
                    int i11 = i10 - 1;
                    arrayList.add(new com.bytedance.adsdk.oq.bob.kq(com.bytedance.adsdk.oq.rhi.csi.kq(listKq.get(i11), listKq3.get(i11)), com.bytedance.adsdk.oq.rhi.csi.kq(pointF2, listKq2.get(i10)), pointF2));
                }
                if (zNextBoolean) {
                    PointF pointF3 = listKq.get(0);
                    int i12 = size - 1;
                    arrayList.add(new com.bytedance.adsdk.oq.bob.kq(com.bytedance.adsdk.oq.rhi.csi.kq(listKq.get(i12), listKq3.get(i12)), com.bytedance.adsdk.oq.rhi.csi.kq(pointF3, listKq2.get(0)), pointF3));
                }
                return new com.bytedance.adsdk.oq.bob.oq.suf(pointF, zNextBoolean, arrayList);
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "c":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "i":
                    listKq2 = gm.kq(jsonReader, f10);
                    break;
                case "o":
                    listKq3 = gm.kq(jsonReader, f10);
                    break;
                case "v":
                    listKq = gm.kq(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }
}
