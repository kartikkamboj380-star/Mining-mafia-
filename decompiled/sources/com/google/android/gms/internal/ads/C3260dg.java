package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3260dg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    InterfaceC5016re f27494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f27495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExecutorService f27496c;

    public C3260dg() {
        this.f27496c = L4.c.f3105b;
    }

    final /* synthetic */ ExecutorService a() {
        return this.f27496c;
    }

    public C3260dg(final Context context) {
        ExecutorService executorService = L4.c.f3105b;
        this.f27496c = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Zf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) H4.B.c().d(AbstractC3892ii.f29799d6)).booleanValue();
                Context context2 = context;
                C3260dg c3260dg = this.f26263a;
                if (zBooleanValue) {
                    try {
                        c3260dg.f27494a = (InterfaceC5016re) L4.t.a(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", C2883ag.f26590a);
                        c3260dg.f27494a.Y2(com.google.android.gms.dynamic.b.N0(context2), "GMA_SDK");
                        c3260dg.f27495b = true;
                    } catch (L4.s | RemoteException | NullPointerException unused) {
                        L4.p.a("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
