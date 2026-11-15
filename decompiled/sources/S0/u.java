package S0;

import androidx.work.C1188c;
import androidx.work.EnumC1186a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.CodedOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f5390u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f5391v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p160q.a f5392w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.work.A f5394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f5396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.work.e f5397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.work.e f5398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f5401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C1188c f5402j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5403k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EnumC1186a f5404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f5406n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f5407o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f5408p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5409q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.work.u f5410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f5411s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f5412t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.work.A f5414b;

        public b(String id, androidx.work.A state) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f5413a = id;
            this.f5414b = state;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.b(this.f5413a, bVar.f5413a) && this.f5414b == bVar.f5414b;
        }

        public int hashCode() {
            return (this.f5413a.hashCode() * 31) + this.f5414b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f5413a + ", state=" + this.f5414b + ')';
        }
    }

    static {
        String strI = androidx.work.q.i("WorkSpec");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"WorkSpec\")");
        f5391v = strI;
        f5392w = new p160q.a() { // from class: S0.t
            @Override // p160q.a
            public final Object apply(Object obj) {
                return u.b((List) obj);
            }
        };
    }

    public u(String id, androidx.work.A state, String workerClassName, String str, androidx.work.e input, androidx.work.e output, long j10, long j11, long j12, C1188c constraints, int i10, EnumC1186a backoffPolicy, long j13, long j14, long j15, long j16, boolean z9, androidx.work.u outOfQuotaPolicy, int i11, int i12) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f5393a = id;
        this.f5394b = state;
        this.f5395c = workerClassName;
        this.f5396d = str;
        this.f5397e = input;
        this.f5398f = output;
        this.f5399g = j10;
        this.f5400h = j11;
        this.f5401i = j12;
        this.f5402j = constraints;
        this.f5403k = i10;
        this.f5404l = backoffPolicy;
        this.f5405m = j13;
        this.f5406n = j14;
        this.f5407o = j15;
        this.f5408p = j16;
        this.f5409q = z9;
        this.f5410r = outOfQuotaPolicy;
        this.f5411s = i11;
        this.f5412t = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        p070h.w.a(it.next());
        throw null;
    }

    public static /* synthetic */ u e(u uVar, String str, androidx.work.A a10, String str2, String str3, androidx.work.e eVar, androidx.work.e eVar2, long j10, long j11, long j12, C1188c c1188c, int i10, EnumC1186a enumC1186a, long j13, long j14, long j15, long j16, boolean z9, androidx.work.u uVar2, int i11, int i12, int i13, Object obj) {
        int i14;
        androidx.work.u uVar3;
        String str4 = (i13 & 1) != 0 ? uVar.f5393a : str;
        androidx.work.A a11 = (i13 & 2) != 0 ? uVar.f5394b : a10;
        String str5 = (i13 & 4) != 0 ? uVar.f5395c : str2;
        String str6 = (i13 & 8) != 0 ? uVar.f5396d : str3;
        androidx.work.e eVar3 = (i13 & 16) != 0 ? uVar.f5397e : eVar;
        androidx.work.e eVar4 = (i13 & 32) != 0 ? uVar.f5398f : eVar2;
        long j17 = (i13 & 64) != 0 ? uVar.f5399g : j10;
        long j18 = (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? uVar.f5400h : j11;
        long j19 = (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? uVar.f5401i : j12;
        C1188c c1188c2 = (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? uVar.f5402j : c1188c;
        int i15 = (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? uVar.f5403k : i10;
        String str7 = str4;
        EnumC1186a enumC1186a2 = (i13 & 2048) != 0 ? uVar.f5404l : enumC1186a;
        androidx.work.A a12 = a11;
        long j20 = (i13 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? uVar.f5405m : j13;
        long j21 = (i13 & 8192) != 0 ? uVar.f5406n : j14;
        long j22 = (i13 & 16384) != 0 ? uVar.f5407o : j15;
        long j23 = (i13 & 32768) != 0 ? uVar.f5408p : j16;
        boolean z10 = (i13 & 65536) != 0 ? uVar.f5409q : z9;
        long j24 = j23;
        androidx.work.u uVar4 = (i13 & 131072) != 0 ? uVar.f5410r : uVar2;
        int i16 = (i13 & 262144) != 0 ? uVar.f5411s : i11;
        if ((i13 & 524288) != 0) {
            uVar3 = uVar4;
            i14 = uVar.f5412t;
        } else {
            i14 = i12;
            uVar3 = uVar4;
        }
        return uVar.d(str7, a12, str5, str6, eVar3, eVar4, j17, j18, j19, c1188c2, i15, enumC1186a2, j20, j21, j22, j24, z10, uVar3, i16, i14);
    }

    public final long c() {
        if (i()) {
            return this.f5406n + kotlin.ranges.b.h(this.f5404l == EnumC1186a.LINEAR ? this.f5405m * ((long) this.f5403k) : (long) Math.scalb(this.f5405m, this.f5403k - 1), 18000000L);
        }
        if (!j()) {
            long jCurrentTimeMillis = this.f5406n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f5399g;
        }
        int i10 = this.f5411s;
        long j10 = this.f5406n;
        if (i10 == 0) {
            j10 += this.f5399g;
        }
        long j11 = this.f5401i;
        long j12 = this.f5400h;
        if (j11 != j12) {
            return j10 + j12 + (i10 == 0 ? ((long) (-1)) * j11 : 0L);
        }
        return j10 + (i10 != 0 ? j12 : 0L);
    }

    public final u d(String id, androidx.work.A state, String workerClassName, String str, androidx.work.e input, androidx.work.e output, long j10, long j11, long j12, C1188c constraints, int i10, EnumC1186a backoffPolicy, long j13, long j14, long j15, long j16, boolean z9, androidx.work.u outOfQuotaPolicy, int i11, int i12) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new u(id, state, workerClassName, str, input, output, j10, j11, j12, constraints, i10, backoffPolicy, j13, j14, j15, j16, z9, outOfQuotaPolicy, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.b(this.f5393a, uVar.f5393a) && this.f5394b == uVar.f5394b && Intrinsics.b(this.f5395c, uVar.f5395c) && Intrinsics.b(this.f5396d, uVar.f5396d) && Intrinsics.b(this.f5397e, uVar.f5397e) && Intrinsics.b(this.f5398f, uVar.f5398f) && this.f5399g == uVar.f5399g && this.f5400h == uVar.f5400h && this.f5401i == uVar.f5401i && Intrinsics.b(this.f5402j, uVar.f5402j) && this.f5403k == uVar.f5403k && this.f5404l == uVar.f5404l && this.f5405m == uVar.f5405m && this.f5406n == uVar.f5406n && this.f5407o == uVar.f5407o && this.f5408p == uVar.f5408p && this.f5409q == uVar.f5409q && this.f5410r == uVar.f5410r && this.f5411s == uVar.f5411s && this.f5412t == uVar.f5412t;
    }

    public final int f() {
        return this.f5412t;
    }

    public final int g() {
        return this.f5411s;
    }

    public final boolean h() {
        return !Intrinsics.b(C1188c.f11231j, this.f5402j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r1v32, types: [int] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v41 */
    public int hashCode() {
        int iHashCode = ((((this.f5393a.hashCode() * 31) + this.f5394b.hashCode()) * 31) + this.f5395c.hashCode()) * 31;
        String str = this.f5396d;
        int iHashCode2 = (((((((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f5397e.hashCode()) * 31) + this.f5398f.hashCode()) * 31) + Long.hashCode(this.f5399g)) * 31) + Long.hashCode(this.f5400h)) * 31) + Long.hashCode(this.f5401i)) * 31) + this.f5402j.hashCode()) * 31) + Integer.hashCode(this.f5403k)) * 31) + this.f5404l.hashCode()) * 31) + Long.hashCode(this.f5405m)) * 31) + Long.hashCode(this.f5406n)) * 31) + Long.hashCode(this.f5407o)) * 31) + Long.hashCode(this.f5408p)) * 31;
        boolean z9 = this.f5409q;
        ?? r10 = z9;
        if (z9) {
            r10 = 1;
        }
        return ((((((iHashCode2 + r10) * 31) + this.f5410r.hashCode()) * 31) + Integer.hashCode(this.f5411s)) * 31) + Integer.hashCode(this.f5412t);
    }

    public final boolean i() {
        return this.f5394b == androidx.work.A.ENQUEUED && this.f5403k > 0;
    }

    public final boolean j() {
        return this.f5400h != 0;
    }

    public final void k(long j10) {
        if (j10 < 900000) {
            androidx.work.q.e().k(f5391v, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        l(kotlin.ranges.b.d(j10, 900000L), kotlin.ranges.b.d(j10, 900000L));
    }

    public final void l(long j10, long j11) {
        if (j10 < 900000) {
            androidx.work.q.e().k(f5391v, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.f5400h = kotlin.ranges.b.d(j10, 900000L);
        if (j11 < 300000) {
            androidx.work.q.e().k(f5391v, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j11 > this.f5400h) {
            androidx.work.q.e().k(f5391v, "Flex duration greater than interval duration; Changed to " + j10);
        }
        this.f5401i = kotlin.ranges.b.k(j11, 300000L, this.f5400h);
    }

    public String toString() {
        return "{WorkSpec: " + this.f5393a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ u(String str, androidx.work.A a10, String str2, String str3, androidx.work.e eVar, androidx.work.e eVar2, long j10, long j11, long j12, C1188c c1188c, int i10, EnumC1186a enumC1186a, long j13, long j14, long j15, long j16, boolean z9, androidx.work.u uVar, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        androidx.work.e eVar3;
        androidx.work.e eVar4;
        androidx.work.A a11 = (i13 & 2) != 0 ? androidx.work.A.ENQUEUED : a10;
        String str4 = (i13 & 8) != 0 ? null : str3;
        if ((i13 & 16) != 0) {
            androidx.work.e EMPTY = androidx.work.e.f11252c;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            eVar3 = EMPTY;
        } else {
            eVar3 = eVar;
        }
        if ((i13 & 32) != 0) {
            androidx.work.e EMPTY2 = androidx.work.e.f11252c;
            Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
            eVar4 = EMPTY2;
        } else {
            eVar4 = eVar2;
        }
        this(str, a11, str2, str4, eVar3, eVar4, (i13 & 64) != 0 ? 0L : j10, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? 0L : j11, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 0L : j12, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? C1188c.f11231j : c1188c, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? 0 : i10, (i13 & 2048) != 0 ? EnumC1186a.EXPONENTIAL : enumC1186a, (i13 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? 30000L : j13, (i13 & 8192) != 0 ? 0L : j14, (i13 & 16384) != 0 ? 0L : j15, (32768 & i13) != 0 ? -1L : j16, (65536 & i13) != 0 ? false : z9, (131072 & i13) != 0 ? androidx.work.u.RUN_AS_NON_EXPEDITED_WORK_REQUEST : uVar, (262144 & i13) != 0 ? 0 : i11, (i13 & 524288) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(String id, String workerClassName_) {
        this(id, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048570, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(String newId, u other) {
        this(newId, other.f5394b, other.f5395c, other.f5396d, new androidx.work.e(other.f5397e), new androidx.work.e(other.f5398f), other.f5399g, other.f5400h, other.f5401i, new C1188c(other.f5402j), other.f5403k, other.f5404l, other.f5405m, other.f5406n, other.f5407o, other.f5408p, other.f5409q, other.f5410r, other.f5411s, 0, 524288, null);
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
    }
}
