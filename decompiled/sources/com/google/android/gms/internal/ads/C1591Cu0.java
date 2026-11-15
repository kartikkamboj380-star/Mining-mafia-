package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1591Cu0 extends AbstractC2112Mv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f18005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f18006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Iterator f18007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC1799Gu0 f18008d;

    C1591Cu0(AbstractC1799Gu0 abstractC1799Gu0) {
        Objects.requireNonNull(abstractC1799Gu0);
        this.f18008d = abstractC1799Gu0;
        this.f18005a = abstractC1799Gu0.f19159d.entrySet().g().listIterator(0);
        this.f18006b = null;
        this.f18007c = C2214Ou0.f21715d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18007c.hasNext() || this.f18005a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.f18007c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f18005a.next();
            this.f18006b = entry.getKey();
            this.f18007c = ((AbstractC5427uu0) entry.getValue()).a();
        }
        Object obj = this.f18006b;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.f18007c.next());
    }
}
