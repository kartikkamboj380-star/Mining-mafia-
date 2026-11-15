package u9;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public interface g {

    public static class a {
        public static g a() {
            return v9.a.a() ? v9.a.b().f50225a : new b();
        }
    }

    public static class b implements g {
        @Override // u9.g
        public void a(Level level, String str, Throwable th) {
            System.out.println("[" + level + "] " + str);
            th.printStackTrace(System.out);
        }

        @Override // u9.g
        public void b(Level level, String str) {
            System.out.println("[" + level + "] " + str);
        }
    }

    void a(Level level, String str, Throwable th);

    void b(Level level, String str);
}
