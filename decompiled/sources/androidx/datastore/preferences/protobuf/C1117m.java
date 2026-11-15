package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1117m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile C1117m f9590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C1117m f9591c = new C1117m(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f9592a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f9593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f9594b;

        a(Object obj, int i10) {
            this.f9593a = obj;
            this.f9594b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9593a == aVar.f9593a && this.f9594b == aVar.f9594b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f9593a) * 65535) + this.f9594b;
        }
    }

    C1117m(boolean z9) {
    }

    public static C1117m b() {
        C1117m c1117mA;
        if (U.f9431d) {
            return f9591c;
        }
        C1117m c1117m = f9590b;
        if (c1117m != null) {
            return c1117m;
        }
        synchronized (C1117m.class) {
            try {
                c1117mA = f9590b;
                if (c1117mA == null) {
                    c1117mA = AbstractC1116l.a();
                    f9590b = c1117mA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1117mA;
    }

    public AbstractC1123t.c a(J j10, int i10) {
        p070h.w.a(this.f9592a.get(new a(j10, i10)));
        return null;
    }
}
