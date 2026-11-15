package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class QA implements InterfaceC5472vG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2696Yb0 f22319a;

    public QA(C2696Yb0 c2696Yb0) {
        this.f22319a = c2696Yb0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5472vG
    public final void P(Context context) {
        try {
            this.f22319a.n();
        } catch (C1761Gb0 e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Cannot invoke onPause for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5472vG
    public final void e(Context context) {
        try {
            this.f22319a.k();
        } catch (C1761Gb0 e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Cannot invoke onDestroy for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5472vG
    public final void h(Context context) {
        try {
            C2696Yb0 c2696Yb0 = this.f22319a;
            c2696Yb0.o();
            if (context != null) {
                c2696Yb0.u(context);
            }
        } catch (C1761Gb0 e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.g("Cannot invoke onResume for the mediation adapter.", e10);
        }
    }
}
