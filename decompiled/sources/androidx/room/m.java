package androidx.room;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f10832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f10833b;

    public m(u database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f10832a = database;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f10833b = setNewSetFromMap;
    }
}
