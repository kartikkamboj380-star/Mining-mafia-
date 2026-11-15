package p190t;

import kotlin.jvm.internal.Intrinsics;
import p200u.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f49477a = new Object();

    public static final Object c(l lVar, int i10) {
        Object obj;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        int iA = a.a(lVar.f49474b, lVar.f49476d, i10);
        if (iA < 0 || (obj = lVar.f49475c[iA]) == f49477a) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(l lVar) {
        int i10 = lVar.f49476d;
        int[] iArr = lVar.f49474b;
        Object[] objArr = lVar.f49475c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f49477a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        lVar.f49473a = false;
        lVar.f49476d = i11;
    }
}
