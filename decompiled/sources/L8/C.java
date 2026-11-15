package L8;

import I8.C0687p;
import I8.InterfaceC0670g0;
import M8.AbstractC0818b;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class C extends AbstractC0818b implements w, InterfaceC0804e, M8.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f3164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f3165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final K8.a f3166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object[] f3167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f3168i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f3169j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f3170k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f3171l;

    private static final class a implements InterfaceC0670g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C f3172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f3173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f3174c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p169q8.b f3175d;

        public a(C c10, long j10, Object obj, p169q8.b bVar) {
            this.f3172a = c10;
            this.f3173b = j10;
            this.f3174c = obj;
            this.f3175d = bVar;
        }

        @Override // I8.InterfaceC0670g0
        public void c() {
            this.f3172a.y(this);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3176a;

        static {
            int[] iArr = new int[K8.a.values().length];
            try {
                iArr[K8.a.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[K8.a.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[K8.a.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3176a = iArr;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f3177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f3178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f3179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3180d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f3181e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3183g;

        c(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3181e = obj;
            this.f3183g |= LinearLayoutManager.INVALID_OFFSET;
            return C.A(C.this, null, this);
        }
    }

    public C(int i10, int i11, K8.a aVar) {
        this.f3164e = i10;
        this.f3165f = i11;
        this.f3166g = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (((L8.O) r9).a(r0) == r1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object A(L8.C r8, L8.InterfaceC0805f r9, p169q8.b r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L8.C.A(L8.C, L8.f, q8.b):java.lang.Object");
    }

    private final void B(long j10) {
        M8.d[] dVarArr;
        if (((AbstractC0818b) this).f3546b != 0 && (dVarArr = ((AbstractC0818b) this).f3545a) != null) {
            for (M8.d dVar : dVarArr) {
                if (dVar != null) {
                    E e10 = (E) dVar;
                    long j11 = e10.f3185a;
                    if (j11 >= 0 && j11 < j10) {
                        e10.f3185a = j10;
                    }
                }
            }
        }
        this.f3169j = j10;
    }

    private final void E() {
        Object[] objArr = this.f3167h;
        Intrinsics.c(objArr);
        D.g(objArr, K(), null);
        this.f3170k--;
        long jK = K() + 1;
        if (this.f3168i < jK) {
            this.f3168i = jK;
        }
        if (this.f3169j < jK) {
            B(jK);
        }
    }

    static /* synthetic */ Object F(C c10, Object obj, p169q8.b bVar) throws Throwable {
        if (c10.c(obj)) {
            return Unit.f45918a;
        }
        Object objG = c10.G(obj, bVar);
        return objG == p179r8.b.e() ? objG : Unit.f45918a;
    }

    private final Object G(Object obj, p169q8.b bVar) throws Throwable {
        Throwable th;
        p169q8.b[] bVarArrI;
        a aVar;
        C0687p c0687p = new C0687p(p179r8.b.c(bVar), 1);
        c0687p.G();
        p169q8.b[] bVarArrI2 = M8.c.f3549a;
        synchronized (this) {
            try {
                if (R(obj)) {
                    try {
                        m8.m.a aVar2 = p129m8.m.f46450b;
                        c0687p.resumeWith(p129m8.m.b(Unit.f45918a));
                        bVarArrI = I(bVarArrI2);
                        aVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        aVar = new a(this, K() + ((long) P()), obj, c0687p);
                        H(aVar);
                        this.f3171l++;
                        if (this.f3165f == 0) {
                            bVarArrI2 = I(bVarArrI2);
                        }
                        bVarArrI = bVarArrI2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (aVar != null) {
                    I8.r.a(c0687p, aVar);
                }
                for (p169q8.b bVar2 : bVarArrI) {
                    if (bVar2 != null) {
                        m8.m.a aVar3 = p129m8.m.f46450b;
                        bVar2.resumeWith(p129m8.m.b(Unit.f45918a));
                    }
                }
                Object objA = c0687p.A();
                if (objA == p179r8.b.e()) {
                    kotlin.coroutines.jvm.internal.h.c(bVar);
                }
                return objA == p179r8.b.e() ? objA : Unit.f45918a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(Object obj) {
        int iP = P();
        Object[] objArrQ = this.f3167h;
        if (objArrQ == null) {
            objArrQ = Q(null, 0, 2);
        } else if (iP >= objArrQ.length) {
            objArrQ = Q(objArrQ, iP, objArrQ.length * 2);
        }
        D.g(objArrQ, K() + ((long) iP), obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [q8.b[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final p169q8.b[] I(p169q8.b[] bVarArr) {
        M8.d[] dVarArr;
        E e10;
        p169q8.b bVar;
        int length = bVarArr.length;
        if (((AbstractC0818b) this).f3546b != 0 && (dVarArr = ((AbstractC0818b) this).f3545a) != null) {
            int length2 = dVarArr.length;
            int i10 = 0;
            while (i10 < length2) {
                M8.d dVar = dVarArr[i10];
                if (dVar == null || (bVar = (e10 = (E) dVar).f3186b) == null || T(e10) < 0) {
                    bVarArr = bVarArr;
                } else {
                    if (length >= bVarArr.length) {
                        bVarArr = bVarArr;
                        bVarArr = bVarArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) bVarArr, Math.max(2, bVarArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                        bVarArr = objArrCopyOf;
                    }
                    bVarArr = bVarArr;
                    bVarArr = bVarArr;
                    ((p169q8.b[]) bVarArr)[length] = bVar;
                    e10.f3186b = null;
                    length++;
                }
                i10++;
                bVarArr = bVarArr;
            }
            bVarArr = bVarArr;
        }
        return (p169q8.b[]) bVarArr;
    }

    private final long J() {
        return K() + ((long) this.f3170k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long K() {
        return Math.min(this.f3169j, this.f3168i);
    }

    private final Object M(long j10) {
        Object[] objArr = this.f3167h;
        Intrinsics.c(objArr);
        Object objF = D.f(objArr, j10);
        return objF instanceof a ? ((a) objF).f3174c : objF;
    }

    private final long N() {
        return K() + ((long) this.f3170k) + ((long) this.f3171l);
    }

    private final int O() {
        return (int) ((K() + ((long) this.f3170k)) - this.f3168i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P() {
        return this.f3170k + this.f3171l;
    }

    private final Object[] Q(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f3167h = objArr2;
        if (objArr != null) {
            long jK = K();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = ((long) i12) + jK;
                D.g(objArr2, j10, D.f(objArr, j10));
            }
        }
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R(Object obj) {
        if (l() == 0) {
            return S(obj);
        }
        if (this.f3170k >= this.f3165f && this.f3169j <= this.f3168i) {
            int i10 = b.f3176a[this.f3166g.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new p129m8.k();
            }
        }
        H(obj);
        int i11 = this.f3170k + 1;
        this.f3170k = i11;
        if (i11 > this.f3165f) {
            E();
        }
        if (O() > this.f3164e) {
            V(this.f3168i + 1, this.f3169j, J(), N());
        }
        return true;
    }

    private final boolean S(Object obj) {
        if (this.f3164e == 0) {
            return true;
        }
        H(obj);
        int i10 = this.f3170k + 1;
        this.f3170k = i10;
        if (i10 > this.f3164e) {
            E();
        }
        this.f3169j = K() + ((long) this.f3170k);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long T(E e10) {
        long j10 = e10.f3185a;
        if (j10 >= J() && (this.f3165f > 0 || j10 > K() || this.f3171l == 0)) {
            return -1L;
        }
        return j10;
    }

    private final Object U(E e10) {
        Object obj;
        p169q8.b[] bVarArrW = M8.c.f3549a;
        synchronized (this) {
            try {
                long jT = T(e10);
                if (jT < 0) {
                    obj = D.f3184a;
                } else {
                    long j10 = e10.f3185a;
                    Object objM = M(jT);
                    e10.f3185a = jT + 1;
                    bVarArrW = W(j10);
                    obj = objM;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (p169q8.b bVar : bVarArrW) {
            if (bVar != null) {
                m8.m.a aVar = p129m8.m.f46450b;
                bVar.resumeWith(p129m8.m.b(Unit.f45918a));
            }
        }
        return obj;
    }

    private final void V(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jK = K(); jK < jMin; jK++) {
            Object[] objArr = this.f3167h;
            Intrinsics.c(objArr);
            D.g(objArr, jK, null);
        }
        this.f3168i = j10;
        this.f3169j = j11;
        this.f3170k = (int) (j12 - jMin);
        this.f3171l = (int) (j13 - j12);
    }

    private final Object x(E e10, p169q8.b bVar) {
        C0687p c0687p = new C0687p(p179r8.b.c(bVar), 1);
        c0687p.G();
        synchronized (this) {
            try {
                if (T(e10) < 0) {
                    e10.f3186b = c0687p;
                } else {
                    m8.m.a aVar = p129m8.m.f46450b;
                    c0687p.resumeWith(p129m8.m.b(Unit.f45918a));
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objA = c0687p.A();
        if (objA == p179r8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(bVar);
        }
        return objA == p179r8.b.e() ? objA : Unit.f45918a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(a aVar) {
        synchronized (this) {
            if (aVar.f3173b < K()) {
                return;
            }
            Object[] objArr = this.f3167h;
            Intrinsics.c(objArr);
            if (D.f(objArr, aVar.f3173b) != aVar) {
                return;
            }
            D.g(objArr, aVar.f3173b, D.f3184a);
            z();
            Unit unit = Unit.f45918a;
        }
    }

    private final void z() {
        if (this.f3165f != 0 || this.f3171l > 1) {
            Object[] objArr = this.f3167h;
            Intrinsics.c(objArr);
            while (this.f3171l > 0 && D.f(objArr, (K() + ((long) P())) - 1) == D.f3184a) {
                this.f3171l--;
                D.g(objArr, K() + ((long) P()), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // M8.AbstractC0818b
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public E f() {
        return new E();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // M8.AbstractC0818b
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public E[] i(int i10) {
        return new E[i10];
    }

    protected final Object L() {
        Object[] objArr = this.f3167h;
        Intrinsics.c(objArr);
        return D.f(objArr, (this.f3168i + ((long) O())) - 1);
    }

    public final p169q8.b[] W(long j10) {
        long j11;
        long j12;
        long j13;
        M8.d[] dVarArr;
        if (j10 > this.f3169j) {
            return M8.c.f3549a;
        }
        long jK = K();
        long j14 = ((long) this.f3170k) + jK;
        if (this.f3165f == 0 && this.f3171l > 0) {
            j14++;
        }
        if (((AbstractC0818b) this).f3546b != 0 && (dVarArr = ((AbstractC0818b) this).f3545a) != null) {
            for (M8.d dVar : dVarArr) {
                if (dVar != null) {
                    long j15 = ((E) dVar).f3185a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.f3169j) {
            return M8.c.f3549a;
        }
        long J9 = J();
        int iMin = l() > 0 ? Math.min(this.f3171l, this.f3165f - ((int) (J9 - j14))) : this.f3171l;
        p169q8.b[] bVarArr = M8.c.f3549a;
        long j16 = ((long) this.f3171l) + J9;
        if (iMin > 0) {
            bVarArr = new p169q8.b[iMin];
            Object[] objArr = this.f3167h;
            Intrinsics.c(objArr);
            j13 = 1;
            long j17 = J9;
            int i10 = 0;
            while (true) {
                if (J9 >= j16) {
                    j11 = jK;
                    j12 = j14;
                    J9 = j17;
                    break;
                }
                Object objF = D.f(objArr, J9);
                j11 = jK;
                N8.D d10 = D.f3184a;
                if (objF != d10) {
                    Intrinsics.d(objF, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objF;
                    int i11 = i10 + 1;
                    j12 = j14;
                    bVarArr[i10] = aVar.f3175d;
                    D.g(objArr, J9, d10);
                    D.g(objArr, j17, aVar.f3174c);
                    long j18 = j17 + 1;
                    if (i11 >= iMin) {
                        J9 = j18;
                        break;
                    }
                    i10 = i11;
                    j17 = j18;
                } else {
                    j12 = j14;
                }
                J9++;
                jK = j11;
                j14 = j12;
            }
        } else {
            j11 = jK;
            j12 = j14;
            j13 = 1;
        }
        p169q8.b[] bVarArr2 = bVarArr;
        int i12 = (int) (J9 - j11);
        long j19 = l() == 0 ? J9 : j12;
        long jMax = Math.max(this.f3168i, J9 - ((long) Math.min(this.f3164e, i12)));
        if (this.f3165f == 0 && jMax < j16) {
            Object[] objArr2 = this.f3167h;
            Intrinsics.c(objArr2);
            if (Intrinsics.b(D.f(objArr2, jMax), D.f3184a)) {
                J9 += j13;
                jMax += j13;
            }
        }
        V(jMax, j19, J9, j16);
        z();
        return !(bVarArr2.length == 0) ? I(bVarArr2) : bVarArr2;
    }

    public final long X() {
        long j10 = this.f3168i;
        if (j10 < this.f3169j) {
            this.f3169j = j10;
        }
        return j10;
    }

    @Override // M8.p
    public InterfaceC0804e a(CoroutineContext coroutineContext, int i10, K8.a aVar) {
        return D.e(this, coroutineContext, i10, aVar);
    }

    @Override // L8.w
    public boolean c(Object obj) {
        int i10;
        boolean z9;
        p169q8.b[] bVarArrI = M8.c.f3549a;
        synchronized (this) {
            if (R(obj)) {
                bVarArrI = I(bVarArrI);
                z9 = true;
            } else {
                z9 = false;
            }
        }
        for (p169q8.b bVar : bVarArrI) {
            if (bVar != null) {
                m8.m.a aVar = p129m8.m.f46450b;
                bVar.resumeWith(p129m8.m.b(Unit.f45918a));
            }
        }
        return z9;
    }

    @Override // L8.B, L8.InterfaceC0804e
    public Object collect(InterfaceC0805f interfaceC0805f, p169q8.b bVar) {
        return A(this, interfaceC0805f, bVar);
    }

    @Override // L8.w, L8.InterfaceC0805f
    public Object emit(Object obj, p169q8.b bVar) {
        return F(this, obj, bVar);
    }

    @Override // L8.w
    public void k() throws Throwable {
        synchronized (this) {
            try {
                try {
                    V(J(), this.f3169j, J(), N());
                    Unit unit = Unit.f45918a;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
