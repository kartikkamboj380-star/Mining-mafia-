package X8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final V8.d[] f6798a = new V8.d[0];

    public static final Set a(V8.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar instanceof c) {
            return ((c) dVar).a();
        }
        HashSet hashSet = new HashSet(dVar.d());
        int iD = dVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            hashSet.add(dVar.e(i10));
        }
        return hashSet;
    }

    public static final V8.d[] b(List list) {
        V8.d[] dVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (dVarArr = (V8.d[]) list.toArray(new V8.d[0])) == null) ? f6798a : dVarArr;
    }
}
