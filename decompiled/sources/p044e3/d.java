package p044e3;

import java.util.HashMap;
import java.util.Map;
import kotlin.collections.E;
import p129m8.q;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f43273a = new d();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f43274a = d.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f43275b = true;

        public final Map a() {
            if (!this.f43275b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.f43275b = false;
            return this.f43274a;
        }

        public final a b(Object obj, Object obj2) {
            if (!this.f43275b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.f43274a.put(obj, obj2);
            return this;
        }
    }

    private d() {
    }

    public static final a a() {
        return new a();
    }

    public static final HashMap b() {
        return new HashMap();
    }

    public static final Map c(Object obj, Object obj2) {
        return E.i(q.a(obj, obj2));
    }

    public static final Map d(Object obj, Object obj2, Object obj3, Object obj4) {
        return E.i(q.a(obj, obj2), q.a(obj3, obj4));
    }

    public static final Map e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return E.i(q.a(obj, obj2), q.a(obj3, obj4), q.a(obj5, obj6));
    }
}
