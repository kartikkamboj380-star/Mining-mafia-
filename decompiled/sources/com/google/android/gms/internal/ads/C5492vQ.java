package com.google.android.gms.internal.ads;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5492vQ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4650oj0 f34056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f34057b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f34058c = new AtomicBoolean(false);

    C5492vQ(InterfaceC4650oj0 interfaceC4650oj0) {
        this.f34056a = interfaceC4650oj0;
    }

    public final void a(C2285Qe c2285Qe) {
        this.f34058c.set(true);
        c2285Qe.g(this);
        this.f34056a.zza();
    }

    public final void b(String str) {
        if (AbstractC4040jt0.c(str) || !this.f34058c.get() || this.f34057b.getAndSet(true)) {
            return;
        }
        this.f34056a.j(str);
    }

    public final void c() {
        if (this.f34057b.get()) {
            this.f34056a.zzg();
        }
    }

    public final void d() {
        if (this.f34057b.getAndSet(false)) {
            this.f34056a.zze();
        }
    }

    public final void e(Activity activity) {
        if (this.f34057b.get()) {
            this.f34056a.zzd();
        }
    }

    public final void f(Activity activity) {
        if (this.f34057b.get()) {
            this.f34056a.zzc();
        }
    }

    public final boolean g(Activity activity) {
        if (!this.f34057b.getAndSet(false)) {
            return false;
        }
        this.f34056a.b();
        return false;
    }
}
