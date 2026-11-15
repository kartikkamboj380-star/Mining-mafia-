package com.google.android.play.core.integrity;

import android.os.RemoteException;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
final class D extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f39794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f39795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f39796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ C7094k f39797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ J f39798g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D(J j10, C7094k c7094k, int i10, String str, long j11, long j12, C7094k c7094k2) {
        super(j10, c7094k);
        this.f39798g = j10;
        this.f39794c = str;
        this.f39795d = j11;
        this.f39796e = j12;
        this.f39797f = c7094k2;
    }

    @Override // V5.F
    protected final void b() {
        if (J.i(this.f39798g)) {
            super.a(new C6688b(-2, null));
            return;
        }
        try {
            J j10 = this.f39798g;
            ((V5.w) j10.f39813f.e()).P3(J.a(j10, this.f39794c, this.f39795d, this.f39796e, 0), new G(this.f39798g, this.f39797f, this.f39795d));
        } catch (RemoteException e10) {
            this.f39798g.f39808a.b(e10, "requestExpressIntegrityToken(%s, %s)", this.f39794c, Long.valueOf(this.f39795d));
            this.f39797f.d(new C6688b(-100, e10));
        }
    }
}
