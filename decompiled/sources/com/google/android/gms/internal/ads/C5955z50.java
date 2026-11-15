package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5955z50 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f35641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f35642b;

    C5955z50(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, Context context) {
        this.f35642b = interfaceExecutorServiceC1805Gx0;
        this.f35641a = context;
    }

    final /* synthetic */ A50 a() {
        G4.t.g();
        return new A50(K4.F0.j0(this.f35641a));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f35642b.e0(new Callable() { // from class: com.google.android.gms.internal.ads.y50
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f35242a.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 57;
    }
}
