package X8;

import kotlin.collections.AbstractC7024j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f6779e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long[] f6780f = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V8.d f6781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function2 f6782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f6783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f6784d;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(V8.d descriptor, Function2 readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.f6781a = descriptor;
        this.f6782b = readIfAbsent;
        int iD = descriptor.d();
        if (iD <= 64) {
            this.f6783c = iD != 64 ? (-1) << iD : 0L;
            this.f6784d = f6780f;
        } else {
            this.f6783c = 0L;
            this.f6784d = e(iD);
        }
    }

    private final void b(int i10) {
        int i11 = (i10 >>> 6) - 1;
        long[] jArr = this.f6784d;
        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
    }

    private final int c() {
        int length = this.f6784d.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = i11 * 64;
            long j10 = this.f6784d[i10];
            while (j10 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                j10 |= 1 << iNumberOfTrailingZeros;
                int i13 = iNumberOfTrailingZeros + i12;
                if (((Boolean) this.f6782b.invoke(this.f6781a, Integer.valueOf(i13))).booleanValue()) {
                    this.f6784d[i10] = j10;
                    return i13;
                }
            }
            this.f6784d[i10] = j10;
            i10 = i11;
        }
        return -1;
    }

    private final long[] e(int i10) {
        long[] jArr = new long[(i10 - 1) >>> 6];
        if ((i10 & 63) != 0) {
            jArr[AbstractC7024j.A(jArr)] = (-1) << i10;
        }
        return jArr;
    }

    public final void a(int i10) {
        if (i10 < 64) {
            this.f6783c |= 1 << i10;
        } else {
            b(i10);
        }
    }

    public final int d() {
        int iNumberOfTrailingZeros;
        int iD = this.f6781a.d();
        do {
            long j10 = this.f6783c;
            if (j10 == -1) {
                if (iD > 64) {
                    return c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
            this.f6783c |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) this.f6782b.invoke(this.f6781a, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
