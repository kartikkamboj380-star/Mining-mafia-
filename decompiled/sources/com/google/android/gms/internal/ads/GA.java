package com.google.android.gms.internal.ads;

import K4.AbstractC0763d;
import K4.InterfaceC0790q0;
import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class GA implements InterfaceC4705pA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0790q0 f18978b = G4.t.l().r();

    public GA(Context context) {
        this.f18977a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4705pA
    public final void a(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        InterfaceC0790q0 interfaceC0790q0 = this.f18978b;
        boolean z9 = Boolean.parseBoolean(str);
        interfaceC0790q0.Q(z9);
        if (z9) {
            AbstractC0763d.a(this.f18977a);
        }
    }
}
