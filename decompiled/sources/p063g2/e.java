package p063g2;

/* JADX INFO: loaded from: classes.dex */
public enum e {
    YES,
    NO,
    UNSET;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44376a;

        static {
            int[] iArr = new int[e.values().length];
            f44376a = iArr;
            try {
                iArr[e.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44376a[e.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44376a[e.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static e e(boolean z9) {
        return z9 ? YES : NO;
    }

    public boolean c() {
        int i10 = a.f44376a[ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            throw new IllegalStateException("No boolean equivalent for UNSET");
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }

    public boolean d() {
        return this != UNSET;
    }
}
