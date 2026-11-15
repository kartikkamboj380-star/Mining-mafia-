package p169q8;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129m8.m;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements b, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a f48102b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f48103c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "result");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f48104a;

    @Nullable
    private volatile Object result;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(b delegate, Object obj) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f48104a = delegate;
        this.result = obj;
    }

    public final Object c() throws Throwable {
        Object obj = this.result;
        p179r8.a aVar = p179r8.a.UNDECIDED;
        if (obj == aVar) {
            if (b.a(f48103c, this, aVar, p179r8.b.e())) {
                return p179r8.b.e();
            }
            obj = this.result;
        }
        if (obj == p179r8.a.RESUMED) {
            return p179r8.b.e();
        }
        if (obj instanceof m.b) {
            throw ((m.b) obj).f46452a;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        b bVar = this.f48104a;
        if (bVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) bVar;
        }
        return null;
    }

    @Override // p169q8.b
    public CoroutineContext getContext() {
        return this.f48104a.getContext();
    }

    @Override // p169q8.b
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            p179r8.a aVar = p179r8.a.UNDECIDED;
            if (obj2 == aVar) {
                if (b.a(f48103c, this, aVar, obj)) {
                    return;
                }
            } else {
                if (obj2 != p179r8.b.e()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (b.a(f48103c, this, p179r8.b.e(), p179r8.a.RESUMED)) {
                    this.f48104a.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f48104a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(b delegate) {
        this(delegate, p179r8.a.UNDECIDED);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }
}
