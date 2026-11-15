package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3134cg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f27172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3260dg f27174c;

    /* synthetic */ C3134cg(C3260dg c3260dg, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(c3260dg);
        this.f27174c = c3260dg;
        this.f27172a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized void c() {
        try {
            C3260dg c3260dg = this.f27174c;
            if (c3260dg.f27495b) {
                c3260dg.f27494a.P2(this.f27172a);
                c3260dg.f27494a.zzi(0);
                c3260dg.f27494a.V(this.f27173b);
                c3260dg.f27494a.A2(null);
                c3260dg.f27494a.b();
            }
        } catch (RemoteException e10) {
            L4.p.b("Clearcut log failed", e10);
        }
    }

    public final synchronized void a() {
        this.f27174c.a().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.bg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f26892a.c();
            }
        });
    }

    public final C3134cg b(int i10) {
        this.f27173b = i10;
        return this;
    }
}
