package p022c1;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.api.Api;
import kotlin.ranges.b;
import p129m8.k;
import p142o1.e;
import p142o1.f;
import p142o1.g;
import p192t1.E;
import p192t1.p;

/* JADX INFO: renamed from: c1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1206l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1206l f11775a = new C1206l();

    /* JADX INFO: renamed from: c1.l$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11776a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11776a = iArr;
        }
    }

    private C1206l() {
    }

    public static final int a(int i10, int i11, int i12, int i13, e eVar) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(i10 / i12);
        int iHighestOneBit2 = Integer.highestOneBit(i11 / i13);
        int i14 = a.f11776a[eVar.ordinal()];
        if (i14 == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i14 != 2) {
                throw new k();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return b.c(iMin, 1);
    }

    public static final long b(int i10, int i11, f fVar, e eVar, f fVar2) {
        if (!g.b(fVar)) {
            C1206l c1206l = f11775a;
            int iF = c1206l.f(fVar.b(), eVar);
            i11 = c1206l.f(fVar.a(), eVar);
            i10 = iF;
        }
        if ((fVar2.b() instanceof p142o1.a.C0488a) && !E.m(i10)) {
            i10 = b.g(i10, ((p142o1.a.C0488a) fVar2.b()).f());
        }
        if ((fVar2.a() instanceof p142o1.a.C0488a) && !E.m(i11)) {
            i11 = b.g(i11, ((p142o1.a.C0488a) fVar2.a()).f());
        }
        return p.a(i10, i11);
    }

    public static final double c(double d10, double d11, double d12, double d13, e eVar) {
        double d14 = d12 / d10;
        double d15 = d13 / d11;
        int i10 = a.f11776a[eVar.ordinal()];
        if (i10 == 1) {
            return Math.max(d14, d15);
        }
        if (i10 == 2) {
            return Math.min(d14, d15);
        }
        throw new k();
    }

    public static final double d(int i10, int i11, int i12, int i13, e eVar) {
        double d10 = ((double) i12) / ((double) i10);
        double d11 = ((double) i13) / ((double) i11);
        int i14 = a.f11776a[eVar.ordinal()];
        if (i14 == 1) {
            return Math.max(d10, d11);
        }
        if (i14 == 2) {
            return Math.min(d10, d11);
        }
        throw new k();
    }

    public static final float e(float f10, float f11, float f12, float f13, e eVar) {
        float f14 = f12 / f10;
        float f15 = f13 / f11;
        int i10 = a.f11776a[eVar.ordinal()];
        if (i10 == 1) {
            return Math.max(f14, f15);
        }
        if (i10 == 2) {
            return Math.min(f14, f15);
        }
        throw new k();
    }

    private final int f(p142o1.a aVar, e eVar) {
        if (aVar instanceof p142o1.a.C0488a) {
            return ((p142o1.a.C0488a) aVar).f();
        }
        int i10 = a.f11776a[eVar.ordinal()];
        if (i10 == 1) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        if (i10 == 2) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        throw new k();
    }
}
