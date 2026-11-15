package p092j1;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f45474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f45475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f45476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r f45477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f45478f;

    public q(int i10, long j10, long j11, n nVar, r rVar, Object obj) {
        this.f45473a = i10;
        this.f45474b = j10;
        this.f45475c = j11;
        this.f45476d = nVar;
        this.f45477e = rVar;
        this.f45478f = obj;
    }

    public static /* synthetic */ q b(q qVar, int i10, long j10, long j11, n nVar, r rVar, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            i10 = qVar.f45473a;
        }
        if ((i11 & 2) != 0) {
            j10 = qVar.f45474b;
        }
        if ((i11 & 4) != 0) {
            j11 = qVar.f45475c;
        }
        if ((i11 & 8) != 0) {
            nVar = qVar.f45476d;
        }
        if ((i11 & 16) != 0) {
            rVar = qVar.f45477e;
        }
        if ((i11 & 32) != 0) {
            obj = qVar.f45478f;
        }
        Object obj3 = obj;
        n nVar2 = nVar;
        long j12 = j11;
        return qVar.a(i10, j10, j12, nVar2, rVar, obj3);
    }

    public final q a(int i10, long j10, long j11, n nVar, r rVar, Object obj) {
        return new q(i10, j10, j11, nVar, rVar, obj);
    }

    public final r c() {
        return this.f45477e;
    }

    public final int d() {
        return this.f45473a;
    }

    public final n e() {
        return this.f45476d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f45473a == qVar.f45473a && this.f45474b == qVar.f45474b && this.f45475c == qVar.f45475c && Intrinsics.b(this.f45476d, qVar.f45476d) && Intrinsics.b(this.f45477e, qVar.f45477e) && Intrinsics.b(this.f45478f, qVar.f45478f);
    }

    public final long f() {
        return this.f45474b;
    }

    public final long g() {
        return this.f45475c;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f45473a * 31) + Long.hashCode(this.f45474b)) * 31) + Long.hashCode(this.f45475c)) * 31) + this.f45476d.hashCode()) * 31;
        r rVar = this.f45477e;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Object obj = this.f45478f;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "NetworkResponse(code=" + this.f45473a + ", requestMillis=" + this.f45474b + ", responseMillis=" + this.f45475c + ", headers=" + this.f45476d + ", body=" + this.f45477e + ", delegate=" + this.f45478f + ')';
    }

    public /* synthetic */ q(int i10, long j10, long j11, n nVar, r rVar, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? TTAdConstant.MATE_VALID : i10, (i11 & 2) != 0 ? 0L : j10, (i11 & 4) != 0 ? 0L : j11, (i11 & 8) != 0 ? n.f45467c : nVar, (i11 & 16) != 0 ? null : rVar, (i11 & 32) != 0 ? null : obj);
    }
}
