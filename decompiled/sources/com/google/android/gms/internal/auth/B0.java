package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class B0 extends AbstractC6069a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0 f35905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected C0 f35906b;

    protected B0(C0 c10) {
        this.f35905a = c10;
        if (c10.l()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f35906b = c10.c();
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final B0 clone() {
        B0 b10 = (B0) this.f35905a.m(5, null, null);
        b10.f35906b = zzd();
        return b10;
    }

    @Override // com.google.android.gms.internal.auth.Y0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0 zzd() {
        if (!this.f35906b.l()) {
            return this.f35906b;
        }
        this.f35906b.h();
        return this.f35906b;
    }
}
