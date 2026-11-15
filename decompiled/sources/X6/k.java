package X6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f6762b = new a("TERABYTES", 0, 1099511627776L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f6763c = new k("GIGABYTES", 1, 1073741824) { // from class: X6.k.b
        {
            a aVar = null;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f6764d = new k("MEGABYTES", 2, 1048576) { // from class: X6.k.c
        {
            a aVar = null;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f6765e = new k("KILOBYTES", 3, 1024) { // from class: X6.k.d
        {
            a aVar = null;
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f6766f = new k("BYTES", 4, 1) { // from class: X6.k.e
        {
            a aVar = null;
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ k[] f6767g = c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f6768a;

    final enum a extends k {
        a(String str, int i10, long j10) {
            super(str, i10, j10, null);
        }
    }

    /* synthetic */ k(String str, int i10, long j10, a aVar) {
        this(str, i10, j10);
    }

    private static /* synthetic */ k[] c() {
        return new k[]{f6762b, f6763c, f6764d, f6765e, f6766f};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f6767g.clone();
    }

    public long d(long j10) {
        return (j10 * this.f6768a) / f6765e.f6768a;
    }

    private k(String str, int i10, long j10) {
        super(str, i10);
        this.f6768a = j10;
    }
}
