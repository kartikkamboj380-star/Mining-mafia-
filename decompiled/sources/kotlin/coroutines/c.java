package kotlin.coroutines;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements CoroutineContext, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CoroutineContext f45952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineContext.Element f45953b;

    public c(CoroutineContext left, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f45952a = left;
        this.f45953b = element;
    }

    private final boolean d(CoroutineContext.Element element) {
        return Intrinsics.b(get(element.getKey()), element);
    }

    private final boolean e(c cVar) {
        while (d(cVar.f45953b)) {
            CoroutineContext coroutineContext = cVar.f45952a;
            if (!(coroutineContext instanceof c)) {
                Intrinsics.d(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return d((CoroutineContext.Element) coroutineContext);
            }
            cVar = (c) coroutineContext;
        }
        return false;
    }

    private final int f() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            CoroutineContext coroutineContext = cVar.f45952a;
            cVar = coroutineContext instanceof c ? (c) coroutineContext : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(String acc, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(acc, "acc");
        Intrinsics.checkNotNullParameter(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.f() == f() && cVar.e(this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this.f45952a.fold(obj, operation), this.f45953b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        c cVar = this;
        while (true) {
            CoroutineContext.Element element = cVar.f45953b.get(key);
            if (element != null) {
                return element;
            }
            CoroutineContext coroutineContext = cVar.f45952a;
            if (!(coroutineContext instanceof c)) {
                return coroutineContext.get(key);
            }
            cVar = (c) coroutineContext;
        }
    }

    public int hashCode() {
        return this.f45952a.hashCode() + this.f45953b.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f45953b.get(key) != null) {
            return this.f45952a;
        }
        CoroutineContext coroutineContextMinusKey = this.f45952a.minusKey(key);
        if (coroutineContextMinusKey == this.f45952a) {
            return this;
        }
        return coroutineContextMinusKey == e.f45956a ? this.f45953b : new c(coroutineContextMinusKey, this.f45953b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.a.b(this, coroutineContext);
    }

    public String toString() {
        return '[' + ((String) fold("", new Function2() { // from class: q8.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return c.g((String) obj, (CoroutineContext.Element) obj2);
            }
        })) + ']';
    }
}
