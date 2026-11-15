package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends a {

    @Nullable
    private final CoroutineContext _context;

    @Nullable
    private transient p169q8.b intercepted;

    public d(p169q8.b bVar, CoroutineContext coroutineContext) {
        super(bVar);
        this._context = coroutineContext;
    }

    @Override // p169q8.b
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.c(coroutineContext);
        return coroutineContext;
    }

    @NotNull
    public final p169q8.b intercepted() {
        p169q8.b bVarV0 = this.intercepted;
        if (bVarV0 == null) {
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) getContext().get(kotlin.coroutines.d.f45954F);
            if (dVar == null || (bVarV0 = dVar.V0(this)) == null) {
                bVarV0 = this;
            }
            this.intercepted = bVarV0;
        }
        return bVarV0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        p169q8.b bVar = this.intercepted;
        if (bVar != null && bVar != this) {
            CoroutineContext.Element element = getContext().get(kotlin.coroutines.d.f45954F);
            Intrinsics.c(element);
            ((kotlin.coroutines.d) element).N(bVar);
        }
        this.intercepted = c.f45957a;
    }

    public d(p169q8.b bVar) {
        this(bVar, bVar != null ? bVar.getContext() : null);
    }
}
