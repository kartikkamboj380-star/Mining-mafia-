package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.h0;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private LayoutInflater f7560G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f7561H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f7562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f7563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RadioButton f7564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f7565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CheckBox f7566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f7567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f7568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f7569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f7570i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f7571j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f7572k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f7573l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f7574m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f7575v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f7576w;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p060g.a.f43843B);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f7570i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(p060g.g.f43997h, (ViewGroup) this, false);
        this.f7566e = checkBox;
        a(checkBox);
    }

    private void d() {
        ImageView imageView = (ImageView) getInflater().inflate(p060g.g.f43998i, (ViewGroup) this, false);
        this.f7563b = imageView;
        b(imageView, 0);
    }

    private void e() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(p060g.g.f44000k, (ViewGroup) this, false);
        this.f7564c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f7560G == null) {
            this.f7560G = LayoutInflater.from(getContext());
        }
        return this.f7560G;
    }

    private void setSubMenuArrowVisible(boolean z9) {
        ImageView imageView = this.f7568g;
        if (imageView != null) {
            imageView.setVisibility(z9 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f7569h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7569h.getLayoutParams();
        rect.top += this.f7569h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void f(g gVar, int i10) {
        this.f7562a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f7562a;
    }

    public void h(boolean z9, char c10) {
        int i10 = (z9 && this.f7562a.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f7567f.setText(this.f7562a.h());
        }
        if (this.f7567f.getVisibility() != i10) {
            this.f7567f.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f7571j);
        TextView textView = (TextView) findViewById(p060g.f.f43960M);
        this.f7565d = textView;
        int i10 = this.f7572k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f7573l, i10);
        }
        this.f7567f = (TextView) findViewById(p060g.f.f43953F);
        ImageView imageView = (ImageView) findViewById(p060g.f.f43956I);
        this.f7568g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f7575v);
        }
        this.f7569h = (ImageView) findViewById(p060g.f.f43981r);
        this.f7570i = (LinearLayout) findViewById(p060g.f.f43975l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f7563b != null && this.f7574m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f7563b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z9) {
        CompoundButton compoundButton;
        View view;
        if (!z9 && this.f7564c == null && this.f7566e == null) {
            return;
        }
        if (this.f7562a.m()) {
            if (this.f7564c == null) {
                e();
            }
            compoundButton = this.f7564c;
            view = this.f7566e;
        } else {
            if (this.f7566e == null) {
                c();
            }
            compoundButton = this.f7566e;
            view = this.f7564c;
        }
        if (z9) {
            compoundButton.setChecked(this.f7562a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f7566e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f7564c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z9) {
        CompoundButton compoundButton;
        if (this.f7562a.m()) {
            if (this.f7564c == null) {
                e();
            }
            compoundButton = this.f7564c;
        } else {
            if (this.f7566e == null) {
                c();
            }
            compoundButton = this.f7566e;
        }
        compoundButton.setChecked(z9);
    }

    public void setForceShowIcon(boolean z9) {
        this.f7561H = z9;
        this.f7574m = z9;
    }

    public void setGroupDividerEnabled(boolean z9) {
        ImageView imageView = this.f7569h;
        if (imageView != null) {
            imageView.setVisibility((this.f7576w || !z9) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z9 = this.f7562a.z() || this.f7561H;
        if (z9 || this.f7574m) {
            ImageView imageView = this.f7563b;
            if (imageView == null && drawable == null && !this.f7574m) {
                return;
            }
            if (imageView == null) {
                d();
            }
            if (drawable == null && !this.f7574m) {
                this.f7563b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f7563b;
            if (!z9) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f7563b.getVisibility() != 0) {
                this.f7563b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f7565d.getVisibility() != 8) {
                this.f7565d.setVisibility(8);
            }
        } else {
            this.f7565d.setText(charSequence);
            if (this.f7565d.getVisibility() != 0) {
                this.f7565d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        h0 h0VarV = h0.v(getContext(), attributeSet, p060g.j.f44124T1, i10, 0);
        this.f7571j = h0VarV.g(p060g.j.f44132V1);
        this.f7572k = h0VarV.n(p060g.j.f44128U1, -1);
        this.f7574m = h0VarV.a(p060g.j.f44136W1, false);
        this.f7573l = context;
        this.f7575v = h0VarV.g(p060g.j.f44140X1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, p060g.a.f43879y, 0);
        this.f7576w = typedArrayObtainStyledAttributes.hasValue(0);
        h0VarV.x();
        typedArrayObtainStyledAttributes.recycle();
    }
}
