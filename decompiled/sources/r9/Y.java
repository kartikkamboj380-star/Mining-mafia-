package r9;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y f48416a = new Y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f48417b = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final X f48418c = new X(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f48419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReference[] f48420e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f48419d = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f48420e = atomicReferenceArr;
    }

    private Y() {
    }

    private final AtomicReference a() {
        return f48420e[(int) (Thread.currentThread().getId() & (((long) f48419d) - 1))];
    }

    public static final void b(X segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f48414f != null || segment.f48415g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f48412d) {
            return;
        }
        AtomicReference atomicReferenceA = f48416a.a();
        X x10 = f48418c;
        X x11 = (X) atomicReferenceA.getAndSet(x10);
        if (x11 == x10) {
            return;
        }
        int i10 = x11 != null ? x11.f48411c : 0;
        if (i10 >= f48417b) {
            atomicReferenceA.set(x11);
            return;
        }
        segment.f48414f = x11;
        segment.f48410b = 0;
        segment.f48411c = i10 + 8192;
        atomicReferenceA.set(segment);
    }

    public static final X c() {
        AtomicReference atomicReferenceA = f48416a.a();
        X x10 = f48418c;
        X x11 = (X) atomicReferenceA.getAndSet(x10);
        if (x11 == x10) {
            return new X();
        }
        if (x11 == null) {
            atomicReferenceA.set(null);
            return new X();
        }
        atomicReferenceA.set(x11.f48414f);
        x11.f48414f = null;
        x11.f48411c = 0;
        return x11;
    }
}
