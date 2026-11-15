package p129m8;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements Lazy, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Function0 f46463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f46464b;

    public y(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f46463a = initializer;
        this.f46464b = u.f46461a;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        if (this.f46464b == u.f46461a) {
            Function0 function0 = this.f46463a;
            Intrinsics.c(function0);
            this.f46464b = function0.invoke();
            this.f46463a = null;
        }
        return this.f46464b;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.f46464b != u.f46461a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
