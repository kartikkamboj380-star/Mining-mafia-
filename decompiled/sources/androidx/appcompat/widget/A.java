package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class A extends Spinner {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f7744i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1084e f7745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f7746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private S f7747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SpinnerAdapter f7748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f7749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h f7750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f7751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Rect f7752h;

    class a extends S {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ f f7753j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, f fVar) {
            super(view);
            this.f7753j = fVar;
        }

        @Override // androidx.appcompat.widget.S
        public p130n.e e() {
            return this.f7753j;
        }

        @Override // androidx.appcompat.widget.S
        public boolean f() {
            if (A.this.getInternalPopup().a()) {
                return true;
            }
            A.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!A.this.getInternalPopup().a()) {
                A.this.b();
            }
            ViewTreeObserver viewTreeObserver = A.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    private static final class c {
        static void a(@NonNull ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (N.b.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    class d implements h, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.appcompat.app.a f7756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListAdapter f7757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f7758c;

        d() {
        }

        @Override // androidx.appcompat.widget.A.h
        public boolean a() {
            androidx.appcompat.app.a aVar = this.f7756a;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.A.h
        public int b() {
            return 0;
        }

        @Override // androidx.appcompat.widget.A.h
        public void dismiss() {
            androidx.appcompat.app.a aVar = this.f7756a;
            if (aVar != null) {
                aVar.dismiss();
                this.f7756a = null;
            }
        }

        @Override // androidx.appcompat.widget.A.h
        public void e(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.A.h
        public CharSequence f() {
            return this.f7758c;
        }

        @Override // androidx.appcompat.widget.A.h
        public Drawable g() {
            return null;
        }

        @Override // androidx.appcompat.widget.A.h
        public void h(CharSequence charSequence) {
            this.f7758c = charSequence;
        }

        @Override // androidx.appcompat.widget.A.h
        public void i(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.A.h
        public void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.A.h
        public void k(int i10, int i11) {
            if (this.f7757b == null) {
                return;
            }
            androidx.appcompat.app.a.C0134a c0134a = new androidx.appcompat.app.a.C0134a(A.this.getPopupContext());
            CharSequence charSequence = this.f7758c;
            if (charSequence != null) {
                c0134a.m(charSequence);
            }
            androidx.appcompat.app.a aVarA = c0134a.l(this.f7757b, A.this.getSelectedItemPosition(), this).a();
            this.f7756a = aVarA;
            ListView listViewL = aVarA.l();
            listViewL.setTextDirection(i10);
            listViewL.setTextAlignment(i11);
            this.f7756a.show();
        }

        @Override // androidx.appcompat.widget.A.h
        public int l() {
            return 0;
        }

        @Override // androidx.appcompat.widget.A.h
        public void m(ListAdapter listAdapter) {
            this.f7757b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            A.this.setSelection(i10);
            if (A.this.getOnItemClickListener() != null) {
                A.this.performItemClick(null, i10, this.f7757b.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.A.h
        public void p(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
    }

    private static class e implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SpinnerAdapter f7760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListAdapter f7761b;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f7760a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f7761b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f7761b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f7760a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f7760a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f7760a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f7760a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f7760a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f7761b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f7760a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f7760a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class f extends U implements h {

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private CharSequence f7762Z;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        ListAdapter f7763a0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        private final Rect f7764b0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        private int f7765c0;

        class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ A f7767a;

            a(A a10) {
                this.f7767a = a10;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                A.this.setSelection(i10);
                if (A.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    A.this.performItemClick(view, i10, fVar.f7763a0.getItemId(i10));
                }
                f.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.V(A.this)) {
                    f.this.dismiss();
                } else {
                    f.this.T();
                    f.super.c();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f7770a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f7770a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = A.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f7770a);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f7764b0 = new Rect();
            D(A.this);
            J(true);
            P(0);
            L(new a(A.this));
        }

        void T() {
            int i10;
            Drawable drawableG = g();
            if (drawableG != null) {
                drawableG.getPadding(A.this.f7752h);
                i10 = s0.b(A.this) ? A.this.f7752h.right : -A.this.f7752h.left;
            } else {
                Rect rect = A.this.f7752h;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = A.this.getPaddingLeft();
            int paddingRight = A.this.getPaddingRight();
            int width = A.this.getWidth();
            A a10 = A.this;
            int i11 = a10.f7751g;
            if (i11 == -2) {
                int iA = a10.a((SpinnerAdapter) this.f7763a0, g());
                int i12 = A.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = A.this.f7752h;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (iA > i13) {
                    iA = i13;
                }
                F(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                F((width - paddingLeft) - paddingRight);
            } else {
                F(i11);
            }
            e(s0.b(A.this) ? i10 + (((width - paddingRight) - z()) - U()) : i10 + paddingLeft + U());
        }

        public int U() {
            return this.f7765c0;
        }

        boolean V(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f7764b0);
        }

        @Override // androidx.appcompat.widget.A.h
        public CharSequence f() {
            return this.f7762Z;
        }

        @Override // androidx.appcompat.widget.A.h
        public void h(CharSequence charSequence) {
            this.f7762Z = charSequence;
        }

        @Override // androidx.appcompat.widget.A.h
        public void j(int i10) {
            this.f7765c0 = i10;
        }

        @Override // androidx.appcompat.widget.A.h
        public void k(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean zA = a();
            T();
            I(2);
            super.c();
            ListView listViewO = o();
            listViewO.setChoiceMode(1);
            listViewO.setTextDirection(i10);
            listViewO.setTextAlignment(i11);
            Q(A.this.getSelectedItemPosition());
            if (zA || (viewTreeObserver = A.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            K(new c(bVar));
        }

        @Override // androidx.appcompat.widget.U, androidx.appcompat.widget.A.h
        public void m(ListAdapter listAdapter) {
            super.m(listAdapter);
            this.f7763a0 = listAdapter;
        }
    }

    static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f7772a;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f7772a ? (byte) 1 : (byte) 0);
        }

        g(Parcel parcel) {
            super(parcel);
            this.f7772a = parcel.readByte() != 0;
        }
    }

    interface h {
        boolean a();

        int b();

        void dismiss();

        void e(int i10);

        CharSequence f();

        Drawable g();

        void h(CharSequence charSequence);

        void i(int i10);

        void j(int i10);

        void k(int i10, int i11);

        int l();

        void m(ListAdapter listAdapter);

        void p(Drawable drawable);
    }

    public A(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p060g.a.f43850I);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f7752h);
        Rect rect = this.f7752h;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        this.f7750f.k(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1084e c1084e = this.f7745a;
        if (c1084e != null) {
            c1084e.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        h hVar = this.f7750f;
        return hVar != null ? hVar.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        h hVar = this.f7750f;
        return hVar != null ? hVar.l() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f7750f != null ? this.f7751g : super.getDropDownWidth();
    }

    final h getInternalPopup() {
        return this.f7750f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        h hVar = this.f7750f;
        return hVar != null ? hVar.g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f7746b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        h hVar = this.f7750f;
        return hVar != null ? hVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1084e c1084e = this.f7745a;
        if (c1084e != null) {
            return c1084e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1084e c1084e = this.f7745a;
        if (c1084e != null) {
            return c1084e.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f7750f;
        if (hVar == null || !hVar.a()) {
            return;
        }
        this.f7750f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f7750f == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        if (!gVar.f7772a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        h hVar = this.f7750f;
        gVar.f7772a = hVar != null && hVar.a();
        return gVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        S s10 = this.f7747c;
        if (s10 == null || !s10.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        h hVar = this.f7750f;
        if (hVar == null) {
            return super.performClick();
        }
        if (hVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1084e c1084e = this.f7745a;
        if (c1084e != null) {
            c1084e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1084e c1084e = this.f7745a;
        if (c1084e != null) {
            c1084e.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        h hVar = this.f7750f;
        if (hVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            hVar.j(i10);
            this.f7750f.e(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        h hVar = this.f7750f;
        if (hVar != null) {
            hVar.i(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f7750f != null) {
            this.f7751g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.f7750f;
        if (hVar != null) {
            hVar.p(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(p080i.a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        h hVar = this.f7750f;
        if (hVar != null) {
            hVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1084e c1084e = this.f7745a;
        if (c1084e != null) {
            c1084e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1084e c1084e = this.f7745a;
        if (c1084e != null) {
            c1084e.j(mode);
        }
    }

    public A(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f7749e) {
            this.f7748d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f7750f != null) {
            Context context = this.f7746b;
            if (context == null) {
                context = getContext();
            }
            this.f7750f.m(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public A(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.A] */
    public A(Context context, AttributeSet attributeSet, int i10, int i11, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrQ;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i10);
        this.f7752h = new Rect();
        d0.a(this, getContext());
        h0 h0VarV = h0.v(context, attributeSet, p060g.j.f44268x2, i10, 0);
        this.f7745a = new C1084e(this);
        if (theme != null) {
            this.f7746b = new p120m.d(context, theme);
        } else {
            int iN = h0VarV.n(p060g.j.f44041C2, 0);
            if (iN != 0) {
                this.f7746b = new p120m.d(context, iN);
            } else {
                this.f7746b = context;
            }
        }
        ?? r11 = -1;
        ?? r10 = 0;
        try {
            if (i11 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7744i, i10, 0);
                    try {
                        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
                        r11 = typedArrayObtainStyledAttributes;
                        if (zHasValue) {
                            i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
                            r11 = typedArrayObtainStyledAttributes;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                        r11 = typedArrayObtainStyledAttributes;
                        if (typedArrayObtainStyledAttributes != null) {
                        }
                        if (i11 != 0) {
                            d dVar = new d();
                            this.f7750f = dVar;
                            dVar.h(h0VarV.o(p060g.j.f44031A2));
                        } else if (i11 == 1) {
                            f fVar = new f(this.f7746b, attributeSet, i10);
                            h0 h0VarV2 = h0.v(this.f7746b, attributeSet, p060g.j.f44268x2, i10, 0);
                            this.f7751g = h0VarV2.m(p060g.j.f44036B2, -2);
                            fVar.p(h0VarV2.g(p060g.j.f44278z2));
                            fVar.h(h0VarV.o(p060g.j.f44031A2));
                            h0VarV2.x();
                            this.f7750f = fVar;
                            this.f7747c = new a(this, fVar);
                        }
                        charSequenceArrQ = h0VarV.q(p060g.j.f44273y2);
                        if (charSequenceArrQ != null) {
                            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrQ);
                            arrayAdapter.setDropDownViewResource(p060g.g.f44009t);
                            setAdapter(arrayAdapter);
                        }
                        h0VarV.x();
                        this.f7749e = true;
                        spinnerAdapter = this.f7748d;
                        if (spinnerAdapter != null) {
                            setAdapter(spinnerAdapter);
                            this.f7748d = null;
                        }
                        this.f7745a.e(attributeSet, i10);
                    }
                } catch (Exception e11) {
                    e = e11;
                    typedArrayObtainStyledAttributes = null;
                } catch (Throwable th) {
                    th = th;
                    if (r10 != 0) {
                        r10.recycle();
                    }
                    throw th;
                }
                r11.recycle();
            }
            if (i11 != 0) {
                d dVar2 = new d();
                this.f7750f = dVar2;
                dVar2.h(h0VarV.o(p060g.j.f44031A2));
            } else if (i11 == 1) {
                f fVar2 = new f(this.f7746b, attributeSet, i10);
                h0 h0VarV3 = h0.v(this.f7746b, attributeSet, p060g.j.f44268x2, i10, 0);
                this.f7751g = h0VarV3.m(p060g.j.f44036B2, -2);
                fVar2.p(h0VarV3.g(p060g.j.f44278z2));
                fVar2.h(h0VarV.o(p060g.j.f44031A2));
                h0VarV3.x();
                this.f7750f = fVar2;
                this.f7747c = new a(this, fVar2);
            }
            charSequenceArrQ = h0VarV.q(p060g.j.f44273y2);
            if (charSequenceArrQ != null) {
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrQ);
                arrayAdapter2.setDropDownViewResource(p060g.g.f44009t);
                setAdapter(arrayAdapter2);
            }
            h0VarV.x();
            this.f7749e = true;
            spinnerAdapter = this.f7748d;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f7748d = null;
            }
            this.f7745a.e(attributeSet, i10);
        } catch (Throwable th2) {
            th = th2;
            r10 = r11;
        }
    }
}
