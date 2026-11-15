package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3050c00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2436Tb0 f26980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AQ f26981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QR f26982c;

    public C3050c00(C2436Tb0 c2436Tb0, AQ aq, QR qr) {
        this.f26980a = c2436Tb0;
        this.f26981b = aq;
        this.f26982c = qr;
    }

    public final void a(C3880ib0 c3880ib0, C3502fb0 c3502fb0, int i10, C4879qY c4879qY, long j10) {
        C5996zQ c5996zQC;
        PR prA = this.f26982c.a();
        prA.a(c3880ib0);
        prA.b(c3502fb0);
        prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "adapter_status");
        prA.c("adapter_l", String.valueOf(j10));
        prA.c("sc", Integer.toString(i10));
        if (c4879qY != null) {
            prA.c("arec", Integer.toString(c4879qY.b().f1252a));
            String strA = this.f26980a.a(c4879qY.getMessage());
            if (strA != null) {
                prA.c("areec", strA);
            }
        }
        AQ aq = this.f26981b;
        Iterator it = c3502fb0.f28433t.iterator();
        do {
            if (!it.hasNext()) {
                c5996zQC = null;
                break;
            }
            c5996zQC = aq.c((String) it.next());
        } while (c5996zQC == null);
        if (c5996zQC != null) {
            prA.c("ancn", c5996zQC.f35738a);
            C2048Lp c2048Lp = c5996zQC.f35739b;
            if (c2048Lp != null) {
                prA.c("adapter_v", c2048Lp.toString());
            }
            C2048Lp c2048Lp2 = c5996zQC.f35740c;
            if (c2048Lp2 != null) {
                prA.c("adapter_sv", c2048Lp2.toString());
            }
        }
        prA.d();
    }
}
