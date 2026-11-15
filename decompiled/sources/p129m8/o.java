package p129m8;

import androidx.concurrent.futures.b;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final class o implements Lazy, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f46453d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f46454e = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Function0 f46455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f46456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f46457c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public o(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f46455a = initializer;
        u uVar = u.f46461a;
        this.f46456b = uVar;
        this.f46457c = uVar;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        Object obj = this.f46456b;
        u uVar = u.f46461a;
        if (obj != uVar) {
            return obj;
        }
        Function0 function0 = this.f46455a;
        if (function0 != null) {
            Object objInvoke = function0.invoke();
            if (b.a(f46454e, this, uVar, objInvoke)) {
                this.f46455a = null;
                return objInvoke;
            }
        }
        return this.f46456b;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.f46456b != u.f46461a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
