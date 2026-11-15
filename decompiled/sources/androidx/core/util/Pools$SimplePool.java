package androidx.core.util;

import N.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class Pools$SimplePool implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f9310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9311b;

    public Pools$SimplePool(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f9310a = new Object[i10];
    }

    private final boolean c(Object obj) {
        int i10 = this.f9311b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f9310a[i11] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // N.d
    public boolean a(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (c(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i10 = this.f9311b;
        Object[] objArr = this.f9310a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = instance;
        this.f9311b = i10 + 1;
        return true;
    }

    @Override // N.d
    public Object b() {
        int i10 = this.f9311b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = this.f9310a[i11];
        Intrinsics.d(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f9310a[i11] = null;
        this.f9311b--;
        return obj;
    }
}
