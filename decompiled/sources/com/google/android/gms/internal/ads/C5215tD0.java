package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5215tD0 extends AbstractC4546nu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f33368a;

    public C5215tD0(Map map) {
        this.f33368a = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4546nu0, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return super.j(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4546nu0, java.util.Map
    public final Set entrySet() {
        return AbstractC1905Iv0.b(this.f33368a.entrySet(), C4961rC0.f32857a);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.k(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4672ou0
    protected final /* synthetic */ Object g() {
        return this.f33368a;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f33368a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return super.l();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4546nu0
    protected final Map i() {
        return this.f33368a;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.f33368a.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return AbstractC1905Iv0.b(this.f33368a.keySet(), SC0.f23149a);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4546nu0, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
