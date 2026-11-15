package p255z4;

import android.util.SparseArray;
import java.util.HashMap;
import p125m4.f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray f51020a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap f51021b;

    static {
        HashMap map = new HashMap();
        f51021b = map;
        map.put(f.DEFAULT, 0);
        f51021b.put(f.VERY_LOW, 1);
        f51021b.put(f.HIGHEST, 2);
        for (f fVar : f51021b.keySet()) {
            f51020a.append(((Integer) f51021b.get(fVar)).intValue(), fVar);
        }
    }

    public static int a(f fVar) {
        Integer num = (Integer) f51021b.get(fVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + fVar);
    }

    public static f b(int i10) {
        f fVar = (f) f51020a.get(i10);
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
