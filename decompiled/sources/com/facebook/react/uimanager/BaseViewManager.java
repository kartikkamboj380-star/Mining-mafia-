package com.facebook.react.uimanager;

import O.AbstractC0845c0;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.react.AbstractC1313n;
import com.facebook.react.AbstractC1316q;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.U;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseViewManager<T extends View, C extends U> extends ViewManager<T, C> implements View.OnLayoutChangeListener {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static final Y.a sMatrixDecompositionContext = new Y.a();
    private static final double[] sTransformDecompositionArray = new double[16];

    private class a implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private View.OnFocusChangeListener f15316a;

        public a(View.OnFocusChangeListener onFocusChangeListener) {
            this.f15316a = onFocusChangeListener;
        }

        public void a(View view) {
            view.setOnFocusChangeListener(this);
        }

        public void b(View view) {
            view.setOnFocusChangeListener(this.f15316a);
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            EventDispatcher eventDispatcherC;
            View.OnFocusChangeListener onFocusChangeListener = this.f15316a;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z9);
            }
            int iE = I0.e(view.getContext());
            if (iE == -1 || !(view.getContext() instanceof E0) || (eventDispatcherC = I0.c((E0) view.getContext(), view.getId())) == null) {
                return;
            }
            if (z9) {
                eventDispatcherC.c(new com.facebook.react.uimanager.events.p(iE, view.getId()));
            } else {
                eventDispatcherC.c(new com.facebook.react.uimanager.events.c(iE, view.getId()));
            }
        }
    }

    private static class b {
        public static void a(View view, ReadableArray readableArray, Boolean bool) {
            Paint paint;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                view.setRenderEffect(null);
            }
            if (readableArray == null) {
                paint = null;
            } else if (K.t(readableArray)) {
                paint = new Paint();
                paint.setColorFilter(K.v(readableArray));
            } else {
                if (i10 >= 31) {
                    view.setRenderEffect(K.w(readableArray));
                }
                paint = null;
            }
            if (paint == null) {
                view.setLayerType((bool == null || !bool.booleanValue()) ? 0 : 2, null);
            } else {
                view.setLayerType(2, paint);
            }
        }
    }

    public BaseViewManager() {
        super(null);
    }

    private void logUnsupportedPropertyWarning(String str) {
        Z1.a.K("ReactNative", "%s doesn't support property '%s'", getName(), str);
    }

    private static float sanitizeFloatPropertyValue(float f10) {
        if (f10 >= -3.4028235E38f && f10 <= Float.MAX_VALUE) {
            return f10;
        }
        if (f10 < -3.4028235E38f || f10 == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f10 > Float.MAX_VALUE || f10 == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f10)) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        throw new IllegalStateException("Invalid float property value: " + f10);
    }

    private static void setPointerEventsFlag(@NonNull View view, com.facebook.react.uimanager.events.u.a aVar, boolean z9) {
        Integer num = (Integer) view.getTag(AbstractC1313n.f15061u);
        int iIntValue = num != null ? num.intValue() : 0;
        int iOrdinal = 1 << aVar.ordinal();
        view.setTag(AbstractC1313n.f15061u, Integer.valueOf(z9 ? iOrdinal | iIntValue : (~iOrdinal) & iIntValue));
    }

    private void updateViewContentDescription(@NonNull T t10) {
        Dynamic dynamic;
        String str = (String) t10.getTag(AbstractC1313n.f15045e);
        ReadableMap readableMap = (ReadableMap) t10.getTag(AbstractC1313n.f15049i);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t10.getTag(AbstractC1313n.f15051k);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(strNextKey);
                if (strNextKey.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    arrayList.add(t10.getContext().getString(AbstractC1316q.f15086L));
                } else if (strNextKey.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    arrayList.add(t10.getContext().getString(AbstractC1316q.f15085K));
                }
            }
        }
        if (readableMap2 != null && readableMap2.hasKey("text") && (dynamic = readableMap2.getDynamic("text")) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        t10.setContentDescription(TextUtils.join(", ", arrayList));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected void addEventEmitters(@NonNull E0 e10, @NonNull T t10) {
        super.addEventEmitters(e10, t10);
        new a(t10.getOnFocusChangeListener()).a(t10);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        e3.d.a aVarB = p044e3.d.a().b("topPointerCancel", p044e3.d.c("phasedRegistrationNames", p044e3.d.d("bubbled", "onPointerCancel", "captured", "onPointerCancelCapture"))).b("topPointerDown", p044e3.d.c("phasedRegistrationNames", p044e3.d.d("bubbled", "onPointerDown", "captured", "onPointerDownCapture")));
        Boolean bool = Boolean.TRUE;
        exportedCustomDirectEventTypeConstants.putAll(aVarB.b("topPointerEnter", p044e3.d.c("phasedRegistrationNames", p044e3.d.e("bubbled", "onPointerEnter", "captured", "onPointerEnterCapture", "skipBubbling", bool))).b("topPointerLeave", p044e3.d.c("phasedRegistrationNames", p044e3.d.e("bubbled", "onPointerLeave", "captured", "onPointerLeaveCapture", "skipBubbling", bool))).b("topPointerMove", p044e3.d.c("phasedRegistrationNames", p044e3.d.d("bubbled", "onPointerMove", "captured", "onPointerMoveCapture"))).b("topPointerUp", p044e3.d.c("phasedRegistrationNames", p044e3.d.d("bubbled", "onPointerUp", "captured", "onPointerUpCapture"))).b("topPointerOut", p044e3.d.c("phasedRegistrationNames", p044e3.d.d("bubbled", "onPointerOut", "captured", "onPointerOutCapture"))).b("topPointerOver", p044e3.d.c("phasedRegistrationNames", p044e3.d.d("bubbled", "onPointerOver", "captured", "onPointerOverCapture"))).b("topClick", p044e3.d.c("phasedRegistrationNames", p044e3.d.d("bubbled", "onClick", "captured", "onClickCapture"))).b("topBlur", p044e3.d.c("phasedRegistrationNames", p044e3.d.d("bubbled", "onBlur", "captured", "onBlurCapture"))).b("topFocus", p044e3.d.c("phasedRegistrationNames", p044e3.d.d("bubbled", "onFocus", "captured", "onFocusCapture"))).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(p044e3.d.a().b("topAccessibilityAction", p044e3.d.c("registrationName", "onAccessibilityAction")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected void onAfterUpdateTransaction(@NonNull T t10) {
        super.onAfterUpdateTransaction(t10);
        updateViewAccessibility(t10);
        Boolean bool = (Boolean) t10.getTag(AbstractC1313n.f15057q);
        if (bool != null && bool.booleanValue()) {
            t10.addOnLayoutChangeListener(this);
            setTransformProperty(t10, (ReadableArray) t10.getTag(AbstractC1313n.f15036C), (ReadableArray) t10.getTag(AbstractC1313n.f15037D));
            t10.setTag(AbstractC1313n.f15057q, Boolean.FALSE);
        }
        b.a(t10, (ReadableArray) t10.getTag(AbstractC1313n.f15055o), (Boolean) t10.getTag(AbstractC1313n.f15038E));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull T t10) {
        super.onDropViewInstance(t10);
        View.OnFocusChangeListener onFocusChangeListener = t10.getOnFocusChangeListener();
        if (onFocusChangeListener instanceof a) {
            ((a) onFocusChangeListener).b(t10);
        }
        if (t10 instanceof ViewGroup) {
            ((ViewGroup) t10).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i16 - i14;
        int i19 = i12 - i10;
        if (i13 - i11 == i17 - i15 && i19 == i18) {
            return;
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(AbstractC1313n.f15037D);
        ReadableArray readableArray2 = (ReadableArray) view.getTag(AbstractC1313n.f15036C);
        if (readableArray2 == null && readableArray == null) {
            return;
        }
        setTransformProperty(view, readableArray2, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected T prepareToRecycleView(@NonNull E0 e10, T t10) {
        t10.setTag(null);
        t10.setTag(AbstractC1313n.f15061u, null);
        t10.setTag(AbstractC1313n.f15062v, null);
        t10.setTag(AbstractC1313n.f15040G, null);
        t10.setTag(AbstractC1313n.f15058r, null);
        t10.setTag(AbstractC1313n.f15045e, null);
        t10.setTag(AbstractC1313n.f15044d, null);
        t10.setTag(AbstractC1313n.f15048h, null);
        t10.setTag(AbstractC1313n.f15049i, null);
        t10.setTag(AbstractC1313n.f15041a, null);
        t10.setTag(AbstractC1313n.f15051k, null);
        t10.setTag(AbstractC1313n.f15050j, null);
        t10.setTag(AbstractC1313n.f15039F, null);
        setTransformProperty(t10, null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            return null;
        }
        t10.resetPivot();
        t10.setTop(0);
        t10.setBottom(0);
        t10.setLeft(0);
        t10.setRight(0);
        t10.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (i10 >= 29) {
            t10.setAnimationMatrix(null);
        }
        t10.setTag(AbstractC1313n.f15036C, null);
        t10.setTag(AbstractC1313n.f15037D, null);
        t10.setTag(AbstractC1313n.f15057q, null);
        t10.removeOnLayoutChangeListener(this);
        t10.setTag(AbstractC1313n.f15038E, null);
        t10.setTag(AbstractC1313n.f15055o, null);
        t10.setTag(AbstractC1313n.f15059s, null);
        b.a(t10, null, null);
        if (i10 >= 28) {
            t10.setOutlineAmbientShadowColor(-16777216);
            t10.setOutlineSpotShadowColor(-16777216);
        }
        t10.setNextFocusDownId(-1);
        t10.setNextFocusForwardId(-1);
        t10.setNextFocusRightId(-1);
        t10.setNextFocusUpId(-1);
        t10.setFocusable(false);
        t10.setFocusableInTouchMode(false);
        t10.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        t10.setAlpha(1.0f);
        setPadding(t10, 0, 0, 0, 0);
        t10.setForeground(null);
        return t10;
    }

    @O3.a(name = "accessibilityActions")
    public void setAccessibilityActions(T t10, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        t10.setTag(AbstractC1313n.f15041a, readableArray);
    }

    @O3.a(name = "accessibilityCollection")
    public void setAccessibilityCollection(@NonNull T t10, ReadableMap readableMap) {
        t10.setTag(AbstractC1313n.f15042b, readableMap);
    }

    @O3.a(name = "accessibilityCollectionItem")
    public void setAccessibilityCollectionItem(@NonNull T t10, ReadableMap readableMap) {
        t10.setTag(AbstractC1313n.f15043c, readableMap);
    }

    @O3.a(name = "accessibilityHint")
    public void setAccessibilityHint(@NonNull T t10, String str) {
        t10.setTag(AbstractC1313n.f15044d, str);
        updateViewContentDescription(t10);
    }

    @O3.a(name = "accessibilityLabel")
    public void setAccessibilityLabel(@NonNull T t10, String str) {
        t10.setTag(AbstractC1313n.f15045e, str);
        updateViewContentDescription(t10);
    }

    @O3.a(name = "accessibilityLabelledBy")
    public void setAccessibilityLabelledBy(@NonNull T t10, Dynamic dynamic) {
        if (dynamic.isNull()) {
            return;
        }
        if (dynamic.getType() == ReadableType.String) {
            t10.setTag(AbstractC1313n.f15058r, dynamic.asString());
        } else if (dynamic.getType() == ReadableType.Array) {
            t10.setTag(AbstractC1313n.f15058r, dynamic.asArray().getString(0));
        }
    }

    @O3.a(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(@NonNull T t10, String str) {
        if (str == null || str.equals("none")) {
            AbstractC0845c0.o0(t10, 0);
        } else if (str.equals("polite")) {
            AbstractC0845c0.o0(t10, 1);
        } else if (str.equals("assertive")) {
            AbstractC0845c0.o0(t10, 2);
        }
    }

    @O3.a(name = "accessibilityRole")
    public void setAccessibilityRole(@NonNull T t10, String str) {
        if (str == null) {
            t10.setTag(AbstractC1313n.f15048h, null);
        } else {
            t10.setTag(AbstractC1313n.f15048h, C1360h0.d.e(str));
        }
    }

    @O3.a(name = "accessibilityValue")
    public void setAccessibilityValue(T t10, ReadableMap readableMap) {
        if (readableMap == null) {
            t10.setTag(AbstractC1313n.f15051k, null);
            t10.setContentDescription(null);
        } else {
            t10.setTag(AbstractC1313n.f15051k, readableMap);
            if (readableMap.hasKey("text")) {
                updateViewContentDescription(t10);
            }
        }
    }

    @O3.a(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(@NonNull T t10, int i10) {
        C1345a.n(t10, Integer.valueOf(i10));
    }

    public void setBorderBottomLeftRadius(T t10, float f10) {
        logUnsupportedPropertyWarning("borderBottomLeftRadius");
    }

    public void setBorderBottomRightRadius(T t10, float f10) {
        logUnsupportedPropertyWarning("borderBottomRightRadius");
    }

    public void setBorderRadius(T t10, float f10) {
        logUnsupportedPropertyWarning("borderRadius");
    }

    public void setBorderTopLeftRadius(T t10, float f10) {
        logUnsupportedPropertyWarning("borderTopLeftRadius");
    }

    public void setBorderTopRightRadius(T t10, float f10) {
        logUnsupportedPropertyWarning("borderTopRightRadius");
    }

    @O3.a(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(T t10, ReadableArray readableArray) {
        C1345a.t(t10, readableArray);
    }

    @O3.a(name = "onClick")
    public void setClick(@NonNull T t10, boolean z9) {
        setPointerEventsFlag(t10, com.facebook.react.uimanager.events.u.a.CLICK, z9);
    }

    @O3.a(name = "onClickCapture")
    public void setClickCapture(@NonNull T t10, boolean z9) {
        setPointerEventsFlag(t10, com.facebook.react.uimanager.events.u.a.CLICK_CAPTURE, z9);
    }

    @O3.a(name = "elevation")
    public void setElevation(@NonNull T t10, float f10) {
        AbstractC0845c0.u0(t10, C1356f0.i(f10));
    }

    @O3.a(customType = "Filter", name = "filter")
    public void setFilter(@NonNull T t10, ReadableArray readableArray) {
        if (P3.a.c(t10) == 2) {
            t10.setTag(AbstractC1313n.f15055o, readableArray);
        }
    }

    @O3.a(name = "importantForAccessibility")
    public void setImportantForAccessibility(@NonNull T t10, String str) {
        if (str == null || str.equals("auto")) {
            AbstractC0845c0.v0(t10, 0);
            return;
        }
        if (str.equals("yes")) {
            AbstractC0845c0.v0(t10, 1);
        } else if (str.equals("no")) {
            AbstractC0845c0.v0(t10, 2);
        } else if (str.equals("no-hide-descendants")) {
            AbstractC0845c0.v0(t10, 4);
        }
    }

    @O3.a(name = "mixBlendMode")
    public void setMixBlendMode(@NonNull T t10, String str) {
        if (P3.a.c(t10) == 2) {
            t10.setTag(AbstractC1313n.f15059s, C1390x.b(str));
            if (t10.getParent() instanceof View) {
                ((View) t10.getParent()).invalidate();
            }
        }
    }

    @O3.a(name = "onMoveShouldSetResponder")
    public void setMoveShouldSetResponder(@NonNull T t10, boolean z9) {
    }

    @O3.a(name = "onMoveShouldSetResponderCapture")
    public void setMoveShouldSetResponderCapture(@NonNull T t10, boolean z9) {
    }

    @O3.a(name = "nativeID")
    public void setNativeId(@NonNull T t10, String str) {
        t10.setTag(AbstractC1313n.f15040G, str);
        V3.a.c(t10);
    }

    @O3.a(defaultFloat = TTAdConstant.VIDEO_SPEED_RATIO, name = "opacity")
    public void setOpacity(@NonNull T t10, float f10) {
        t10.setAlpha(f10);
    }

    @O3.a(customType = "Color", name = "outlineColor")
    public void setOutlineColor(T t10, Integer num) {
        C1345a.w(t10, num);
    }

    @O3.a(name = "outlineOffset")
    public void setOutlineOffset(T t10, float f10) {
        C1345a.x(t10, f10);
    }

    @O3.a(name = "outlineStyle")
    public void setOutlineStyle(T t10, String str) {
        C1345a.y(t10, str == null ? null : U3.p.d(str));
    }

    @O3.a(name = "outlineWidth")
    public void setOutlineWidth(T t10, float f10) {
        C1345a.z(t10, f10);
    }

    @O3.a(name = "onPointerEnter")
    public void setPointerEnter(@NonNull T t10, boolean z9) {
        setPointerEventsFlag(t10, com.facebook.react.uimanager.events.u.a.ENTER, z9);
    }

    @O3.a(name = "onPointerEnterCapture")
    public void setPointerEnterCapture(@NonNull T t10, boolean z9) {
        setPointerEventsFlag(t10, com.facebook.react.uimanager.events.u.a.ENTER_CAPTURE, z9);
    }

    @O3.a(name = "onPointerLeave")
    public void setPointerLeave(@NonNull T t10, boolean z9) {
        setPointerEventsFlag(t10, com.facebook.react.uimanager.events.u.a.LEAVE, z9);
    }

    @O3.a(name = "onPointerLeaveCapture")
    public void setPointerLeaveCapture(@NonNull T t10, boolean z9) {
        setPointerEventsFlag(t10, com.facebook.react.uimanager.events.u.a.LEAVE_CAPTURE, z9);
    }

    @O3.a(name = "onPointerMove")
    public void setPointerMove(@NonNull T t10, boolean z9) {
        setPointerEventsFlag(t10, com.facebook.react.uimanager.events.u.a.MOVE, z9);
    }

    @O3.a(name = "onPointerMoveCapture")
    public void setPointerMoveCapture(@NonNull T t10, boolean z9) {
        setPointerEventsFlag(t10, com.facebook.react.uimanager.events.u.a.MOVE_CAPTURE, z9);
    }

    @O3.a(name = "onPointerOut")
    public void setPointerOut(@NonNull T t10, boolean z9) {
        setPointerEventsFlag(t10, com.facebook.react.uimanager.events.u.a.OUT, z9);
    }

    @O3.a(name = "onPointerOutCapture")
    public void setPointerOutCapture(@NonNull T t10, boolean z9) {
        setPointerEventsFlag(t10, com.facebook.react.uimanager.events.u.a.OUT_CAPTURE, z9);
    }

    @O3.a(name = "onPointerOver")
    public void setPointerOver(@NonNull T t10, boolean z9) {
        setPointerEventsFlag(t10, com.facebook.react.uimanager.events.u.a.OVER, z9);
    }

    @O3.a(name = "onPointerOverCapture")
    public void setPointerOverCapture(@NonNull T t10, boolean z9) {
        setPointerEventsFlag(t10, com.facebook.react.uimanager.events.u.a.OVER_CAPTURE, z9);
    }

    @O3.a(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(@NonNull T t10, boolean z9) {
        t10.setTag(AbstractC1313n.f15038E, Boolean.valueOf(z9));
    }

    @O3.a(name = "onResponderEnd")
    public void setResponderEnd(@NonNull T t10, boolean z9) {
    }

    @O3.a(name = "onResponderGrant")
    public void setResponderGrant(@NonNull T t10, boolean z9) {
    }

    @O3.a(name = "onResponderMove")
    public void setResponderMove(@NonNull T t10, boolean z9) {
    }

    @O3.a(name = "onResponderReject")
    public void setResponderReject(@NonNull T t10, boolean z9) {
    }

    @O3.a(name = "onResponderRelease")
    public void setResponderRelease(@NonNull T t10, boolean z9) {
    }

    @O3.a(name = "onResponderStart")
    public void setResponderStart(@NonNull T t10, boolean z9) {
    }

    @O3.a(name = "onResponderTerminate")
    public void setResponderTerminate(@NonNull T t10, boolean z9) {
    }

    @O3.a(name = "onResponderTerminationRequest")
    public void setResponderTerminationRequest(@NonNull T t10, boolean z9) {
    }

    @O3.a(name = "role")
    public void setRole(@NonNull T t10, String str) {
        if (str == null) {
            t10.setTag(AbstractC1313n.f15035B, null);
        } else {
            t10.setTag(AbstractC1313n.f15035B, C1360h0.e.d(str));
        }
    }

    @O3.a(name = "rotation")
    @Deprecated
    public void setRotation(@NonNull T t10, float f10) {
        t10.setRotation(f10);
    }

    @O3.a(defaultFloat = TTAdConstant.VIDEO_SPEED_RATIO, name = "scaleX")
    @Deprecated
    public void setScaleX(@NonNull T t10, float f10) {
        t10.setScaleX(f10);
    }

    @O3.a(defaultFloat = TTAdConstant.VIDEO_SPEED_RATIO, name = "scaleY")
    @Deprecated
    public void setScaleY(@NonNull T t10, float f10) {
        t10.setScaleY(f10);
    }

    @O3.a(name = "screenReaderFocusable")
    public void setScreenReaderFocusable(@NonNull T t10, boolean z9) {
        if (Build.VERSION.SDK_INT >= 28) {
            t10.setScreenReaderFocusable(z9);
        }
    }

    @O3.a(customType = "Color", defaultInt = -16777216, name = "shadowColor")
    public void setShadowColor(@NonNull T t10, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            t10.setOutlineAmbientShadowColor(i10);
            t10.setOutlineSpotShadowColor(i10);
        }
    }

    @O3.a(name = "onShouldBlockNativeResponder")
    public void setShouldBlockNativeResponder(@NonNull T t10, boolean z9) {
    }

    @O3.a(name = "onStartShouldSetResponder")
    public void setStartShouldSetResponder(@NonNull T t10, boolean z9) {
    }

    @O3.a(name = "onStartShouldSetResponderCapture")
    public void setStartShouldSetResponderCapture(@NonNull T t10, boolean z9) {
    }

    @O3.a(name = "testID")
    public void setTestId(@NonNull T t10, String str) {
        t10.setTag(AbstractC1313n.f15062v, str);
        t10.setTag(str);
    }

    @O3.a(name = "onTouchCancel")
    public void setTouchCancel(@NonNull T t10, boolean z9) {
    }

    @O3.a(name = "onTouchEnd")
    public void setTouchEnd(@NonNull T t10, boolean z9) {
    }

    @O3.a(name = "onTouchMove")
    public void setTouchMove(@NonNull T t10, boolean z9) {
    }

    @O3.a(name = "onTouchStart")
    public void setTouchStart(@NonNull T t10, boolean z9) {
    }

    @O3.a(name = "transform")
    public void setTransform(@NonNull T t10, ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t10.getTag(AbstractC1313n.f15036C), readableArray)) {
            return;
        }
        t10.setTag(AbstractC1313n.f15036C, readableArray);
        t10.setTag(AbstractC1313n.f15057q, Boolean.TRUE);
    }

    @O3.a(name = "transformOrigin")
    public void setTransformOrigin(@NonNull T t10, ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t10.getTag(AbstractC1313n.f15037D), readableArray)) {
            return;
        }
        t10.setTag(AbstractC1313n.f15037D, readableArray);
        t10.setTag(AbstractC1313n.f15057q, Boolean.TRUE);
    }

    protected void setTransformProperty(@NonNull T t10, ReadableArray readableArray, ReadableArray readableArray2) {
        if (readableArray == null) {
            t10.setTranslationX(C1356f0.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            t10.setTranslationY(C1356f0.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            t10.setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            t10.setRotationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            t10.setRotationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            t10.setScaleX(1.0f);
            t10.setScaleY(1.0f);
            t10.setCameraDistance(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        boolean z9 = P3.a.c(t10) == 2;
        Y.a aVar = sMatrixDecompositionContext;
        aVar.a();
        double[] dArr = sTransformDecompositionArray;
        TransformHelper.d(readableArray, dArr, C1356f0.g(t10.getWidth()), C1356f0.g(t10.getHeight()), readableArray2, z9);
        Y.k(dArr, aVar);
        t10.setTranslationX(C1356f0.i(sanitizeFloatPropertyValue((float) aVar.f15524d[0])));
        t10.setTranslationY(C1356f0.i(sanitizeFloatPropertyValue((float) aVar.f15524d[1])));
        t10.setRotation(sanitizeFloatPropertyValue((float) aVar.f15525e[2]));
        t10.setRotationX(sanitizeFloatPropertyValue((float) aVar.f15525e[0]));
        t10.setRotationY(sanitizeFloatPropertyValue((float) aVar.f15525e[1]));
        t10.setScaleX(sanitizeFloatPropertyValue((float) aVar.f15522b[0]));
        t10.setScaleY(sanitizeFloatPropertyValue((float) aVar.f15522b[1]));
        double[] dArr2 = aVar.f15521a;
        if (dArr2.length > 2) {
            float f10 = (float) dArr2[2];
            if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f10 = 7.8125E-4f;
            }
            float f11 = (-1.0f) / f10;
            float f12 = C1392y.c().density;
            t10.setCameraDistance(sanitizeFloatPropertyValue(f12 * f12 * f11 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    @O3.a(defaultFloat = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, name = "translateX")
    @Deprecated
    public void setTranslateX(@NonNull T t10, float f10) {
        t10.setTranslationX(C1356f0.i(f10));
    }

    @O3.a(defaultFloat = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, name = "translateY")
    @Deprecated
    public void setTranslateY(@NonNull T t10, float f10) {
        t10.setTranslationY(C1356f0.i(f10));
    }

    @O3.a(name = "accessibilityState")
    public void setViewState(@NonNull T t10, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey(STATE_EXPANDED)) {
            t10.setTag(AbstractC1313n.f15050j, Boolean.valueOf(readableMap.getBoolean(STATE_EXPANDED)));
        }
        if (readableMap.hasKey("selected")) {
            boolean zIsSelected = t10.isSelected();
            boolean z9 = readableMap.getBoolean("selected");
            t10.setSelected(z9);
            if (t10.isAccessibilityFocused() && zIsSelected && !z9) {
                t10.announceForAccessibility(t10.getContext().getString(AbstractC1316q.f15087M));
            }
        } else {
            t10.setSelected(false);
        }
        t10.setTag(AbstractC1313n.f15049i, readableMap);
        if (readableMap.hasKey("disabled") && !readableMap.getBoolean("disabled")) {
            t10.setEnabled(true);
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            if (strNextKey.equals(STATE_BUSY) || strNextKey.equals(STATE_EXPANDED) || (strNextKey.equals(STATE_CHECKED) && readableMap.getType(STATE_CHECKED) == ReadableType.String)) {
                updateViewContentDescription(t10);
                return;
            } else if (t10.isAccessibilityFocused()) {
                t10.sendAccessibilityEvent(1);
            }
        }
    }

    @O3.a(name = "zIndex")
    public void setZIndex(@NonNull T t10, float f10) {
        ViewGroupManager.setViewZIndex(t10, Math.round(f10));
        ViewParent parent = t10.getParent();
        if (parent instanceof InterfaceC1391x0) {
            ((InterfaceC1391x0) parent).updateDrawingOrder();
        }
    }

    protected void updateViewAccessibility(@NonNull T t10) {
        C1360h0.i0(t10, t10.isFocusable(), t10.getImportantForAccessibility());
    }

    public BaseViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
