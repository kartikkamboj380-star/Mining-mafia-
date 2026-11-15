package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5686wy implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f34675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f34676b;

    private C5686wy(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f34675a = interfaceC4864qQ0;
        this.f34676b = interfaceC4864qQ1;
    }

    public static C5686wy a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C5686wy(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return Wrappers.packageManager(((C4049jy) this.f34675a).a()).getPackageInfo(((ApplicationInfo) this.f34676b.zzb()).packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
