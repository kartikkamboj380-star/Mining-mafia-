package p044e3;

import N.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f43268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43269b;

    public b(int i10) {
        this.f43268a = new Object[i10];
    }

    @Override // N.d
    public synchronized boolean a(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        int i10 = this.f43269b;
        Object[] objArr = this.f43268a;
        if (i10 == objArr.length) {
            return false;
        }
        objArr[i10] = instance;
        this.f43269b = i10 + 1;
        return true;
    }

    @Override // N.d
    public synchronized Object b() {
        int i10 = this.f43269b;
        if (i10 == 0) {
            return null;
        }
        int i11 = i10 - 1;
        this.f43269b = i11;
        Object obj = this.f43268a[i11];
        Intrinsics.d(obj, "null cannot be cast to non-null type T of com.facebook.react.common.ClearableSynchronizedPool");
        this.f43268a[i11] = null;
        return obj;
    }

    public final synchronized void c() {
        try {
            int i10 = this.f43269b;
            for (int i11 = 0; i11 < i10; i11++) {
                this.f43268a[i11] = null;
            }
            this.f43269b = 0;
        } catch (Throwable th) {
            throw th;
        }
    }
}
