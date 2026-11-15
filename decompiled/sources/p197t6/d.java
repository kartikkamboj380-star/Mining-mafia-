package p197t6;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f49686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f49687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f49688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f49689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f49690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f49691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f49692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f49693h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f49694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f49695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f49696c;

        public a(boolean z9, boolean z10, boolean z11) {
            this.f49694a = z9;
            this.f49695b = z10;
            this.f49696c = z11;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49698b;

        public b(int i10, int i11) {
            this.f49697a = i10;
            this.f49698b = i11;
        }
    }

    public d(long j10, b bVar, a aVar, int i10, int i11, double d10, double d11, int i12) {
        this.f49688c = j10;
        this.f49686a = bVar;
        this.f49687b = aVar;
        this.f49689d = i10;
        this.f49690e = i11;
        this.f49691f = d10;
        this.f49692g = d11;
        this.f49693h = i12;
    }

    public boolean a(long j10) {
        return this.f49688c < j10;
    }
}
