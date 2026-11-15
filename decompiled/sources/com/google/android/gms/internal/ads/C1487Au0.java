package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Au0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1487Au0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f17429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f17430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    C6057zu0 f17431c;

    public C1487Au0() {
        this(4);
    }

    private final void e(int i10) {
        Object[] objArr = this.f17429a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.f17429a = Arrays.copyOf(objArr, AbstractC5301tu0.b(length, i11));
        }
    }

    private final AbstractC1539Bu0 f(boolean z9) {
        C6057zu0 c6057zu0;
        C6057zu0 c6057zu1;
        if (z9 && (c6057zu1 = this.f17431c) != null) {
            throw c6057zu1.a();
        }
        C5933yv0 c5933yv0L = C5933yv0.l(this.f17430b, this.f17429a, this);
        if (!z9 || (c6057zu0 = this.f17431c) == null) {
            return c5933yv0L;
        }
        throw c6057zu0.a();
    }

    public final C1487Au0 a(Object obj, Object obj2) {
        e(this.f17430b + 1);
        AbstractC2472Tt0.a(obj, obj2);
        Object[] objArr = this.f17429a;
        int i10 = this.f17430b;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.f17430b = i10 + 1;
        return this;
    }

    public final C1487Au0 b(Iterable iterable) {
        if (iterable instanceof Collection) {
            e(this.f17430b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final AbstractC1539Bu0 c() {
        return f(true);
    }

    public final AbstractC1539Bu0 d() {
        return f(false);
    }

    C1487Au0(int i10) {
        this.f17429a = new Object[i10 + i10];
        this.f17430b = 0;
    }
}
