package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class NM0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f21237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC4854qL0 f21238b;

    /* synthetic */ NM0(AbstractC5231tL0 abstractC5231tL0, byte[] bArr) {
        if (!(abstractC5231tL0 instanceof OM0)) {
            this.f21237a = null;
            this.f21238b = (AbstractC4854qL0) abstractC5231tL0;
            return;
        }
        OM0 om0 = (OM0) abstractC5231tL0;
        ArrayDeque arrayDeque = new ArrayDeque(om0.t());
        this.f21237a = arrayDeque;
        arrayDeque.push(om0);
        this.f21238b = b(om0.J());
    }

    private final AbstractC4854qL0 b(AbstractC5231tL0 abstractC5231tL0) {
        while (abstractC5231tL0 instanceof OM0) {
            OM0 om0 = (OM0) abstractC5231tL0;
            this.f21237a.push(om0);
            abstractC5231tL0 = om0.J();
        }
        return (AbstractC4854qL0) abstractC5231tL0;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC4854qL0 next() {
        AbstractC4854qL0 abstractC4854qL0B;
        AbstractC4854qL0 abstractC4854qL0 = this.f21238b;
        if (abstractC4854qL0 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f21237a;
            abstractC4854qL0B = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            abstractC4854qL0B = b(((OM0) arrayDeque.pop()).E());
        } while (abstractC4854qL0B.j() == 0);
        this.f21238b = abstractC4854qL0B;
        return abstractC4854qL0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21238b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
