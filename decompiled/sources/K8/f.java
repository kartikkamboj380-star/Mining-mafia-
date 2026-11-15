package K8;

import I8.InterfaceC0683n;
import N8.D;
import N8.G;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m f2945a = new m(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f2946b = G.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f2947c = G.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS, 0, 0, 12, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f2948d = new D("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final D f2949e = new D("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final D f2950f = new D("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final D f2951g = new D("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final D f2952h = new D("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final D f2953i = new D("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final D f2954j = new D("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final D f2955k = new D("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final D f2956l = new D("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final D f2957m = new D("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final D f2958n = new D("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final D f2959o = new D("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final D f2960p = new D("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final D f2961q = new D("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final D f2962r = new D("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final D f2963s = new D("NO_CLOSE_CAUSE");

    /* synthetic */ class a extends kotlin.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2964a = new a();

        a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final m b(long j10, m mVar) {
            return f.x(j10, mVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).longValue(), (m) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(InterfaceC0683n interfaceC0683n, Object obj, p259z8.n nVar) {
        Object objB = interfaceC0683n.b(obj, null, nVar);
        if (objB == null) {
            return false;
        }
        interfaceC0683n.s(objB);
        return true;
    }

    static /* synthetic */ boolean C(InterfaceC0683n interfaceC0683n, Object obj, p259z8.n nVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            nVar = null;
        }
        return B(interfaceC0683n, obj, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j10, boolean z9) {
        return (z9 ? 4611686018427387904L : 0L) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m x(long j10, m mVar) {
        return new m(j10, mVar, mVar.y(), 0);
    }

    public static final F8.e y() {
        return a.f2964a;
    }

    public static final D z() {
        return f2956l;
    }
}
