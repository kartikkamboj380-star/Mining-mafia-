package p135n4;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(p135n4.a aVar);

        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f46808a;

        b(int i10) {
            this.f46808a = i10;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract p135n4.a b();

    public abstract b c();
}
