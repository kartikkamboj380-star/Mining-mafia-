package p154p3;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.c1;
import com.facebook.yoga.p;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f47804i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f47805j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c1 f47806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f47807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap f47808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArrayList f47809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f47810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f47811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final N3.a f47812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RootViewManager f47813h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        void a(Queue queue);
    }

    static {
        String simpleName = c.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        f47805j = simpleName;
    }

    public c(c1 viewManagerRegistry, b mountItemExecutor) {
        Intrinsics.checkNotNullParameter(viewManagerRegistry, "viewManagerRegistry");
        Intrinsics.checkNotNullParameter(mountItemExecutor, "mountItemExecutor");
        this.f47806a = viewManagerRegistry;
        this.f47807b = mountItemExecutor;
        this.f47808c = new ConcurrentHashMap();
        this.f47809d = new CopyOnWriteArrayList();
        this.f47812g = new N3.a();
        this.f47813h = new RootViewManager();
    }

    private final e j(int i10, int i11) {
        return i10 == -1 ? h(i11) : f(i10);
    }

    public final void a(int i10, View view, E0 e10) {
        e eVarG = g(i10, "attachView");
        if (eVarG.w()) {
            ReactSoftExceptionLogger.logSoftException(f47805j, new IllegalStateException("Trying to attach a view to a stopped surface"));
        } else {
            eVarG.h(view, e10);
        }
    }

    public final void b() {
        this.f47812g.b();
    }

    public final void c(int i10, int i11, String str, boolean z9, WritableMap writableMap, int i12) {
        e eVarJ = j(i10, i11);
        if (eVarJ == null) {
            Z1.a.d(f47805j, "Cannot queue event without valid surface mounting manager for tag: %d, surfaceId: %d", Integer.valueOf(i11), Integer.valueOf(i10));
        } else {
            eVarJ.l(i11, str, z9, writableMap, i12);
        }
    }

    public final void d(ReactContext reactContext, String str, int i10, int i11, com.facebook.react.common.mapbuffer.a aVar) {
        c1 c1Var = this.f47806a;
        if (str == null) {
            throw new IllegalStateException("Required value was null.");
        }
        c1Var.g(str).experimental_prefetchResource(reactContext, i10, i11, aVar);
    }

    public final EventEmitterWrapper e(int i10, int i11) {
        e eVarJ = j(i10, i11);
        if (eVarJ != null) {
            return eVarJ.o(i11);
        }
        return null;
    }

    public final e f(int i10) {
        e eVar = this.f47811f;
        if (eVar != null && eVar.q() == i10) {
            return this.f47811f;
        }
        e eVar2 = this.f47810e;
        if (eVar2 != null && eVar2.q() == i10) {
            return this.f47810e;
        }
        e eVar3 = (e) this.f47808c.get(Integer.valueOf(i10));
        this.f47811f = eVar3;
        return eVar3;
    }

    public final e g(int i10, String context) {
        Intrinsics.checkNotNullParameter(context, "context");
        e eVarF = f(i10);
        if (eVarF != null) {
            return eVarF;
        }
        throw new RetryableMountingLayerException("Unable to find SurfaceMountingManager for surfaceId: [" + i10 + "]. Context: " + context);
    }

    public final e h(int i10) {
        e eVar = this.f47810e;
        if (eVar != null && eVar.s(i10)) {
            return this.f47810e;
        }
        Iterator it = this.f47808c.entrySet().iterator();
        while (it.hasNext()) {
            e eVar2 = (e) ((Map.Entry) it.next()).getValue();
            if (eVar2 != this.f47810e && eVar2.s(i10)) {
                if (this.f47810e == null) {
                    this.f47810e = eVar2;
                }
                return eVar2;
            }
        }
        return null;
    }

    public final e i(int i10) {
        e eVarH = h(i10);
        if (eVarH != null) {
            return eVarH;
        }
        throw new RetryableMountingLayerException("Unable to find SurfaceMountingManager for tag: [" + i10 + "]");
    }

    public final boolean k(int i10) {
        return h(i10) != null;
    }

    public final boolean l(int i10) {
        e eVarF = f(i10);
        if (eVarF == null || eVarF.w()) {
            return false;
        }
        return !eVarF.v();
    }

    public final long m(ReactContext reactContext, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, p pVar, float f11, p pVar2, float[] fArr) {
        c1 c1Var = this.f47806a;
        if (str != null) {
            return c1Var.g(str).measure(reactContext, readableMap, readableMap2, readableMap3, f10, pVar, f11, pVar2, fArr);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void n(int i10, int i11, int i12, ReadableArray commandArgs) {
        Intrinsics.checkNotNullParameter(commandArgs, "commandArgs");
        UiThreadUtil.assertOnUiThread();
        g(i10, "receiveCommand:int").D(i11, i12, commandArgs);
    }

    public final void o(int i10, int i11, String str, ReadableArray commandArgs) {
        Intrinsics.checkNotNullParameter(commandArgs, "commandArgs");
        UiThreadUtil.assertOnUiThread();
        e eVarG = g(i10, "receiveCommand:string");
        if (str == null) {
            throw new IllegalStateException("Required value was null.");
        }
        eVarG.E(i11, str, commandArgs);
    }

    public final void p(int i10, int i11, int i12) {
        UiThreadUtil.assertOnUiThread();
        if (i10 == -1) {
            i(i11).H(i11, i12);
        } else {
            g(i10, "sendAccessibilityEvent").H(i11, i12);
        }
    }

    public final e q(int i10, E0 e10, View view) {
        N3.a aVar = this.f47812g;
        c1 c1Var = this.f47806a;
        RootViewManager rootViewManager = this.f47813h;
        b bVar = this.f47807b;
        if (e10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        e eVar = new e(i10, aVar, c1Var, rootViewManager, bVar, e10);
        this.f47808c.putIfAbsent(Integer.valueOf(i10), eVar);
        if (this.f47808c.get(Integer.valueOf(i10)) != eVar) {
            ReactSoftExceptionLogger.logSoftException(f47805j, new IllegalStateException("Called startSurface more than once for the SurfaceId [" + i10 + "]"));
        }
        this.f47810e = (e) this.f47808c.get(Integer.valueOf(i10));
        if (view != null) {
            eVar.h(view, e10);
        }
        return eVar;
    }

    public final void r(int i10) {
        e eVar = (e) this.f47808c.get(Integer.valueOf(i10));
        if (eVar == null) {
            ReactSoftExceptionLogger.logSoftException(f47805j, new IllegalStateException("Cannot call stopSurface on non-existent surface: [" + i10 + "]"));
            return;
        }
        while (this.f47809d.size() >= 15) {
            Integer num = (Integer) this.f47809d.get(0);
            if (num == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.f47808c.remove(num);
            this.f47809d.remove(num);
            Z1.a.c(f47805j, "Removing stale SurfaceMountingManager: [%d]", num);
        }
        this.f47809d.add(Integer.valueOf(i10));
        eVar.J();
        if (this.f47810e == eVar) {
            this.f47810e = null;
        }
        if (this.f47811f == eVar) {
            this.f47811f = null;
        }
    }

    public final boolean s(int i10) {
        if (this.f47809d.contains(Integer.valueOf(i10))) {
            return true;
        }
        e eVarF = f(i10);
        return eVarF != null && eVarF.w();
    }

    public final void t(int i10, ReadableMap readableMap) {
        UiThreadUtil.assertOnUiThread();
        if (readableMap == null) {
            return;
        }
        i(i10).P(i10, readableMap);
    }
}
