package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3220dM implements InterfaceC2091Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f27404a;

    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final void a(Object obj, Map map) {
        C3723hM c3723hM = (C3723hM) this.f27404a.get();
        if (c3723hM == null) {
            return;
        }
        c3723hM.x().onAdClicked();
        if (((Boolean) H4.B.c().d(AbstractC3892ii.kc)).booleanValue()) {
            c3723hM.y().t0();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            c3723hM.y().F0();
        }
    }
}
