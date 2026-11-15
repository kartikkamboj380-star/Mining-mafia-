package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.util.JsonWriter;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3357eS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Clock f27783a;

    public C3357eS(Clock clock) {
        this.f27783a = clock;
    }

    public final void a(List list, String str, String str2, Object... objArr) {
        if (((Boolean) AbstractC4397mj.f31570a.e()).booleanValue()) {
            long jCurrentTimeMillis = this.f27783a.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jCurrentTimeMillis);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj = objArr[i10];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e10) {
                int i11 = AbstractC0786o0.f2696b;
                L4.p.d("unable to log", e10);
            }
            String strValueOf = String.valueOf(stringWriter.toString());
            int i12 = AbstractC0786o0.f2696b;
            L4.p.e("AD-DBG ".concat(strValueOf));
        }
    }
}
