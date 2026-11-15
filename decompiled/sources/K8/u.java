package K8;

import I8.M;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
final class u extends h implements v {
    public u(CoroutineContext coroutineContext, g gVar) {
        super(coroutineContext, gVar, true, true);
    }

    @Override // I8.AbstractC0657a
    protected void M0(Throwable th, boolean z9) {
        if (P0().o(th) || z9) {
            return;
        }
        M.a(getContext(), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // I8.AbstractC0657a
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public void N0(Unit unit) {
        y.a.a(P0(), null, 1, null);
    }

    @Override // I8.AbstractC0657a, I8.H0, I8.B0
    public boolean isActive() {
        return super.isActive();
    }
}
