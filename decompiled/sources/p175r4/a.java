package p175r4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p145o4.m;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f48228e = new C0524a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f48229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f48230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f48231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f48232d;

    /* JADX INFO: renamed from: r4.a$a, reason: collision with other inner class name */
    public static final class C0524a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f48233a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f48234b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f48235c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f48236d = "";

        C0524a() {
        }

        public C0524a a(d dVar) {
            this.f48234b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f48233a, Collections.unmodifiableList(this.f48234b), this.f48235c, this.f48236d);
        }

        public C0524a c(String str) {
            this.f48236d = str;
            return this;
        }

        public C0524a d(b bVar) {
            this.f48235c = bVar;
            return this;
        }

        public C0524a e(f fVar) {
            this.f48233a = fVar;
            return this;
        }
    }

    a(f fVar, List list, b bVar, String str) {
        this.f48229a = fVar;
        this.f48230b = list;
        this.f48231c = bVar;
        this.f48232d = str;
    }

    public static C0524a e() {
        return new C0524a();
    }

    public String a() {
        return this.f48232d;
    }

    public b b() {
        return this.f48231c;
    }

    public List c() {
        return this.f48230b;
    }

    public f d() {
        return this.f48229a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
