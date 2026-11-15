package N8;

import I8.X0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f3688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f3689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X0[] f3690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3691d;

    public O(CoroutineContext coroutineContext, int i10) {
        this.f3688a = coroutineContext;
        this.f3689b = new Object[i10];
        this.f3690c = new X0[i10];
    }

    public final void a(X0 x10, Object obj) {
        Object[] objArr = this.f3689b;
        int i10 = this.f3691d;
        objArr[i10] = obj;
        X0[] x0Arr = this.f3690c;
        this.f3691d = i10 + 1;
        Intrinsics.d(x10, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        x0Arr[i10] = x10;
    }

    public final void b(CoroutineContext coroutineContext) {
        int length = this.f3690c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            X0 x10 = this.f3690c[length];
            Intrinsics.c(x10);
            x10.V(coroutineContext, this.f3689b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
