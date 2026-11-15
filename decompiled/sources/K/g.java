package K;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class g extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p169q8.b f2391a;

    public g(p169q8.b bVar) {
        super(false);
        this.f2391a = bVar;
    }

    public void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            p169q8.b bVar = this.f2391a;
            m8.m.a aVar = p129m8.m.f46450b;
            bVar.resumeWith(p129m8.m.b(p129m8.n.a(th)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f2391a.resumeWith(p129m8.m.b(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
