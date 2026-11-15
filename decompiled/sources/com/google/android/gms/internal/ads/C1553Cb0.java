package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1553Cb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f17912a;

    public C1553Cb0(JSONObject jSONObject) {
        this.f17912a = jSONObject;
    }

    public final String a() {
        if (c() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final boolean b() {
        return this.f17912a.optBoolean((String) H4.B.c().d(AbstractC3892ii.f29920o6), true);
    }

    public final int c() {
        int iOptInt = this.f17912a.optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
