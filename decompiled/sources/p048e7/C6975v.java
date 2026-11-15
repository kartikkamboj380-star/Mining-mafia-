package p048e7;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p169q8.b;

/* JADX INFO: renamed from: e7.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6975v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f43503c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43505b;

    /* JADX INFO: renamed from: e7.v$a */
    public static final class a {

        /* JADX INFO: renamed from: e7.v$a$a, reason: collision with other inner class name */
        static final class C0419a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f43506a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f43507b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f43509d;

            C0419a(b bVar) {
                super(bVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f43507b = obj;
                this.f43509d |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.a(null, this);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
        
            if (r10 == r1) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [H6.e] */
        /* JADX WARN: Type inference failed for: r9v0, types: [H6.e, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v20 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(H6.e r9, p169q8.b r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof p048e7.C6975v.a.C0419a
                if (r0 == 0) goto L13
                r0 = r10
                e7.v$a$a r0 = (p048e7.C6975v.a.C0419a) r0
                int r1 = r0.f43509d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f43509d = r1
                goto L18
            L13:
                e7.v$a$a r0 = new e7.v$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f43507b
                java.lang.Object r1 = p179r8.b.e()
                int r2 = r0.f43509d
                java.lang.String r3 = "FirebaseSessions"
                r4 = 2
                r5 = 1
                java.lang.String r6 = ""
                if (r2 == 0) goto L48
                if (r2 == r5) goto L3e
                if (r2 != r4) goto L36
                java.lang.Object r9 = r0.f43506a
                java.lang.String r9 = (java.lang.String) r9
                p129m8.n.b(r10)     // Catch: java.lang.Exception -> L34
                goto L85
            L34:
                r10 = move-exception
                goto L8c
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f43506a
                H6.e r9 = (H6.e) r9
                p129m8.n.b(r10)     // Catch: java.lang.Exception -> L46
                goto L60
            L46:
                r10 = move-exception
                goto L6a
            L48:
                p129m8.n.b(r10)
                r10 = 0
                com.google.android.gms.tasks.Task r10 = r9.a(r10)     // Catch: java.lang.Exception -> L46
                java.lang.String r2 = "getToken(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)     // Catch: java.lang.Exception -> L46
                r0.f43506a = r9     // Catch: java.lang.Exception -> L46
                r0.f43509d = r5     // Catch: java.lang.Exception -> L46
                java.lang.Object r10 = S8.b.a(r10, r0)     // Catch: java.lang.Exception -> L46
                if (r10 != r1) goto L60
                goto L84
            L60:
                com.google.firebase.installations.g r10 = (com.google.firebase.installations.g) r10     // Catch: java.lang.Exception -> L46
                java.lang.String r10 = r10.b()     // Catch: java.lang.Exception -> L46
                r7 = r10
                r10 = r9
                r9 = r7
                goto L71
            L6a:
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r3, r2, r10)
                r10 = r9
                r9 = r6
            L71:
                com.google.android.gms.tasks.Task r10 = r10.getId()     // Catch: java.lang.Exception -> L34
                java.lang.String r2 = "getId(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)     // Catch: java.lang.Exception -> L34
                r0.f43506a = r9     // Catch: java.lang.Exception -> L34
                r0.f43509d = r4     // Catch: java.lang.Exception -> L34
                java.lang.Object r10 = S8.b.a(r10, r0)     // Catch: java.lang.Exception -> L34
                if (r10 != r1) goto L85
            L84:
                return r1
            L85:
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L34
                if (r10 != 0) goto L8a
                goto L91
            L8a:
                r6 = r10
                goto L91
            L8c:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r3, r0, r10)
            L91:
                e7.v r10 = new e7.v
                r0 = 0
                r10.<init>(r6, r9, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p048e7.C6975v.a.a(H6.e, q8.b):java.lang.Object");
        }

        private a() {
        }
    }

    public /* synthetic */ C6975v(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String a() {
        return this.f43505b;
    }

    public final String b() {
        return this.f43504a;
    }

    private C6975v(String str, String str2) {
        this.f43504a = str;
        this.f43505b = str2;
    }
}
