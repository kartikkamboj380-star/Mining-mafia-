package G7;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.EnumC1358g0;
import com.facebook.react.uimanager.InterfaceC1370m0;
import com.facebook.react.uimanager.InterfaceC1376p0;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends ViewGroup implements InterfaceC1370m0, InterfaceC1376p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1025b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f1026a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, float f10, g pointerEventsProxy) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pointerEventsProxy, "pointerEventsProxy");
        this.f1026a = pointerEventsProxy;
        pointerEventsProxy.a(new f(this));
        setBackgroundColor(-16777216);
        setAlpha(f10);
    }

    public final boolean getBlockGestures$react_native_screens_release() {
        return !I7.b.b(getAlpha(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, null);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1376p0
    @NotNull
    public EnumC1358g0 getPointerEvents() {
        return this.f1026a.getPointerEvents();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1370m0
    public boolean interceptsTouchEvent(float f10, float f11) {
        return getBlockGestures$react_native_screens_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1026a.a(null);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getBlockGestures$react_native_screens_release()) {
            callOnClick();
        }
        return getBlockGestures$react_native_screens_release();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1368l0
    public int reactTagForTouch(float f10, float f11) {
        throw new IllegalStateException("[RNScreens] DimmingView should never be asked for the view tag!");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, float f10) {
        this(context, f10, new g(null));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
    }
}
