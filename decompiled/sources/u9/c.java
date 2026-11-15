package u9;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static volatile c f50010s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final d f50011t = new d();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Map f50012u = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f50013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f50014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f50015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal f50016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f50017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f50018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u9.b f50019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u9.a f50020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p f50021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ExecutorService f50022j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f50023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f50024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f50025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f50026n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f50027o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f50028p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f50029q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final g f50030r;

    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0547c initialValue() {
            return new C0547c();
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50032a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f50032a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50032a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50032a[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50032a[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50032a[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: u9.c$c, reason: collision with other inner class name */
    static final class C0547c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List f50033a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f50034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f50035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        q f50036d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f50037e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f50038f;

        C0547c() {
        }
    }

    public c() {
        this(f50011t);
    }

    static void a(List list, Class[] clsArr) {
        for (Class cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public static d b() {
        return new d();
    }

    private void c(q qVar, Object obj) {
        if (obj != null) {
            q(qVar, obj, j());
        }
    }

    public static c d() {
        c cVar;
        c cVar2 = f50010s;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (c.class) {
            try {
                cVar = f50010s;
                if (cVar == null) {
                    cVar = new c();
                    f50010s = cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    private void g(q qVar, Object obj, Throwable th) {
        if (!(obj instanceof n)) {
            if (this.f50023k) {
                throw new e("Invoking subscriber failed", th);
            }
            if (this.f50024l) {
                this.f50030r.a(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + qVar.f50086a.getClass(), th);
            }
            if (this.f50026n) {
                m(new n(this, th, obj, qVar.f50086a));
                return;
            }
            return;
        }
        if (this.f50024l) {
            g gVar = this.f50030r;
            Level level = Level.SEVERE;
            gVar.a(level, "SubscriberExceptionEvent subscriber " + qVar.f50086a.getClass() + " threw an exception", th);
            n nVar = (n) obj;
            this.f50030r.a(level, "Initial event " + nVar.f50066c + " caused exception in " + nVar.f50067d, nVar.f50065b);
        }
    }

    private boolean j() {
        h hVar = this.f50017e;
        return hVar == null || hVar.b();
    }

    private static List l(Class cls) {
        List arrayList;
        Map map = f50012u;
        synchronized (map) {
            try {
                arrayList = (List) map.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        a(arrayList, superclass.getInterfaces());
                    }
                    f50012u.put(cls, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    private void n(Object obj, C0547c c0547c) {
        boolean zO;
        Class<?> cls = obj.getClass();
        if (this.f50028p) {
            List listL = l(cls);
            int size = listL.size();
            zO = false;
            for (int i10 = 0; i10 < size; i10++) {
                zO |= o(obj, c0547c, (Class) listL.get(i10));
            }
        } else {
            zO = o(obj, c0547c, cls);
        }
        if (zO) {
            return;
        }
        if (this.f50025m) {
            this.f50030r.b(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.f50027o || cls == i.class || cls == n.class) {
            return;
        }
        m(new i(this, obj));
    }

    private boolean o(Object obj, C0547c c0547c, Class cls) {
        CopyOnWriteArrayList<q> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.f50013a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (q qVar : copyOnWriteArrayList) {
            c0547c.f50037e = obj;
            c0547c.f50036d = qVar;
            try {
                q(qVar, obj, c0547c.f50035c);
                boolean z9 = c0547c.f50038f;
                c0547c.f50037e = null;
                c0547c.f50036d = null;
                c0547c.f50038f = false;
                if (z9) {
                    return true;
                }
            } catch (Throwable th) {
                c0547c.f50037e = null;
                c0547c.f50036d = null;
                c0547c.f50038f = false;
                throw th;
            }
        }
        return true;
    }

    private void q(q qVar, Object obj, boolean z9) {
        int i10 = b.f50032a[qVar.f50087b.f50069b.ordinal()];
        if (i10 == 1) {
            i(qVar, obj);
            return;
        }
        if (i10 == 2) {
            if (z9) {
                i(qVar, obj);
                return;
            } else {
                this.f50018f.a(qVar, obj);
                return;
            }
        }
        if (i10 == 3) {
            l lVar = this.f50018f;
            if (lVar != null) {
                lVar.a(qVar, obj);
                return;
            } else {
                i(qVar, obj);
                return;
            }
        }
        if (i10 == 4) {
            if (z9) {
                this.f50019g.a(qVar, obj);
                return;
            } else {
                i(qVar, obj);
                return;
            }
        }
        if (i10 == 5) {
            this.f50020h.a(qVar, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + qVar.f50087b.f50069b);
    }

    private void t(Object obj, o oVar) {
        Class cls = oVar.f50070c;
        q qVar = new q(obj, oVar);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f50013a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f50013a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(qVar)) {
            throw new e("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i10 = 0; i10 <= size; i10++) {
            if (i10 == size || oVar.f50071d > ((q) copyOnWriteArrayList.get(i10)).f50087b.f50071d) {
                copyOnWriteArrayList.add(i10, qVar);
                break;
            }
        }
        List arrayList = (List) this.f50014b.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f50014b.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (oVar.f50072e) {
            if (!this.f50028p) {
                c(qVar, this.f50015c.get(cls));
                return;
            }
            for (Map.Entry entry : this.f50015c.entrySet()) {
                if (cls.isAssignableFrom((Class) entry.getKey())) {
                    c(qVar, entry.getValue());
                }
            }
        }
    }

    private void v(Object obj, Class cls) {
        List list = (List) this.f50013a.get(cls);
        if (list != null) {
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                q qVar = (q) list.get(i10);
                if (qVar.f50086a == obj) {
                    qVar.f50088c = false;
                    list.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
        }
    }

    ExecutorService e() {
        return this.f50022j;
    }

    public g f() {
        return this.f50030r;
    }

    void h(j jVar) {
        Object obj = jVar.f50059a;
        q qVar = jVar.f50060b;
        j.b(jVar);
        if (qVar.f50088c) {
            i(qVar, obj);
        }
    }

    void i(q qVar, Object obj) {
        try {
            qVar.f50087b.f50068a.invoke(qVar.f50086a, obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (InvocationTargetException e11) {
            g(qVar, obj, e11.getCause());
        }
    }

    public synchronized boolean k(Object obj) {
        return this.f50014b.containsKey(obj);
    }

    public void m(Object obj) {
        C0547c c0547c = (C0547c) this.f50016d.get();
        List list = c0547c.f50033a;
        list.add(obj);
        if (c0547c.f50034b) {
            return;
        }
        c0547c.f50035c = j();
        c0547c.f50034b = true;
        if (c0547c.f50038f) {
            throw new e("Internal error. Abort state was not reset");
        }
        while (!list.isEmpty()) {
            try {
                n(list.remove(0), c0547c);
            } catch (Throwable th) {
                c0547c.f50034b = false;
                c0547c.f50035c = false;
                throw th;
            }
        }
        c0547c.f50034b = false;
        c0547c.f50035c = false;
    }

    public void p(Object obj) {
        synchronized (this.f50015c) {
            this.f50015c.put(obj.getClass(), obj);
        }
        m(obj);
    }

    public void r(Object obj) {
        if (v9.b.c() && !v9.b.a()) {
            throw new RuntimeException("It looks like you are using EventBus on Android, make sure to add the \"eventbus\" Android library to your dependencies.");
        }
        List listA = this.f50021i.a(obj.getClass());
        synchronized (this) {
            try {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    t(obj, (o) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object s(Class cls) {
        Object objCast;
        synchronized (this.f50015c) {
            objCast = cls.cast(this.f50015c.remove(cls));
        }
        return objCast;
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f50029q + ", eventInheritance=" + this.f50028p + "]";
    }

    public synchronized void u(Object obj) {
        try {
            List list = (List) this.f50014b.get(obj);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    v(obj, (Class) it.next());
                }
                this.f50014b.remove(obj);
            } else {
                this.f50030r.b(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    c(d dVar) {
        this.f50016d = new a();
        this.f50030r = dVar.b();
        this.f50013a = new HashMap();
        this.f50014b = new HashMap();
        this.f50015c = new ConcurrentHashMap();
        h hVarC = dVar.c();
        this.f50017e = hVarC;
        this.f50018f = hVarC != null ? hVarC.a(this) : null;
        this.f50019g = new u9.b(this);
        this.f50020h = new u9.a(this);
        List list = dVar.f50049j;
        this.f50029q = list != null ? list.size() : 0;
        this.f50021i = new p(dVar.f50049j, dVar.f50047h, dVar.f50046g);
        this.f50024l = dVar.f50040a;
        this.f50025m = dVar.f50041b;
        this.f50026n = dVar.f50042c;
        this.f50027o = dVar.f50043d;
        this.f50023k = dVar.f50044e;
        this.f50028p = dVar.f50045f;
        this.f50022j = dVar.f50048i;
    }
}
