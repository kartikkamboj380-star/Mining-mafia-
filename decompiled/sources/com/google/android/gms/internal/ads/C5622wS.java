package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5622wS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f34557b;

    private C5622wS(long j10, int[] iArr) {
        this.f34556a = j10;
        this.f34557b = iArr;
    }

    public static AbstractC5931yu0 a(JsonReader jsonReader) {
        int i10 = AbstractC5931yu0.f35482c;
        C5553vu0 c5553vu0 = new C5553vu0();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            AbstractC5931yu0 abstractC5931yu0L = AbstractC5931yu0.l();
            jsonReader.beginObject();
            C5622wS c5622wS = null;
            Long lValueOf = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (Objects.equals(strNextName, "id")) {
                    lValueOf = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(strNextName, "event_types")) {
                    C5553vu0 c5553vu1 = new C5553vu0();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c5553vu1.g(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    abstractC5931yu0L = c5553vu1.j();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (lValueOf != null && !abstractC5931yu0L.isEmpty()) {
                long jLongValue = lValueOf.longValue();
                int[] iArr = new int[abstractC5931yu0L.size()];
                for (int i11 = 0; i11 < abstractC5931yu0L.size(); i11++) {
                    iArr[i11] = ((Integer) abstractC5931yu0L.get(i11)).intValue();
                }
                c5622wS = new C5622wS(jLongValue, iArr);
            }
            if (c5622wS != null) {
                c5553vu0.g(c5622wS);
            }
        }
        jsonReader.endArray();
        return c5553vu0.j();
    }
}
