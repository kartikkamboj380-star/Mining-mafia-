package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class U extends C1383t0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final b f15489y = new b();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f15490z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15491a;

        static {
            int[] iArr = new int[com.facebook.yoga.w.values().length];
            f15491a = iArr;
            try {
                iArr[com.facebook.yoga.w.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15491a[com.facebook.yoga.w.UNDEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15491a[com.facebook.yoga.w.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15491a[com.facebook.yoga.w.PERCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f15492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        com.facebook.yoga.w f15493b;

        void a(Dynamic dynamic) {
            if (dynamic.isNull()) {
                this.f15493b = com.facebook.yoga.w.UNDEFINED;
                this.f15492a = Float.NaN;
                return;
            }
            if (dynamic.getType() != ReadableType.String) {
                if (dynamic.getType() == ReadableType.Number) {
                    this.f15493b = com.facebook.yoga.w.POINT;
                    this.f15492a = C1356f0.h(dynamic.asDouble());
                    return;
                } else {
                    this.f15493b = com.facebook.yoga.w.UNDEFINED;
                    this.f15492a = Float.NaN;
                    return;
                }
            }
            String strAsString = dynamic.asString();
            if (strAsString.equals("auto")) {
                this.f15493b = com.facebook.yoga.w.AUTO;
                this.f15492a = Float.NaN;
            } else {
                if (strAsString.endsWith("%")) {
                    this.f15493b = com.facebook.yoga.w.PERCENT;
                    this.f15492a = Float.parseFloat(strAsString.substring(0, strAsString.length() - 1));
                    return;
                }
                Z1.a.I("ReactNative", "Unknown value: " + strAsString);
                this.f15493b = com.facebook.yoga.w.UNDEFINED;
                this.f15492a = Float.NaN;
            }
        }

        private b() {
        }
    }

    static {
        p064g3.b.a("LayoutShadowNode", p064g3.a.ERROR);
    }

    private int t1(int i10) {
        if (com.facebook.react.modules.i18nmanager.a.f().d(R())) {
            if (i10 == 0) {
                return 4;
            }
            if (i10 == 2) {
                return 5;
            }
        }
        return i10;
    }

    @O3.a(name = "alignContent")
    public void setAlignContent(String str) {
        if (P()) {
        }
        if (str == null) {
            B0(com.facebook.yoga.a.FLEX_START);
            return;
        }
        switch (str) {
            case "stretch":
                B0(com.facebook.yoga.a.STRETCH);
                break;
            case "baseline":
                B0(com.facebook.yoga.a.BASELINE);
                break;
            case "center":
                B0(com.facebook.yoga.a.CENTER);
                break;
            case "flex-start":
                B0(com.facebook.yoga.a.FLEX_START);
                break;
            case "auto":
                B0(com.facebook.yoga.a.AUTO);
                break;
            case "space-between":
                B0(com.facebook.yoga.a.SPACE_BETWEEN);
                break;
            case "flex-end":
                B0(com.facebook.yoga.a.FLEX_END);
                break;
            case "space-around":
                B0(com.facebook.yoga.a.SPACE_AROUND);
                break;
            case "space-evenly":
                B0(com.facebook.yoga.a.SPACE_EVENLY);
                break;
            default:
                Z1.a.I("ReactNative", "invalid value for alignContent: " + str);
                B0(com.facebook.yoga.a.FLEX_START);
                break;
        }
    }

    @O3.a(name = "alignItems")
    public void setAlignItems(String str) {
        if (P()) {
        }
        if (str == null) {
            C0(com.facebook.yoga.a.STRETCH);
            return;
        }
        switch (str) {
            case "stretch":
                C0(com.facebook.yoga.a.STRETCH);
                break;
            case "baseline":
                C0(com.facebook.yoga.a.BASELINE);
                break;
            case "center":
                C0(com.facebook.yoga.a.CENTER);
                break;
            case "flex-start":
                C0(com.facebook.yoga.a.FLEX_START);
                break;
            case "auto":
                C0(com.facebook.yoga.a.AUTO);
                break;
            case "space-between":
                C0(com.facebook.yoga.a.SPACE_BETWEEN);
                break;
            case "flex-end":
                C0(com.facebook.yoga.a.FLEX_END);
                break;
            case "space-around":
                C0(com.facebook.yoga.a.SPACE_AROUND);
                break;
            default:
                Z1.a.I("ReactNative", "invalid value for alignItems: " + str);
                C0(com.facebook.yoga.a.STRETCH);
                break;
        }
    }

    @O3.a(name = "alignSelf")
    public void setAlignSelf(String str) {
        if (P()) {
        }
        if (str == null) {
            D0(com.facebook.yoga.a.AUTO);
            return;
        }
        switch (str) {
            case "stretch":
                D0(com.facebook.yoga.a.STRETCH);
                break;
            case "baseline":
                D0(com.facebook.yoga.a.BASELINE);
                break;
            case "center":
                D0(com.facebook.yoga.a.CENTER);
                break;
            case "flex-start":
                D0(com.facebook.yoga.a.FLEX_START);
                break;
            case "auto":
                D0(com.facebook.yoga.a.AUTO);
                break;
            case "space-between":
                D0(com.facebook.yoga.a.SPACE_BETWEEN);
                break;
            case "flex-end":
                D0(com.facebook.yoga.a.FLEX_END);
                break;
            case "space-around":
                D0(com.facebook.yoga.a.SPACE_AROUND);
                break;
            default:
                Z1.a.I("ReactNative", "invalid value for alignSelf: " + str);
                D0(com.facebook.yoga.a.AUTO);
                break;
        }
    }

    @O3.a(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f10) {
        e1(f10);
    }

    @O3.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i10, float f10) {
        if (P()) {
            return;
        }
        F0(t1(h1.f15823b[i10]), C1356f0.i(f10));
    }

    @O3.a(name = "collapsable")
    public void setCollapsable(boolean z9) {
        this.f15490z = z9;
    }

    @O3.a(name = "collapsableChildren")
    public void setCollapsableChildren(boolean z9) {
    }

    @O3.a(name = "columnGap")
    public void setColumnGap(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f15489y.a(dynamic);
        int i10 = a.f15491a[this.f15489y.f15493b.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            G0(this.f15489y.f15492a);
        } else if (i10 == 4) {
            H0(this.f15489y.f15492a);
        }
        dynamic.recycle();
    }

    @O3.a(name = "display")
    public void setDisplay(String str) {
        if (P()) {
            return;
        }
        if (str == null) {
            J0(com.facebook.yoga.i.FLEX);
            return;
        }
        if (str.equals("flex")) {
            J0(com.facebook.yoga.i.FLEX);
            return;
        }
        if (str.equals("none")) {
            J0(com.facebook.yoga.i.NONE);
            return;
        }
        Z1.a.I("ReactNative", "invalid value for display: " + str);
        J0(com.facebook.yoga.i.FLEX);
    }

    @Override // com.facebook.react.uimanager.C1383t0
    @O3.a(defaultFloat = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, name = "flex")
    public void setFlex(float f10) {
        if (P()) {
            return;
        }
        super.setFlex(f10);
    }

    @O3.a(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f15489y.a(dynamic);
        int i10 = a.f15491a[this.f15489y.f15493b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            K0(this.f15489y.f15492a);
        } else if (i10 == 3) {
            L0();
        } else if (i10 == 4) {
            M0(this.f15489y.f15492a);
        }
        dynamic.recycle();
    }

    @O3.a(name = "flexDirection")
    public void setFlexDirection(String str) {
        if (P()) {
        }
        if (str == null) {
            N0(com.facebook.yoga.l.COLUMN);
            return;
        }
        switch (str) {
            case "row-reverse":
                N0(com.facebook.yoga.l.ROW_REVERSE);
                break;
            case "column":
                N0(com.facebook.yoga.l.COLUMN);
                break;
            case "row":
                N0(com.facebook.yoga.l.ROW);
                break;
            case "column-reverse":
                N0(com.facebook.yoga.l.COLUMN_REVERSE);
                break;
            default:
                Z1.a.I("ReactNative", "invalid value for flexDirection: " + str);
                N0(com.facebook.yoga.l.COLUMN);
                break;
        }
    }

    @Override // com.facebook.react.uimanager.C1383t0
    @O3.a(defaultFloat = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, name = "flexGrow")
    public void setFlexGrow(float f10) {
        if (P()) {
            return;
        }
        super.setFlexGrow(f10);
    }

    @Override // com.facebook.react.uimanager.C1383t0
    @O3.a(defaultFloat = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, name = "flexShrink")
    public void setFlexShrink(float f10) {
        if (P()) {
            return;
        }
        super.setFlexShrink(f10);
    }

    @O3.a(name = "flexWrap")
    public void setFlexWrap(String str) {
        if (P()) {
        }
        if (str == null) {
            O0(com.facebook.yoga.x.NO_WRAP);
            return;
        }
        switch (str) {
            case "nowrap":
                O0(com.facebook.yoga.x.NO_WRAP);
                break;
            case "wrap-reverse":
                O0(com.facebook.yoga.x.WRAP_REVERSE);
                break;
            case "wrap":
                O0(com.facebook.yoga.x.WRAP);
                break;
            default:
                Z1.a.I("ReactNative", "invalid value for flexWrap: " + str);
                O0(com.facebook.yoga.x.NO_WRAP);
                break;
        }
    }

    @O3.a(name = "gap")
    public void setGap(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f15489y.a(dynamic);
        int i10 = a.f15491a[this.f15489y.f15493b.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            P0(this.f15489y.f15492a);
        } else if (i10 == 4) {
            Q0(this.f15489y.f15492a);
        }
        dynamic.recycle();
    }

    @O3.a(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f15489y.a(dynamic);
        int i10 = a.f15491a[this.f15489y.f15493b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            e(this.f15489y.f15492a);
        } else if (i10 == 3) {
            f1();
        } else if (i10 == 4) {
            g1(this.f15489y.f15492a);
        }
        dynamic.recycle();
    }

    @O3.a(name = "inset")
    public void setInset(Dynamic dynamic) {
    }

    @O3.b(names = {"insetBlock", "insetBlockEnd", "insetBlockStart"})
    public void setInsetBlock(int i10, Dynamic dynamic) {
    }

    @O3.b(names = {"insetInline", "insetInlineEnd", "insetInlineStart"})
    public void setInsetInline(int i10, Dynamic dynamic) {
    }

    @O3.a(name = "justifyContent")
    public void setJustifyContent(String str) {
        if (P()) {
        }
        if (str == null) {
            R0(com.facebook.yoga.n.FLEX_START);
            return;
        }
        switch (str) {
            case "center":
                R0(com.facebook.yoga.n.CENTER);
                break;
            case "flex-start":
                R0(com.facebook.yoga.n.FLEX_START);
                break;
            case "space-between":
                R0(com.facebook.yoga.n.SPACE_BETWEEN);
                break;
            case "flex-end":
                R0(com.facebook.yoga.n.FLEX_END);
                break;
            case "space-around":
                R0(com.facebook.yoga.n.SPACE_AROUND);
                break;
            case "space-evenly":
                R0(com.facebook.yoga.n.SPACE_EVENLY);
                break;
            default:
                Z1.a.I("ReactNative", "invalid value for justifyContent: " + str);
                R0(com.facebook.yoga.n.FLEX_START);
                break;
        }
    }

    @O3.b(names = {"marginBlock", "marginBlockEnd", "marginBlockStart"})
    public void setMarginBlock(int i10, Dynamic dynamic) {
    }

    @O3.b(names = {"marginInline", "marginInlineEnd", "marginInlineStart"})
    public void setMarginInline(int i10, Dynamic dynamic) {
    }

    @O3.b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i10, Dynamic dynamic) {
        if (P()) {
            return;
        }
        int iT1 = t1(h1.f15824c[i10]);
        this.f15489y.a(dynamic);
        int i11 = a.f15491a[this.f15489y.f15493b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            T0(iT1, this.f15489y.f15492a);
        } else if (i11 == 3) {
            U0(iT1);
        } else if (i11 == 4) {
            V0(iT1, this.f15489y.f15492a);
        }
        dynamic.recycle();
    }

    @O3.a(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f15489y.a(dynamic);
        int i10 = a.f15491a[this.f15489y.f15493b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            h1(this.f15489y.f15492a);
        } else if (i10 == 4) {
            i1(this.f15489y.f15492a);
        }
        dynamic.recycle();
    }

    @O3.a(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f15489y.a(dynamic);
        int i10 = a.f15491a[this.f15489y.f15493b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            j1(this.f15489y.f15492a);
        } else if (i10 == 4) {
            k1(this.f15489y.f15492a);
        }
        dynamic.recycle();
    }

    @O3.a(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f15489y.a(dynamic);
        int i10 = a.f15491a[this.f15489y.f15493b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            l1(this.f15489y.f15492a);
        } else if (i10 == 4) {
            m1(this.f15489y.f15492a);
        }
        dynamic.recycle();
    }

    @O3.a(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f15489y.a(dynamic);
        int i10 = a.f15491a[this.f15489y.f15493b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            n1(this.f15489y.f15492a);
        } else if (i10 == 4) {
            o1(this.f15489y.f15492a);
        }
        dynamic.recycle();
    }

    @O3.a(name = "overflow")
    public void setOverflow(String str) {
        if (P()) {
        }
        if (str == null) {
            X0(com.facebook.yoga.u.VISIBLE);
            return;
        }
        switch (str) {
            case "hidden":
                X0(com.facebook.yoga.u.HIDDEN);
                break;
            case "scroll":
                X0(com.facebook.yoga.u.SCROLL);
                break;
            case "visible":
                X0(com.facebook.yoga.u.VISIBLE);
                break;
            default:
                Z1.a.I("ReactNative", "invalid value for overflow: " + str);
                X0(com.facebook.yoga.u.VISIBLE);
                break;
        }
    }

    @O3.b(names = {"paddingBlock", "paddingBlockEnd", "paddingBlockStart"})
    public void setPaddingBlock(int i10, Dynamic dynamic) {
    }

    @O3.b(names = {"paddingInline", "paddingInlineEnd", "paddingInlineStart"})
    public void setPaddingInline(int i10, Dynamic dynamic) {
    }

    @O3.b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i10, Dynamic dynamic) {
        if (P()) {
            return;
        }
        int iT1 = t1(h1.f15824c[i10]);
        this.f15489y.a(dynamic);
        int i11 = a.f15491a[this.f15489y.f15493b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            l(iT1, this.f15489y.f15492a);
        } else if (i11 == 4) {
            Y0(iT1, this.f15489y.f15492a);
        }
        dynamic.recycle();
    }

    @O3.a(name = "position")
    public void setPosition(String str) {
        if (P()) {
            return;
        }
        if (str == null) {
            b1(com.facebook.yoga.v.RELATIVE);
            return;
        }
        if (str.equals("relative")) {
            b1(com.facebook.yoga.v.RELATIVE);
            return;
        }
        if (str.equals("absolute")) {
            b1(com.facebook.yoga.v.ABSOLUTE);
            return;
        }
        Z1.a.I("ReactNative", "invalid value for position: " + str);
        b1(com.facebook.yoga.v.RELATIVE);
    }

    @O3.b(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i10, Dynamic dynamic) {
        if (P()) {
            return;
        }
        int iT1 = t1(new int[]{4, 5, 0, 2, 1, 3}[i10]);
        this.f15489y.a(dynamic);
        int i11 = a.f15491a[this.f15489y.f15493b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            Z0(iT1, this.f15489y.f15492a);
        } else if (i11 == 4) {
            a1(iT1, this.f15489y.f15492a);
        }
        dynamic.recycle();
    }

    @O3.a(name = "rowGap")
    public void setRowGap(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f15489y.a(dynamic);
        int i10 = a.f15491a[this.f15489y.f15493b.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            c1(this.f15489y.f15492a);
        } else if (i10 == 4) {
            d1(this.f15489y.f15492a);
        }
        dynamic.recycle();
    }

    @Override // com.facebook.react.uimanager.C1383t0
    @O3.a(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z9) {
        super.setShouldNotifyOnLayout(z9);
    }

    @O3.a(name = "onPointerEnter")
    public void setShouldNotifyPointerEnter(boolean z9) {
    }

    @O3.a(name = "onPointerLeave")
    public void setShouldNotifyPointerLeave(boolean z9) {
    }

    @O3.a(name = "onPointerMove")
    public void setShouldNotifyPointerMove(boolean z9) {
    }

    @O3.a(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f15489y.a(dynamic);
        int i10 = a.f15491a[this.f15489y.f15493b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            Q(this.f15489y.f15492a);
        } else if (i10 == 3) {
            p1();
        } else if (i10 == 4) {
            q1(this.f15489y.f15492a);
        }
        dynamic.recycle();
    }
}
