package p038d7;

import A6.b;
import p257z6.c;
import p257z6.d;
import p257z6.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements A6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A6.a f43159a = new a();

    /* JADX INFO: renamed from: d7.a$a, reason: collision with other inner class name */
    private static final class C0412a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0412a f43160a = new C0412a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final c f43161b = c.d("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final c f43162c = c.d("variantId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final c f43163d = c.d("parameterKey");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final c f43164e = c.d("parameterValue");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final c f43165f = c.d("templateVersion");

        private C0412a() {
        }

        @Override // p257z6.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d dVar, e eVar) {
            eVar.b(f43161b, dVar.d());
            eVar.b(f43162c, dVar.f());
            eVar.b(f43163d, dVar.b());
            eVar.b(f43164e, dVar.c());
            eVar.e(f43165f, dVar.e());
        }
    }

    private a() {
    }

    @Override // A6.a
    public void a(b bVar) {
        C0412a c0412a = C0412a.f43160a;
        bVar.a(d.class, c0412a);
        bVar.a(b.class, c0412a);
    }
}
