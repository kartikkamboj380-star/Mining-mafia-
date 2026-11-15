package P;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.CodedOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4584d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f4585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4586b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4587c = -1;

    public static class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final a f4588A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final a f4589B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final a f4590C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final a f4591D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final a f4592E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final a f4593F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final a f4594G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final a f4595H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final a f4596I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final a f4597J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public static final a f4598K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final a f4599L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public static final a f4600M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final a f4601N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final a f4602O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public static final a f4603P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public static final a f4604Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public static final a f4605R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final a f4606S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public static final a f4607T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public static final a f4608U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public static final a f4609V;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f4610e = new a(1, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f4611f = new a(2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f4612g = new a(4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f4613h = new a(8, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f4614i = new a(16, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f4615j = new a(32, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f4616k = new a(64, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f4617l = new a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f4618m = new a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, (CharSequence) null, D.b.class);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f4619n = new a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, (CharSequence) null, D.b.class);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f4620o = new a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, (CharSequence) null, D.c.class);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f4621p = new a(2048, (CharSequence) null, D.c.class);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f4622q = new a(CodedOutputStream.DEFAULT_BUFFER_SIZE, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f4623r = new a(8192, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f4624s = new a(16384, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f4625t = new a(32768, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f4626u = new a(65536, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f4627v = new a(131072, (CharSequence) null, D.g.class);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f4628w = new a(262144, null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f4629x = new a(524288, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final a f4630y = new a(1048576, null);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final a f4631z = new a(2097152, (CharSequence) null, D.h.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f4632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f4633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class f4634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final D f4635d;

        static {
            int i10 = Build.VERSION.SDK_INT;
            f4588A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f4589B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, D.e.class);
            f4590C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f4591D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f4592E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f4593F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f4594G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f4595H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f4596I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f4597J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f4598K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f4599L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, D.f.class);
            f4600M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, D.d.class);
            f4601N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f4602O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f4603P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f4604Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f4605R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f4606S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f4607T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f4608U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f4609V = new a(i10 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a a(CharSequence charSequence, D d10) {
            return new a(null, this.f4633b, charSequence, d10, this.f4634c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f4632a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f4632a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f4635d == null) {
                return false;
            }
            Class cls = this.f4634c;
            if (cls != null) {
                try {
                    p070h.w.a(cls.getDeclaredConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception e10) {
                    Class cls2 = this.f4634c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e10);
                }
            }
            return this.f4635d.a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f4632a;
            if (obj2 == null) {
                return aVar.f4632a == null;
            }
            return obj2.equals(aVar.f4632a);
        }

        public int hashCode() {
            Object obj = this.f4632a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String strJ = A.j(this.f4633b);
            if (strJ.equals("ACTION_UNKNOWN") && c() != null) {
                strJ = c().toString();
            }
            sb.append(strJ);
            return sb.toString();
        }

        public a(int i10, CharSequence charSequence, D d10) {
            this(null, i10, charSequence, d10, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i10, CharSequence charSequence, Class cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, D d10, Class cls) {
            this.f4633b = i10;
            this.f4635d = d10;
            if (obj == null) {
                this.f4632a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f4632a = obj;
            }
            this.f4634c = cls;
        }
    }

    private static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f4636a;

        e(Object obj) {
            this.f4636a = obj;
        }

        public static e a(int i10, int i11, boolean z9) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z9));
        }

        public static e b(int i10, int i11, boolean z9, int i12) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z9, i12));
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f4637a;

        f(Object obj) {
            this.f4637a = obj;
        }

        public static f a(int i10, int i11, int i12, int i13, boolean z9) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z9));
        }

        public static f b(int i10, int i11, int i12, int i13, boolean z9, boolean z10) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z9, z10));
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f4638a;

        g(Object obj) {
            this.f4638a = obj;
        }

        public static g d(int i10, float f10, float f11, float f12) {
            return new g(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f4638a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f4638a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f4638a).getMin();
        }
    }

    private A(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f4585a = accessibilityNodeInfo;
    }

    private SparseArray C(View view) {
        return (SparseArray) view.getTag(B.c.f65I);
    }

    private boolean I() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int J(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i10)).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f4584d;
        f4584d = i11 + 1;
        return i11;
    }

    public static A X0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new A(accessibilityNodeInfo);
    }

    public static A d0() {
        return X0(AccessibilityNodeInfo.obtain());
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    public static A e0(A a10) {
        return X0(AccessibilityNodeInfo.obtain(a10.f4585a));
    }

    public static A f0(View view) {
        return X0(AccessibilityNodeInfo.obtain(view));
    }

    private void g() {
        this.f4585a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f4585a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f4585a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f4585a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List h(String str) {
        ArrayList<Integer> integerArrayList = this.f4585a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f4585a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String j(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                return "ACTION_LONG_CLICK";
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT /* 128 */:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER /* 256 */:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET /* 1024 */:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case CodedOutputStream.DEFAULT_BUFFER_SIZE /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private void j0(View view) {
        SparseArray sparseArrayC = C(view);
        if (sparseArrayC != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < sparseArrayC.size(); i10++) {
                if (((WeakReference) sparseArrayC.valueAt(i10)).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                sparseArrayC.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private boolean l(int i10) {
        Bundle bundleW = w();
        return bundleW != null && (bundleW.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    private void l0(int i10, boolean z9) {
        Bundle bundleW = w();
        if (bundleW != null) {
            int i11 = bundleW.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z9) {
                i10 = 0;
            }
            bundleW.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public static ClickableSpan[] r(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray z(View view) {
        SparseArray sparseArrayC = C(view);
        if (sparseArrayC != null) {
            return sparseArrayC;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(B.c.f65I, sparseArray);
        return sparseArray;
    }

    public CharSequence A() {
        return this.f4585a.getPackageName();
    }

    public void A0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4585a.setHintText(charSequence);
        } else {
            this.f4585a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public g B() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f4585a.getRangeInfo();
        if (rangeInfo != null) {
            return new g(rangeInfo);
        }
        return null;
    }

    public void B0(View view) {
        this.f4585a.setLabelFor(view);
    }

    public void C0(View view) {
        this.f4585a.setLabeledBy(view);
    }

    public CharSequence D() {
        return Build.VERSION.SDK_INT >= 30 ? b.a(this.f4585a) : this.f4585a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void D0(int i10) {
        this.f4585a.setMaxTextLength(i10);
    }

    public CharSequence E() {
        if (!I()) {
            return this.f4585a.getText();
        }
        List listH = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listH2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listH3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listH4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f4585a.getText(), 0, this.f4585a.getText().length()));
        for (int i10 = 0; i10 < listH.size(); i10++) {
            spannableString.setSpan(new C0919a(((Integer) listH4.get(i10)).intValue(), this, w().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listH.get(i10)).intValue(), ((Integer) listH2.get(i10)).intValue(), ((Integer) listH3.get(i10)).intValue());
        }
        return spannableString;
    }

    public void E0(CharSequence charSequence) {
        this.f4585a.setPackageName(charSequence);
    }

    public CharSequence F() {
        return Build.VERSION.SDK_INT >= 28 ? this.f4585a.getTooltipText() : this.f4585a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void F0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4585a.setPaneTitle(charSequence);
        } else {
            this.f4585a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public String G() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.f4585a) : this.f4585a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void G0(View view) {
        this.f4586b = -1;
        this.f4585a.setParent(view);
    }

    public String H() {
        return this.f4585a.getViewIdResourceName();
    }

    public void H0(View view, int i10) {
        this.f4586b = i10;
        this.f4585a.setParent(view, i10);
    }

    public void I0(g gVar) {
        this.f4585a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) gVar.f4638a);
    }

    public void J0(CharSequence charSequence) {
        this.f4585a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean K() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f4585a) : l(64);
    }

    public void K0(boolean z9) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4585a.setScreenReaderFocusable(z9);
        } else {
            l0(1, z9);
        }
    }

    public boolean L() {
        return this.f4585a.isAccessibilityFocused();
    }

    public void L0(boolean z9) {
        this.f4585a.setScrollable(z9);
    }

    public boolean M() {
        return this.f4585a.isCheckable();
    }

    public void M0(boolean z9) {
        this.f4585a.setSelected(z9);
    }

    public boolean N() {
        return this.f4585a.isChecked();
    }

    public void N0(boolean z9) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4585a.setShowingHintText(z9);
        } else {
            l0(4, z9);
        }
    }

    public boolean O() {
        return this.f4585a.isClickable();
    }

    public void O0(View view) {
        this.f4587c = -1;
        this.f4585a.setSource(view);
    }

    public boolean P() {
        return this.f4585a.isContextClickable();
    }

    public void P0(View view, int i10) {
        this.f4587c = i10;
        this.f4585a.setSource(view, i10);
    }

    public boolean Q() {
        return this.f4585a.isEnabled();
    }

    public void Q0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.f4585a, charSequence);
        } else {
            this.f4585a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean R() {
        return this.f4585a.isFocusable();
    }

    public void R0(CharSequence charSequence) {
        this.f4585a.setText(charSequence);
    }

    public boolean S() {
        return this.f4585a.isFocused();
    }

    public void S0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4585a.setTooltipText(charSequence);
        } else {
            this.f4585a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public boolean T() {
        return l(67108864);
    }

    public void T0(View view) {
        this.f4585a.setTraversalAfter(view);
    }

    public boolean U() {
        return this.f4585a.isImportantForAccessibility();
    }

    public void U0(String str) {
        this.f4585a.setViewIdResourceName(str);
    }

    public boolean V() {
        return this.f4585a.isLongClickable();
    }

    public void V0(boolean z9) {
        this.f4585a.setVisibleToUser(z9);
    }

    public boolean W() {
        return this.f4585a.isPassword();
    }

    public AccessibilityNodeInfo W0() {
        return this.f4585a;
    }

    public boolean X() {
        return Build.VERSION.SDK_INT >= 28 ? this.f4585a.isScreenReaderFocusable() : l(1);
    }

    public boolean Y() {
        return this.f4585a.isScrollable();
    }

    public boolean Z() {
        return this.f4585a.isSelected();
    }

    public void a(int i10) {
        this.f4585a.addAction(i10);
    }

    public boolean a0() {
        return Build.VERSION.SDK_INT >= 26 ? this.f4585a.isShowingHintText() : l(4);
    }

    public void b(a aVar) {
        this.f4585a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f4632a);
    }

    public boolean b0() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f4585a) : l(8388608);
    }

    public void c(View view) {
        this.f4585a.addChild(view);
    }

    public boolean c0() {
        return this.f4585a.isVisibleToUser();
    }

    public void d(View view, int i10) {
        this.f4585a.addChild(view, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4585a;
        if (accessibilityNodeInfo == null) {
            if (a10.f4585a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(a10.f4585a)) {
            return false;
        }
        return this.f4587c == a10.f4587c && this.f4586b == a10.f4586b;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            j0(view);
            ClickableSpan[] clickableSpanArrR = r(charSequence);
            if (clickableSpanArrR == null || clickableSpanArrR.length <= 0) {
                return;
            }
            w().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", B.c.f76a);
            SparseArray sparseArrayZ = z(view);
            for (int i10 = 0; i10 < clickableSpanArrR.length; i10++) {
                int iJ = J(clickableSpanArrR[i10], sparseArrayZ);
                sparseArrayZ.put(iJ, new WeakReference(clickableSpanArrR[i10]));
                e(clickableSpanArrR[i10], (Spanned) charSequence, iJ);
            }
        }
    }

    public boolean g0(int i10, Bundle bundle) {
        return this.f4585a.performAction(i10, bundle);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4585a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f4585a.getActionList();
        if (actionList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public boolean i0(a aVar) {
        return this.f4585a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f4632a);
    }

    public int k() {
        return this.f4585a.getActions();
    }

    public void k0(boolean z9) {
        this.f4585a.setAccessibilityFocused(z9);
    }

    public void m(Rect rect) {
        this.f4585a.getBoundsInParent(rect);
    }

    public void m0(Rect rect) {
        this.f4585a.setBoundsInParent(rect);
    }

    public void n(Rect rect) {
        this.f4585a.getBoundsInScreen(rect);
    }

    public void n0(Rect rect) {
        this.f4585a.setBoundsInScreen(rect);
    }

    public void o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f4585a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f4585a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void o0(boolean z9) {
        this.f4585a.setCheckable(z9);
    }

    public int p() {
        return this.f4585a.getChildCount();
    }

    public void p0(boolean z9) {
        this.f4585a.setChecked(z9);
    }

    public CharSequence q() {
        return this.f4585a.getClassName();
    }

    public void q0(CharSequence charSequence) {
        this.f4585a.setClassName(charSequence);
    }

    public void r0(boolean z9) {
        this.f4585a.setClickable(z9);
    }

    public e s() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f4585a.getCollectionInfo();
        if (collectionInfo != null) {
            return new e(collectionInfo);
        }
        return null;
    }

    public void s0(Object obj) {
        this.f4585a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f4636a);
    }

    public CharSequence t() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f4585a) : this.f4585a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void t0(Object obj) {
        this.f4585a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f4637a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb.append("; boundsInParent: " + rect);
        n(rect);
        sb.append("; boundsInScreen: " + rect);
        o(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(A());
        sb.append("; className: ");
        sb.append(q());
        sb.append("; text: ");
        sb.append(E());
        sb.append("; error: ");
        sb.append(v());
        sb.append("; maxTextLength: ");
        sb.append(y());
        sb.append("; stateDescription: ");
        sb.append(D());
        sb.append("; contentDescription: ");
        sb.append(u());
        sb.append("; tooltipText: ");
        sb.append(F());
        sb.append("; viewIdResName: ");
        sb.append(H());
        sb.append("; uniqueId: ");
        sb.append(G());
        sb.append("; checkable: ");
        sb.append(M());
        sb.append("; checked: ");
        sb.append(N());
        sb.append("; focusable: ");
        sb.append(R());
        sb.append("; focused: ");
        sb.append(S());
        sb.append("; selected: ");
        sb.append(Z());
        sb.append("; clickable: ");
        sb.append(O());
        sb.append("; longClickable: ");
        sb.append(V());
        sb.append("; contextClickable: ");
        sb.append(P());
        sb.append("; enabled: ");
        sb.append(Q());
        sb.append("; password: ");
        sb.append(W());
        sb.append("; scrollable: " + Y());
        sb.append("; containerTitle: ");
        sb.append(t());
        sb.append("; granularScrollingSupported: ");
        sb.append(T());
        sb.append("; importantForAccessibility: ");
        sb.append(U());
        sb.append("; visible: ");
        sb.append(c0());
        sb.append("; isTextSelectable: ");
        sb.append(b0());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(K());
        sb.append("; [");
        List listI = i();
        for (int i10 = 0; i10 < listI.size(); i10++) {
            a aVar = (a) listI.get(i10);
            String strJ = j(aVar.b());
            if (strJ.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strJ = aVar.c().toString();
            }
            sb.append(strJ);
            if (i10 != listI.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public CharSequence u() {
        return this.f4585a.getContentDescription();
    }

    public void u0(CharSequence charSequence) {
        this.f4585a.setContentDescription(charSequence);
    }

    public CharSequence v() {
        return this.f4585a.getError();
    }

    public void v0(boolean z9) {
        this.f4585a.setEnabled(z9);
    }

    public Bundle w() {
        return this.f4585a.getExtras();
    }

    public void w0(CharSequence charSequence) {
        this.f4585a.setError(charSequence);
    }

    public CharSequence x() {
        return Build.VERSION.SDK_INT >= 26 ? this.f4585a.getHintText() : this.f4585a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
    }

    public void x0(boolean z9) {
        this.f4585a.setFocusable(z9);
    }

    public int y() {
        return this.f4585a.getMaxTextLength();
    }

    public void y0(boolean z9) {
        this.f4585a.setFocused(z9);
    }

    public void z0(boolean z9) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4585a.setHeading(z9);
        } else {
            l0(2, z9);
        }
    }

    public void h0() {
    }
}
