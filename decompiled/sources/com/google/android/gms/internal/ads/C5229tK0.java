package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5229tK0 extends AbstractC4977rK0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JK0 f33384a = new JK0(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C5229tK0) && ((C5229tK0) obj).f33384a.equals(this.f33384a);
        }
        return true;
    }

    public final void g(String str, AbstractC4977rK0 abstractC4977rK0) {
        this.f33384a.put(str, abstractC4977rK0);
    }

    public final int hashCode() {
        return this.f33384a.hashCode();
    }

    public final Set i() {
        return this.f33384a.entrySet();
    }

    public final boolean j(String str) {
        return this.f33384a.containsKey(str);
    }

    public final AbstractC4977rK0 k(String str) {
        return (AbstractC4977rK0) this.f33384a.get(str);
    }
}
