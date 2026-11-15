package androidx.room;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.AbstractC7033c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends A {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    protected abstract void bind(A0.k kVar, Object obj);

    public final void insert(Object obj) {
        A0.k kVarAcquire = acquire();
        try {
            bind(kVarAcquire, obj);
            kVarAcquire.l0();
        } finally {
            release(kVarAcquire);
        }
    }

    public final long insertAndReturnId(Object obj) {
        A0.k kVarAcquire = acquire();
        try {
            bind(kVarAcquire, obj);
            return kVarAcquire.l0();
        } finally {
            release(kVarAcquire);
        }
    }

    @NotNull
    public final long[] insertAndReturnIdsArray(@NotNull Collection<Object> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        A0.k kVarAcquire = acquire();
        try {
            long[] jArr = new long[entities.size()];
            int i10 = 0;
            for (Object obj : entities) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.r();
                }
                bind(kVarAcquire, obj);
                jArr[i10] = kVarAcquire.l0();
                i10 = i11;
            }
            return jArr;
        } finally {
            release(kVarAcquire);
        }
    }

    @NotNull
    public final Long[] insertAndReturnIdsArrayBox(@NotNull Collection<Object> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        A0.k kVarAcquire = acquire();
        Iterator<Object> it = entities.iterator();
        try {
            int size = entities.size();
            Long[] lArr = new Long[size];
            for (int i10 = 0; i10 < size; i10++) {
                bind(kVarAcquire, it.next());
                lArr[i10] = Long.valueOf(kVarAcquire.l0());
            }
            release(kVarAcquire);
            return lArr;
        } catch (Throwable th) {
            release(kVarAcquire);
            throw th;
        }
    }

    @NotNull
    public final List<Long> insertAndReturnIdsList(@NotNull Object[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        A0.k kVarAcquire = acquire();
        try {
            List listC = CollectionsKt.c();
            for (Object obj : entities) {
                bind(kVarAcquire, obj);
                listC.add(Long.valueOf(kVarAcquire.l0()));
            }
            return CollectionsKt.a(listC);
        } finally {
            release(kVarAcquire);
        }
    }

    public final void insert(@NotNull Object[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        A0.k kVarAcquire = acquire();
        try {
            for (Object obj : entities) {
                bind(kVarAcquire, obj);
                kVarAcquire.l0();
            }
            release(kVarAcquire);
        } catch (Throwable th) {
            release(kVarAcquire);
            throw th;
        }
    }

    @NotNull
    public final long[] insertAndReturnIdsArray(@NotNull Object[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        A0.k kVarAcquire = acquire();
        try {
            long[] jArr = new long[entities.length];
            int length = entities.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = i11 + 1;
                bind(kVarAcquire, entities[i10]);
                jArr[i11] = kVarAcquire.l0();
                i10++;
                i11 = i12;
            }
            release(kVarAcquire);
            return jArr;
        } catch (Throwable th) {
            release(kVarAcquire);
            throw th;
        }
    }

    @NotNull
    public final Long[] insertAndReturnIdsArrayBox(@NotNull Object[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        A0.k kVarAcquire = acquire();
        Iterator itA = AbstractC7033c.a(entities);
        try {
            int length = entities.length;
            Long[] lArr = new Long[length];
            for (int i10 = 0; i10 < length; i10++) {
                bind(kVarAcquire, itA.next());
                lArr[i10] = Long.valueOf(kVarAcquire.l0());
            }
            release(kVarAcquire);
            return lArr;
        } catch (Throwable th) {
            release(kVarAcquire);
            throw th;
        }
    }

    @NotNull
    public final List<Long> insertAndReturnIdsList(@NotNull Collection<Object> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        A0.k kVarAcquire = acquire();
        try {
            List listC = CollectionsKt.c();
            Iterator<T> it = entities.iterator();
            while (it.hasNext()) {
                bind(kVarAcquire, it.next());
                listC.add(Long.valueOf(kVarAcquire.l0()));
            }
            return CollectionsKt.a(listC);
        } finally {
            release(kVarAcquire);
        }
    }

    public final void insert(@NotNull Iterable<Object> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        A0.k kVarAcquire = acquire();
        try {
            Iterator<Object> it = entities.iterator();
            while (it.hasNext()) {
                bind(kVarAcquire, it.next());
                kVarAcquire.l0();
            }
            release(kVarAcquire);
        } catch (Throwable th) {
            release(kVarAcquire);
            throw th;
        }
    }
}
