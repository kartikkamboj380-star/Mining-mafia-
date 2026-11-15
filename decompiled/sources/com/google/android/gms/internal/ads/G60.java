package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final class G60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4637od f18931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4131kc f18932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5825y30 f18933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4891qe f18934d = new C4891qe();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4739pR f18935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Z30 f18936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2936b50 f18937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C50 f18938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C3314e60 f18939i;

    public G60(InterfaceC4637od interfaceC4637od, InterfaceC5825y30 interfaceC5825y30, InterfaceC3471fM interfaceC3471fM, int i10, int i11, int i12, int i13) {
        this.f18931a = interfaceC4637od;
        this.f18933c = interfaceC5825y30;
        this.f18935e = interfaceC3471fM.a(interfaceC4637od.zzd(), new Handler.Callback() { // from class: com.google.android.gms.internal.ads.A40
            @Override // android.os.Handler.Callback
            public final /* synthetic */ boolean handleMessage(Message message) {
                return this.f17236a.b(message);
            }
        });
        this.f18936f = new Z30(this, i10);
        this.f18937g = new C2936b50(this, i11);
        this.f18938h = new C50(this, i12);
        this.f18939i = new C3314e60(this, i13);
        S20 s20 = new S20(this);
        this.f18932b = s20;
        interfaceC4637od.B(s20);
    }

    public final void a() {
        this.f18935e.h(null);
        this.f18931a.A(this.f18932b);
    }

    final /* synthetic */ boolean b(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            this.f18936f.a();
            return true;
        }
        if (i10 == 2) {
            this.f18937g.a();
            return true;
        }
        if (i10 == 3) {
            this.f18938h.a();
            return true;
        }
        if (i10 != 4) {
            return false;
        }
        this.f18939i.a();
        return true;
    }

    final /* synthetic */ void c() {
        this.f18936f.a();
        this.f18937g.a();
        this.f18938h.a();
        this.f18939i.a();
    }

    final /* synthetic */ InterfaceC4637od d() {
        return this.f18931a;
    }

    final /* synthetic */ InterfaceC5825y30 e() {
        return this.f18933c;
    }

    final /* synthetic */ C4891qe f() {
        return this.f18934d;
    }

    final /* synthetic */ InterfaceC4739pR g() {
        return this.f18935e;
    }
}
