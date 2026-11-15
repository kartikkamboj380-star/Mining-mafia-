package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class e implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final ThreadLocal f10700e = new ThreadLocal();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static Comparator f10701f = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f10703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f10704c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f10702a = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f10705d = new ArrayList();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f10713d;
            if ((recyclerView == null) != (cVar2.f10713d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z9 = cVar.f10710a;
            if (z9 != cVar2.f10710a) {
                return z9 ? -1 : 1;
            }
            int i10 = cVar2.f10711b - cVar.f10711b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f10712c - cVar2.f10712c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    static class b implements RecyclerView.p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int[] f10708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f10709d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f10709d;
            int i13 = i12 * 2;
            int[] iArr = this.f10708c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f10708c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f10708c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f10708c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f10709d++;
        }

        void b() {
            int[] iArr = this.f10708c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f10709d = 0;
        }

        void c(RecyclerView recyclerView, boolean z9) {
            this.f10709d = 0;
            int[] iArr = this.f10708c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.f10444m;
            if (recyclerView.f10442l == null || pVar == null || !pVar.isItemPrefetchEnabled()) {
                return;
            }
            if (z9) {
                if (!recyclerView.f10426d.p()) {
                    pVar.collectInitialPrefetchPositions(recyclerView.f10442l.getItemCount(), this);
                }
            } else if (!recyclerView.n0()) {
                pVar.collectAdjacentPrefetchPositions(this.f10706a, this.f10707b, recyclerView.f10459y0, this);
            }
            int i10 = this.f10709d;
            if (i10 > pVar.mPrefetchMaxCountObserved) {
                pVar.mPrefetchMaxCountObserved = i10;
                pVar.mPrefetchMaxObservedInInitialPrefetch = z9;
                recyclerView.f10422b.K();
            }
        }

        boolean d(int i10) {
            if (this.f10708c != null) {
                int i11 = this.f10709d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f10708c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i10, int i11) {
            this.f10706a = i10;
            this.f10707b = i11;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10712c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f10713d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10714e;

        c() {
        }

        public void a() {
            this.f10710a = false;
            this.f10711b = 0;
            this.f10712c = 0;
            this.f10713d = null;
            this.f10714e = 0;
        }
    }

    e() {
    }

    private void b() {
        c cVar;
        int size = this.f10702a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = (RecyclerView) this.f10702a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f10458x0.c(recyclerView, false);
                i10 += recyclerView.f10458x0.f10709d;
            }
        }
        this.f10705d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f10702a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f10458x0;
                int iAbs = Math.abs(bVar.f10706a) + Math.abs(bVar.f10707b);
                for (int i14 = 0; i14 < bVar.f10709d * 2; i14 += 2) {
                    if (i12 >= this.f10705d.size()) {
                        cVar = new c();
                        this.f10705d.add(cVar);
                    } else {
                        cVar = (c) this.f10705d.get(i12);
                    }
                    int[] iArr = bVar.f10708c;
                    int i15 = iArr[i14 + 1];
                    cVar.f10710a = i15 <= iAbs;
                    cVar.f10711b = iAbs;
                    cVar.f10712c = i15;
                    cVar.f10713d = recyclerView2;
                    cVar.f10714e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f10705d, f10701f);
    }

    private void c(c cVar, long j10) {
        RecyclerView.D dI = i(cVar.f10713d, cVar.f10714e, cVar.f10710a ? Long.MAX_VALUE : j10);
        if (dI == null || dI.mNestedRecyclerView == null || !dI.isBound() || dI.isInvalid()) {
            return;
        }
        h(dI.mNestedRecyclerView.get(), j10);
    }

    private void d(long j10) {
        for (int i10 = 0; i10 < this.f10705d.size(); i10++) {
            c cVar = (c) this.f10705d.get(i10);
            if (cVar.f10713d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int iJ = recyclerView.f10428e.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            RecyclerView.D dH0 = RecyclerView.h0(recyclerView.f10428e.i(i11));
            if (dH0.mPosition == i10 && !dH0.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f10417U && recyclerView.f10428e.j() != 0) {
            recyclerView.W0();
        }
        b bVar = recyclerView.f10458x0;
        bVar.c(recyclerView, true);
        if (bVar.f10709d != 0) {
            try {
                K.o.a("RV Nested Prefetch");
                recyclerView.f10459y0.f(recyclerView.f10442l);
                for (int i10 = 0; i10 < bVar.f10709d * 2; i10 += 2) {
                    i(recyclerView, bVar.f10708c[i10], j10);
                }
                K.o.b();
            } catch (Throwable th) {
                K.o.b();
                throw th;
            }
        }
    }

    private RecyclerView.D i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.f10422b;
        try {
            recyclerView.I0();
            RecyclerView.D dI = vVar.I(i10, false, j10);
            if (dI != null) {
                if (!dI.isBound() || dI.isInvalid()) {
                    vVar.a(dI, false);
                } else {
                    vVar.B(dI.itemView);
                }
            }
            return dI;
        } finally {
            recyclerView.K0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f10702a.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f10703b == 0) {
            this.f10703b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f10458x0.e(i10, i11);
    }

    void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        this.f10702a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            K.o.a("RV Prefetch");
            if (!this.f10702a.isEmpty()) {
                int size = this.f10702a.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) this.f10702a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f10704c);
                }
            }
        } finally {
            this.f10703b = 0L;
            K.o.b();
        }
    }
}
