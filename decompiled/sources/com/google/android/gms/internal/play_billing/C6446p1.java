package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6446p1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37318a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f37320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC6465u1 f37321d;

    /* synthetic */ C6446p1(AbstractC6465u1 abstractC6465u1, AbstractC6442o1 abstractC6442o1) {
        this.f37321d = abstractC6465u1;
    }

    private final Iterator a() {
        if (this.f37320c == null) {
            this.f37320c = this.f37321d.f37341c.entrySet().iterator();
        }
        return this.f37320c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f37318a + 1 >= this.f37321d.f37340b.size()) {
            return !this.f37321d.f37341c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f37319b = true;
        int i10 = this.f37318a + 1;
        this.f37318a = i10;
        return i10 < this.f37321d.f37340b.size() ? (Map.Entry) this.f37321d.f37340b.get(this.f37318a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f37319b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f37319b = false;
        this.f37321d.o();
        if (this.f37318a >= this.f37321d.f37340b.size()) {
            a().remove();
            return;
        }
        AbstractC6465u1 abstractC6465u1 = this.f37321d;
        int i10 = this.f37318a;
        this.f37318a = i10 - 1;
        abstractC6465u1.m(i10);
    }
}
