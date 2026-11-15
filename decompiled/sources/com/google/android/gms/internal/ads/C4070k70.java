package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4070k70 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f30705b;

    C4070k70(Context context, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0) {
        this.f30704a = context;
        this.f30705b = interfaceExecutorServiceC1805Gx0;
    }

    final /* synthetic */ C4196l70 a() {
        Context context = this.f30704a;
        return new C4196l70(AbstractC2447Th.c(context), AbstractC2447Th.d(context));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return ((Boolean) AbstractC3015bj.f26897b.e()).booleanValue() ? this.f30705b.e0(new Callable() { // from class: com.google.android.gms.internal.ads.j70
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f30317a.a();
            }
        }) : AbstractC5685wx0.a(new C4196l70(-1, -1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 59;
    }
}
