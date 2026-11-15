package com.facebook.react.uimanager;

import android.widget.ImageView;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K0 f15353a = new K0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f15354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f15355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f15356d;

    static {
        Pair pairA = p129m8.q.a("topChange", kotlin.collections.E.e(p129m8.q.a("phasedRegistrationNames", kotlin.collections.E.j(p129m8.q.a("bubbled", "onChange"), p129m8.q.a("captured", "onChangeCapture")))));
        Pair pairA2 = p129m8.q.a("topSelect", kotlin.collections.E.e(p129m8.q.a("phasedRegistrationNames", kotlin.collections.E.j(p129m8.q.a("bubbled", "onSelect"), p129m8.q.a("captured", "onSelectCapture")))));
        com.facebook.react.uimanager.events.y.a aVar = com.facebook.react.uimanager.events.y.f15668b;
        f15354b = kotlin.collections.E.j(pairA, pairA2, p129m8.q.a(aVar.a(com.facebook.react.uimanager.events.y.START), kotlin.collections.E.e(p129m8.q.a("phasedRegistrationNames", kotlin.collections.E.j(p129m8.q.a("bubbled", "onTouchStart"), p129m8.q.a("captured", "onTouchStartCapture"))))), p129m8.q.a(aVar.a(com.facebook.react.uimanager.events.y.MOVE), kotlin.collections.E.e(p129m8.q.a("phasedRegistrationNames", kotlin.collections.E.j(p129m8.q.a("bubbled", "onTouchMove"), p129m8.q.a("captured", "onTouchMoveCapture"))))), p129m8.q.a(aVar.a(com.facebook.react.uimanager.events.y.END), kotlin.collections.E.e(p129m8.q.a("phasedRegistrationNames", kotlin.collections.E.j(p129m8.q.a("bubbled", "onTouchEnd"), p129m8.q.a("captured", "onTouchEndCapture"))))), p129m8.q.a(aVar.a(com.facebook.react.uimanager.events.y.CANCEL), kotlin.collections.E.e(p129m8.q.a("phasedRegistrationNames", kotlin.collections.E.j(p129m8.q.a("bubbled", "onTouchCancel"), p129m8.q.a("captured", "onTouchCancelCapture"))))));
        f15355c = kotlin.collections.E.j(p129m8.q.a("topContentSizeChange", kotlin.collections.E.e(p129m8.q.a("registrationName", "onContentSizeChange"))), p129m8.q.a("topLayout", kotlin.collections.E.e(p129m8.q.a("registrationName", "onLayout"))), p129m8.q.a("topLoadingError", kotlin.collections.E.e(p129m8.q.a("registrationName", "onLoadingError"))), p129m8.q.a("topLoadingFinish", kotlin.collections.E.e(p129m8.q.a("registrationName", "onLoadingFinish"))), p129m8.q.a("topLoadingStart", kotlin.collections.E.e(p129m8.q.a("registrationName", "onLoadingStart"))), p129m8.q.a("topSelectionChange", kotlin.collections.E.e(p129m8.q.a("registrationName", "onSelectionChange"))), p129m8.q.a("topMessage", kotlin.collections.E.e(p129m8.q.a("registrationName", "onMessage"))), p129m8.q.a("topScrollBeginDrag", kotlin.collections.E.e(p129m8.q.a("registrationName", "onScrollBeginDrag"))), p129m8.q.a("topScrollEndDrag", kotlin.collections.E.e(p129m8.q.a("registrationName", "onScrollEndDrag"))), p129m8.q.a("topScroll", kotlin.collections.E.e(p129m8.q.a("registrationName", "onScroll"))), p129m8.q.a("topMomentumScrollBegin", kotlin.collections.E.e(p129m8.q.a("registrationName", "onMomentumScrollBegin"))), p129m8.q.a("topMomentumScrollEnd", kotlin.collections.E.e(p129m8.q.a("registrationName", "onMomentumScrollEnd"))));
        f15356d = kotlin.collections.E.j(p129m8.q.a("UIView", kotlin.collections.E.e(p129m8.q.a("ContentMode", kotlin.collections.E.j(p129m8.q.a("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal())), p129m8.q.a("ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal())), p129m8.q.a("ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal())))))), p129m8.q.a("StyleConstants", kotlin.collections.E.e(p129m8.q.a("PointerEventsValues", kotlin.collections.E.j(p129m8.q.a("none", Integer.valueOf(EnumC1358g0.NONE.ordinal())), p129m8.q.a("boxNone", Integer.valueOf(EnumC1358g0.BOX_NONE.ordinal())), p129m8.q.a("boxOnly", Integer.valueOf(EnumC1358g0.BOX_ONLY.ordinal())), p129m8.q.a("unspecified", Integer.valueOf(EnumC1358g0.AUTO.ordinal())))))), p129m8.q.a("AccessibilityEventTypes", kotlin.collections.E.j(p129m8.q.a("typeWindowStateChanged", 32), p129m8.q.a("typeViewFocused", 8), p129m8.q.a("typeViewClicked", 1))));
    }

    private K0() {
    }
}
