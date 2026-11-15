package com.facebook.react.uimanager;

import O.AbstractC0845c0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.react.AbstractC1313n;
import com.facebook.react.AbstractC1316q;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.ConnectionResult;
import com.google.protobuf.DescriptorProtos;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.react.uimanager.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1360h0 extends U.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final HashMap f15704u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f15705v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f15706w;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f15707q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Handler f15708r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final HashMap f15709s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    View f15710t;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.h0$a */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ((View) message.obj).sendAccessibilityEvent(4);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.h0$b */
    class b extends com.facebook.react.uimanager.events.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WritableMap f15712a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, int i11, WritableMap writableMap) {
            super(i10, i11);
            this.f15712a = writableMap;
        }

        @Override // com.facebook.react.uimanager.events.e
        public WritableMap getEventData() {
            return this.f15712a;
        }

        @Override // com.facebook.react.uimanager.events.e
        public String getEventName() {
            return "topAccessibilityAction";
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.h0$c */
    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f15715b;

        static {
            int[] iArr = new int[e.values().length];
            f15715b = iArr;
            try {
                iArr[e.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15715b[e.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15715b[e.CHECKBOX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15715b[e.COMBOBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15715b[e.GRID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15715b[e.HEADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15715b[e.IMG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15715b[e.LINK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15715b[e.LIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15715b[e.MENU.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15715b[e.MENUBAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15715b[e.MENUITEM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15715b[e.NONE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15715b[e.PROGRESSBAR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15715b[e.RADIO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15715b[e.RADIOGROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15715b[e.SCROLLBAR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f15715b[e.SEARCHBOX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f15715b[e.SLIDER.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f15715b[e.SPINBUTTON.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f15715b[e.SUMMARY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f15715b[e.SWITCH.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f15715b[e.TAB.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f15715b[e.TABLIST.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f15715b[e.TIMER.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f15715b[e.TOOLBAR.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            int[] iArr2 = new int[d.values().length];
            f15714a = iArr2;
            try {
                iArr2[d.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f15714a[d.DROPDOWNLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f15714a[d.TOGGLEBUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f15714a[d.SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f15714a[d.IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f15714a[d.IMAGEBUTTON.ordinal()] = 6;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f15714a[d.KEYBOARDKEY.ordinal()] = 7;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f15714a[d.TEXT.ordinal()] = 8;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f15714a[d.ADJUSTABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f15714a[d.CHECKBOX.ordinal()] = 10;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f15714a[d.RADIO.ordinal()] = 11;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f15714a[d.SPINBUTTON.ordinal()] = 12;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f15714a[d.SWITCH.ordinal()] = 13;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f15714a[d.LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f15714a[d.GRID.ordinal()] = 15;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f15714a[d.SCROLLVIEW.ordinal()] = 16;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f15714a[d.HORIZONTALSCROLLVIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f15714a[d.PAGER.ordinal()] = 18;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f15714a[d.DRAWERLAYOUT.ordinal()] = 19;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f15714a[d.SLIDINGDRAWER.ordinal()] = 20;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f15714a[d.ICONMENU.ordinal()] = 21;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f15714a[d.VIEWGROUP.ordinal()] = 22;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f15714a[d.WEBVIEW.ordinal()] = 23;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f15714a[d.NONE.ordinal()] = 24;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f15714a[d.LINK.ordinal()] = 25;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f15714a[d.SUMMARY.ordinal()] = 26;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f15714a[d.HEADER.ordinal()] = 27;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f15714a[d.ALERT.ordinal()] = 28;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f15714a[d.COMBOBOX.ordinal()] = 29;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f15714a[d.MENU.ordinal()] = 30;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f15714a[d.MENUBAR.ordinal()] = 31;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f15714a[d.MENUITEM.ordinal()] = 32;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f15714a[d.PROGRESSBAR.ordinal()] = 33;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f15714a[d.RADIOGROUP.ordinal()] = 34;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f15714a[d.SCROLLBAR.ordinal()] = 35;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f15714a[d.TAB.ordinal()] = 36;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f15714a[d.TABLIST.ordinal()] = 37;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f15714a[d.TIMER.ordinal()] = 38;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f15714a[d.TOOLBAR.ordinal()] = 39;
            } catch (NoSuchFieldError unused65) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.h0$d */
    public enum d {
        NONE,
        BUTTON,
        DROPDOWNLIST,
        TOGGLEBUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER,
        ALERT,
        CHECKBOX,
        COMBOBOX,
        MENU,
        MENUBAR,
        MENUITEM,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        SCROLLBAR,
        SPINBUTTON,
        SWITCH,
        TAB,
        TABLIST,
        TIMER,
        LIST,
        GRID,
        PAGER,
        SCROLLVIEW,
        HORIZONTALSCROLLVIEW,
        VIEWGROUP,
        WEBVIEW,
        DRAWERLAYOUT,
        SLIDINGDRAWER,
        ICONMENU,
        TOOLBAR;

        public static d d(e eVar) {
            switch (c.f15715b[eVar.ordinal()]) {
                case 1:
                    return ALERT;
                case 2:
                    return BUTTON;
                case 3:
                    return CHECKBOX;
                case 4:
                    return COMBOBOX;
                case 5:
                    return GRID;
                case 6:
                    return HEADER;
                case 7:
                    return IMAGE;
                case 8:
                    return LINK;
                case 9:
                    return LIST;
                case 10:
                    return MENU;
                case 11:
                    return MENUBAR;
                case 12:
                    return MENUITEM;
                case 13:
                    return NONE;
                case 14:
                    return PROGRESSBAR;
                case 15:
                    return RADIO;
                case 16:
                    return RADIOGROUP;
                case 17:
                    return SCROLLBAR;
                case 18:
                    return SEARCH;
                case 19:
                    return ADJUSTABLE;
                case 20:
                    return SPINBUTTON;
                case 21:
                    return SUMMARY;
                case 22:
                    return SWITCH;
                case 23:
                    return TAB;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    return TABLIST;
                case 25:
                    return TIMER;
                case 26:
                    return TOOLBAR;
                default:
                    return null;
            }
        }

        public static d e(String str) {
            if (str == null) {
                return NONE;
            }
            for (d dVar : values()) {
                if (dVar.name().equalsIgnoreCase(str)) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }

        public static d f(View view) {
            e eVar = (e) view.getTag(AbstractC1313n.f15035B);
            return eVar != null ? d(eVar) : (d) view.getTag(AbstractC1313n.f15048h);
        }

        public static String g(d dVar) {
            switch (c.f15714a[dVar.ordinal()]) {
                case 1:
                    return "android.widget.Button";
                case 2:
                    return "android.widget.Spinner";
                case 3:
                    return "android.widget.ToggleButton";
                case 4:
                    return "android.widget.EditText";
                case 5:
                    return "android.widget.ImageView";
                case 6:
                    return "android.widget.ImageButton";
                case 7:
                    return "android.inputmethodservice.Keyboard$Key";
                case 8:
                    return "android.widget.TextView";
                case 9:
                    return "android.widget.SeekBar";
                case 10:
                    return "android.widget.CheckBox";
                case 11:
                    return "android.widget.RadioButton";
                case 12:
                    return "android.widget.SpinButton";
                case 13:
                    return "android.widget.Switch";
                case 14:
                    return "android.widget.AbsListView";
                case 15:
                    return "android.widget.GridView";
                case 16:
                    return "android.widget.ScrollView";
                case 17:
                    return "android.widget.HorizontalScrollView";
                case 18:
                    return "androidx.viewpager.widget.ViewPager";
                case 19:
                    return "androidx.drawerlayout.widget.DrawerLayout";
                case 20:
                    return "android.widget.SlidingDrawer";
                case 21:
                    return "com.android.internal.view.menu.IconMenuView";
                case 22:
                    return "android.view.ViewGroup";
                case 23:
                    return "android.webkit.WebView";
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case 26:
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case 30:
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                case 33:
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case 35:
                case 36:
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                case 39:
                    return "android.view.View";
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + dVar);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.h0$e */
    public enum e {
        ALERT,
        ALERTDIALOG,
        APPLICATION,
        ARTICLE,
        BANNER,
        BUTTON,
        CELL,
        CHECKBOX,
        COLUMNHEADER,
        COMBOBOX,
        COMPLEMENTARY,
        CONTENTINFO,
        DEFINITION,
        DIALOG,
        DIRECTORY,
        DOCUMENT,
        FEED,
        FIGURE,
        FORM,
        GRID,
        GROUP,
        HEADING,
        IMG,
        LINK,
        LIST,
        LISTITEM,
        LOG,
        MAIN,
        MARQUEE,
        MATH,
        MENU,
        MENUBAR,
        MENUITEM,
        METER,
        NAVIGATION,
        NONE,
        NOTE,
        OPTION,
        PRESENTATION,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        REGION,
        ROW,
        ROWGROUP,
        ROWHEADER,
        SCROLLBAR,
        SEARCHBOX,
        SEPARATOR,
        SLIDER,
        SPINBUTTON,
        STATUS,
        SUMMARY,
        SWITCH,
        TAB,
        TABLE,
        TABLIST,
        TABPANEL,
        TERM,
        TIMER,
        TOOLBAR,
        TOOLTIP,
        TREE,
        TREEGRID,
        TREEITEM;

        public static e d(String str) {
            for (e eVar : values()) {
                if (eVar.name().equalsIgnoreCase(str)) {
                    return eVar;
                }
            }
            return null;
        }
    }

    static {
        HashMap map = new HashMap();
        f15704u = map;
        f15705v = 1056964608;
        f15706w = 2;
        map.put("activate", Integer.valueOf(P.A.a.f4614i.b()));
        map.put("longpress", Integer.valueOf(P.A.a.f4615j.b()));
        map.put("increment", Integer.valueOf(P.A.a.f4622q.b()));
        map.put("decrement", Integer.valueOf(P.A.a.f4623r.b()));
        map.put("expand", Integer.valueOf(P.A.a.f4628w.b()));
        map.put("collapse", Integer.valueOf(P.A.a.f4629x.b()));
    }

    public C1360h0(View view, boolean z9, int i10) {
        super(view);
        this.f15707q = view;
        this.f15709s = new HashMap();
        this.f15708r = new a();
        view.setFocusable(z9);
        AbstractC0845c0.v0(view, i10);
    }

    public static P.A W(View view) {
        if (view == null) {
            return null;
        }
        P.A aD0 = P.A.d0();
        try {
            AbstractC0845c0.Z(view, aD0);
            return aD0;
        } catch (NullPointerException unused) {
            if (aD0 != null) {
                aD0.h0();
            }
            return null;
        }
    }

    public static CharSequence Y(View view, P.A a10) {
        P.A aW = a10 == null ? W(view) : P.A.e0(a10);
        if (aW == null) {
            return null;
        }
        try {
            CharSequence charSequenceU = aW.u();
            CharSequence charSequenceE = aW.E();
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceE);
            boolean z9 = view instanceof EditText;
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(charSequenceU) && (!z9 || zIsEmpty)) {
                sb.append(charSequenceU);
                return sb;
            }
            if (!zIsEmpty) {
                sb.append(charSequenceE);
                return sb;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                P.A aD0 = P.A.d0();
                AbstractC0845c0.Z(childAt, aD0);
                if (f0(aD0, childAt) && !d0(aD0, childAt)) {
                    CharSequence charSequenceY = Y(childAt, null);
                    if (!TextUtils.isEmpty(charSequenceY)) {
                        sb2.append(((Object) charSequenceY) + ", ");
                    }
                }
                aD0.h0();
            }
            return g0(sb2);
        } finally {
            aW.h0();
        }
    }

    public static boolean Z(P.A a10, View view) {
        if (a10 != null && view != null && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    P.A aD0 = P.A.d0();
                    try {
                        AbstractC0845c0.Z(childAt, aD0);
                        if (aD0.c0() && !d0(aD0, childAt) && f0(aD0, childAt)) {
                            return true;
                        }
                        aD0.h0();
                    } finally {
                        if (aD0 != null) {
                            aD0.h0();
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean a0(P.A a10) {
        if (a10 != null) {
            return !TextUtils.isEmpty(a10.D()) || a10.M() || c0(a10);
        }
        return false;
    }

    public static boolean b0(P.A a10) {
        if (a10 == null || a10.s() != null) {
            return false;
        }
        return (TextUtils.isEmpty(a10.E()) && TextUtils.isEmpty(a10.u()) && TextUtils.isEmpty(a10.x())) ? false : true;
    }

    public static boolean c0(P.A a10) {
        P.A.g gVarB;
        if (a10 == null || (gVarB = a10.B()) == null) {
            return false;
        }
        float fB = gVarB.b();
        float fC = gVarB.c();
        float fA = gVarB.a();
        return fB - fC > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fA >= fC && fA <= fB;
    }

    public static boolean d0(P.A a10, View view) {
        if (a10 == null || view == null || !a10.c0()) {
            return false;
        }
        return a10.X() || e0(a10);
    }

    public static boolean e0(P.A a10) {
        if (a10 == null) {
            return false;
        }
        if (!a10.O() && !a10.V() && !a10.R()) {
            List listI = a10.i();
            if (!listI.contains(16) && !listI.contains(32) && !listI.contains(1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean f0(P.A a10, View view) {
        int iX;
        if (a10 == null || view == null || (iX = AbstractC0845c0.x(view)) == 4 || (iX == 2 && a10.p() <= 0)) {
            return false;
        }
        return b0(a10) || a0(a10) || a10.M() || Z(a10, view);
    }

    private static String g0(StringBuilder sb) {
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - f15706w, length);
        }
        return sb.toString();
    }

    private void h0(View view) {
        if (this.f15708r.hasMessages(1, view)) {
            this.f15708r.removeMessages(1, view);
        }
        this.f15708r.sendMessageDelayed(this.f15708r.obtainMessage(1, view), 200L);
    }

    public static void i0(View view, boolean z9, int i10) {
        if (AbstractC0845c0.M(view)) {
            return;
        }
        if (view.getTag(AbstractC1313n.f15048h) == null && view.getTag(AbstractC1313n.f15049i) == null && view.getTag(AbstractC1313n.f15041a) == null && view.getTag(AbstractC1313n.f15062v) == null && view.getTag(AbstractC1313n.f15043c) == null && view.getTag(AbstractC1313n.f15046f) == null && view.getTag(AbstractC1313n.f15035B) == null) {
            return;
        }
        AbstractC0845c0.m0(view, new C1360h0(view, z9, i10));
    }

    public static void j0(P.A a10, d dVar, Context context) {
        if (dVar == null) {
            dVar = d.NONE;
        }
        a10.q0(d.g(dVar));
        if (dVar.equals(d.LINK)) {
            a10.J0(context.getString(AbstractC1316q.f15075A));
            return;
        }
        if (dVar.equals(d.IMAGE)) {
            a10.J0(context.getString(AbstractC1316q.f15116y));
            return;
        }
        if (dVar.equals(d.IMAGEBUTTON)) {
            a10.J0(context.getString(AbstractC1316q.f15117z));
            a10.r0(true);
            return;
        }
        if (dVar.equals(d.BUTTON)) {
            a10.r0(true);
            return;
        }
        if (dVar.equals(d.TOGGLEBUTTON)) {
            a10.r0(true);
            a10.o0(true);
            return;
        }
        if (dVar.equals(d.SUMMARY)) {
            a10.J0(context.getString(AbstractC1316q.f15088N));
            return;
        }
        if (dVar.equals(d.HEADER)) {
            a10.z0(true);
            return;
        }
        if (dVar.equals(d.ALERT)) {
            a10.J0(context.getString(AbstractC1316q.f15092a));
            return;
        }
        if (dVar.equals(d.COMBOBOX)) {
            a10.J0(context.getString(AbstractC1316q.f15115x));
            return;
        }
        if (dVar.equals(d.MENU)) {
            a10.J0(context.getString(AbstractC1316q.f15076B));
            return;
        }
        if (dVar.equals(d.MENUBAR)) {
            a10.J0(context.getString(AbstractC1316q.f15077C));
            return;
        }
        if (dVar.equals(d.MENUITEM)) {
            a10.J0(context.getString(AbstractC1316q.f15078D));
            return;
        }
        if (dVar.equals(d.PROGRESSBAR)) {
            a10.J0(context.getString(AbstractC1316q.f15079E));
            return;
        }
        if (dVar.equals(d.RADIOGROUP)) {
            a10.J0(context.getString(AbstractC1316q.f15080F));
            return;
        }
        if (dVar.equals(d.SCROLLBAR)) {
            a10.J0(context.getString(AbstractC1316q.f15083I));
            return;
        }
        if (dVar.equals(d.SPINBUTTON)) {
            a10.J0(context.getString(AbstractC1316q.f15084J));
            return;
        }
        if (dVar.equals(d.TAB)) {
            a10.J0(context.getString(AbstractC1316q.f15082H));
            return;
        }
        if (dVar.equals(d.TABLIST)) {
            a10.J0(context.getString(AbstractC1316q.f15089O));
        } else if (dVar.equals(d.TIMER)) {
            a10.J0(context.getString(AbstractC1316q.f15090P));
        } else if (dVar.equals(d.TOOLBAR)) {
            a10.J0(context.getString(AbstractC1316q.f15091Q));
        }
    }

    private static void k0(P.A a10, ReadableMap readableMap, Context context) {
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(strNextKey);
            if (strNextKey.equals("selected") && dynamic.getType() == ReadableType.Boolean) {
                a10.M0(dynamic.asBoolean());
            } else if (strNextKey.equals("disabled") && dynamic.getType() == ReadableType.Boolean) {
                a10.v0(!dynamic.asBoolean());
            } else if (strNextKey.equals("checked") && dynamic.getType() == ReadableType.Boolean) {
                boolean zAsBoolean = dynamic.asBoolean();
                a10.o0(true);
                a10.p0(zAsBoolean);
            }
        }
    }

    @Override // U.a
    protected int B(float f10, float f11) {
        return LinearLayoutManager.INVALID_OFFSET;
    }

    @Override // U.a
    protected void C(List list) {
    }

    @Override // U.a
    protected boolean J(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override // U.a
    protected void N(int i10, P.A a10) {
        a10.u0("");
        a10.m0(new Rect(0, 0, 1, 1));
    }

    protected View X() {
        return this.f15707q;
    }

    @Override // U.a, O.C0840a
    public P.B b(View view) {
        return null;
    }

    @Override // U.a, O.C0840a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(AbstractC1313n.f15051k);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int iAsInt = dynamic.asInt();
                    int iAsInt2 = dynamic2.asInt();
                    int iAsInt3 = dynamic3.asInt();
                    if (iAsInt3 <= iAsInt || iAsInt2 < iAsInt || iAsInt3 < iAsInt2) {
                        return;
                    }
                    accessibilityEvent.setItemCount(iAsInt3 - iAsInt);
                    accessibilityEvent.setCurrentItemIndex(iAsInt2);
                }
            }
        }
    }

    @Override // U.a, O.C0840a
    public void g(View view, P.A a10) {
        super.g(view, a10);
        if (view.getTag(AbstractC1313n.f15050j) != null) {
            a10.a(((Boolean) view.getTag(AbstractC1313n.f15050j)).booleanValue() ? 524288 : 262144);
        }
        d dVarF = d.f(view);
        String str = (String) view.getTag(AbstractC1313n.f15044d);
        if (dVarF != null) {
            j0(a10, dVarF, view.getContext());
        }
        if (str != null) {
            a10.S0(str);
        }
        Object tag = view.getTag(AbstractC1313n.f15058r);
        if (tag != null) {
            View viewA = V3.a.a(view.getRootView(), (String) tag);
            this.f15710t = viewA;
            if (viewA != null) {
                a10.C0(viewA);
            }
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(AbstractC1313n.f15049i);
        if (readableMap != null) {
            k0(a10, readableMap, view.getContext());
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(AbstractC1313n.f15041a);
        ReadableMap readableMap2 = (ReadableMap) view.getTag(AbstractC1313n.f15043c);
        if (readableMap2 != null) {
            a10.t0(P.A.f.a(readableMap2.getInt("rowIndex"), readableMap2.getInt("rowSpan"), readableMap2.getInt("columnIndex"), readableMap2.getInt("columnSpan"), readableMap2.getBoolean("heading")));
        }
        boolean z9 = true;
        if (readableArray != null) {
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                ReadableMap map = readableArray.getMap(i10);
                if (!map.hasKey(MediationMetaData.KEY_NAME)) {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
                int iIntValue = f15705v;
                String string = map.hasKey("label") ? map.getString("label") : null;
                HashMap map2 = f15704u;
                if (map2.containsKey(map.getString(MediationMetaData.KEY_NAME))) {
                    iIntValue = ((Integer) map2.get(map.getString(MediationMetaData.KEY_NAME))).intValue();
                } else {
                    f15705v++;
                }
                this.f15709s.put(Integer.valueOf(iIntValue), map.getString(MediationMetaData.KEY_NAME));
                a10.b(new P.A.a(iIntValue, string));
            }
        }
        ReadableMap readableMap3 = (ReadableMap) view.getTag(AbstractC1313n.f15051k);
        if (readableMap3 != null && readableMap3.hasKey("min") && readableMap3.hasKey("now") && readableMap3.hasKey("max")) {
            Dynamic dynamic = readableMap3.getDynamic("min");
            Dynamic dynamic2 = readableMap3.getDynamic("now");
            Dynamic dynamic3 = readableMap3.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int iAsInt = dynamic.asInt();
                    int iAsInt2 = dynamic2.asInt();
                    int iAsInt3 = dynamic3.asInt();
                    if (iAsInt3 > iAsInt && iAsInt2 >= iAsInt && iAsInt3 >= iAsInt2) {
                        a10.I0(P.A.g.d(0, iAsInt, iAsInt3, iAsInt2));
                    }
                }
            }
        }
        String str2 = (String) view.getTag(AbstractC1313n.f15062v);
        if (str2 != null) {
            a10.U0(str2);
        }
        boolean z10 = TextUtils.isEmpty(a10.u()) && TextUtils.isEmpty(a10.E());
        if (readableArray == null && readableMap == null && tag == null && dVarF == null) {
            z9 = false;
        }
        if (z10 && z9) {
            a10.u0(Y(view, a10));
        }
    }

    @Override // O.C0840a
    public boolean j(View view, int i10, Bundle bundle) {
        if (i10 == 524288) {
            view.setTag(AbstractC1313n.f15050j, Boolean.FALSE);
        }
        if (i10 == 262144) {
            view.setTag(AbstractC1313n.f15050j, Boolean.TRUE);
        }
        if (!this.f15709s.containsKey(Integer.valueOf(i10))) {
            return super.j(view, i10, bundle);
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("actionName", (String) this.f15709s.get(Integer.valueOf(i10)));
        ReactContext reactContext = (ReactContext) view.getContext();
        if (reactContext.hasActiveReactInstance()) {
            int id = view.getId();
            int iE = I0.e(reactContext);
            UIManager uIManagerG = I0.g(reactContext, P3.a.a(id));
            if (uIManagerG != null) {
                uIManagerG.getEventDispatcher().c(new b(iE, id, writableMapCreateMap));
            }
        } else {
            ReactSoftExceptionLogger.logSoftException("ReactAccessibilityDelegate", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
        }
        d dVar = (d) view.getTag(AbstractC1313n.f15048h);
        ReadableMap readableMap = (ReadableMap) view.getTag(AbstractC1313n.f15051k);
        if (dVar != d.ADJUSTABLE) {
            return true;
        }
        if (i10 != P.A.a.f4622q.b() && i10 != P.A.a.f4623r.b()) {
            return true;
        }
        if (readableMap != null && !readableMap.hasKey("text")) {
            h0(view);
        }
        return super.j(view, i10, bundle);
    }

    public P.B l0(View view) {
        return super.b(view);
    }
}
