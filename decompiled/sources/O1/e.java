package O1;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f4001c = new e(null, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f4002d = new e(a.none, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f4003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f4004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f4005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f4006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f4007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f4008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f4009k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f4010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f4011b;

    public enum a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum b {
        meet,
        slice
    }

    static {
        a aVar = a.xMidYMid;
        b bVar = b.meet;
        f4003e = new e(aVar, bVar);
        a aVar2 = a.xMinYMin;
        f4004f = new e(aVar2, bVar);
        f4005g = new e(a.xMaxYMax, bVar);
        f4006h = new e(a.xMidYMin, bVar);
        f4007i = new e(a.xMidYMax, bVar);
        b bVar2 = b.slice;
        f4008j = new e(aVar, bVar2);
        f4009k = new e(aVar2, bVar2);
    }

    e(a aVar, b bVar) {
        this.f4010a = aVar;
        this.f4011b = bVar;
    }

    public a a() {
        return this.f4010a;
    }

    public b b() {
        return this.f4011b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f4010a == eVar.f4010a && this.f4011b == eVar.f4011b;
    }

    public String toString() {
        return this.f4010a + " " + this.f4011b;
    }
}
