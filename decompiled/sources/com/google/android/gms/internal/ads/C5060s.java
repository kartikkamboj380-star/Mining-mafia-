package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5060s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f33061a = new CopyOnWriteArrayList();

    public final void a(Handler handler, InterfaceC5186t interfaceC5186t) {
        b(interfaceC5186t);
        this.f33061a.add(new r(handler, interfaceC5186t));
    }

    public final void b(InterfaceC5186t interfaceC5186t) {
        CopyOnWriteArrayList<r> copyOnWriteArrayList = this.f33061a;
        for (r rVar : copyOnWriteArrayList) {
            if (rVar.c() == interfaceC5186t) {
                rVar.a();
                copyOnWriteArrayList.remove(rVar);
            }
        }
    }

    public final void c(final int i10, final long j10, final long j11) {
        for (final r rVar : this.f33061a) {
            if (!rVar.d()) {
                rVar.b().post(new Runnable() { // from class: com.google.android.gms.internal.ads.q
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        rVar.c().S(i10, j10, j11);
                    }
                });
            }
        }
    }
}
