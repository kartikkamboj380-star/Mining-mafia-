package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1173t extends AbstractC1164j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f10232k = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f10233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p150p.a f10234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC1164j.b f10235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference f10236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f10240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final L8.x f10241j;

    /* JADX INFO: renamed from: androidx.lifecycle.t$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC1164j.b a(AbstractC1164j.b state1, AbstractC1164j.b bVar) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.t$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AbstractC1164j.b f10242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private InterfaceC1168n f10243b;

        public b(InterfaceC1171q interfaceC1171q, AbstractC1164j.b initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.c(interfaceC1171q);
            this.f10243b = C1176w.f(interfaceC1171q);
            this.f10242a = initialState;
        }

        public final void a(r rVar, AbstractC1164j.a event) {
            Intrinsics.checkNotNullParameter(event, "event");
            AbstractC1164j.b bVarE = event.e();
            this.f10242a = C1173t.f10232k.a(this.f10242a, bVarE);
            InterfaceC1168n interfaceC1168n = this.f10243b;
            Intrinsics.c(rVar);
            interfaceC1168n.onStateChanged(rVar, event);
            this.f10242a = bVarE;
        }

        public final AbstractC1164j.b b() {
            return this.f10242a;
        }
    }

    private C1173t(r rVar, boolean z9) {
        this.f10233b = z9;
        this.f10234c = new p150p.a();
        AbstractC1164j.b bVar = AbstractC1164j.b.INITIALIZED;
        this.f10235d = bVar;
        this.f10240i = new ArrayList();
        this.f10236e = new WeakReference(rVar);
        this.f10241j = L8.M.a(bVar);
    }

    private final void e(r rVar) {
        Iterator itDescendingIterator = this.f10234c.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.f10239h) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            Intrinsics.checkNotNullExpressionValue(entry, "next()");
            InterfaceC1171q interfaceC1171q = (InterfaceC1171q) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f10235d) > 0 && !this.f10239h && this.f10234c.contains(interfaceC1171q)) {
                AbstractC1164j.a aVarA = AbstractC1164j.a.Companion.a(bVar.b());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                m(aVarA.e());
                bVar.a(rVar, aVarA);
                l();
            }
        }
    }

    private final AbstractC1164j.b f(InterfaceC1171q interfaceC1171q) {
        b bVar;
        Map.Entry entryK = this.f10234c.k(interfaceC1171q);
        AbstractC1164j.b bVar2 = null;
        AbstractC1164j.b bVarB = (entryK == null || (bVar = (b) entryK.getValue()) == null) ? null : bVar.b();
        if (!this.f10240i.isEmpty()) {
            ArrayList arrayList = this.f10240i;
            bVar2 = (AbstractC1164j.b) arrayList.get(arrayList.size() - 1);
        }
        a aVar = f10232k;
        return aVar.a(aVar.a(this.f10235d, bVarB), bVar2);
    }

    private final void g(String str) {
        if (!this.f10233b || AbstractC1174u.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void h(r rVar) {
        p.b.d dVarD = this.f10234c.d();
        Intrinsics.checkNotNullExpressionValue(dVarD, "observerMap.iteratorWithAdditions()");
        while (dVarD.hasNext() && !this.f10239h) {
            Map.Entry entry = (Map.Entry) dVarD.next();
            InterfaceC1171q interfaceC1171q = (InterfaceC1171q) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f10235d) < 0 && !this.f10239h && this.f10234c.contains(interfaceC1171q)) {
                m(bVar.b());
                AbstractC1164j.a aVarB = AbstractC1164j.a.Companion.b(bVar.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(rVar, aVarB);
                l();
            }
        }
    }

    private final boolean j() {
        if (this.f10234c.size() == 0) {
            return true;
        }
        Map.Entry entryA = this.f10234c.a();
        Intrinsics.c(entryA);
        AbstractC1164j.b bVarB = ((b) entryA.getValue()).b();
        Map.Entry entryE = this.f10234c.e();
        Intrinsics.c(entryE);
        AbstractC1164j.b bVarB2 = ((b) entryE.getValue()).b();
        return bVarB == bVarB2 && this.f10235d == bVarB2;
    }

    private final void k(AbstractC1164j.b bVar) {
        AbstractC1164j.b bVar2 = this.f10235d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == AbstractC1164j.b.INITIALIZED && bVar == AbstractC1164j.b.DESTROYED) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + bVar + ", but was " + this.f10235d + " in component " + this.f10236e.get()).toString());
        }
        this.f10235d = bVar;
        if (this.f10238g || this.f10237f != 0) {
            this.f10239h = true;
            return;
        }
        this.f10238g = true;
        o();
        this.f10238g = false;
        if (this.f10235d == AbstractC1164j.b.DESTROYED) {
            this.f10234c = new p150p.a();
        }
    }

    private final void l() {
        ArrayList arrayList = this.f10240i;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void m(AbstractC1164j.b bVar) {
        this.f10240i.add(bVar);
    }

    private final void o() {
        r rVar = (r) this.f10236e.get();
        if (rVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!j()) {
            this.f10239h = false;
            AbstractC1164j.b bVar = this.f10235d;
            Map.Entry entryA = this.f10234c.a();
            Intrinsics.c(entryA);
            if (bVar.compareTo(((b) entryA.getValue()).b()) < 0) {
                e(rVar);
            }
            Map.Entry entryE = this.f10234c.e();
            if (!this.f10239h && entryE != null && this.f10235d.compareTo(((b) entryE.getValue()).b()) > 0) {
                h(rVar);
            }
        }
        this.f10239h = false;
        this.f10241j.setValue(b());
    }

    @Override // androidx.lifecycle.AbstractC1164j
    public void a(InterfaceC1171q observer) {
        r rVar;
        Intrinsics.checkNotNullParameter(observer, "observer");
        g("addObserver");
        AbstractC1164j.b bVar = this.f10235d;
        AbstractC1164j.b bVar2 = AbstractC1164j.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC1164j.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (((b) this.f10234c.i(observer, bVar3)) == null && (rVar = (r) this.f10236e.get()) != null) {
            boolean z9 = this.f10237f != 0 || this.f10238g;
            AbstractC1164j.b bVarF = f(observer);
            this.f10237f++;
            while (bVar3.b().compareTo(bVarF) < 0 && this.f10234c.contains(observer)) {
                m(bVar3.b());
                AbstractC1164j.a aVarB = AbstractC1164j.a.Companion.b(bVar3.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(rVar, aVarB);
                l();
                bVarF = f(observer);
            }
            if (!z9) {
                o();
            }
            this.f10237f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC1164j
    public AbstractC1164j.b b() {
        return this.f10235d;
    }

    @Override // androidx.lifecycle.AbstractC1164j
    public void d(InterfaceC1171q observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        g("removeObserver");
        this.f10234c.j(observer);
    }

    public void i(AbstractC1164j.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        g("handleLifecycleEvent");
        k(event.e());
    }

    public void n(AbstractC1164j.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        g("setCurrentState");
        k(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1173t(r provider) {
        this(provider, true);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}
