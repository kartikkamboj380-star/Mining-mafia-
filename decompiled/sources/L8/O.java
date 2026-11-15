package L8;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class O implements InterfaceC0805f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0805f f3221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function2 f3222b;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f3223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f3224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f3225c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3227e;

        a(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3225c = obj;
            this.f3227e |= LinearLayoutManager.INVALID_OFFSET;
            return O.this.a(this);
        }
    }

    public O(InterfaceC0805f interfaceC0805f, Function2 function2) {
        this.f3221a = interfaceC0805f;
        this.f3222b = function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (((L8.O) r7).a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [M8.u] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(p169q8.b r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof L8.O.a
            if (r0 == 0) goto L13
            r0 = r7
            L8.O$a r0 = (L8.O.a) r0
            int r1 = r0.f3227e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3227e = r1
            goto L18
        L13:
            L8.O$a r0 = new L8.O$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f3225c
            java.lang.Object r1 = p179r8.b.e()
            int r2 = r0.f3227e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p129m8.n.b(r7)
            goto L79
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f3224b
            M8.u r2 = (M8.u) r2
            java.lang.Object r4 = r0.f3223a
            L8.O r4 = (L8.O) r4
            p129m8.n.b(r7)     // Catch: java.lang.Throwable -> L40
            goto L60
        L40:
            r7 = move-exception
            goto L7f
        L42:
            p129m8.n.b(r7)
            M8.u r2 = new M8.u
            L8.f r7 = r6.f3221a
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            r2.<init>(r7, r5)
            kotlin.jvm.functions.Function2 r7 = r6.f3222b     // Catch: java.lang.Throwable -> L40
            r0.f3223a = r6     // Catch: java.lang.Throwable -> L40
            r0.f3224b = r2     // Catch: java.lang.Throwable -> L40
            r0.f3227e = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L5f
            goto L78
        L5f:
            r4 = r6
        L60:
            r2.releaseIntercepted()
            L8.f r7 = r4.f3221a
            boolean r2 = r7 instanceof L8.O
            if (r2 == 0) goto L7c
            L8.O r7 = (L8.O) r7
            r2 = 0
            r0.f3223a = r2
            r0.f3224b = r2
            r0.f3227e = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.Unit r7 = kotlin.Unit.f45918a
            return r7
        L7c:
            kotlin.Unit r7 = kotlin.Unit.f45918a
            return r7
        L7f:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: L8.O.a(q8.b):java.lang.Object");
    }

    @Override // L8.InterfaceC0805f
    public Object emit(Object obj, p169q8.b bVar) {
        return this.f3221a.emit(obj, bVar);
    }
}
