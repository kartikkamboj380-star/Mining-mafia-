package p123m2;

import Y1.f;
import Y1.n;
import Y1.o;
import java.util.List;
import p253z2.g;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f46361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f46362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f46363c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f46364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private n f46365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f46366c;

        static /* bridge */ /* synthetic */ g c(a aVar) {
            aVar.getClass();
            return null;
        }

        public b e() {
            return new b(this);
        }
    }

    public static a e() {
        return new a();
    }

    public f a() {
        return this.f46361a;
    }

    public n b() {
        return this.f46363c;
    }

    public g c() {
        return null;
    }

    public h d() {
        return this.f46362b;
    }

    private b(a aVar) {
        this.f46361a = aVar.f46364a != null ? f.b(aVar.f46364a) : null;
        this.f46363c = aVar.f46365b != null ? aVar.f46365b : o.a(Boolean.FALSE);
        this.f46362b = aVar.f46366c;
        a.c(aVar);
    }
}
