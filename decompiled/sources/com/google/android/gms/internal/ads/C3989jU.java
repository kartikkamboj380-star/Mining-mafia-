package com.google.android.gms.internal.ads;

import K4.InterfaceC0790q0;
import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3989jU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3613gU f30442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QR f30443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0790q0 f30444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    InterfaceC2309Qq f30445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    InterfaceC2309Qq f30446f;

    C3989jU(C3613gU c3613gU, QR qr, Context context, InterfaceC0790q0 interfaceC0790q0) {
        this.f30442b = c3613gU;
        this.f30443c = qr;
        this.f30441a = context;
        this.f30444d = interfaceC0790q0;
    }

    public final void a() {
        try {
            if (this.f30444d.L()) {
                return;
            }
            C3613gU c3613gU = this.f30442b;
            c3613gU.a();
            c3613gU.b(new C3865iU(this));
        } catch (Exception e10) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29655P5)).booleanValue()) {
                if (this.f30446f == null) {
                    this.f30446f = C2205Oq.e(this.f30441a);
                }
                this.f30446f.b(e10, "InstallReferrerUnsampled.initializeAndReport");
            } else {
                if (this.f30445e == null) {
                    this.f30445e = C2205Oq.c(this.f30441a);
                }
                this.f30445e.b(e10, "InstallReferrer.initializeAndReport");
            }
        }
    }

    final /* synthetic */ Context b() {
        return this.f30441a;
    }

    final /* synthetic */ C3613gU c() {
        return this.f30442b;
    }

    final /* synthetic */ QR d() {
        return this.f30443c;
    }

    final /* synthetic */ InterfaceC0790q0 e() {
        return this.f30444d;
    }
}
