package T1;

import Y1.n;
import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f5636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f5637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f5638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f5639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f5640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final S1.a f5641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final S1.c f5642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final V1.b f5643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Context f5644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f5645l;

    class a implements n {
        a() {
        }

        @Override // Y1.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public File get() {
            Y1.k.g(d.this.f5644k);
            return d.this.f5644k.getApplicationContext().getCacheDir();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f5647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f5648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n f5649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f5650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f5651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f5652f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private j f5653g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private S1.a f5654h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private S1.c f5655i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private V1.b f5656j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f5657k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final Context f5658l;

        public d n() {
            return new d(this);
        }

        private b(Context context) {
            this.f5647a = 1;
            this.f5648b = "image_cache";
            this.f5650d = 41943040L;
            this.f5651e = 10485760L;
            this.f5652f = 2097152L;
            this.f5653g = new c();
            this.f5658l = context;
        }
    }

    protected d(b bVar) {
        Context context = bVar.f5658l;
        this.f5644k = context;
        Y1.k.j((bVar.f5649c == null && context == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
        if (bVar.f5649c == null && context != null) {
            bVar.f5649c = new a();
        }
        this.f5634a = bVar.f5647a;
        this.f5635b = (String) Y1.k.g(bVar.f5648b);
        this.f5636c = (n) Y1.k.g(bVar.f5649c);
        this.f5637d = bVar.f5650d;
        this.f5638e = bVar.f5651e;
        this.f5639f = bVar.f5652f;
        this.f5640g = (j) Y1.k.g(bVar.f5653g);
        this.f5641h = bVar.f5654h == null ? S1.g.b() : bVar.f5654h;
        this.f5642i = bVar.f5655i == null ? S1.h.i() : bVar.f5655i;
        this.f5643j = bVar.f5656j == null ? V1.c.b() : bVar.f5656j;
        this.f5645l = bVar.f5657k;
    }

    public static b m(Context context) {
        return new b(context);
    }

    public String b() {
        return this.f5635b;
    }

    public n c() {
        return this.f5636c;
    }

    public S1.a d() {
        return this.f5641h;
    }

    public S1.c e() {
        return this.f5642i;
    }

    public long f() {
        return this.f5637d;
    }

    public V1.b g() {
        return this.f5643j;
    }

    public j h() {
        return this.f5640g;
    }

    public boolean i() {
        return this.f5645l;
    }

    public long j() {
        return this.f5638e;
    }

    public long k() {
        return this.f5639f;
    }

    public int l() {
        return this.f5634a;
    }
}
