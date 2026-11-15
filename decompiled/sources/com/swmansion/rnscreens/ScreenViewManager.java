package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1385u0;
import com.facebook.react.uimanager.D0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.U0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.horcrux.svg.BuildConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
@p234x3.a(name = ScreenViewManager.REACT_CLASS)
@Metadata
public class ScreenViewManager extends ViewGroupManager<C6814s> implements X3.D {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public static final String REACT_CLASS = "RNSScreen";

    @NotNull
    private final U0 delegate;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ScreenViewManager() {
        super(null, 1, null);
        this.delegate = new X3.C(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    protected U0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return kotlin.collections.E.l(p129m8.q.a("topDismissed", kotlin.collections.E.i(p129m8.q.a("registrationName", "onDismissed"))), p129m8.q.a("topWillAppear", kotlin.collections.E.i(p129m8.q.a("registrationName", "onWillAppear"))), p129m8.q.a("topAppear", kotlin.collections.E.i(p129m8.q.a("registrationName", "onAppear"))), p129m8.q.a("topWillDisappear", kotlin.collections.E.i(p129m8.q.a("registrationName", "onWillDisappear"))), p129m8.q.a("topDisappear", kotlin.collections.E.i(p129m8.q.a("registrationName", "onDisappear"))), p129m8.q.a("topHeaderHeightChange", kotlin.collections.E.i(p129m8.q.a("registrationName", "onHeaderHeightChange"))), p129m8.q.a("topHeaderBackButtonClicked", kotlin.collections.E.i(p129m8.q.a("registrationName", "onHeaderBackButtonClicked"))), p129m8.q.a("topTransitionProgress", kotlin.collections.E.i(p129m8.q.a("registrationName", "onTransitionProgress"))), p129m8.q.a("topSheetDetentChanged", kotlin.collections.E.i(p129m8.q.a("registrationName", "onSheetDetentChanged"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.N
    public /* bridge */ /* synthetic */ void removeAllViews(@NotNull View view) {
        super.removeAllViews(view);
    }

    @Override // X3.D
    public void setCustomAnimationOnSwipe(@Nullable C6814s c6814s, boolean z9) {
    }

    @Override // X3.D
    public void setFullScreenSwipeEnabled(@Nullable C6814s c6814s, boolean z9) {
    }

    @Override // X3.D
    public void setFullScreenSwipeShadowEnabled(@Nullable C6814s c6814s, boolean z9) {
    }

    @Override // X3.D
    public void setGestureResponseDistance(@Nullable C6814s c6814s, @Nullable ReadableMap readableMap) {
    }

    @Override // X3.D
    public void setHideKeyboardOnSwipe(@Nullable C6814s c6814s, boolean z9) {
    }

    @Override // X3.D
    public void setHomeIndicatorHidden(@Nullable C6814s c6814s, boolean z9) {
    }

    @Override // X3.D
    public void setPreventNativeDismiss(@Nullable C6814s c6814s, boolean z9) {
    }

    @Override // X3.D
    public void setSwipeDirection(@Nullable C6814s c6814s, @Nullable String str) {
    }

    @Override // X3.D
    public void setTransitionDuration(@Nullable C6814s c6814s, int i10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public C6814s createViewInstance(@NotNull E0 reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new C6814s(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull C6814s view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.t();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(@NotNull C6814s parent, @NotNull View view) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        super.removeView(parent, view);
        if (view instanceof C6819x) {
            parent.setFooter(null);
        }
    }

    @Override // X3.D
    public void setActivityState(@NotNull C6814s view, float f10) {
        Intrinsics.checkNotNullParameter(view, "view");
        setActivityState(view, (int) f10);
    }

    @Override // X3.D
    @O3.a(defaultBoolean = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED, name = "gestureEnabled")
    public void setGestureEnabled(@NotNull C6814s view, boolean z9) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setGestureEnabled(z9);
    }

    @Override // X3.D
    @O3.a(name = "nativeBackButtonDismissalEnabled")
    public void setNativeBackButtonDismissalEnabled(@NotNull C6814s view, boolean z9) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNativeBackButtonDismissalEnabled(z9);
    }

    @Override // X3.D
    @O3.a(customType = "Color", name = "navigationBarColor")
    public void setNavigationBarColor(@NotNull C6814s view, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNavigationBarColor(num);
    }

    @Override // X3.D
    @O3.a(name = "navigationBarHidden")
    public void setNavigationBarHidden(@NotNull C6814s view, boolean z9) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNavigationBarHidden(Boolean.valueOf(z9));
    }

    @Override // X3.D
    @O3.a(name = "navigationBarTranslucent")
    public void setNavigationBarTranslucent(@NotNull C6814s view, boolean z9) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNavigationBarTranslucent(Boolean.valueOf(z9));
    }

    @Override // X3.D
    @O3.a(name = "replaceAnimation")
    public void setReplaceAnimation(@NotNull C6814s view, @Nullable String str) {
        C6814s.c cVar;
        Intrinsics.checkNotNullParameter(view, "view");
        if (str == null || Intrinsics.b(str, "pop")) {
            cVar = C6814s.c.POP;
        } else {
            if (!Intrinsics.b(str, "push")) {
                throw new JSApplicationIllegalArgumentException("Unknown replace animation type " + str);
            }
            cVar = C6814s.c.PUSH;
        }
        view.setReplaceAnimation(cVar);
    }

    @Override // X3.D
    public void setScreenId(@NotNull C6814s view, @Nullable String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (str == null || str.length() == 0) {
            str = null;
        }
        view.setScreenId(str);
    }

    @Override // X3.D
    @O3.a(name = "screenOrientation")
    public void setScreenOrientation(@NotNull C6814s view, @Nullable String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScreenOrientation(str);
    }

    @Override // X3.D
    @O3.a(name = "sheetAllowedDetents")
    public void setSheetAllowedDetents(@NotNull C6814s view, @Nullable final ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.getSheetDetents().clear();
        if (readableArray == null || readableArray.size() == 0) {
            view.getSheetDetents().add(Double.valueOf(1.0d));
        } else {
            G8.j.C(G8.j.w(CollectionsKt.O(kotlin.ranges.a.f45995d.a(0, readableArray.size() - 1, 1)), new Function1() { // from class: com.swmansion.rnscreens.Z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Double.valueOf(readableArray.getDouble(((Integer) obj).intValue()));
                }
            }), view.getSheetDetents());
        }
    }

    @Override // X3.D
    @O3.a(name = "sheetCornerRadius")
    public void setSheetCornerRadius(@NotNull C6814s view, float f10) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetCornerRadius(f10);
    }

    @Override // X3.D
    @O3.a(name = "sheetElevation")
    public void setSheetElevation(@Nullable C6814s c6814s, int i10) {
        if (c6814s != null) {
            c6814s.setSheetElevation(i10);
        }
    }

    @Override // X3.D
    @O3.a(name = "sheetExpandsWhenScrolledToEdge")
    public void setSheetExpandsWhenScrolledToEdge(@NotNull C6814s view, boolean z9) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetExpandsWhenScrolledToEdge(z9);
    }

    @Override // X3.D
    @O3.a(name = "sheetGrabberVisible")
    public void setSheetGrabberVisible(@NotNull C6814s view, boolean z9) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetGrabberVisible(z9);
    }

    @Override // X3.D
    @O3.a(name = "sheetInitialDetent")
    public void setSheetInitialDetent(@NotNull C6814s view, int i10) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetInitialDetentIndex(i10);
    }

    @Override // X3.D
    @O3.a(name = "sheetLargestUndimmedDetent")
    public void setSheetLargestUndimmedDetent(@NotNull C6814s view, int i10) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (-1 > i10 || i10 >= 3) {
            throw new IllegalStateException("[RNScreens] sheetLargestUndimmedDetent on Android supports values between -1 and 2");
        }
        view.setSheetLargestUndimmedDetentIndex(i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r4.equals(com.unity3d.ads.BuildConfig.FLAVOR) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r4.equals("flip") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        if (r4.equals("simple_push") != false) goto L42;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X3.D
    @O3.a(name = "stackAnimation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStackAnimation(@org.jetbrains.annotations.NotNull com.swmansion.rnscreens.C6814s r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackAnimation(com.swmansion.rnscreens.s, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r4.equals("fullScreenModal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r4.equals("containedTransparentModal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r4.equals("pageSheet") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r4.equals("containedModal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r4.equals("modal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        r4 = com.swmansion.rnscreens.C6814s.e.MODAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r4.equals("transparentModal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r4 = com.swmansion.rnscreens.C6814s.e.TRANSPARENT_MODAL;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X3.D
    @O3.a(name = "stackPresentation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStackPresentation(@org.jetbrains.annotations.NotNull com.swmansion.rnscreens.C6814s r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r4 == 0) goto L62
            int r0 = r4.hashCode()
            switch(r0) {
                case -76271493: goto L54;
                case 3452698: goto L49;
                case 104069805: goto L3e;
                case 438078970: goto L35;
                case 872434704: goto L2c;
                case 955284238: goto L23;
                case 1171936146: goto L1a;
                case 1798290171: goto Lf;
                default: goto Le;
            }
        Le:
            goto L62
        Lf:
            java.lang.String r0 = "formSheet"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            com.swmansion.rnscreens.s$e r4 = com.swmansion.rnscreens.C6814s.e.FORM_SHEET
            goto L5e
        L1a:
            java.lang.String r0 = "fullScreenModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            goto L46
        L23:
            java.lang.String r0 = "containedTransparentModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            goto L5c
        L2c:
            java.lang.String r0 = "pageSheet"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            goto L46
        L35:
            java.lang.String r0 = "containedModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            goto L46
        L3e:
            java.lang.String r0 = "modal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
        L46:
            com.swmansion.rnscreens.s$e r4 = com.swmansion.rnscreens.C6814s.e.MODAL
            goto L5e
        L49:
            java.lang.String r0 = "push"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            com.swmansion.rnscreens.s$e r4 = com.swmansion.rnscreens.C6814s.e.PUSH
            goto L5e
        L54:
            java.lang.String r0 = "transparentModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
        L5c:
            com.swmansion.rnscreens.s$e r4 = com.swmansion.rnscreens.C6814s.e.TRANSPARENT_MODAL
        L5e:
            r3.setStackPresentation(r4)
            return
        L62:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r3 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown presentation type "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackPresentation(com.swmansion.rnscreens.s, java.lang.String):void");
    }

    @Override // X3.D
    @O3.a(name = "statusBarAnimation")
    public void setStatusBarAnimation(@NotNull C6814s view, @Nullable String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarAnimated(Boolean.valueOf((str == null || Intrinsics.b("none", str)) ? false : true));
    }

    @Override // X3.D
    @O3.a(customType = "Color", name = "statusBarColor")
    public void setStatusBarColor(@NotNull C6814s view, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarColor(num);
    }

    @Override // X3.D
    @O3.a(name = "statusBarHidden")
    public void setStatusBarHidden(@NotNull C6814s view, boolean z9) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarHidden(Boolean.valueOf(z9));
    }

    @Override // X3.D
    @O3.a(name = "statusBarStyle")
    public void setStatusBarStyle(@NotNull C6814s view, @Nullable String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarStyle(str);
    }

    @Override // X3.D
    @O3.a(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(@NotNull C6814s view, boolean z9) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarTranslucent(Boolean.valueOf(z9));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Object updateState(@NotNull C6814s view, @Nullable C1385u0 c1385u0, @Nullable D0 d10) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStateWrapper(d10);
        return super.updateState(view, c1385u0, d10);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull C6814s parent, @NotNull View child, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child instanceof C6817v) {
            parent.w((C6817v) child);
        } else if (child instanceof C6819x) {
            parent.setFooter((C6819x) child);
        }
        super.addView(parent, child, i10);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(@NotNull C6814s parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (parent.getChildAt(i10) instanceof C6819x) {
            parent.setFooter(null);
        }
        super.removeViewAt(parent, i10);
    }

    @O3.a(name = "activityState")
    public final void setActivityState(@NotNull C6814s view, int i10) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (i10 == -1) {
            return;
        }
        if (i10 == 0) {
            view.setActivityState(C6814s.a.INACTIVE);
        } else if (i10 == 1) {
            view.setActivityState(C6814s.a.TRANSITIONING_OR_BELOW_TOP);
        } else {
            if (i10 != 2) {
                return;
            }
            view.setActivityState(C6814s.a.ON_TOP);
        }
    }
}
