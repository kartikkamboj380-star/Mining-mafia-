package androidx.appcompat.widget;

import O.AbstractC0845c0;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class SearchView extends T implements p120m.c {

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    static final o f7957G0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private final View.OnClickListener f7958A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    View.OnKeyListener f7959B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f7960C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f7961D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f7962E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private TextWatcher f7963F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final SearchAutoComplete f7964G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final View f7965H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final View f7966I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final View f7967J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    final ImageView f7968K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    final ImageView f7969L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    final ImageView f7970M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    final ImageView f7971N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final View f7972O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private q f7973P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private Rect f7974Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private Rect f7975R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int[] f7976S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int[] f7977T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final ImageView f7978U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final Drawable f7979V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final int f7980W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final int f7981a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final Intent f7982b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final Intent f7983c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final CharSequence f7984d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private m f7985e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private l f7986f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    View.OnFocusChangeListener f7987g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private View.OnClickListener f7988h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f7989i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f7990j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    S.a f7991k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f7992l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private CharSequence f7993m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f7994n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f7995o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f7996p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f7997q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private CharSequence f7998r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private CharSequence f7999s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f8000t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f8001u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    SearchableInfo f8002v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private Bundle f8003w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final Runnable f8004x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private Runnable f8005y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final WeakHashMap f8006z0;

    public static class SearchAutoComplete extends C1083d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f8007e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private SearchView f8008f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f8009g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Runnable f8010h;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, p060g.a.f43867m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f7957G0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f8009g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f8009g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f8007e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C1083d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f8009g) {
                removeCallbacks(this.f8010h);
                post(this.f8010h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z9, int i10, Rect rect) {
            super.onFocusChanged(z9, i10, rect);
            this.f8008f.X();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f8008f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z9) {
            super.onWindowFocusChanged(z9);
            if (z9 && this.f8008f.hasFocus() && getVisibility() == 0) {
                this.f8009g = true;
                if (SearchView.K(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z9) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z9) {
                this.f8009g = false;
                removeCallbacks(this.f8010h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f8009g = true;
                    return;
                }
                this.f8009g = false;
                removeCallbacks(this.f8010h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f8008f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f8007e = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f8010h = new a();
            this.f8007e = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.W(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.d0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            S.a aVar = SearchView.this.f7991k0;
            if (aVar instanceof b0) {
                aVar.b(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f7987g0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z9);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.z();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f7968K) {
                searchView.T();
                return;
            }
            if (view == searchView.f7970M) {
                searchView.P();
                return;
            }
            if (view == searchView.f7969L) {
                searchView.U();
            } else if (view == searchView.f7971N) {
                searchView.Y();
            } else if (view == searchView.f7964G) {
                searchView.F();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f8002v0 == null) {
                return false;
            }
            if (searchView.f7964G.isPopupShowing() && SearchView.this.f7964G.getListSelection() != -1) {
                return SearchView.this.V(view, i10, keyEvent);
            }
            if (SearchView.this.f7964G.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.N(0, null, searchView2.f7964G.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.U();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.Q(i10, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.R(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
        boolean a();
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
    }

    private static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Method f8022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f8023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f8024c;

        o() {
            this.f8022a = null;
            this.f8023b = null;
            this.f8024c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f8022a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f8023b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f8024c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f8023b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f8022a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f8024c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class p extends T.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f8025c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i10) {
                return new p[i10];
            }
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f8025c + "}";
        }

        @Override // T.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f8025c));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8025c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    private static class q extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f8026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f8027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rect f8028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f8029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f8030e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f8031f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f8030e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f8027b = new Rect();
            this.f8029d = new Rect();
            this.f8028c = new Rect();
            a(rect, rect2);
            this.f8026a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f8027b.set(rect);
            this.f8029d.set(rect);
            Rect rect3 = this.f8029d;
            int i10 = this.f8030e;
            rect3.inset(-i10, -i10);
            this.f8028c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z9;
            boolean z10;
            int x10 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z11 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z10 = this.f8031f;
                    if (z10 && !this.f8029d.contains(x10, y9)) {
                        z11 = z10;
                        z9 = false;
                    }
                } else if (action != 3) {
                    z9 = true;
                    z11 = false;
                } else {
                    z10 = this.f8031f;
                    this.f8031f = false;
                }
                z11 = z10;
                z9 = true;
            } else if (this.f8027b.contains(x10, y9)) {
                this.f8031f = true;
                z9 = true;
            } else {
                z9 = true;
                z11 = false;
            }
            if (!z11) {
                return false;
            }
            if (!z9 || this.f8028c.contains(x10, y9)) {
                Rect rect = this.f8028c;
                motionEvent.setLocation(x10 - rect.left, y9 - rect.top);
            } else {
                motionEvent.setLocation(this.f8026a.getWidth() / 2, this.f8026a.getHeight() / 2);
            }
            return this.f8026a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f7957G0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent A(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f7999s0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f8003w0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f8002v0.getSearchActivity());
        return intent;
    }

    private Intent B(Cursor cursor, int i10, String str) {
        int position;
        String strR;
        try {
            String strR2 = b0.r(cursor, "suggest_intent_action");
            if (strR2 == null) {
                strR2 = this.f8002v0.getSuggestIntentAction();
            }
            if (strR2 == null) {
                strR2 = "android.intent.action.SEARCH";
            }
            String str2 = strR2;
            String strR3 = b0.r(cursor, "suggest_intent_data");
            if (strR3 == null) {
                strR3 = this.f8002v0.getSuggestIntentData();
            }
            if (strR3 != null && (strR = b0.r(cursor, "suggest_intent_data_id")) != null) {
                strR3 = strR3 + "/" + Uri.encode(strR);
            }
            return A(str2, strR3 == null ? null : Uri.parse(strR3), b0.r(cursor, "suggest_intent_extra_data"), b0.r(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e10);
            return null;
        }
    }

    private Intent C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f8003w0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void E() {
        this.f7964G.dismissDropDown();
    }

    private void G(View view, Rect rect) {
        view.getLocationInWindow(this.f7976S);
        getLocationInWindow(this.f7977T);
        int[] iArr = this.f7976S;
        int i10 = iArr[1];
        int[] iArr2 = this.f7977T;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence H(CharSequence charSequence) {
        if (!this.f7989i0 || this.f7979V == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f7964G.getTextSize()) * 1.25d);
        this.f7979V.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f7979V), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean I() {
        Intent intent;
        SearchableInfo searchableInfo = this.f8002v0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            if (this.f8002v0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f7982b0;
            } else {
                intent = this.f8002v0.getVoiceSearchLaunchRecognizer() ? this.f7983c0 : null;
            }
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    static boolean K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean L() {
        return (this.f7992l0 || this.f7997q0) && !J();
    }

    private void M(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    private boolean O(int i10, int i11, String str) {
        Cursor cursorF = this.f7991k0.f();
        if (cursorF == null || !cursorF.moveToPosition(i10)) {
            return false;
        }
        M(B(cursorF, i11, str));
        return true;
    }

    private void Z() {
        post(this.f8004x0);
    }

    private void a0(int i10) {
        Editable text = this.f7964G.getText();
        Cursor cursorF = this.f7991k0.f();
        if (cursorF == null) {
            return;
        }
        if (!cursorF.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceConvertToString = this.f7991k0.convertToString(cursorF);
        if (charSequenceConvertToString != null) {
            setQuery(charSequenceConvertToString);
        } else {
            setQuery(text);
        }
    }

    private void c0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f7964G.getText());
        this.f7970M.setVisibility(!zIsEmpty || (this.f7989i0 && !this.f8000t0) ? 0 : 8);
        Drawable drawable = this.f7970M.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f7964G;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(H(queryHint));
    }

    private void f0() {
        this.f7964G.setThreshold(this.f8002v0.getSuggestThreshold());
        this.f7964G.setImeOptions(this.f8002v0.getImeOptions());
        int inputType = this.f8002v0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f8002v0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f7964G.setInputType(inputType);
        S.a aVar = this.f7991k0;
        if (aVar != null) {
            aVar.b(null);
        }
        if (this.f8002v0.getSuggestAuthority() != null) {
            b0 b0Var = new b0(getContext(), this, this.f8002v0, this.f8006z0);
            this.f7991k0 = b0Var;
            this.f7964G.setAdapter(b0Var);
            ((b0) this.f7991k0).A(this.f7994n0 ? 2 : 1);
        }
    }

    private void g0() {
        this.f7967J.setVisibility((L() && (this.f7969L.getVisibility() == 0 || this.f7971N.getVisibility() == 0)) ? 0 : 8);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(p060g.d.f43894e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(p060g.d.f43895f);
    }

    private void h0(boolean z9) {
        this.f7969L.setVisibility((this.f7992l0 && L() && hasFocus() && (z9 || !this.f7997q0)) ? 0 : 8);
    }

    private void i0(boolean z9) {
        this.f7990j0 = z9;
        int i10 = 8;
        int i11 = z9 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f7964G.getText());
        this.f7968K.setVisibility(i11);
        h0(!zIsEmpty);
        this.f7965H.setVisibility(z9 ? 8 : 0);
        if (this.f7978U.getDrawable() != null && !this.f7989i0) {
            i10 = 0;
        }
        this.f7978U.setVisibility(i10);
        c0();
        j0(zIsEmpty);
        g0();
    }

    private void j0(boolean z9) {
        int i10 = 8;
        if (this.f7997q0 && !J() && z9) {
            this.f7969L.setVisibility(8);
            i10 = 0;
        }
        this.f7971N.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f7964G.setText(charSequence);
        this.f7964G.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void F() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f7964G);
            return;
        }
        o oVar = f7957G0;
        oVar.b(this.f7964G);
        oVar.a(this.f7964G);
    }

    public boolean J() {
        return this.f7990j0;
    }

    void N(int i10, String str, String str2) {
        getContext().startActivity(A("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void P() {
        if (!TextUtils.isEmpty(this.f7964G.getText())) {
            this.f7964G.setText("");
            this.f7964G.requestFocus();
            this.f7964G.setImeVisibility(true);
        } else if (this.f7989i0) {
            l lVar = this.f7986f0;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                i0(true);
            }
        }
    }

    boolean Q(int i10, int i11, String str) {
        O(i10, 0, null);
        this.f7964G.setImeVisibility(false);
        E();
        return true;
    }

    boolean R(int i10) {
        a0(i10);
        return true;
    }

    protected void S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void T() {
        i0(false);
        this.f7964G.requestFocus();
        this.f7964G.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f7988h0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void U() {
        Editable text = this.f7964G.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.f7985e0;
        if (mVar == null || !mVar.b(text.toString())) {
            if (this.f8002v0 != null) {
                N(0, null, text.toString());
            }
            this.f7964G.setImeVisibility(false);
            E();
        }
    }

    boolean V(View view, int i10, KeyEvent keyEvent) {
        if (this.f8002v0 != null && this.f7991k0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return Q(this.f7964G.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f7964G.setSelection(i10 == 21 ? 0 : this.f7964G.length());
                this.f7964G.setListSelection(0);
                this.f7964G.clearListSelection();
                this.f7964G.b();
                return true;
            }
            if (i10 == 19) {
                this.f7964G.getListSelection();
                return false;
            }
        }
        return false;
    }

    void W(CharSequence charSequence) {
        Editable text = this.f7964G.getText();
        this.f7999s0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        h0(!zIsEmpty);
        j0(zIsEmpty);
        c0();
        g0();
        if (this.f7985e0 != null && !TextUtils.equals(charSequence, this.f7998r0)) {
            this.f7985e0.a(charSequence.toString());
        }
        this.f7998r0 = charSequence.toString();
    }

    void X() {
        i0(J());
        Z();
        if (this.f7964G.hasFocus()) {
            F();
        }
    }

    void Y() {
        SearchableInfo searchableInfo = this.f8002v0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(D(this.f7982b0, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(C(this.f7983c0, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public void b0(CharSequence charSequence, boolean z9) {
        this.f7964G.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f7964G;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f7999s0 = charSequence;
        }
        if (!z9 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        U();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f7995o0 = true;
        super.clearFocus();
        this.f7964G.clearFocus();
        this.f7964G.setImeVisibility(false);
        this.f7995o0 = false;
    }

    void d0() {
        int[] iArr = this.f7964G.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f7966I.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f7967J.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f7964G.getImeOptions();
    }

    public int getInputType() {
        return this.f7964G.getInputType();
    }

    public int getMaxWidth() {
        return this.f7996p0;
    }

    public CharSequence getQuery() {
        return this.f7964G.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f7993m0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f8002v0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f7984d0 : getContext().getText(this.f8002v0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f7981a0;
    }

    int getSuggestionRowLayout() {
        return this.f7980W;
    }

    public S.a getSuggestionsAdapter() {
        return this.f7991k0;
    }

    @Override // p120m.c
    public void onActionViewCollapsed() {
        b0("", false);
        clearFocus();
        i0(true);
        this.f7964G.setImeOptions(this.f8001u0);
        this.f8000t0 = false;
    }

    @Override // p120m.c
    public void onActionViewExpanded() {
        if (this.f8000t0) {
            return;
        }
        this.f8000t0 = true;
        int imeOptions = this.f7964G.getImeOptions();
        this.f8001u0 = imeOptions;
        this.f7964G.setImeOptions(imeOptions | 33554432);
        this.f7964G.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f8004x0);
        post(this.f8005y0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.T, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (z9) {
            G(this.f7964G, this.f7974Q);
            Rect rect = this.f7975R;
            Rect rect2 = this.f7974Q;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            q qVar = this.f7973P;
            if (qVar != null) {
                qVar.a(this.f7975R, this.f7974Q);
                return;
            }
            q qVar2 = new q(this.f7975R, this.f7974Q, this.f7964G);
            this.f7973P = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    @Override // androidx.appcompat.widget.T, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        if (J()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f7996p0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f7996p0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f7996p0) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        i0(pVar.f8025c);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f8025c = J();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f7995o0 || !isFocusable()) {
            return false;
        }
        if (J()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f7964G.requestFocus(i10, rect);
        if (zRequestFocus) {
            i0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f8003w0 = bundle;
    }

    public void setIconified(boolean z9) {
        if (z9) {
            P();
        } else {
            T();
        }
    }

    public void setIconifiedByDefault(boolean z9) {
        if (this.f7989i0 == z9) {
            return;
        }
        this.f7989i0 = z9;
        i0(z9);
        e0();
    }

    public void setImeOptions(int i10) {
        this.f7964G.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f7964G.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f7996p0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.f7986f0 = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f7987g0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f7985e0 = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f7988h0 = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f7993m0 = charSequence;
        e0();
    }

    public void setQueryRefinementEnabled(boolean z9) {
        this.f7994n0 = z9;
        S.a aVar = this.f7991k0;
        if (aVar instanceof b0) {
            ((b0) aVar).A(z9 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f8002v0 = searchableInfo;
        if (searchableInfo != null) {
            f0();
            e0();
        }
        boolean zI = I();
        this.f7997q0 = zI;
        if (zI) {
            this.f7964G.setPrivateImeOptions("nm");
        }
        i0(J());
    }

    public void setSubmitButtonEnabled(boolean z9) {
        this.f7992l0 = z9;
        i0(J());
    }

    public void setSuggestionsAdapter(S.a aVar) {
        this.f7991k0 = aVar;
        this.f7964G.setAdapter(aVar);
    }

    void z() {
        if (this.f7972O.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f7966I.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = s0.b(this);
            int dimensionPixelSize = this.f7989i0 ? resources.getDimensionPixelSize(p060g.d.f43892c) + resources.getDimensionPixelSize(p060g.d.f43893d) : 0;
            this.f7964G.getDropDownBackground().getPadding(rect);
            this.f7964G.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f7964G.setDropDownWidth((((this.f7972O.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p060g.a.f43848G);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7974Q = new Rect();
        this.f7975R = new Rect();
        this.f7976S = new int[2];
        this.f7977T = new int[2];
        this.f8004x0 = new b();
        this.f8005y0 = new c();
        this.f8006z0 = new WeakHashMap();
        f fVar = new f();
        this.f7958A0 = fVar;
        this.f7959B0 = new g();
        h hVar = new h();
        this.f7960C0 = hVar;
        i iVar = new i();
        this.f7961D0 = iVar;
        j jVar = new j();
        this.f7962E0 = jVar;
        this.f7963F0 = new a();
        h0 h0VarV = h0.v(context, attributeSet, p060g.j.f44178f2, i10, 0);
        AbstractC0845c0.k0(this, context, p060g.j.f44178f2, attributeSet, h0VarV.r(), i10, 0);
        LayoutInflater.from(context).inflate(h0VarV.n(p060g.j.f44228p2, p060g.g.f44007r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(p060g.f.f43951D);
        this.f7964G = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f7965H = findViewById(p060g.f.f43989z);
        View viewFindViewById = findViewById(p060g.f.f43950C);
        this.f7966I = viewFindViewById;
        View viewFindViewById2 = findViewById(p060g.f.f43957J);
        this.f7967J = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(p060g.f.f43987x);
        this.f7968K = imageView;
        ImageView imageView2 = (ImageView) findViewById(p060g.f.f43948A);
        this.f7969L = imageView2;
        ImageView imageView3 = (ImageView) findViewById(p060g.f.f43988y);
        this.f7970M = imageView3;
        ImageView imageView4 = (ImageView) findViewById(p060g.f.f43952E);
        this.f7971N = imageView4;
        ImageView imageView5 = (ImageView) findViewById(p060g.f.f43949B);
        this.f7978U = imageView5;
        AbstractC0845c0.q0(viewFindViewById, h0VarV.g(p060g.j.f44233q2));
        AbstractC0845c0.q0(viewFindViewById2, h0VarV.g(p060g.j.f44253u2));
        imageView.setImageDrawable(h0VarV.g(p060g.j.f44248t2));
        imageView2.setImageDrawable(h0VarV.g(p060g.j.f44218n2));
        imageView3.setImageDrawable(h0VarV.g(p060g.j.f44203k2));
        imageView4.setImageDrawable(h0VarV.g(p060g.j.f44263w2));
        imageView5.setImageDrawable(h0VarV.g(p060g.j.f44248t2));
        this.f7979V = h0VarV.g(p060g.j.f44243s2);
        m0.a(imageView, getResources().getString(p060g.h.f44023n));
        this.f7980W = h0VarV.n(p060g.j.f44258v2, p060g.g.f44006q);
        this.f7981a0 = h0VarV.n(p060g.j.f44208l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f7963F0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f7959B0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(h0VarV.a(p060g.j.f44223o2, true));
        int iF = h0VarV.f(p060g.j.f44188h2, -1);
        if (iF != -1) {
            setMaxWidth(iF);
        }
        this.f7984d0 = h0VarV.p(p060g.j.f44213m2);
        this.f7993m0 = h0VarV.p(p060g.j.f44238r2);
        int iK = h0VarV.k(p060g.j.f44198j2, -1);
        if (iK != -1) {
            setImeOptions(iK);
        }
        int iK2 = h0VarV.k(p060g.j.f44193i2, -1);
        if (iK2 != -1) {
            setInputType(iK2);
        }
        setFocusable(h0VarV.a(p060g.j.f44183g2, true));
        h0VarV.x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f7982b0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f7983c0 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f7972O = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        i0(this.f7989i0);
        e0();
    }
}
