package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Td0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2440Td0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5141sd0 f23576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4739pR f23577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4739pR f23578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23580e;

    public C2440Td0(Context context, Looper looper, InterfaceC3471fM interfaceC3471fM) {
        this.f23576a = new C5141sd0(context.getApplicationContext());
        this.f23577b = interfaceC3471fM.a(looper, null);
        this.f23578c = interfaceC3471fM.a(Looper.getMainLooper(), null);
    }

    private final void f(final boolean z9, final boolean z10) {
        if (g(z9, z10)) {
            this.f23577b.g(new Runnable() { // from class: com.google.android.gms.internal.ads.qc0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f32687a.d(z9, z10);
                }
            });
            return;
        }
        final C5141sd0 c5141sd0 = this.f23576a;
        Objects.requireNonNull(c5141sd0);
        final Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.Pb0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                c5141sd0.a();
            }
        };
        this.f23578c.e(runnable, 1000L);
        this.f23577b.g(new Runnable() { // from class: com.google.android.gms.internal.ads.Rc0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f22861a.c(runnable, z9, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(boolean z9, boolean z10) {
        return z9 && z10;
    }

    public final void a(boolean z9) {
        if (this.f23579d == z9) {
            return;
        }
        this.f23579d = z9;
        f(z9, this.f23580e);
    }

    public final void b(boolean z9) {
        if (this.f23580e == z9) {
            return;
        }
        this.f23580e = z9;
        if (this.f23579d) {
            f(true, z9);
        }
    }

    final /* synthetic */ void c(Runnable runnable, boolean z9, boolean z10) {
        this.f23578c.i(runnable);
        this.f23576a.b(z9, z10);
    }

    final /* synthetic */ void d(boolean z9, boolean z10) {
        this.f23576a.b(z9, z10);
    }
}
