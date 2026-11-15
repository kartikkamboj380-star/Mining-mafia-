package Z8;

import kotlin.Unit;
import kotlin.collections.C7023i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Z8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1076e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C7023i f7190a = new C7023i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7191b;

    protected final void a(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            try {
                if (this.f7191b + array.length < AbstractC1074c.f7188a) {
                    this.f7191b += array.length;
                    this.f7190a.addLast(array);
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final char[] b(int i10) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f7190a.r();
            if (cArr != null) {
                this.f7191b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i10] : cArr;
    }
}
