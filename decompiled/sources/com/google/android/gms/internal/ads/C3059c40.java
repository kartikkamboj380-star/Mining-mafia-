package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3059c40 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f27012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f27013b;

    C3059c40(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, Context context) {
        this.f27012a = interfaceExecutorServiceC1805Gx0;
        this.f27013b = context;
    }

    private final Intent b() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        return (!((Boolean) H4.B.c().d(AbstractC3892ii.xc)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.f27013b.registerReceiver(null, intentFilter) : this.f27013b.registerReceiver(null, intentFilter, 4);
    }

    private static final boolean c(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    final /* synthetic */ C3185d40 a() {
        double intExtra;
        boolean zIsCharging;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.xd)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) this.f27013b.getSystemService("batterymanager");
            intExtra = batteryManager != null ? ((double) batteryManager.getIntProperty(4)) / 100.0d : -1.0d;
            zIsCharging = batteryManager != null ? batteryManager.isCharging() : c(b());
        } else {
            Intent intentB = b();
            boolean zC = c(intentB);
            intExtra = intentB != null ? ((double) intentB.getIntExtra("level", -1)) / ((double) intentB.getIntExtra("scale", -1)) : -1.0d;
            zIsCharging = zC;
        }
        return new C3185d40(intExtra, zIsCharging);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f27012a.e0(new Callable() { // from class: com.google.android.gms.internal.ads.b40
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f26709a.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 14;
    }
}
