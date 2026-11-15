package com.google.android.play.core.integrity;

import V5.C0970g;
import android.os.Parcelable;
import android.os.RemoteException;
import p176r5.C7094k;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6694h extends V5.F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ byte[] f39855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Long f39856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C7094k f39857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f39858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ C6697k f39859f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6694h(C6697k c6697k, C7094k c7094k, byte[] bArr, Long l10, Parcelable parcelable, C7094k c7094k2, IntegrityTokenRequest integrityTokenRequest) {
        super(c7094k);
        this.f39859f = c6697k;
        this.f39855b = bArr;
        this.f39856c = l10;
        this.f39857d = c7094k2;
        this.f39858e = integrityTokenRequest;
    }

    @Override // V5.F
    public final void a(Exception exc) {
        if (exc instanceof C0970g) {
            super.a(new C6687a(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // V5.F
    protected final void b() {
        try {
            ((V5.B) this.f39859f.f39873e.e()).a2(C6697k.a(this.f39859f, this.f39855b, this.f39856c, null), new BinderC6696j(this.f39859f, this.f39857d));
        } catch (RemoteException e10) {
            this.f39859f.f39869a.b(e10, "requestIntegrityToken(%s)", this.f39858e);
            this.f39857d.d(new C6687a(-100, e10));
        }
    }
}
