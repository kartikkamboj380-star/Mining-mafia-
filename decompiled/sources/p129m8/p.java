package p129m8;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class p implements Lazy, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Function0 f46458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f46459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f46460c;

    public p(Function0 initializer, Object obj) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f46458a = initializer;
        this.f46459b = u.f46461a;
        this.f46460c = obj == null ? this : obj;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f46459b;
        u uVar = u.f46461a;
        if (obj != uVar) {
            return obj;
        }
        synchronized (this.f46460c) {
            objInvoke = this.f46459b;
            if (objInvoke == uVar) {
                Function0 function0 = this.f46458a;
                Intrinsics.c(function0);
                objInvoke = function0.invoke();
                this.f46459b = objInvoke;
                this.f46458a = null;
            }
        }
        return objInvoke;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.f46459b != u.f46461a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ p(Function0 function0, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i10 & 2) != 0 ? null : obj);
    }
}
