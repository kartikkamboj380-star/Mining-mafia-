package p137n6;

import A6.b;
import p257z6.c;
import p257z6.d;
import p257z6.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements A6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A6.a f46911a = new a();

    /* JADX INFO: renamed from: n6.a$a, reason: collision with other inner class name */
    private static final class C0480a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0480a f46912a = new C0480a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final c f46913b = c.d("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final c f46914c = c.d("parameterKey");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final c f46915d = c.d("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final c f46916e = c.d("variantId");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final c f46917f = c.d("templateVersion");

        private C0480a() {
        }

        @Override // p257z6.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, e eVar) {
            eVar.b(f46913b, jVar.e());
            eVar.b(f46914c, jVar.c());
            eVar.b(f46915d, jVar.d());
            eVar.b(f46916e, jVar.g());
            eVar.e(f46917f, jVar.f());
        }
    }

    private a() {
    }

    @Override // A6.a
    public void a(b bVar) {
        C0480a c0480a = C0480a.f46912a;
        bVar.a(j.class, c0480a);
        bVar.a(b.class, c0480a);
    }
}
