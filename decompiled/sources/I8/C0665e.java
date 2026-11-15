package I8;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: I8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0665e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f1768b = AtomicIntegerFieldUpdater.newUpdater(C0665e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W[] f1769a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: renamed from: I8.e$a */
    private final class a extends G0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f1770h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final InterfaceC0683n f1771e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC0670g0 f1772f;

        public a(InterfaceC0683n interfaceC0683n) {
            this.f1771e = interfaceC0683n;
        }

        public final void B(b bVar) {
            f1770h.set(this, bVar);
        }

        public final void C(InterfaceC0670g0 interfaceC0670g0) {
            this.f1772f = interfaceC0670g0;
        }

        @Override // I8.G0
        public boolean v() {
            return false;
        }

        @Override // I8.G0
        public void w(Throwable th) {
            if (th != null) {
                Object objI = this.f1771e.i(th);
                if (objI != null) {
                    this.f1771e.s(objI);
                    b bVarY = y();
                    if (bVarY != null) {
                        bVarY.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C0665e.d().decrementAndGet(C0665e.this) == 0) {
                InterfaceC0683n interfaceC0683n = this.f1771e;
                W[] wArr = C0665e.this.f1769a;
                ArrayList arrayList = new ArrayList(wArr.length);
                for (W w10 : wArr) {
                    arrayList.add(w10.n());
                }
                interfaceC0683n.resumeWith(p129m8.m.b(arrayList));
            }
        }

        public final b y() {
            return (b) f1770h.get(this);
        }

        public final InterfaceC0670g0 z() {
            InterfaceC0670g0 interfaceC0670g0 = this.f1772f;
            if (interfaceC0670g0 != null) {
                return interfaceC0670g0;
            }
            Intrinsics.r("handle");
            return null;
        }
    }

    /* JADX INFO: renamed from: I8.e$b */
    private final class b implements InterfaceC0681m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a[] f1774a;

        public b(a[] aVarArr) {
            this.f1774a = aVarArr;
        }

        @Override // I8.InterfaceC0681m
        public void a(Throwable th) {
            b();
        }

        public final void b() {
            for (a aVar : this.f1774a) {
                aVar.z().c();
            }
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f1774a + ']';
        }
    }

    public C0665e(W[] wArr) {
        this.f1769a = wArr;
        this.notCompletedCount$volatile = wArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater d() {
        return f1768b;
    }

    public final Object c(p169q8.b bVar) {
        C0687p c0687p = new C0687p(p179r8.b.c(bVar), 1);
        c0687p.G();
        int length = this.f1769a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            W w10 = this.f1769a[i10];
            w10.start();
            a aVar = new a(c0687p);
            aVar.C(F0.j(w10, false, aVar, 1, null));
            Unit unit = Unit.f45918a;
            aVarArr[i10] = aVar;
        }
        b bVar2 = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].B(bVar2);
        }
        if (c0687p.a()) {
            bVar2.b();
        } else {
            r.c(c0687p, bVar2);
        }
        Object objA = c0687p.A();
        if (objA == p179r8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(bVar);
        }
        return objA;
    }
}
