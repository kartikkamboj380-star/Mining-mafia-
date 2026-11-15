package com.google.android.gms.internal.ads;

import H4.InterfaceC0580a;
import J4.InterfaceC0742e;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3979jP implements InterfaceC0580a, InterfaceC3019bl, J4.B, InterfaceC3270dl, InterfaceC0742e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0580a f30412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC3019bl f30413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private J4.B f30414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC3270dl f30415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC0742e f30416e;

    @Override // J4.B
    public final synchronized void B2() {
        J4.B b10 = this.f30414c;
        if (b10 != null) {
            b10.B2();
        }
    }

    @Override // J4.B
    public final synchronized void F4() {
        J4.B b10 = this.f30414c;
        if (b10 != null) {
            b10.F4();
        }
    }

    @Override // J4.B
    public final void H1() {
        J4.B b10 = this.f30414c;
        if (b10 != null) {
            b10.H1();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3270dl
    public final synchronized void I0(String str, String str2) {
        InterfaceC3270dl interfaceC3270dl = this.f30415d;
        if (interfaceC3270dl != null) {
            interfaceC3270dl.I0(str, str2);
        }
    }

    @Override // J4.B
    public final void N0() {
        J4.B b10 = this.f30414c;
        if (b10 != null) {
            b10.N0();
        }
    }

    @Override // J4.B
    public final synchronized void S3(int i10) {
        J4.B b10 = this.f30414c;
        if (b10 != null) {
            b10.S3(i10);
        }
    }

    @Override // J4.B
    public final void Z1() {
        J4.B b10 = this.f30414c;
        if (b10 != null) {
            b10.Z1();
        }
    }

    @Override // J4.B
    public final synchronized void Z2() {
        J4.B b10 = this.f30414c;
        if (b10 != null) {
            b10.Z2();
        }
    }

    @Override // J4.B
    public final synchronized void Z4() {
        J4.B b10 = this.f30414c;
        if (b10 != null) {
            b10.Z4();
        }
    }

    protected final synchronized void b(InterfaceC0580a interfaceC0580a, InterfaceC3019bl interfaceC3019bl, J4.B b10, InterfaceC3270dl interfaceC3270dl, InterfaceC0742e interfaceC0742e) {
        this.f30412a = interfaceC0580a;
        this.f30413b = interfaceC3019bl;
        this.f30414c = b10;
        this.f30415d = interfaceC3270dl;
        this.f30416e = interfaceC0742e;
    }

    @Override // J4.B
    public final void b4() {
        J4.B b10 = this.f30414c;
        if (b10 != null) {
            b10.b4();
        }
    }

    @Override // J4.B
    public final synchronized void c() {
        J4.B b10 = this.f30414c;
        if (b10 != null) {
            b10.c();
        }
    }

    @Override // H4.InterfaceC0580a
    public final synchronized void onAdClicked() {
        InterfaceC0580a interfaceC0580a = this.f30412a;
        if (interfaceC0580a != null) {
            interfaceC0580a.onAdClicked();
        }
    }

    @Override // J4.B
    public final void t4() {
        J4.B b10 = this.f30414c;
        if (b10 != null) {
            b10.t4();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3019bl
    public final synchronized void v(String str, Bundle bundle) {
        InterfaceC3019bl interfaceC3019bl = this.f30413b;
        if (interfaceC3019bl != null) {
            interfaceC3019bl.v(str, bundle);
        }
    }

    @Override // J4.InterfaceC0742e
    public final synchronized void zzl() {
        InterfaceC0742e interfaceC0742e = this.f30416e;
        if (interfaceC0742e != null) {
            interfaceC0742e.zzl();
        }
    }
}
