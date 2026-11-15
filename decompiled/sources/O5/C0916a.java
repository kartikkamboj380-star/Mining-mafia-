package O5;

import android.app.PendingIntent;
import java.util.Map;

/* JADX INFO: renamed from: O5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0916a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f4509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f4510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f4511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f4512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f4513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f4514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final PendingIntent f4515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PendingIntent f4516l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final PendingIntent f4517m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PendingIntent f4518n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map f4519o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f4520p = false;

    private C0916a(String str, int i10, int i11, int i12, Integer num, int i13, long j10, long j11, long j12, long j13, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        this.f4505a = str;
        this.f4506b = i10;
        this.f4507c = i11;
        this.f4508d = i12;
        this.f4509e = num;
        this.f4510f = i13;
        this.f4511g = j10;
        this.f4512h = j11;
        this.f4513i = j12;
        this.f4514j = j13;
        this.f4515k = pendingIntent;
        this.f4516l = pendingIntent2;
        this.f4517m = pendingIntent3;
        this.f4518n = pendingIntent4;
        this.f4519o = map;
    }

    public static C0916a d(String str, int i10, int i11, int i12, Integer num, int i13, long j10, long j11, long j12, long j13, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        return new C0916a(str, i10, i11, i12, num, i13, j10, j11, j12, j13, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    private final boolean g(d dVar) {
        return dVar.a() && this.f4513i <= this.f4514j;
    }

    public boolean a(d dVar) {
        return c(dVar) != null;
    }

    public int b() {
        return this.f4507c;
    }

    final PendingIntent c(d dVar) {
        if (dVar.b() == 0) {
            PendingIntent pendingIntent = this.f4516l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (g(dVar)) {
                return this.f4518n;
            }
            return null;
        }
        if (dVar.b() == 1) {
            PendingIntent pendingIntent2 = this.f4515k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (g(dVar)) {
                return this.f4517m;
            }
        }
        return null;
    }

    final void e() {
        this.f4520p = true;
    }

    final boolean f() {
        return this.f4520p;
    }
}
