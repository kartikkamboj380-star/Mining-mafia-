package E6;

/* JADX INFO: loaded from: classes3.dex */
public interface j {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f603a;

        a(int i10) {
            this.f603a = i10;
        }

        public int d() {
            return this.f603a;
        }
    }

    a b(String str);
}
