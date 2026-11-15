package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3170cy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L4.a f27257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f27258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f27259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakReference f27260d;

    /* synthetic */ C3170cy(C2919ay c2919ay, byte[] bArr) {
        this.f27257a = c2919ay.d();
        this.f27258b = c2919ay.e();
        this.f27260d = c2919ay.g();
        this.f27259c = c2919ay.f();
    }

    static int j() {
        return ((Integer) H4.B.c().d(AbstractC3892ii.f29689T)).intValue();
    }

    final Context a() {
        return this.f27258b;
    }

    final Context b() {
        return this.f27258b;
    }

    final WeakReference c() {
        return this.f27260d;
    }

    final L4.a d() {
        return this.f27257a;
    }

    final String e() {
        return G4.t.g().R(this.f27258b, this.f27257a.f3097a);
    }

    final C2687Xx f() {
        return new C2687Xx(this.f27258b, this.f27257a);
    }

    public final G4.k g() {
        return new G4.k(this.f27258b, this.f27257a);
    }

    final C1672Ej h() {
        return new C1672Ej(this.f27258b);
    }

    final long i() {
        return this.f27259c;
    }
}
