package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f8593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f8594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f8595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected p240y.i f8596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f8597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f8598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View[] f8599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HashMap f8600h;

    public c(Context context) {
        super(context);
        this.f8593a = new int[32];
        this.f8597e = false;
        this.f8599g = null;
        this.f8600h = new HashMap();
        this.f8595c = context;
        g(null);
    }

    private void a(String str) {
        if (str == null || str.length() == 0 || this.f8595c == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iF = f(strTrim);
        if (iF != 0) {
            this.f8600h.put(Integer.valueOf(iF), strTrim);
            b(iF);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f8594b + 1;
        int[] iArr = this.f8593a;
        if (i11 > iArr.length) {
            this.f8593a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f8593a;
        int i12 = this.f8594b;
        iArr2[i12] = i10;
        this.f8594b = i12 + 1;
    }

    private int e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f8595c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int f(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iE = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objF = constraintLayout.f(0, str);
            if (objF instanceof Integer) {
                iE = ((Integer) objF).intValue();
            }
        }
        if (iE == 0 && constraintLayout != null) {
            iE = e(constraintLayout, str);
        }
        if (iE == 0) {
            try {
                iE = h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iE == 0 ? this.f8595c.getResources().getIdentifier(str, "id", this.f8595c.getPackageName()) : iE;
    }

    protected void c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }

    protected void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f8594b; i10++) {
            View viewH = constraintLayout.h(this.f8593a[i10]);
            if (viewH != null) {
                viewH.setVisibility(visibility);
                if (elevation > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    viewH.setTranslationZ(viewH.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f8875a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f9008t1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f8598f = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f8593a, this.f8594b);
    }

    public abstract void h(p240y.e eVar, boolean z9);

    public void i(ConstraintLayout constraintLayout) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
        String str;
        int iE;
        if (isInEditMode()) {
            setIds(this.f8598f);
        }
        p240y.i iVar = this.f8596d;
        if (iVar == null) {
            return;
        }
        iVar.c();
        for (int i10 = 0; i10 < this.f8594b; i10++) {
            int i11 = this.f8593a[i10];
            View viewH = constraintLayout.h(i11);
            if (viewH == null && (iE = e(constraintLayout, (str = (String) this.f8600h.get(Integer.valueOf(i11))))) != 0) {
                this.f8593a[i10] = iE;
                this.f8600h.put(Integer.valueOf(iE), str);
                viewH = constraintLayout.h(iE);
            }
            if (viewH != null) {
                this.f8596d.a(constraintLayout.i(viewH));
            }
        }
        this.f8596d.b(constraintLayout.f8484c);
    }

    public void m() {
        if (this.f8596d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f8551n0 = (p240y.e) this.f8596d;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f8598f;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f8597e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f8598f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f8594b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f8598f = null;
        this.f8594b = 0;
        for (int i10 : iArr) {
            b(i10);
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8593a = new int[32];
        this.f8597e = false;
        this.f8599g = null;
        this.f8600h = new HashMap();
        this.f8595c = context;
        g(attributeSet);
    }
}
