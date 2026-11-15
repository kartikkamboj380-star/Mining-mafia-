package L8;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;

/* JADX INFO: renamed from: L8.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0808i {

    /* JADX INFO: renamed from: L8.i$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f3254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f3255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f3256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3257d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f3258e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f3259f;

        a(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3258e = obj;
            this.f3259f |= LinearLayoutManager.INVALID_OFFSET;
            return AbstractC0808i.c(null, null, false, this);
        }
    }

    public static final Object b(InterfaceC0805f interfaceC0805f, K8.x xVar, p169q8.b bVar) {
        Object objC = c(interfaceC0805f, xVar, true, bVar);
        return objC == p179r8.b.e() ? objC : Unit.f45918a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(L8.InterfaceC0805f r6, K8.x r7, boolean r8, p169q8.b r9) {
        /*
            boolean r0 = r9 instanceof L8.AbstractC0808i.a
            if (r0 == 0) goto L13
            r0 = r9
            L8.i$a r0 = (L8.AbstractC0808i.a) r0
            int r1 = r0.f3259f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3259f = r1
            goto L18
        L13:
            L8.i$a r0 = new L8.i$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f3258e
            java.lang.Object r1 = p179r8.b.e()
            int r2 = r0.f3259f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f3257d
            java.lang.Object r6 = r0.f3256c
            K8.i r6 = (K8.i) r6
            java.lang.Object r7 = r0.f3255b
            K8.x r7 = (K8.x) r7
            java.lang.Object r2 = r0.f3254a
            L8.f r2 = (L8.InterfaceC0805f) r2
            p129m8.n.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f3257d
            java.lang.Object r6 = r0.f3256c
            K8.i r6 = (K8.i) r6
            java.lang.Object r7 = r0.f3255b
            K8.x r7 = (K8.x) r7
            java.lang.Object r2 = r0.f3254a
            L8.f r2 = (L8.InterfaceC0805f) r2
            p129m8.n.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            p129m8.n.b(r9)
            L8.AbstractC0806g.p(r6)
            K8.i r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f3254a = r6     // Catch: java.lang.Throwable -> L3c
            r0.f3255b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f3256c = r9     // Catch: java.lang.Throwable -> L3c
            r0.f3257d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f3259f = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            goto L93
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f3254a = r2     // Catch: java.lang.Throwable -> L3c
            r0.f3255b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f3256c = r6     // Catch: java.lang.Throwable -> L3c
            r0.f3257d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f3259f = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
        L93:
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            K8.n.a(r7, r6)
        L9a:
            kotlin.Unit r6 = kotlin.Unit.f45918a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            K8.n.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L8.AbstractC0808i.c(L8.f, K8.x, boolean, q8.b):java.lang.Object");
    }
}
