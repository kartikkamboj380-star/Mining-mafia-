package W5;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f6585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W5.a f6587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6588d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f6589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f6590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private W5.a f6591c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f6592d;

        public d a() {
            return new d(this, null);
        }

        public a b(W5.a aVar) {
            this.f6591c = aVar;
            return this;
        }

        public a c(boolean z9) {
            this.f6589a = z9;
            return this;
        }
    }

    /* synthetic */ d(a aVar, h hVar) {
        this.f6585a = aVar.f6589a;
        this.f6586b = aVar.f6590b;
        this.f6587c = aVar.f6591c;
        this.f6588d = aVar.f6592d;
    }

    public W5.a a() {
        return this.f6587c;
    }

    public String b() {
        return this.f6588d;
    }

    public boolean c() {
        return this.f6585a;
    }

    public final String d() {
        return this.f6586b;
    }
}
