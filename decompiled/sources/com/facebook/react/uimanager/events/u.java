package com.facebook.react.uimanager.events;

import android.view.View;
import com.facebook.react.AbstractC1313n;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f15636a = new u();

    public enum a {
        CANCEL,
        CANCEL_CAPTURE,
        CLICK,
        CLICK_CAPTURE,
        DOWN,
        DOWN_CAPTURE,
        ENTER,
        ENTER_CAPTURE,
        LEAVE,
        LEAVE_CAPTURE,
        MOVE,
        MOVE_CAPTURE,
        UP,
        UP_CAPTURE,
        OUT,
        OUT_CAPTURE,
        OVER,
        OVER_CAPTURE;


        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f15641K = p189s8.a.a(c());
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15657a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.DOWN_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.UP_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.CANCEL_CAPTURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.CLICK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.CLICK_CAPTURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f15657a = iArr;
        }
    }

    private u() {
    }

    public static final int a(String pointerType, int i10, int i11) {
        Intrinsics.checkNotNullParameter(pointerType, "pointerType");
        int i12 = 0;
        if (Intrinsics.b("touch", pointerType)) {
            return 0;
        }
        int i13 = i11 ^ i10;
        if (i13 == 0) {
            return -1;
        }
        if (i13 != 1) {
            i12 = 2;
            if (i13 != 2) {
                if (i13 == 4) {
                    return 1;
                }
                if (i13 != 8) {
                    return i13 != 16 ? -1 : 4;
                }
                return 3;
            }
        }
        return i12;
    }

    public static final int b(String str, String pointerType, int i10) {
        Intrinsics.checkNotNullParameter(pointerType, "pointerType");
        if (f15636a.g(str)) {
            return 0;
        }
        if (Intrinsics.b("touch", pointerType)) {
            return 1;
        }
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0055 A[RETURN] */
    public static final int c(String str) {
        if (str == null) {
            return 2;
        }
        switch (str) {
            case "topPointerEnter":
                return 4;
            case "topPointerLeave":
                return 4;
            case "topPointerDown":
                return 3;
            case "topPointerMove":
                return 4;
            case "topPointerOver":
                return 4;
            case "topPointerUp":
                return 3;
            case "topPointerCancel":
                return 3;
            case "topPointerOut":
                return 4;
            default:
                return 2;
        }
    }

    public static final double d(int i10, String str) {
        return (f15636a.g(str) || i10 == 0) ? 0.0d : 0.5d;
    }

    public static final String e(int i10) {
        if (i10 == 1) {
            return "touch";
        }
        if (i10 != 2) {
            return i10 != 3 ? "" : "mouse";
        }
        return "pen";
    }

    public static final boolean f(String str) {
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -1304584214:
                return str.equals("topPointerDown");
            case -1304316135:
                return str.equals("topPointerMove");
            case -1304250340:
                return str.equals("topPointerOver");
            case -1065042973:
                return str.equals("topPointerUp");
            case 383186882:
                return str.equals("topPointerCancel");
            case 1343400710:
                return str.equals("topPointerOut");
            default:
                return false;
        }
    }

    public static final boolean h(View view, a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (view == null) {
            return true;
        }
        switch (b.f15657a[event.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                Object tag = view.getTag(AbstractC1313n.f15061u);
                Integer num = tag instanceof Integer ? (Integer) tag : null;
                return (num == null || (num.intValue() & (1 << event.ordinal())) == 0) ? false : true;
        }
    }

    public final boolean g(String str) {
        if (str == null) {
            return false;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -1780335505) {
            return str.equals("topPointerLeave");
        }
        if (iHashCode != -1065042973) {
            return iHashCode == 1343400710 && str.equals("topPointerOut");
        }
        return str.equals("topPointerUp");
    }
}
