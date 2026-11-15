package com.facebook.react.views.textinput;

import O.AbstractC0845c0;
import android.R;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.C1091l;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.C1345a;
import com.facebook.react.uimanager.C1356f0;
import com.facebook.react.uimanager.C1360h0;
import com.facebook.react.uimanager.D0;
import com.facebook.react.uimanager.I0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.X;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC7033c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.facebook.react.views.textinput.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1406j extends C1091l {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final a f16375j0 = new a(null);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final boolean f16376k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final KeyListener f16377l0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private String f16378G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private List f16379H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f16380I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private L f16381J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private InterfaceC1397a f16382K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private K f16383L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private b f16384M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f16385N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f16386O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final com.facebook.react.views.text.v f16387P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f16388Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private String f16389R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f16390S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f16391T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f16392U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f16393V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f16394W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f16395a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private String f16396b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private U3.q f16397c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private D0 f16398d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f16399e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f16400f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InputMethodManager f16401g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private EventDispatcher f16402g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f16403h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private c f16404h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f16405i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private String f16406i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f16407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f16408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f16409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CopyOnWriteArrayList f16410m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f16411v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f16412w;

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(Editable editable, SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            if (i10 > spannableStringBuilder.length() || i11 > spannableStringBuilder.length()) {
                return false;
            }
            while (i10 < i11) {
                if (editable.charAt(i10) != spannableStringBuilder.charAt(i10)) {
                    return false;
                }
                i10++;
            }
            return true;
        }

        public final boolean b() {
            return C1406j.f16376k0;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$b */
    private static final class b implements KeyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f16413a;

        public final void a(int i10) {
            this.f16413a = i10;
        }

        @Override // android.text.method.KeyListener
        public void clearMetaKeyState(View view, Editable content, int i10) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(content, "content");
            C1406j.f16377l0.clearMetaKeyState(view, content, i10);
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return this.f16413a;
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyDown(View view, Editable text, int i10, KeyEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(event, "event");
            return C1406j.f16377l0.onKeyDown(view, text, i10, event);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyOther(View view, Editable text, KeyEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(event, "event");
            return C1406j.f16377l0.onKeyOther(view, text, event);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyUp(View view, Editable text, int i10, KeyEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(event, "event");
            return C1406j.f16377l0.onKeyUp(view, text, i10, event);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$c */
    private final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s10) {
            CopyOnWriteArrayList copyOnWriteArrayList;
            Intrinsics.checkNotNullParameter(s10, "s");
            if (C1406j.this.E() || (copyOnWriteArrayList = C1406j.this.f16410m) == null) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(s10);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s10, int i10, int i11, int i12) {
            CopyOnWriteArrayList copyOnWriteArrayList;
            Intrinsics.checkNotNullParameter(s10, "s");
            if (C1406j.this.E() || (copyOnWriteArrayList = C1406j.this.f16410m) == null) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(s10, i10, i11, i12);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s10, int i10, int i11, int i12) {
            CopyOnWriteArrayList copyOnWriteArrayList;
            Intrinsics.checkNotNullParameter(s10, "s");
            if (C1406j.f16375j0.b()) {
                Z1.a.m(C1406j.this.f16403h, "onTextChanged[" + C1406j.this.getId() + "]: " + ((Object) s10) + " " + i10 + " " + i11 + " " + i12);
            }
            if (!C1406j.this.E() && (copyOnWriteArrayList = C1406j.this.f16410m) != null) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(s10, i10, i11, i12);
                }
            }
            C1406j.this.d0();
            C1406j.this.M();
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$d */
    public static final class d implements ActionMode.Callback {
        d() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(item, "item");
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(menu, "menu");
            if (C1406j.this.f16393V) {
                return false;
            }
            menu.removeItem(R.id.pasteAsPlainText);
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(menu, "menu");
            return true;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$e */
    public static final class e extends C1360h0 {
        e(boolean z9, int i10) {
            super(C1406j.this, z9, i10);
        }

        @Override // com.facebook.react.uimanager.C1360h0, O.C0840a
        public boolean j(View host, int i10, Bundle bundle) {
            Intrinsics.checkNotNullParameter(host, "host");
            if (i10 != 16) {
                return super.j(host, i10, bundle);
            }
            Editable text = C1406j.this.getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int length = text.length();
            if (length > 0) {
                C1406j.this.setSelection(length);
            }
            return C1406j.this.O();
        }
    }

    static {
        p084i3.a aVar = p084i3.a.f45065a;
        f16376k0 = false;
        QwertyKeyListener instanceForFullKeyboard = QwertyKeyListener.getInstanceForFullKeyboard();
        Intrinsics.checkNotNullExpressionValue(instanceForFullKeyboard, "getInstanceForFullKeyboard(...)");
        f16377l0 = instanceForFullKeyboard;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1406j(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        String simpleName = C1406j.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.f16403h = simpleName;
        this.f16390S = -1;
        this.f16391T = -1;
        this.f16397c0 = U3.q.VISIBLE;
        Object systemService = context.getSystemService("input_method");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.f16401g = (InputMethodManager) systemService;
        this.f16407j = getGravity() & 8388615;
        this.f16408k = getGravity() & 112;
        this.f16409l = 0;
        this.f16405i = false;
        this.f16380I = false;
        this.f16410m = null;
        this.f16411v = getInputType();
        if (this.f16384M == null) {
            this.f16384M = new b();
        }
        this.f16383L = null;
        this.f16387P = new com.facebook.react.views.text.v();
        u();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 <= 27) {
            setLayerType(1, null);
        }
        AbstractC0845c0.m0(this, new e(isFocusable(), getImportantForAccessibility()));
        d dVar = new d();
        setCustomSelectionActionModeCallback(dVar);
        setCustomInsertionActionModeCallback(dVar);
    }

    private final boolean D() {
        return (getInputType() & 144) != 0;
    }

    private final void F(SpannableStringBuilder spannableStringBuilder) {
        Editable text = getText();
        if (text == null) {
            throw new IllegalStateException("Required value was null.");
        }
        for (Object obj : text.getSpans(0, length(), Object.class)) {
            int spanFlags = text.getSpanFlags(obj);
            boolean z9 = (spanFlags & 33) == 33;
            if (obj instanceof p025c4.i) {
                text.removeSpan(obj);
            }
            if (z9) {
                int spanStart = text.getSpanStart(obj);
                int spanEnd = text.getSpanEnd(obj);
                text.removeSpan(obj);
                if (f16375j0.c(text, spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    private final void G(int i10, int i11) {
        if (i10 == -1 || i11 == -1) {
            return;
        }
        setSelection(w(i10), w(i11));
    }

    private final void I(com.facebook.react.views.text.l lVar) {
        if (!(D() && Intrinsics.b(getText(), lVar.h())) && v(lVar.b())) {
            if (f16376k0) {
                Z1.a.m(this.f16403h, "maybeSetText[" + getId() + "]: current text: " + ((Object) getText()) + " update: " + ((Object) lVar.h()));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(lVar.h());
            F(spannableStringBuilder);
            V(spannableStringBuilder);
            this.f16412w = lVar.a();
            this.f16399e0 = true;
            if (lVar.h().length() == 0) {
                setText((CharSequence) null);
            } else {
                Editable text = getText();
                if (text == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                text.replace(0, length(), spannableStringBuilder);
            }
            this.f16399e0 = false;
            if (getBreakStrategy() != lVar.j()) {
                setBreakStrategy(lVar.j());
            }
            d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        InterfaceC1397a interfaceC1397a = this.f16382K;
        if (interfaceC1397a != null) {
            interfaceC1397a.a();
        }
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean O() {
        boolean zRequestFocus = super.requestFocus(130, null);
        if (isInTouchMode() && getShowSoftInputOnFocus()) {
            T();
        }
        return zRequestFocus;
    }

    private final void Q() {
        ReactContext reactContextD = I0.d(this);
        if (p084i3.a.f45070f || this.f16398d0 != null || reactContextD.isBridgeless()) {
            return;
        }
        p pVar = new p(this);
        UIManagerModule uIManagerModule = (UIManagerModule) reactContextD.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.setViewLocalData(getId(), pVar);
        }
    }

    private final void U(SpannableStringBuilder spannableStringBuilder, Class cls, N.g gVar) {
        Iterator itA = AbstractC7033c.a(spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cls));
        while (itA.hasNext()) {
            Object next = itA.next();
            if (gVar.test(next)) {
                spannableStringBuilder.removeSpan(next);
            }
        }
    }

    private final void V(SpannableStringBuilder spannableStringBuilder) {
        U(spannableStringBuilder, p025c4.d.class, new N.g() { // from class: com.facebook.react.views.textinput.c
            @Override // N.g
            public final boolean test(Object obj) {
                return C1406j.W(this.f16368a, (p025c4.d) obj);
            }
        });
        U(spannableStringBuilder, p025c4.e.class, new N.g() { // from class: com.facebook.react.views.textinput.d
            @Override // N.g
            public final boolean test(Object obj) {
                return C1406j.X(this.f16369a, (p025c4.e) obj);
            }
        });
        U(spannableStringBuilder, p025c4.g.class, new N.g() { // from class: com.facebook.react.views.textinput.e
            @Override // N.g
            public final boolean test(Object obj) {
                return C1406j.Y(this.f16370a, (p025c4.g) obj);
            }
        });
        U(spannableStringBuilder, p025c4.j.class, new N.g() { // from class: com.facebook.react.views.textinput.f
            @Override // N.g
            public final boolean test(Object obj) {
                return C1406j.Z(this.f16371a, (p025c4.j) obj);
            }
        });
        U(spannableStringBuilder, p025c4.m.class, new N.g() { // from class: com.facebook.react.views.textinput.g
            @Override // N.g
            public final boolean test(Object obj) {
                return C1406j.a0(this.f16372a, (p025c4.m) obj);
            }
        });
        U(spannableStringBuilder, p025c4.a.class, new N.g() { // from class: com.facebook.react.views.textinput.h
            @Override // N.g
            public final boolean test(Object obj) {
                return C1406j.b0(this.f16373a, (p025c4.a) obj);
            }
        });
        U(spannableStringBuilder, p025c4.c.class, new N.g() { // from class: com.facebook.react.views.textinput.i
            @Override // N.g
            public final boolean test(Object obj) {
                return C1406j.c0(this.f16374a, (p025c4.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean W(C1406j c1406j, p025c4.d span) {
        Intrinsics.checkNotNullParameter(span, "span");
        return span.getSize() == c1406j.f16387P.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean X(C1406j c1406j, p025c4.e span) {
        Intrinsics.checkNotNullParameter(span, "span");
        int backgroundColor = span.getBackgroundColor();
        Integer numI = C1345a.i(c1406j);
        return numI != null && backgroundColor == numI.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Y(C1406j c1406j, p025c4.g span) {
        Intrinsics.checkNotNullParameter(span, "span");
        return span.getForegroundColor() == c1406j.getCurrentTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Z(C1406j c1406j, p025c4.j jVar) {
        return (c1406j.getPaintFlags() & 16) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a0(C1406j c1406j, p025c4.m mVar) {
        return (c1406j.getPaintFlags() & 8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b0(C1406j c1406j, p025c4.a span) {
        Intrinsics.checkNotNullParameter(span, "span");
        return span.b() == c1406j.f16387P.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c0(C1406j c1406j, p025c4.c span) {
        Intrinsics.checkNotNullParameter(span, "span");
        return span.c() == c1406j.f16391T && Intrinsics.b(span.a(), c1406j.f16389R) && span.d() == c1406j.f16390S && Intrinsics.b(span.b(), c1406j.getFontFeatureSettings());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    public final void d0() {
        if (this.f16398d0 == null || getId() == -1) {
            return;
        }
        Editable text = getText();
        boolean z9 = text == null || text.length() == 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (text != null && !z9) {
            try {
                spannableStringBuilder.append(text.subSequence(0, text.length()));
            } catch (IndexOutOfBoundsException e10) {
                ReactSoftExceptionLogger.logSoftException(this.f16403h, e10);
            }
        }
        if (z9) {
            if (getHint() != null) {
                CharSequence hint = getHint();
                Intrinsics.checkNotNullExpressionValue(hint, "getHint(...)");
                if (hint.length() > 0) {
                    spannableStringBuilder.append(getHint());
                } else if (P3.a.c(this) != 2) {
                    spannableStringBuilder.append("I");
                }
            } else if (P3.a.c(this) != 2) {
                spannableStringBuilder.append("I");
            }
        }
        t(spannableStringBuilder);
        spannableStringBuilder.setSpan(new p025c4.l(new TextPaint(getPaint())), 0, spannableStringBuilder.length(), 18);
        com.facebook.react.views.text.x.f16310a.A(getId(), spannableStringBuilder);
    }

    private final void e0() {
        String str = this.f16406i0;
        int i10 = 6;
        if (str != null) {
            switch (str.hashCode()) {
                case -1273775369:
                    if (str.equals("previous")) {
                        i10 = 7;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        i10 = 3;
                    }
                    break;
                case 3304:
                    if (str.equals("go")) {
                        i10 = 2;
                    }
                    break;
                case 3089282:
                    str.equals("done");
                    break;
                case 3377907:
                    if (str.equals("next")) {
                        i10 = 5;
                    }
                    break;
                case 3387192:
                    if (str.equals("none")) {
                        i10 = 1;
                    }
                    break;
                case 3526536:
                    if (str.equals("send")) {
                        i10 = 4;
                    }
                    break;
            }
        }
        if (this.f16380I) {
            i10 |= 33554432;
        }
        setImeOptions(i10);
    }

    private final c getTextWatcherDelegator() {
        if (this.f16404h0 == null) {
            this.f16404h0 = new c();
        }
        return this.f16404h0;
    }

    private final void t(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.setSpan(new p025c4.d(this.f16387P.c()), 0, spannableStringBuilder.length(), 16711698);
        spannableStringBuilder.setSpan(new p025c4.g(getCurrentTextColor()), 0, spannableStringBuilder.length(), 16711698);
        Integer numI = C1345a.i(this);
        if (numI != null && numI.intValue() != 0) {
            spannableStringBuilder.setSpan(new p025c4.e(numI.intValue()), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 16) != 0) {
            spannableStringBuilder.setSpan(new p025c4.j(), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 8) != 0) {
            spannableStringBuilder.setSpan(new p025c4.m(), 0, spannableStringBuilder.length(), 16711698);
        }
        float fD = this.f16387P.d();
        if (!Float.isNaN(fD)) {
            spannableStringBuilder.setSpan(new p025c4.a(fD), 0, spannableStringBuilder.length(), 16711698);
        }
        if (this.f16391T != -1 || this.f16390S != -1 || this.f16389R != null || getFontFeatureSettings() != null) {
            int i10 = this.f16391T;
            int i11 = this.f16390S;
            String fontFeatureSettings = getFontFeatureSettings();
            String str = this.f16389R;
            AssetManager assets = getContext().getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            spannableStringBuilder.setSpan(new p025c4.c(i10, i11, fontFeatureSettings, str, assets), 0, spannableStringBuilder.length(), 16711698);
        }
        float fE = this.f16387P.e();
        if (Float.isNaN(fE)) {
            return;
        }
        spannableStringBuilder.setSpan(new p025c4.b(fE), 0, spannableStringBuilder.length(), 16711698);
    }

    private final int w(int i10) {
        int length;
        if (getText() == null) {
            length = 0;
        } else {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            length = text.length();
        }
        return (int) Math.max(0.0d, Math.min(i10, length));
    }

    protected final void A() {
        this.f16401g.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public final int B() {
        int i10 = this.f16409l + 1;
        this.f16409l = i10;
        return i10;
    }

    public final boolean C() {
        return (getInputType() & 131072) != 0;
    }

    protected final boolean E() {
        return this.f16405i;
    }

    public final void H(int i10, int i11, int i12) {
        if (v(i10)) {
            G(i11, i12);
        }
    }

    public final void J(com.facebook.react.views.text.l reactTextUpdate) {
        Intrinsics.checkNotNullParameter(reactTextUpdate, "reactTextUpdate");
        this.f16405i = true;
        I(reactTextUpdate);
        this.f16405i = false;
    }

    public final void K(com.facebook.react.views.text.l reactTextUpdate) {
        Intrinsics.checkNotNullParameter(reactTextUpdate, "reactTextUpdate");
        this.f16400f0 = true;
        I(reactTextUpdate);
        this.f16400f0 = false;
    }

    public final void L() {
        if (this.f16388Q) {
            this.f16388Q = false;
            Typeface typeface = getTypeface();
            int i10 = this.f16391T;
            int i11 = this.f16390S;
            String str = this.f16389R;
            AssetManager assets = getContext().getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            setTypeface(com.facebook.react.views.text.s.a(typeface, i10, i11, str, assets));
            setPaintFlags((this.f16391T == -1 && this.f16390S == -1 && this.f16389R == null && getFontFeatureSettings() == null) ? getPaintFlags() & (-129) : getPaintFlags() | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        }
    }

    public final void N() {
        O();
    }

    public final void P(float f10, int i10) {
        C1345a.q(this, (U3.d) U3.d.d().get(i10), Float.isNaN(f10) ? null : new W(C1356f0.g(f10), X.POINT));
    }

    public final boolean R() {
        String str = this.f16378G;
        if (str == null) {
            return !C();
        }
        return Intrinsics.b(str, "blurAndSubmit");
    }

    public final boolean S() {
        String str = this.f16378G;
        if (str == null) {
            return !C();
        }
        return Intrinsics.b(str, "submit") || Intrinsics.b(str, "blurAndSubmit");
    }

    protected final boolean T() {
        return this.f16401g.showSoftInput(this, 0);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        if (this.f16410m == null) {
            this.f16410m = new CopyOnWriteArrayList();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16410m;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(watcher);
        }
    }

    protected final void finalize() {
        if (f16376k0) {
            Z1.a.m(this.f16403h, "finalize[" + getId() + "] delete cached spannable");
        }
        com.facebook.react.views.text.x.f16310a.l(getId());
    }

    protected final boolean getContainsImages() {
        return this.f16412w;
    }

    public final boolean getDisableFullscreenUI() {
        return this.f16380I;
    }

    public final boolean getDisableTextDiffing$ReactAndroid_release() {
        return this.f16399e0;
    }

    @Nullable
    public final List<String> getDragAndDropFilter() {
        return this.f16379H;
    }

    public final int getGravityHorizontal$ReactAndroid_release() {
        return getGravity() & 8388615;
    }

    public final int getGravityVertical$ReactAndroid_release() {
        return getGravity() & 112;
    }

    protected final int getNativeEventCount() {
        return this.f16409l;
    }

    @Nullable
    public final String getReturnKeyType() {
        return this.f16406i0;
    }

    public final int getStagedInputType() {
        return this.f16411v;
    }

    @Nullable
    public final D0 getStateWrapper() {
        return this.f16398d0;
    }

    @Nullable
    public final String getSubmitBehavior() {
        return this.f16378G;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (this.f16412w) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator itA = AbstractC7033c.a((p025c4.p[]) text.getSpans(0, text.length(), p025c4.p.class));
            while (itA.hasNext()) {
                if (((p025c4.p) itA.next()).a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public boolean isLayoutRequested() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        super.setTextIsSelectable(true);
        G(selectionStart, selectionEnd);
        if (this.f16412w) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator itA = AbstractC7033c.a((p025c4.p[]) text.getSpans(0, text.length(), p025c4.p.class));
            while (itA.hasNext()) {
                ((p025c4.p) itA.next()).c();
            }
        }
        if (this.f16392U && !this.f16394W) {
            O();
        }
        this.f16394W = true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (p204u3.i.a() && p204u3.b.k()) {
            u();
        }
    }

    @Override // androidx.appcompat.widget.C1091l, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        ReactContext reactContextD = I0.d(this);
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (inputConnectionOnCreateInputConnection != null && this.f16386O) {
            EventDispatcher eventDispatcher = this.f16402g0;
            if (eventDispatcher == null) {
                throw new IllegalStateException("Required value was null.");
            }
            inputConnectionOnCreateInputConnection = new C1407k(inputConnectionOnCreateInputConnection, reactContextD, this, eventDispatcher);
        }
        if (C() && (R() || S())) {
            outAttrs.imeOptions &= -1073741825;
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // androidx.appcompat.widget.C1091l, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f16412w) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator itA = AbstractC7033c.a((p025c4.p[]) text.getSpans(0, text.length(), p025c4.p.class));
            while (itA.hasNext()) {
                ((p025c4.p) itA.next()).d();
            }
        }
    }

    @Override // androidx.appcompat.widget.C1091l, android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        List list = this.f16379H;
        if (list != null && event.getAction() == 1) {
            if (list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (event.getClipDescription().hasMimeType((String) it.next())) {
                }
            }
            return false;
        }
        return super.onDragEvent(event);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f16397c0 != U3.q.VISIBLE) {
            C1345a.a(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f16412w) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator itA = AbstractC7033c.a((p025c4.p[]) text.getSpans(0, text.length(), p025c4.p.class));
            while (itA.hasNext()) {
                ((p025c4.p) itA.next()).e();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z9, int i10, Rect rect) {
        L l10;
        super.onFocusChanged(z9, i10, rect);
        if (!z9 || (l10 = this.f16381J) == null || l10 == null) {
            return;
        }
        l10.a(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i10 != 66 || C()) {
            return super.onKeyUp(i10, event);
        }
        A();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        M();
        if (this.f16395a0 && isFocused()) {
            selectAll();
            this.f16395a0 = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        K k10 = this.f16383L;
        if (k10 != null) {
            k10.a(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i10, int i11) {
        L l10;
        if (f16376k0) {
            Z1.a.m(this.f16403h, "onSelectionChanged[" + getId() + "]: " + i10 + " " + i11);
        }
        super.onSelectionChanged(i10, i11);
        if (this.f16381J == null || !hasFocus() || (l10 = this.f16381J) == null) {
            return;
        }
        l10.a(i10, i11);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f16412w) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator itA = AbstractC7033c.a((p025c4.p[]) text.getSpans(0, text.length(), p025c4.p.class));
            while (itA.hasNext()) {
                ((p025c4.p) itA.next()).f();
            }
        }
    }

    @Override // androidx.appcompat.widget.C1091l, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            i10 = R.id.pasteAsPlainText;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        int action = ev.getAction();
        if (action == 0) {
            this.f16385N = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.f16385N) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.f16385N = false;
        }
        return super.onTouchEvent(ev);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f16410m;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(watcher);
            if (copyOnWriteArrayList.isEmpty()) {
                this.f16410m = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    public final void setAllowFontScaling(boolean z9) {
        if (this.f16387P.b() != z9) {
            this.f16387P.h(z9);
            u();
        }
    }

    public final void setAutoFocus(boolean z9) {
        this.f16392U = z9;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        C1345a.n(this, Integer.valueOf(i10));
    }

    public final void setBorderRadius(float f10) {
        P(f10, U3.d.BORDER_RADIUS.ordinal());
    }

    public final void setBorderStyle(@Nullable String str) {
        C1345a.r(this, str == null ? null : U3.f.f5930a.a(str));
    }

    protected final void setContainsImages(boolean z9) {
        this.f16412w = z9;
    }

    public final void setContentSizeWatcher(@Nullable InterfaceC1397a interfaceC1397a) {
        this.f16382K = interfaceC1397a;
    }

    public final void setContextMenuHidden(boolean z9) {
        this.f16393V = z9;
    }

    public final void setDisableFullscreenUI(boolean z9) {
        this.f16380I = z9;
        e0();
    }

    public final void setDisableTextDiffing$ReactAndroid_release(boolean z9) {
        this.f16399e0 = z9;
    }

    public final void setDragAndDropFilter(@Nullable List<String> list) {
        this.f16379H = list;
    }

    public final void setEventDispatcher(@Nullable EventDispatcher eventDispatcher) {
        this.f16402g0 = eventDispatcher;
    }

    public final void setFontFamily(@Nullable String str) {
        this.f16389R = str;
        this.f16388Q = true;
    }

    @Override // android.widget.TextView
    public void setFontFeatureSettings(@Nullable String str) {
        if (Intrinsics.b(str, getFontFeatureSettings())) {
            return;
        }
        super.setFontFeatureSettings(str);
        this.f16388Q = true;
    }

    public final void setFontSize(float f10) {
        this.f16387P.i(f10);
        u();
    }

    public final void setFontStyle(@Nullable String str) {
        int iB = com.facebook.react.views.text.s.b(str);
        if (iB != this.f16391T) {
            this.f16391T = iB;
            this.f16388Q = true;
        }
    }

    public final void setFontWeight(@Nullable String str) {
        int iD = com.facebook.react.views.text.s.d(str);
        if (iD != this.f16390S) {
            this.f16390S = iD;
            this.f16388Q = true;
        }
    }

    public final void setGravityHorizontal$ReactAndroid_release(int i10) {
        if (i10 == 0) {
            i10 = this.f16407j;
        }
        setGravity(i10 | (getGravity() & (-8388616)));
    }

    public final void setGravityVertical$ReactAndroid_release(int i10) {
        if (i10 == 0) {
            i10 = this.f16408k;
        }
        setGravity(i10 | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setInputType(int i10) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i10);
        this.f16411v = i10;
        super.setTypeface(typeface);
        if (C()) {
            setSingleLine(false);
        }
        if (this.f16384M == null) {
            this.f16384M = new b();
        }
        b bVar = this.f16384M;
        if (bVar != null) {
            bVar.a(i10);
        }
        super.setKeyListener(this.f16384M);
    }

    public final void setLetterSpacingPt(float f10) {
        this.f16387P.k(f10);
        u();
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        this.f16387P.l(i10);
    }

    public final void setMaxFontSizeMultiplier(float f10) {
        if (f10 == this.f16387P.g()) {
            return;
        }
        this.f16387P.m(f10);
        u();
    }

    protected final void setNativeEventCount(int i10) {
        this.f16409l = i10;
    }

    public final void setOnKeyPress(boolean z9) {
        this.f16386O = z9;
    }

    public final void setOverflow(@Nullable String str) {
        if (str == null) {
            this.f16397c0 = U3.q.VISIBLE;
        } else {
            U3.q qVarA = U3.q.f5993a.a(str);
            if (qVarA == null) {
                qVarA = U3.q.VISIBLE;
            }
            this.f16397c0 = qVarA;
        }
        invalidate();
    }

    public final void setPlaceholder(@Nullable String str) {
        if (Intrinsics.b(str, this.f16396b0)) {
            return;
        }
        this.f16396b0 = str;
        setHint(str);
    }

    public final void setReturnKeyType(@Nullable String str) {
        this.f16406i0 = str;
        e0();
    }

    public final void setScrollWatcher(@Nullable K k10) {
        this.f16383L = k10;
    }

    public final void setSelectTextOnFocus(boolean z9) {
        super.setSelectAllOnFocus(z9);
        this.f16395a0 = z9;
    }

    @Override // android.widget.EditText
    public void setSelection(int i10, int i11) {
        if (f16376k0) {
            Z1.a.m(this.f16403h, "setSelection[" + getId() + "]: " + i10 + " " + i11);
        }
        super.setSelection(i10, i11);
    }

    public final void setSelectionWatcher$ReactAndroid_release(@Nullable L l10) {
        this.f16381J = l10;
    }

    protected final void setSettingTextFromJS(boolean z9) {
        this.f16405i = z9;
    }

    protected final void setSettingTextFromState(boolean z9) {
        this.f16400f0 = z9;
    }

    public final void setStagedInputType(int i10) {
        this.f16411v = i10;
    }

    public final void setStateWrapper(@Nullable D0 d10) {
        this.f16398d0 = d10;
    }

    public final void setSubmitBehavior(@Nullable String str) {
        this.f16378G = str;
    }

    protected final void u() {
        setTextSize(0, this.f16387P.c());
        float fD = this.f16387P.d();
        if (Float.isNaN(fD)) {
            return;
        }
        setLetterSpacing(fD);
    }

    public final boolean v(int i10) {
        return i10 >= this.f16409l;
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (this.f16412w) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator itA = AbstractC7033c.a((p025c4.p[]) text.getSpans(0, text.length(), p025c4.p.class));
            while (itA.hasNext()) {
                if (((p025c4.p) itA.next()).a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    public final void x() {
        if (Build.VERSION.SDK_INT > 28 || !isInTouchMode()) {
            super.clearFocus();
        } else {
            View rootView = getRootView();
            Intrinsics.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) rootView;
            int descendantFocusability = viewGroup.getDescendantFocusability();
            viewGroup.setDescendantFocusability(393216);
            super.clearFocus();
            viewGroup.setDescendantFocusability(descendantFocusability);
        }
        A();
    }

    public final void y() {
        x();
    }

    public final void z() {
        if (getInputType() != this.f16411v) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.f16411v);
            G(selectionStart, selectionEnd);
        }
    }
}
