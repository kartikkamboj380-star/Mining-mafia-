package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5440v00 implements InterfaceC4627oY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f33968a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DQ f33969b;

    public C5440v00(DQ dq) {
        this.f33969b = dq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4627oY
    public final C4753pY a(String str, JSONObject jSONObject) {
        C4753pY c4753pY;
        synchronized (this) {
            try {
                Map map = this.f33968a;
                c4753pY = (C4753pY) map.get(str);
                if (c4753pY == null) {
                    c4753pY = new C4753pY(this.f33969b.a(str, jSONObject), new BinderC3246dZ(), str);
                    map.put(str, c4753pY);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4753pY;
    }
}
