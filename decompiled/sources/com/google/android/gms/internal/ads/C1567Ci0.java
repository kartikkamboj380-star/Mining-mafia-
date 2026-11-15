package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ci0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1567Ci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f17924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C1619Di0 f17927d;

    /* synthetic */ C1567Ci0(C1619Di0 c1619Di0, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(c1619Di0);
        this.f17927d = c1619Di0;
        this.f17924a = bArr;
    }

    public final synchronized void a() {
        try {
            C1619Di0 c1619Di0 = this.f17927d;
            if (c1619Di0.f18276b) {
                InterfaceC1775Gi0 interfaceC1775Gi0 = c1619Di0.f18275a;
                interfaceC1775Gi0.t2(this.f17924a);
                interfaceC1775Gi0.x(this.f17925b);
                interfaceC1775Gi0.zzi(this.f17926c);
                interfaceC1775Gi0.E3(null);
                interfaceC1775Gi0.zze();
            }
        } catch (RemoteException e10) {
            Log.d("GASS", "Clearcut log failed", e10);
        }
    }

    public final C1567Ci0 b(int i10) {
        this.f17925b = i10;
        return this;
    }

    public final C1567Ci0 c(int i10) {
        this.f17926c = i10;
        return this;
    }
}
