package p057f6;

import D6.c;
import D6.d;
import android.util.Log;
import androidx.lifecycle.AbstractC1169o;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class n implements InterfaceC6983d, p247y6.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final G6.b f43703i = new G6.b() { // from class: f6.j
        @Override // G6.b
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f43704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f43705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f43706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f43707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set f43708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u f43709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f43710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f43711h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f43712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f43713b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f43714c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private i f43715d = i.f43696a;

        b(Executor executor) {
            this.f43712a = executor;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(C6982c c6982c) {
            this.f43714c.add(c6982c);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f43713b.add(new G6.b() { // from class: f6.o
                @Override // G6.b
                public final Object get() {
                    return n.b.a(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f43713b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f43712a, this.f43713b, this.f43714c, this.f43715d);
        }

        public b f(i iVar) {
            this.f43715d = iVar;
            return this;
        }
    }

    public static /* synthetic */ Object j(n nVar, C6982c c6982c) {
        nVar.getClass();
        return c6982c.h().a(new F(c6982c, nVar));
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List list) {
        int i10;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f43707d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((G6.b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f43711h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (v e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = list.iterator();
            while (true) {
                i10 = 0;
                if (!it2.hasNext()) {
                    break;
                }
                Object[] array = ((C6982c) it2.next()).j().toArray();
                int length = array.length;
                while (i10 < length) {
                    Object obj = array[i10];
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f43708e.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f43708e.add(obj.toString());
                    }
                    i10++;
                }
            }
            if (this.f43704a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f43704a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final C6982c c6982c = (C6982c) it3.next();
                this.f43704a.put(c6982c, new w(new G6.b() { // from class: f6.k
                    @Override // G6.b
                    public final Object get() {
                        return n.j(this.f43697a, c6982c);
                    }
                }));
            }
            arrayList.addAll(t(list));
            arrayList.addAll(u());
            s();
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
        r();
    }

    private void o(Map map, boolean z9) {
        for (Map.Entry entry : map.entrySet()) {
            C6982c c6982c = (C6982c) entry.getKey();
            G6.b bVar = (G6.b) entry.getValue();
            if (c6982c.n() || (c6982c.o() && z9)) {
                bVar.get();
            }
        }
        this.f43709f.f();
    }

    private static List q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private void r() {
        Boolean bool = (Boolean) this.f43710g.get();
        if (bool != null) {
            o(this.f43704a, bool.booleanValue());
        }
    }

    private void s() {
        for (C6982c c6982c : this.f43704a.keySet()) {
            for (q qVar : c6982c.g()) {
                if (qVar.g() && !this.f43706c.containsKey(qVar.c())) {
                    this.f43706c.put(qVar.c(), x.b(Collections.EMPTY_SET));
                } else if (this.f43705b.containsKey(qVar.c())) {
                    continue;
                } else {
                    if (qVar.f()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", c6982c, qVar.c()));
                    }
                    if (!qVar.g()) {
                        this.f43705b.put(qVar.c(), C.e());
                    }
                }
            }
        }
    }

    private List t(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6982c c6982c = (C6982c) it.next();
            if (c6982c.p()) {
                final G6.b bVar = (G6.b) this.f43704a.get(c6982c);
                for (E e10 : c6982c.j()) {
                    if (this.f43705b.containsKey(e10)) {
                        final C c10 = (C) ((G6.b) this.f43705b.get(e10));
                        arrayList.add(new Runnable() { // from class: f6.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                c10.g(bVar);
                            }
                        });
                    } else {
                        this.f43705b.put(e10, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List u() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f43704a.entrySet()) {
            C6982c c6982c = (C6982c) entry.getKey();
            if (!c6982c.p()) {
                G6.b bVar = (G6.b) entry.getValue();
                for (E e10 : c6982c.j()) {
                    if (!map.containsKey(e10)) {
                        map.put(e10, new HashSet());
                    }
                    ((Set) map.get(e10)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f43706c.containsKey(entry2.getKey())) {
                final x xVar = (x) this.f43706c.get(entry2.getKey());
                for (final G6.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: f6.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            xVar.a(bVar2);
                        }
                    });
                }
            } else {
                this.f43706c.put((E) entry2.getKey(), x.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // p057f6.InterfaceC6983d
    public G6.a b(E e10) {
        G6.b bVarG = g(e10);
        if (bVarG == null) {
            return C.e();
        }
        return bVarG instanceof C ? (C) bVarG : C.f(bVarG);
    }

    @Override // p057f6.InterfaceC6983d
    public synchronized G6.b d(E e10) {
        x xVar = (x) this.f43706c.get(e10);
        if (xVar != null) {
            return xVar;
        }
        return f43703i;
    }

    @Override // p057f6.InterfaceC6983d
    public synchronized G6.b g(E e10) {
        D.c(e10, "Null interface requested.");
        return (G6.b) this.f43705b.get(e10);
    }

    public void p(boolean z9) {
        HashMap map;
        if (AbstractC1169o.a(this.f43710g, null, Boolean.valueOf(z9))) {
            synchronized (this) {
                map = new HashMap(this.f43704a);
            }
            o(map, z9);
        }
    }

    private n(Executor executor, Iterable iterable, Collection collection, i iVar) {
        this.f43704a = new HashMap();
        this.f43705b = new HashMap();
        this.f43706c = new HashMap();
        this.f43708e = new HashSet();
        this.f43710g = new AtomicReference();
        u uVar = new u(executor);
        this.f43709f = uVar;
        this.f43711h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C6982c.q(uVar, u.class, d.class, c.class));
        arrayList.add(C6982c.q(this, p247y6.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C6982c c6982c = (C6982c) it.next();
            if (c6982c != null) {
                arrayList.add(c6982c);
            }
        }
        this.f43707d = q(iterable);
        n(arrayList);
    }
}
