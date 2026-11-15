package M6;

import com.google.firebase.messaging.O;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f3529b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M6.a f3530a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private M6.a f3531a = null;

        a() {
        }

        public b a() {
            return new b(this.f3531a);
        }

        public a b(M6.a aVar) {
            this.f3531a = aVar;
            return this;
        }
    }

    b(M6.a aVar) {
        this.f3530a = aVar;
    }

    public static a b() {
        return new a();
    }

    public M6.a a() {
        return this.f3530a;
    }

    public byte[] c() {
        return O.a(this);
    }
}
