package T1;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public interface f {

    public interface a {
        long a();

        String getId();

        long getTimestamp();
    }

    public interface b {
        boolean e();

        R1.a f(Object obj);

        void g(S1.j jVar, Object obj);
    }

    void a();

    void b();

    boolean c(String str, Object obj);

    b d(String str, Object obj);

    long e(a aVar);

    boolean f(String str, Object obj);

    R1.a g(String str, Object obj);

    Collection h();

    boolean isExternal();

    long remove(String str);
}
