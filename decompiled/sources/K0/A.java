package K0;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f2401a = new A();

    private A() {
    }

    private final File c(Context context) {
        return new File(C0748a.f2471a.a(context), "androidx.work.workdb");
    }

    public static final void d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        A a10 = f2401a;
        if (a10.b(context).exists()) {
            androidx.work.q.e().a(B.f2402a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry entry : a10.e(context).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        androidx.work.q.e().k(B.f2402a, "Over-writing contents of " + file2);
                    }
                    androidx.work.q.e().a(B.f2402a, file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed");
                }
            }
        }
    }

    public final File a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return c(context);
    }

    public final File b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final Map e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File fileB = b(context);
        File fileA = a(context);
        String[] strArr = B.f2403b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.b.c(kotlin.collections.E.d(strArr.length), 16));
        for (String str : strArr) {
            Pair pairA = p129m8.q.a(new File(fileB.getPath() + str), new File(fileA.getPath() + str));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return kotlin.collections.E.o(linkedHashMap, p129m8.q.a(fileB, fileA));
    }
}
