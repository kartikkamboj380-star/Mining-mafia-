package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class DQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18168a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18171d;

    public final synchronized void a() {
        this.f18171d++;
    }

    public final synchronized void b() {
        this.f18171d--;
    }

    public final synchronized int c() {
        return this.f18171d;
    }
}
