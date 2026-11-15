package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3754hb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29030a;

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    C3754hb0(JsonReader jsonReader) throws IOException {
        byte b10;
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -1724546052) {
                if (iHashCode == 3059181 && strNextName.equals("code")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (strNextName.equals("description")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                jsonReader.nextInt();
            } else if (b10 != 1) {
                jsonReader.skipValue();
            } else {
                strNextString = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        this.f29030a = strNextString;
    }

    public final String a() {
        return this.f29030a;
    }
}
