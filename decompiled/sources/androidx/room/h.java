package androidx.room;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends A {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    protected abstract void bind(A0.k kVar, Object obj);

    public final int handle(Object obj) {
        A0.k kVarAcquire = acquire();
        try {
            bind(kVarAcquire, obj);
            return kVarAcquire.r();
        } finally {
            release(kVarAcquire);
        }
    }

    public final int handleMultiple(@NotNull Iterable<Object> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        A0.k kVarAcquire = acquire();
        try {
            Iterator<Object> it = entities.iterator();
            int iR = 0;
            while (it.hasNext()) {
                bind(kVarAcquire, it.next());
                iR += kVarAcquire.r();
            }
            release(kVarAcquire);
            return iR;
        } catch (Throwable th) {
            release(kVarAcquire);
            throw th;
        }
    }

    public final int handleMultiple(@NotNull Object[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        A0.k kVarAcquire = acquire();
        try {
            int iR = 0;
            for (Object obj : entities) {
                bind(kVarAcquire, obj);
                iR += kVarAcquire.r();
            }
            release(kVarAcquire);
            return iR;
        } catch (Throwable th) {
            release(kVarAcquire);
            throw th;
        }
    }
}
