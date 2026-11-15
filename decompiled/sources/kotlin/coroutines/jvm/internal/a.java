package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129m8.m;
import p129m8.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements p169q8.b, e, Serializable {

    @Nullable
    private final p169q8.b completion;

    public a(p169q8.b bVar) {
        this.completion = bVar;
    }

    @NotNull
    public p169q8.b create(@NotNull p169q8.b completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Nullable
    public e getCallerFrame() {
        p169q8.b bVar = this.completion;
        if (bVar instanceof e) {
            return (e) bVar;
        }
        return null;
    }

    @Nullable
    public final p169q8.b getCompletion() {
        return this.completion;
    }

    @Nullable
    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // p169q8.b
    public final void resumeWith(@NotNull Object obj) {
        p169q8.b bVar = this;
        while (true) {
            h.b(bVar);
            a aVar = (a) bVar;
            p169q8.b bVar2 = aVar.completion;
            Intrinsics.c(bVar2);
            try {
                Object objInvokeSuspend = aVar.invokeSuspend(obj);
                if (objInvokeSuspend == p179r8.b.e()) {
                    return;
                } else {
                    obj = m.b(objInvokeSuspend);
                }
            } catch (Throwable th) {
                m.a aVar2 = m.f46450b;
                obj = m.b(n.a(th));
            }
            aVar.releaseIntercepted();
            if (!(bVar2 instanceof a)) {
                bVar2.resumeWith(obj);
                return;
            }
            bVar = bVar2;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    @NotNull
    public p169q8.b create(@Nullable Object obj, @NotNull p169q8.b completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
