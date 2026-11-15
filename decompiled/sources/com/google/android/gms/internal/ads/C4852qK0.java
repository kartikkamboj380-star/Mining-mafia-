package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4852qK0 extends AbstractC4977rK0 implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f32622a = new ArrayList();

    @Override // com.google.android.gms.internal.ads.AbstractC4977rK0
    public final String a() {
        ArrayList arrayList = this.f32622a;
        int size = arrayList.size();
        if (size == 1) {
            return ((AbstractC4977rK0) arrayList.get(0)).a();
        }
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 37);
        sb.append("Array must have size 1, but has size ");
        sb.append(size);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C4852qK0) && ((C4852qK0) obj).f32622a.equals(this.f32622a);
        }
        return true;
    }

    public final void g(AbstractC4977rK0 abstractC4977rK0) {
        this.f32622a.add(abstractC4977rK0);
    }

    public final int hashCode() {
        return this.f32622a.hashCode();
    }

    public final int i() {
        return this.f32622a.size();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f32622a.iterator();
    }

    public final AbstractC4977rK0 j(int i10) {
        return (AbstractC4977rK0) this.f32622a.get(i10);
    }
}
