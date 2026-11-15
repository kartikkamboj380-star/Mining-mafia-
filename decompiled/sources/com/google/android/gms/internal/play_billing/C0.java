package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class C0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator f37068a;

    public C0(Iterator it) {
        this.f37068a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37068a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f37068a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f37068a.remove();
    }
}
