package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import com.tenjin.android.config.TenjinConsts;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2403Sl implements InterfaceC2091Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f23316b;

    public C2403Sl(Context context, Map map) {
        this.f23315a = context;
        this.f23316b = map;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final void a(Object obj, Map map) {
        byte b10;
        C2521Us c2521UsD = G4.t.d();
        Context context = this.f23315a;
        if (c2521UsD.a(context)) {
            String str = (String) map.get(TenjinConsts.EVENT_NAME);
            String str2 = (String) map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                if (iHashCode != 94401) {
                    if (iHashCode == 94407 && str.equals("_ai")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                } else if (str.equals("_ac")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("_aa")) {
                b10 = 2;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                G4.t.d().k(context, str2, (Map) this.f23316b.get("_ac"));
            } else if (b10 == 1) {
                G4.t.d().l(context, str2, (Map) this.f23316b.get("_ai"));
            } else if (b10 == 2) {
                G4.t.d().n(context, str2);
            } else {
                int i10 = AbstractC0786o0.f2696b;
                L4.p.c("logScionEvent gmsg contained unsupported eventName");
            }
        }
    }
}
