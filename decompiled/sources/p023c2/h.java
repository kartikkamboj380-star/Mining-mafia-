package p023c2;

import Y1.k;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f11815d = new IdentityHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f11816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11817b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f11818c;

    public static class a extends RuntimeException {
        public a() {
            super("Null shared reference");
        }
    }

    public h(Object obj, g gVar, boolean z9) {
        this.f11816a = k.g(obj);
        this.f11818c = gVar;
        if (z9) {
            a(obj);
        }
    }

    private static void a(Object obj) {
        Map map = f11815d;
        synchronized (map) {
            try {
                Integer num = (Integer) map.get(obj);
                if (num == null) {
                    map.put(obj, 1);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized int c() {
        int i10;
        e();
        k.b(Boolean.valueOf(this.f11817b > 0));
        i10 = this.f11817b - 1;
        this.f11817b = i10;
        return i10;
    }

    private void e() {
        if (!h(this)) {
            throw new a();
        }
    }

    public static boolean h(h hVar) {
        return hVar != null && hVar.g();
    }

    private static void i(Object obj) {
        Map map = f11815d;
        synchronized (map) {
            try {
                Integer num = (Integer) map.get(obj);
                if (num == null) {
                    Z1.a.N("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                } else if (num.intValue() == 1) {
                    map.remove(obj);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void b() {
        e();
        this.f11817b++;
    }

    public void d() {
        Object obj;
        if (c() == 0) {
            synchronized (this) {
                obj = this.f11816a;
                this.f11816a = null;
            }
            if (obj != null) {
                g gVar = this.f11818c;
                if (gVar != null) {
                    gVar.a(obj);
                }
                i(obj);
            }
        }
    }

    public synchronized Object f() {
        return this.f11816a;
    }

    public synchronized boolean g() {
        return this.f11817b > 0;
    }
}
