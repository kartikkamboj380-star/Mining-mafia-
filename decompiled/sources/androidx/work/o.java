package androidx.work;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.p f11410a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.google.common.util.concurrent.p pVar) {
        super(1);
        this.f11410a = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.f45918a;
    }

    public final void invoke(Throwable th) {
        this.f11410a.cancel(false);
    }
}
