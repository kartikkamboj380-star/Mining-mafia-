package K7;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.I0;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0038a f2906d = new C0038a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactContext f2907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventDispatcher f2909c;

    /* JADX INFO: renamed from: K7.a$a, reason: collision with other inner class name */
    public static final class C0038a {
        public /* synthetic */ C0038a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0038a() {
        }
    }

    public a(ReactContext reactContext, int i10) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f2907a = reactContext;
        this.f2908b = i10;
        EventDispatcher eventDispatcherC = I0.c(reactContext, i10);
        if (eventDispatcherC != null) {
            this.f2909c = eventDispatcherC;
            return;
        }
        throw new IllegalStateException(("[RNScreens] Nullish event dispatcher for view with tag: " + i10).toString());
    }

    protected final EventDispatcher a() {
        return this.f2909c;
    }

    protected final int b() {
        return I0.e(this.f2907a);
    }

    public final int c() {
        return this.f2908b;
    }
}
