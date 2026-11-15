package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5745xQ0 extends p180s.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f34817b;

    public C5745xQ0(C1982Ki c1982Ki) {
        this.f34817b = new WeakReference(c1982Ki);
    }

    @Override // p180s.e
    public final void a(ComponentName componentName, p180s.c cVar) {
        C1982Ki c1982Ki = (C1982Ki) this.f34817b.get();
        if (c1982Ki != null) {
            c1982Ki.f(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1982Ki c1982Ki = (C1982Ki) this.f34817b.get();
        if (c1982Ki != null) {
            c1982Ki.g();
        }
    }
}
