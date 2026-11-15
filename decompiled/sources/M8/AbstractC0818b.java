package M8;

import L8.K;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: M8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0818b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d[] f3545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private A f3548d;

    protected final d e() {
        d dVarF;
        A a10;
        synchronized (this) {
            try {
                d[] dVarArrI = this.f3545a;
                if (dVarArrI == null) {
                    dVarArrI = i(2);
                    this.f3545a = dVarArrI;
                } else if (this.f3546b >= dVarArrI.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrI, dVarArrI.length * 2);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.f3545a = (d[]) objArrCopyOf;
                    dVarArrI = (d[]) objArrCopyOf;
                }
                int i10 = this.f3547c;
                do {
                    dVarF = dVarArrI[i10];
                    if (dVarF == null) {
                        dVarF = f();
                        dVarArrI[i10] = dVarF;
                    }
                    i10++;
                    if (i10 >= dVarArrI.length) {
                        i10 = 0;
                    }
                    Intrinsics.d(dVarF, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVarF.a(this));
                this.f3547c = i10;
                this.f3546b++;
                a10 = this.f3548d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (a10 != null) {
            a10.Z(1);
        }
        return dVarF;
    }

    protected abstract d f();

    public final K g() {
        A a10;
        synchronized (this) {
            a10 = this.f3548d;
            if (a10 == null) {
                a10 = new A(this.f3546b);
                this.f3548d = a10;
            }
        }
        return a10;
    }

    protected abstract d[] i(int i10);

    protected final void j(d dVar) {
        A a10;
        int i10;
        p169q8.b[] bVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f3546b - 1;
                this.f3546b = i11;
                a10 = this.f3548d;
                if (i11 == 0) {
                    this.f3547c = 0;
                }
                Intrinsics.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                bVarArrB = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (p169q8.b bVar : bVarArrB) {
            if (bVar != null) {
                m8.m.a aVar = p129m8.m.f46450b;
                bVar.resumeWith(p129m8.m.b(Unit.f45918a));
            }
        }
        if (a10 != null) {
            a10.Z(-1);
        }
    }

    protected final int l() {
        return this.f3546b;
    }

    protected final d[] m() {
        return this.f3545a;
    }
}
