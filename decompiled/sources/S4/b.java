package S4;

import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B4.b f5488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdRequest f5489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5490d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f5491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private B4.b f5492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AdRequest f5493c = new AdRequest.Builder().n();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f5494d;

        public a(String str, B4.b bVar) {
            this.f5491a = str;
            this.f5492b = bVar;
        }

        public b a() {
            return new b(this, null);
        }

        public a b(AdRequest adRequest) {
            this.f5493c = adRequest;
            return this;
        }

        public a c(int i10) {
            this.f5494d = i10;
            return this;
        }

        final /* synthetic */ String d() {
            return this.f5491a;
        }

        final /* synthetic */ B4.b e() {
            return this.f5492b;
        }

        final /* synthetic */ AdRequest f() {
            return this.f5493c;
        }

        final /* synthetic */ int g() {
            return this.f5494d;
        }
    }

    /* synthetic */ b(a aVar, byte[] bArr) {
        this.f5487a = aVar.d();
        this.f5488b = aVar.e();
        this.f5489c = aVar.f();
        this.f5490d = aVar.g();
    }

    public B4.b a() {
        B4.b bVar = this.f5488b;
        return bVar == null ? B4.b.INTERSTITIAL : bVar;
    }

    public AdRequest b() {
        return this.f5489c;
    }

    public String c() {
        return this.f5487a;
    }

    public int d() {
        return this.f5490d;
    }
}
