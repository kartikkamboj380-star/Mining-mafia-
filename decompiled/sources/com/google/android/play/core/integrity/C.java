package com.google.android.play.core.integrity;

import android.os.RemoteException;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
final class C extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f39791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C7094k f39792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ J f39793e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C(J j10, C7094k c7094k, int i10, long j11, C7094k c7094k2) {
        super(j10, c7094k);
        this.f39793e = j10;
        this.f39791c = j11;
        this.f39792d = c7094k2;
    }

    @Override // V5.F
    protected final void b() {
        if (J.i(this.f39793e)) {
            super.a(new C6688b(-2, null));
            return;
        }
        try {
            J j10 = this.f39793e;
            ((V5.w) j10.f39813f.e()).e6(J.b(j10, this.f39791c, 0), new H(this.f39793e, this.f39792d));
        } catch (RemoteException e10) {
            this.f39793e.f39808a.b(e10, "warmUpIntegrityToken(%s)", Long.valueOf(this.f39791c));
            this.f39792d.d(new C6688b(-100, e10));
        }
    }
}
