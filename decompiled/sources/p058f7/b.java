package p058f7;

import R8.g;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f43738a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f43739b = Collections.synchronizedMap(new LinkedHashMap());

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final R8.a f43740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f43741b;

        public a(R8.a mutex, c cVar) {
            Intrinsics.checkNotNullParameter(mutex, "mutex");
            this.f43740a = mutex;
            this.f43741b = cVar;
        }

        public final R8.a a() {
            return this.f43740a;
        }

        public final c b() {
            return this.f43741b;
        }

        public final void c(c cVar) {
            this.f43741b = cVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.b(this.f43740a, aVar.f43740a) && Intrinsics.b(this.f43741b, aVar.f43741b);
        }

        public int hashCode() {
            int iHashCode = this.f43740a.hashCode() * 31;
            c cVar = this.f43741b;
            return iHashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.f43740a + ", subscriber=" + this.f43741b + ')';
        }

        public /* synthetic */ a(R8.a aVar, c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i10 & 2) != 0 ? null : cVar);
        }
    }

    /* JADX INFO: renamed from: f7.b$b, reason: collision with other inner class name */
    static final class C0424b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f43742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f43743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f43744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f43745d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f43746e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f43747f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f43748g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f43750i;

        C0424b(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43748g = obj;
            this.f43750i |= LinearLayoutManager.INVALID_OFFSET;
            return b.this.c(this);
        }
    }

    private b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(c.a subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        Map dependencies = f43739b;
        if (dependencies.containsKey(subscriberName)) {
            Log.d("FirebaseSessions", "Dependency " + subscriberName + " already added.");
            return;
        }
        Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
        dependencies.put(subscriberName, new a(g.a(true), null, 2, 0 == true ? 1 : 0));
        Log.d("FirebaseSessions", "Dependency to " + subscriberName + " added.");
    }

    private final a b(c.a aVar) {
        Map dependencies = f43739b;
        Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
        Object obj = dependencies.get(aVar);
        if (obj != null) {
            Intrinsics.checkNotNullExpressionValue(obj, "getOrElse(...)");
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    public static final void e(c subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        c.a aVarC = subscriber.c();
        a aVarB = f43738a.b(aVarC);
        if (aVarB.b() != null) {
            Log.d("FirebaseSessions", "Subscriber " + aVarC + " already registered.");
            return;
        }
        aVarB.c(subscriber);
        Log.d("FirebaseSessions", "Subscriber " + aVarC + " registered.");
        R8.a.C0077a.b(aVarB.a(), null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    /* JADX WARN: Code duplicated, block: B:19:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009f -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(p169q8.b r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof p058f7.b.C0424b
            if (r0 == 0) goto L13
            r0 = r11
            f7.b$b r0 = (p058f7.b.C0424b) r0
            int r1 = r0.f43750i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43750i = r1
            goto L18
        L13:
            f7.b$b r0 = new f7.b$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f43748g
            java.lang.Object r1 = p179r8.b.e()
            int r2 = r0.f43750i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r2 = r0.f43747f
            java.lang.Object r5 = r0.f43746e
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f43745d
            R8.a r6 = (R8.a) r6
            java.lang.Object r7 = r0.f43744c
            f7.c$a r7 = (f7.c.a) r7
            java.lang.Object r8 = r0.f43743b
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f43742a
            java.util.Map r9 = (java.util.Map) r9
            p129m8.n.b(r11)
            goto La0
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            p129m8.n.b(r11)
            java.util.Map r11 = p058f7.b.f43739b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = kotlin.collections.E.d(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L69:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb3
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            f7.c$a r7 = (f7.c.a) r7
            java.lang.Object r11 = r11.getValue()
            f7.b$a r11 = (f7.b.a) r11
            R8.a r6 = r11.a()
            r0.f43742a = r5
            r0.f43743b = r8
            r0.f43744c = r7
            r0.f43745d = r6
            r0.f43746e = r5
            r0.f43747f = r2
            r0.f43750i = r3
            java.lang.Object r11 = r6.d(r4, r0)
            if (r11 != r1) goto L9f
            return r1
        L9f:
            r9 = r5
        La0:
            f7.b r11 = p058f7.b.f43738a     // Catch: java.lang.Throwable -> Lae
            f7.c r11 = r11.d(r7)     // Catch: java.lang.Throwable -> Lae
            r6.e(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L69
        Lae:
            r11 = move-exception
            r6.e(r4)
            throw r11
        Lb3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p058f7.b.c(q8.b):java.lang.Object");
    }

    public final c d(c.a subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        c cVarB = b(subscriberName).b();
        if (cVarB != null) {
            return cVarB;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }
}
