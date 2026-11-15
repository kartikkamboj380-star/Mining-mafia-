package p078h7;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.c;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f44843c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f44844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f44845b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f44846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f44847b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f44849d;

        b(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f44847b = obj;
            this.f44849d |= LinearLayoutManager.INVALID_OFFSET;
            return j.this.f(this);
        }
    }

    public j(o localOverrideSettings, o remoteSettings) {
        Intrinsics.checkNotNullParameter(localOverrideSettings, "localOverrideSettings");
        Intrinsics.checkNotNullParameter(remoteSettings, "remoteSettings");
        this.f44844a = localOverrideSettings;
        this.f44845b = remoteSettings;
    }

    private final boolean d(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    private final boolean e(long j10) {
        return kotlin.time.b.F(j10) && kotlin.time.b.A(j10);
    }

    public final double a() {
        Double dC = this.f44844a.c();
        if (dC != null) {
            double dDoubleValue = dC.doubleValue();
            if (d(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double dC2 = this.f44845b.c();
        if (dC2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = dC2.doubleValue();
        if (d(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    public final long b() {
        kotlin.time.b bVarB = this.f44844a.b();
        if (bVarB != null) {
            long jM = bVarB.M();
            if (e(jM)) {
                return jM;
            }
        }
        kotlin.time.b bVarB2 = this.f44845b.b();
        if (bVarB2 != null) {
            long jM2 = bVarB2.M();
            if (e(jM2)) {
                return jM2;
            }
        }
        kotlin.time.b.a aVar = kotlin.time.b.f46051b;
        return c.p(30, H8.b.MINUTES);
    }

    public final boolean c() {
        Boolean boolA = this.f44844a.a();
        if (boolA != null) {
            return boolA.booleanValue();
        }
        Boolean boolA2 = this.f44845b.a();
        if (boolA2 != null) {
            return boolA2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r6.d(r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(p169q8.b r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof h7.j.b
            if (r0 == 0) goto L13
            r0 = r6
            h7.j$b r0 = (h7.j.b) r0
            int r1 = r0.f44849d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44849d = r1
            goto L18
        L13:
            h7.j$b r0 = new h7.j$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f44847b
            java.lang.Object r1 = p179r8.b.e()
            int r2 = r0.f44849d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p129m8.n.b(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f44846a
            h7.j r2 = (p078h7.j) r2
            p129m8.n.b(r6)
            goto L4d
        L3c:
            p129m8.n.b(r6)
            h7.o r6 = r5.f44844a
            r0.f44846a = r5
            r0.f44849d = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L4c
            goto L5a
        L4c:
            r2 = r5
        L4d:
            h7.o r6 = r2.f44845b
            r2 = 0
            r0.f44846a = r2
            r0.f44849d = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            kotlin.Unit r6 = kotlin.Unit.f45918a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p078h7.j.f(q8.b):java.lang.Object");
    }
}
