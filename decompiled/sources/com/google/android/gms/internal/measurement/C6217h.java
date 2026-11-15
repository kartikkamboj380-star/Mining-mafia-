package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6217h implements InterfaceC6289p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6289p f36697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36698b;

    public C6217h(String str) {
        this.f36697a = InterfaceC6289p.f36808x;
        this.f36698b = str;
    }

    public final InterfaceC6289p a() {
        return this.f36697a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Iterator b() {
        return null;
    }

    public final String c() {
        return this.f36698b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final InterfaceC6289p e(String str, C6157a2 c6157a2, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6217h)) {
            return false;
        }
        C6217h c6217h = (C6217h) obj;
        return this.f36698b.equals(c6217h.f36698b) && this.f36697a.equals(c6217h.f36697a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final InterfaceC6289p g() {
        return new C6217h(this.f36698b, this.f36697a.g());
    }

    public final int hashCode() {
        return (this.f36698b.hashCode() * 31) + this.f36697a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Double zzd() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Boolean zze() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public C6217h(String str, InterfaceC6289p interfaceC6289p) {
        this.f36697a = interfaceC6289p;
        this.f36698b = str;
    }
}
