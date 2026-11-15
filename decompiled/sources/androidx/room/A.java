package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    @NotNull
    private final u database;

    @NotNull
    private final AtomicBoolean lock;

    @NotNull
    private final Lazy stmt$delegate;

    static final class a extends kotlin.jvm.internal.m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A0.k invoke() {
            return A.this.a();
        }
    }

    public A(u database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.database = database;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = p129m8.g.a(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final A0.k a() {
        return this.database.compileStatement(createQuery());
    }

    private final A0.k b() {
        return (A0.k) this.stmt$delegate.getValue();
    }

    private final A0.k c(boolean z9) {
        return z9 ? b() : a();
    }

    @NotNull
    public A0.k acquire() {
        assertNotMainThread();
        return c(this.lock.compareAndSet(false, true));
    }

    protected void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    protected abstract String createQuery();

    public void release(@NotNull A0.k statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == b()) {
            this.lock.set(false);
        }
    }
}
