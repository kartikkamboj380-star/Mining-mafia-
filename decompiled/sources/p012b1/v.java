package p012b1;

import I8.AbstractC0677k;
import I8.O;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p129m8.n;
import p132n1.e;
import p132n1.f;
import p132n1.q;
import p132n1.r;
import p192t1.A;
import p192t1.B;
import p192t1.s;

/* JADX INFO: loaded from: classes.dex */
public final class v implements r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f11547g = AtomicIntegerFieldUpdater.newUpdater(v.class, "f");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f11548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O f11549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A f11550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f11551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f11552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile /* synthetic */ int f11553f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f11554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f.b f11555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Lazy f11556c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Lazy f11557d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final j.c f11558e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final h f11559f;

        public a(Context context, f.b bVar, Lazy lazy, Lazy lazy2, j.c cVar, h hVar, s sVar) {
            this.f11554a = context;
            this.f11555b = bVar;
            this.f11556c = lazy;
            this.f11557d = lazy2;
            this.f11558e = cVar;
            this.f11559f = hVar;
        }

        public final Context a() {
            return this.f11554a;
        }

        public final h b() {
            return this.f11559f;
        }

        public final f.b c() {
            return this.f11555b;
        }

        public final Lazy d() {
            return this.f11557d;
        }

        public final j.c e() {
            return this.f11558e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.b(this.f11554a, aVar.f11554a) && Intrinsics.b(this.f11555b, aVar.f11555b) && Intrinsics.b(this.f11556c, aVar.f11556c) && Intrinsics.b(this.f11557d, aVar.f11557d) && Intrinsics.b(this.f11558e, aVar.f11558e) && Intrinsics.b(this.f11559f, aVar.f11559f) && Intrinsics.b(null, null);
        }

        public final s f() {
            return null;
        }

        public final Lazy g() {
            return this.f11556c;
        }

        public int hashCode() {
            return ((((((((((this.f11554a.hashCode() * 31) + this.f11555b.hashCode()) * 31) + this.f11556c.hashCode()) * 31) + this.f11557d.hashCode()) * 31) + this.f11558e.hashCode()) * 31) + this.f11559f.hashCode()) * 31;
        }

        public String toString() {
            return "Options(application=" + this.f11554a + ", defaults=" + this.f11555b + ", memoryCacheLazy=" + this.f11556c + ", diskCacheLazy=" + this.f11557d + ", eventListenerFactory=" + this.f11558e + ", componentRegistry=" + this.f11559f + ", logger=" + ((Object) null) + ')';
        }
    }

    static final class b extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11560a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f11562c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, p169q8.b bVar) {
            super(2, bVar);
            this.f11562c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p169q8.b create(Object obj, p169q8.b bVar) {
            return v.this.new b(this.f11562c, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, p169q8.b bVar) {
            return ((b) create(o10, bVar)).invokeSuspend(Unit.f45918a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p179r8.b.e();
            int i10 = this.f11560a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
                return obj;
            }
            n.b(obj);
            v vVar = v.this;
            f fVar = this.f11562c;
            this.f11560a = 1;
            Object objF = vVar.f(fVar, 0, this);
            return objF == objE ? objE : objF;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f11563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f11564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f11565c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f11566d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f11567e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f11568f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f11570h;

        c(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11568f = obj;
            this.f11570h |= LinearLayoutManager.INVALID_OFFSET;
            return v.this.f(null, 0, this);
        }
    }

    static final class d extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f11572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v f11573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p142o1.f f11574d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ j f11575e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ n f11576f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f fVar, v vVar, p142o1.f fVar2, j jVar, n nVar, p169q8.b bVar) {
            super(2, bVar);
            this.f11572b = fVar;
            this.f11573c = vVar;
            this.f11574d = fVar2;
            this.f11575e = jVar;
            this.f11576f = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p169q8.b create(Object obj, p169q8.b bVar) {
            return new d(this.f11572b, this.f11573c, this.f11574d, this.f11575e, this.f11576f, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, p169q8.b bVar) {
            return ((d) create(o10, bVar)).invokeSuspend(Unit.f45918a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p179r8.b.e();
            int i10 = this.f11571a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
                return obj;
            }
            n.b(obj);
            p052f1.d dVar = new p052f1.d(this.f11572b, this.f11573c.getComponents().g(), 0, this.f11572b, this.f11574d, this.f11575e, this.f11576f != null);
            this.f11571a = 1;
            Object objH = dVar.h(this);
            return objH == objE ? objE : objH;
        }
    }

    public v(a aVar) {
        this.f11548a = aVar;
        aVar.f();
        this.f11549b = y.c(null);
        A a10 = B.a(this);
        this.f11550c = a10;
        aVar.f();
        q qVarA = r.a(this, a10, null);
        this.f11551d = qVarA;
        aVar.g();
        aVar.d();
        h.a aVarE = y.e(B.a(A.a(z.a(y.f(aVar.b().l(), aVar), aVar), aVar), aVar));
        aVar.f();
        this.f11552e = aVarE.i(new p052f1.a(this, a10, qVarA, null)).p();
        this.f11553f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 4621. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.lang.Object f(p132n1.f r20, int r21, p169q8.b r22) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012b1.v.f(n1.f, int, q8.b):java.lang.Object");
    }

    private final void h(f fVar, j jVar) {
        this.f11548a.f();
        jVar.b(fVar);
        f.d dVarP = fVar.p();
        if (dVarP != null) {
            dVarP.b(fVar);
        }
    }

    private final void i(e eVar, p172r1.a aVar, j jVar) {
        f fVarB = eVar.b();
        this.f11548a.f();
        if (aVar != null) {
            aVar.c(eVar.a());
        }
        jVar.c(fVarB, eVar);
        f.d dVarP = fVarB.p();
        if (dVarP != null) {
            dVarP.c(fVarB, eVar);
        }
    }

    private final void j(p132n1.s sVar, p172r1.a aVar, j jVar) {
        f fVarB = sVar.b();
        sVar.a();
        this.f11548a.f();
        if (aVar != null) {
            aVar.b(sVar.c());
        }
        jVar.a(fVarB, sVar);
        f.d dVarP = fVarB.p();
        if (dVarP != null) {
            dVarP.a(fVarB, sVar);
        }
    }

    @Override // p012b1.r
    public f.b a() {
        return this.f11548a.c();
    }

    @Override // p012b1.r
    public p032d1.a b() {
        return (p032d1.a) this.f11548a.d().getValue();
    }

    @Override // p012b1.r
    public p132n1.d c(f fVar) {
        return z.c(fVar, AbstractC0677k.b(this.f11549b, null, null, new b(fVar, null), 3, null));
    }

    @Override // p012b1.r
    public p082i1.d d() {
        return (p082i1.d) this.f11548a.g().getValue();
    }

    public final a g() {
        return this.f11548a;
    }

    @Override // p012b1.r
    public h getComponents() {
        return this.f11552e;
    }
}
