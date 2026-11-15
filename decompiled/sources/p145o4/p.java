package p145o4;

import android.util.Base64;
import p125m4.f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(f fVar);
    }

    public static a a() {
        return new d.b().d(f.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract f d();

    public boolean e() {
        return c() != null;
    }

    public p f(f fVar) {
        return a().b(b()).d(fVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
