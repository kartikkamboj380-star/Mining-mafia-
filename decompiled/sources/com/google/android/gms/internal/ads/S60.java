package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class S60 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f23131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f23132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L4.a f23133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f23134d;

    S60(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, Context context, L4.a aVar, String str) {
        this.f23131a = interfaceExecutorServiceC1805Gx0;
        this.f23132b = context;
        this.f23133c = aVar;
        this.f23134d = str;
    }

    final /* synthetic */ T60 a() {
        Context context = this.f23132b;
        boolean zIsCallerInstantApp = Wrappers.packageManager(context).isCallerInstantApp();
        G4.t.g();
        boolean zJ = K4.F0.j(context);
        String str = this.f23133c.f3097a;
        G4.t.g();
        boolean zK = K4.F0.k();
        G4.t.g();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return new T60(zIsCallerInstantApp, zJ, str, zK, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.c(context, ModuleDescriptor.MODULE_ID), DynamiteModule.a(context, ModuleDescriptor.MODULE_ID), this.f23134d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f23131a.e0(new Callable() { // from class: com.google.android.gms.internal.ads.R60
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f22726a.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 35;
    }
}
