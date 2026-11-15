package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ir0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3911ir0 extends BroadcastReceiver implements InterfaceC2102Mq0, InterfaceC1573Cl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f30084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f30085c = true;

    C3911ir0(Context context, ExecutorService executorService) {
        this.f30083a = context;
        this.f30084b = executorService;
    }

    private final synchronized void f(boolean z9) {
        this.f30085c = z9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final void a(Map map) {
        map.put("up", Boolean.valueOf(d()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final void b(Map map) {
        map.put("up", Boolean.valueOf(d()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final void c(Map map, Context context, View view) {
        map.put("up", Boolean.valueOf(d()));
    }

    final synchronized boolean d() {
        return this.f30085c;
    }

    final /* synthetic */ Void e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.f30083a.registerReceiver(this, intentFilter);
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            f(true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            f(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1573Cl0
    public final com.google.common.util.concurrent.p zza() {
        return AbstractC5685wx0.d(new Callable() { // from class: com.google.android.gms.internal.ads.hr0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f29126a.e();
                return null;
            }
        }, this.f30084b);
    }
}
