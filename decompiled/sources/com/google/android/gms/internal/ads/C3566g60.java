package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3566g60 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f28572c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f28573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f28574b;

    public C3566g60(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, Context context) {
        this.f28573a = interfaceExecutorServiceC1805Gx0;
        this.f28574b = context;
    }

    final /* synthetic */ C3692h60 a() {
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29865j6)).booleanValue()) {
            return new C3692h60(null);
        }
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29964s6)).booleanValue()) {
            return new C3692h60(G4.t.y().h(this.f28574b));
        }
        if (f28572c == null) {
            f28572c = G4.t.y().h(this.f28574b);
        }
        return new C3692h60(f28572c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f28573a.e0(new Callable() { // from class: com.google.android.gms.internal.ads.f60
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f28184a.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 27;
    }
}
