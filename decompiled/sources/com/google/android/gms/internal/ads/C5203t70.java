package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5203t70 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f33341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f33342b;

    public C5203t70(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, Context context) {
        this.f33341a = interfaceExecutorServiceC1805Gx0;
        this.f33342b = context;
    }

    final /* synthetic */ C4951r70 a() {
        boolean zIsActiveNetworkMetered;
        int i10;
        Context context = this.f33342b;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        G4.t.g();
        int i11 = -1;
        if (K4.F0.f(context, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                i10 = type;
                i11 = iOrdinal;
            } else {
                i10 = -1;
            }
            zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        } else {
            zIsActiveNetworkMetered = false;
            i10 = -2;
        }
        return new C4951r70(networkOperator, i10, G4.t.j().k(context), phoneType, zIsActiveNetworkMetered, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f33341a.e0(new Callable() { // from class: com.google.android.gms.internal.ads.s70
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f33111a.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 39;
    }
}
