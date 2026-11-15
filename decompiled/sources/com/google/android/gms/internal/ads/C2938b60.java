package com.google.android.gms.internal.ads;

import K4.InterfaceC0790q0;
import android.content.pm.PackageInfo;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2938b60 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f26722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6019zb0 f26723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PackageInfo f26724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0790q0 f26725d;

    public C2938b60(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, C6019zb0 c6019zb0, PackageInfo packageInfo, InterfaceC0790q0 interfaceC0790q0) {
        this.f26722a = interfaceExecutorServiceC1805Gx0;
        this.f26723b = c6019zb0;
        this.f26724c = packageInfo;
        this.f26725d = interfaceC0790q0;
    }

    final /* synthetic */ C3063c60 a() {
        return new C3063c60(this.f26723b, this.f26724c, this.f26725d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f26722a.e0(new Callable() { // from class: com.google.android.gms.internal.ads.a60
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f26425a.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 26;
    }
}
