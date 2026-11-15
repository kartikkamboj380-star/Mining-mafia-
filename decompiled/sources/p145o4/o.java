package p145o4;

import p125m4.c;
import p125m4.d;
import p125m4.h;

/* JADX INFO: loaded from: classes2.dex */
abstract class o {

    public static abstract class a {
        public abstract o a();

        abstract a b(c cVar);

        abstract a c(d dVar);

        abstract a d(h hVar);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    o() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract c b();

    abstract d c();

    public byte[] d() {
        return (byte[]) e().apply(c().c());
    }

    abstract h e();

    public abstract p f();

    public abstract String g();
}
