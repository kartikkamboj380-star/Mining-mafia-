package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Du0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1643Du0 extends AbstractC2112Mv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f18304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Iterator f18305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC1799Gu0 f18306c;

    C1643Du0(AbstractC1799Gu0 abstractC1799Gu0) {
        Objects.requireNonNull(abstractC1799Gu0);
        this.f18306c = abstractC1799Gu0;
        this.f18304a = ((AbstractC5931yu0) abstractC1799Gu0.f19159d.values()).listIterator(0);
        this.f18305b = C2214Ou0.f21715d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18305b.hasNext() || this.f18304a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f18305b.hasNext()) {
            this.f18305b = ((AbstractC5427uu0) this.f18304a.next()).a();
        }
        return this.f18305b.next();
    }
}
