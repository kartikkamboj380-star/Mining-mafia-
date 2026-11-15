package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p240y.a f8576k;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void o(p240y.e eVar, int i10, boolean z9) {
        this.f8575j = i10;
        if (z9) {
            int i11 = this.f8574i;
            if (i11 == 5) {
                this.f8575j = 1;
            } else if (i11 == 6) {
                this.f8575j = 0;
            }
        } else {
            int i12 = this.f8574i;
            if (i12 == 5) {
                this.f8575j = 0;
            } else if (i12 == 6) {
                this.f8575j = 1;
            }
        }
        if (eVar instanceof p240y.a) {
            ((p240y.a) eVar).P0(this.f8575j);
        }
    }

    @Override // androidx.constraintlayout.widget.c
    protected void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.f8576k = new p240y.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f8875a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f8987q1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f8980p1) {
                    this.f8576k.O0(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == i.f8994r1) {
                    this.f8576k.Q0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f8596d = this.f8576k;
        m();
    }

    public int getMargin() {
        return this.f8576k.M0();
    }

    public int getType() {
        return this.f8574i;
    }

    @Override // androidx.constraintlayout.widget.c
    public void h(p240y.e eVar, boolean z9) {
        o(eVar, this.f8574i, z9);
    }

    public boolean n() {
        return this.f8576k.K0();
    }

    public void setAllowsGoneWidget(boolean z9) {
        this.f8576k.O0(z9);
    }

    public void setDpMargin(int i10) {
        this.f8576k.Q0((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f8576k.Q0(i10);
    }

    public void setType(int i10) {
        this.f8574i = i10;
    }
}
