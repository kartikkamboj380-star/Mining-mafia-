package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractActivityC1148t;
import androidx.fragment.app.ComponentCallbacksC1144o;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.I0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.swmansion.rnscreens.z, reason: case insensitive filesystem */
/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public class C6821z extends ComponentCallbacksC1144o implements A {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f42625h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C6814s f42626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f42627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f42629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f42630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f42631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f42632g;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.z$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final short a(float f10) {
            int i10;
            if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i10 = 1;
            } else {
                i10 = f10 == 1.0f ? 2 : 3;
            }
            return (short) i10;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.z$b */
    public enum b {
        DID_APPEAR,
        WILL_APPEAR,
        DID_DISAPPEAR,
        WILL_DISAPPEAR;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f42638f = p189s8.a.a(c());
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.z$c */
    private static final class c extends FrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.z$d */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42639a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.WILL_APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.DID_APPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.WILL_DISAPPEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.DID_DISAPPEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f42639a = iArr;
        }
    }

    public C6821z() {
        this.f42627b = new ArrayList();
        this.f42629d = -1.0f;
        this.f42630e = true;
        this.f42631f = true;
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    private final void A() {
        w(b.WILL_DISAPPEAR, this);
        B(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
    }

    private final void C(final boolean z9) {
        this.f42632g = !z9;
        ComponentCallbacksC1144o parentFragment = getParentFragment();
        if (parentFragment == null || ((parentFragment instanceof C6821z) && !((C6821z) parentFragment).f42632g)) {
            if (isResumed()) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6821z.D(z9, this);
                    }
                });
            } else if (z9) {
                y();
            } else {
                A();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(boolean z9, C6821z c6821z) {
        if (z9) {
            c6821z.x();
        } else {
            c6821z.z();
        }
    }

    private final void H() {
        AbstractActivityC1148t activity = getActivity();
        if (activity == null) {
            this.f42628c = true;
        } else {
            d0.f42321a.x(d(), activity, k());
        }
    }

    private final void x() {
        w(b.DID_APPEAR, this);
        B(1.0f, false);
    }

    private final void y() {
        w(b.DID_DISAPPEAR, this);
        B(1.0f, true);
    }

    private final void z() {
        w(b.WILL_APPEAR, this);
        B(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
    }

    public void B(float f10, boolean z9) {
        if (!(this instanceof T) || this.f42629d == f10) {
            return;
        }
        float fMax = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(1.0f, f10));
        this.f42629d = fMax;
        short sA = f42625h.a(fMax);
        T t10 = (T) this;
        C6816u container = t10.d().getContainer();
        boolean goingForward = container instanceof L ? ((L) container).getGoingForward() : false;
        Context context = t10.d().getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher eventDispatcherC = I0.c(reactContext, t10.d().getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.c(new H7.j(I0.e(reactContext), t10.d().getId(), this.f42629d, z9, goingForward, sA));
        }
    }

    public void E() {
        C(true);
    }

    public void F() {
        C(false);
    }

    public void G(C6814s c6814s) {
        Intrinsics.checkNotNullParameter(c6814s, "<set-?>");
        this.f42626a = c6814s;
    }

    public boolean a() {
        return false;
    }

    @Override // com.swmansion.rnscreens.A
    public Activity b() {
        ComponentCallbacksC1144o fragment;
        AbstractActivityC1148t activity;
        AbstractActivityC1148t activity2 = getActivity();
        if (activity2 != null) {
            return activity2;
        }
        Context context = d().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ViewParent container = d().getContainer(); container != null; container = container.getParent()) {
            if ((container instanceof C6814s) && (fragment = ((C6814s) container).getFragment()) != null && (activity = fragment.getActivity()) != null) {
                return activity;
            }
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.InterfaceC6805i
    public ComponentCallbacksC1144o c() {
        return this;
    }

    @Override // com.swmansion.rnscreens.A
    public C6814s d() {
        C6814s c6814s = this.f42626a;
        if (c6814s != null) {
            return c6814s;
        }
        Intrinsics.r("screen");
        return null;
    }

    @Override // com.swmansion.rnscreens.InterfaceC6818w
    public void e(b event) {
        A fragmentWrapper;
        Intrinsics.checkNotNullParameter(event, "event");
        List listF = f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (((C6816u) obj).getScreenCount() > 0) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            C6814s topScreen = ((C6816u) obj2).getTopScreen();
            if (topScreen != null && (fragmentWrapper = topScreen.getFragmentWrapper()) != null) {
                w(event, fragmentWrapper);
            }
        }
    }

    @Override // com.swmansion.rnscreens.A
    public List f() {
        return this.f42627b;
    }

    @Override // com.swmansion.rnscreens.A
    public void g(C6816u container) {
        Intrinsics.checkNotNullParameter(container, "container");
        f().add(container);
    }

    public void h() {
        H();
    }

    @Override // com.swmansion.rnscreens.A
    public void i(C6816u container) {
        Intrinsics.checkNotNullParameter(container, "container");
        f().remove(container);
    }

    @Override // com.swmansion.rnscreens.InterfaceC6818w
    public void j(b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = d.f42639a[event.ordinal()];
        if (i10 == 1) {
            this.f42630e = false;
            return;
        }
        if (i10 == 2) {
            this.f42631f = false;
        } else if (i10 == 3) {
            this.f42630e = true;
        } else {
            if (i10 != 4) {
                throw new p129m8.k();
            }
            this.f42631f = true;
        }
    }

    @Override // com.swmansion.rnscreens.A
    public ReactContext k() {
        if (getContext() instanceof ReactContext) {
            Context context = getContext();
            Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context;
        }
        if (d().getContext() instanceof ReactContext) {
            Context context2 = d().getContext();
            Intrinsics.d(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context2;
        }
        for (ViewParent container = d().getContainer(); container != null; container = container.getParent()) {
            if (container instanceof C6814s) {
                C6814s c6814s = (C6814s) container;
                if (c6814s.getContext() instanceof ReactContext) {
                    Context context3 = c6814s.getContext();
                    Intrinsics.d(context3, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    return (ReactContext) context3;
                }
            }
        }
        return null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1144o
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        d().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = getContext();
        if (context == null) {
            return null;
        }
        c cVar = new c(context);
        cVar.addView(I7.c.b(d()));
        return cVar;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1144o
    public void onDestroy() {
        super.onDestroy();
        C6816u container = d().getContainer();
        if (container == null || !container.n(d().getFragmentWrapper())) {
            Context context = d().getContext();
            if (context instanceof ReactContext) {
                int iE = I0.e(context);
                EventDispatcher eventDispatcherC = I0.c((ReactContext) context, d().getId());
                if (eventDispatcherC != null) {
                    eventDispatcherC.c(new H7.h(iE, d().getId()));
                }
            }
        }
        f().clear();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1144o
    public void onResume() {
        super.onResume();
        if (this.f42628c) {
            this.f42628c = false;
            d0.f42321a.x(d(), b(), k());
        }
    }

    public boolean u(b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = d.f42639a[event.ordinal()];
        if (i10 == 1) {
            return this.f42630e;
        }
        if (i10 == 2) {
            return this.f42631f;
        }
        if (i10 == 3) {
            return !this.f42630e;
        }
        if (i10 == 4) {
            return !this.f42631f;
        }
        throw new p129m8.k();
    }

    public void v() {
        Context context = d().getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int iE = I0.e(reactContext);
        EventDispatcher eventDispatcherC = I0.c(reactContext, d().getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.c(new H7.b(iE, d().getId()));
        }
    }

    public void w(b event, A fragmentWrapper) {
        com.facebook.react.uimanager.events.e kVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        ComponentCallbacksC1144o componentCallbacksC1144oC = fragmentWrapper.c();
        if (componentCallbacksC1144oC instanceof T) {
            T t10 = (T) componentCallbacksC1144oC;
            if (t10.u(event)) {
                C6814s c6814sD = t10.d();
                fragmentWrapper.j(event);
                int iF = I0.f(c6814sD);
                int i10 = d.f42639a[event.ordinal()];
                if (i10 == 1) {
                    kVar = new H7.k(iF, c6814sD.getId());
                } else if (i10 == 2) {
                    kVar = new H7.f(iF, c6814sD.getId());
                } else if (i10 == 3) {
                    kVar = new H7.l(iF, c6814sD.getId());
                } else {
                    if (i10 != 4) {
                        throw new p129m8.k();
                    }
                    kVar = new H7.g(iF, c6814sD.getId());
                }
                Context context = d().getContext();
                Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher eventDispatcherC = I0.c((ReactContext) context, d().getId());
                if (eventDispatcherC != null) {
                    eventDispatcherC.c(kVar);
                }
                fragmentWrapper.e(event);
            }
        }
    }

    public C6821z(C6814s screenView) {
        Intrinsics.checkNotNullParameter(screenView, "screenView");
        this.f42627b = new ArrayList();
        this.f42629d = -1.0f;
        this.f42630e = true;
        this.f42631f = true;
        G(screenView);
    }
}
