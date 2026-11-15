package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3628gb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28692c;

    public C3628gb0(int i10, int i11, boolean z9) {
        this.f28690a = i10;
        this.f28691b = i11;
        this.f28692c = z9;
    }

    static List a(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int iNextInt = 0;
            int iNextInt2 = 0;
            boolean zNextBoolean = false;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if ("width".equals(strNextName)) {
                    iNextInt = jsonReader.nextInt();
                } else if ("height".equals(strNextName)) {
                    iNextInt2 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(strNextName)) {
                    zNextBoolean = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new C3628gb0(iNextInt, iNextInt2, zNextBoolean));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
