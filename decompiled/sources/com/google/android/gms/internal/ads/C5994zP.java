package com.google.android.gms.internal.ads;

import H4.InterfaceC0580a;
import J4.InterfaceC0742e;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5994zP extends C3979jP implements InterfaceC4599oK {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC4599oK f35719f;

    @Override // com.google.android.gms.internal.ads.InterfaceC4599oK
    public final synchronized void F0() {
        InterfaceC4599oK interfaceC4599oK = this.f35719f;
        if (interfaceC4599oK != null) {
            interfaceC4599oK.F0();
        }
    }

    protected final synchronized void e(InterfaceC0580a interfaceC0580a, InterfaceC3019bl interfaceC3019bl, J4.B b10, InterfaceC3270dl interfaceC3270dl, InterfaceC0742e interfaceC0742e, InterfaceC4599oK interfaceC4599oK) throws Throwable {
        try {
            try {
                super.b(interfaceC0580a, interfaceC3019bl, b10, interfaceC3270dl, interfaceC0742e);
                this.f35719f = interfaceC4599oK;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4599oK
    public final synchronized void t0() {
        InterfaceC4599oK interfaceC4599oK = this.f35719f;
        if (interfaceC4599oK != null) {
            interfaceC4599oK.t0();
        }
    }
}
