package p190t;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p200u.b;
import p200u.c;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f49461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f49462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f49463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f49464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f49466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f49467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f49468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f49469i;

    public j(int i10) {
        this.f49461a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f49462b = new c(0, 0.75f);
        this.f49463c = new b();
    }

    private final int f(Object obj, Object obj2) {
        int iG = g(obj, obj2);
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    protected Object a(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    protected void b(boolean z9, Object key, Object oldValue, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
    }

    public final Object c(Object key) {
        Object objD;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f49463c) {
            Object objA = this.f49462b.a(key);
            if (objA != null) {
                this.f49468h++;
                return objA;
            }
            this.f49469i++;
            Object objA2 = a(key);
            if (objA2 == null) {
                return null;
            }
            synchronized (this.f49463c) {
                try {
                    this.f49466f++;
                    objD = this.f49462b.d(key, objA2);
                    if (objD != null) {
                        this.f49462b.d(key, objD);
                    } else {
                        this.f49464d += f(key, objA2);
                        Unit unit = Unit.f45918a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objD != null) {
                b(false, key, objA2, objD);
                return objD;
            }
            i(this.f49461a);
            return objA2;
        }
    }

    public final Object d(Object key, Object value) {
        Object objD;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.f49463c) {
            try {
                this.f49465e++;
                this.f49464d += f(key, value);
                objD = this.f49462b.d(key, value);
                if (objD != null) {
                    this.f49464d -= f(key, objD);
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objD != null) {
            b(false, key, objD, value);
        }
        i(this.f49461a);
        return objD;
    }

    public final Object e(Object key) {
        Object objE;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f49463c) {
            try {
                objE = this.f49462b.e(key);
                if (objE != null) {
                    this.f49464d -= f(key, objE);
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objE != null) {
            b(false, key, objE, null);
        }
        return objE;
    }

    protected int g(Object key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return 1;
    }

    public final Map h() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.f49463c) {
            try {
                for (Map.Entry entry : this.f49462b.b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    public void i(int i10) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.f49463c) {
                try {
                    if (this.f49464d < 0 || (this.f49462b.c() && this.f49464d != 0)) {
                        break;
                    }
                    if (this.f49464d > i10 && !this.f49462b.c()) {
                        Map.Entry entry = (Map.Entry) CollectionsKt.X(this.f49462b.b());
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        this.f49462b.e(key);
                        this.f49464d -= f(key, value);
                        this.f49467g++;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            b(true, key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public String toString() {
        String str;
        synchronized (this.f49463c) {
            try {
                int i10 = this.f49468h;
                int i11 = this.f49469i + i10;
                str = "LruCache[maxSize=" + this.f49461a + ",hits=" + this.f49468h + ",misses=" + this.f49469i + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
