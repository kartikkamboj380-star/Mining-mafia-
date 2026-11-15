package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.i;
import androidx.constraintlayout.widget.j;
import p240y.e;
import p240y.g;
import p240y.l;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private g f8473k;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.j, androidx.constraintlayout.widget.c
    protected void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.f8473k = new g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f8875a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f8882b1) {
                    this.f8473k.S1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f8889c1) {
                    this.f8473k.Y0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f8959m1) {
                    this.f8473k.d1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f8966n1) {
                    this.f8473k.a1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f8896d1) {
                    this.f8473k.b1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f8903e1) {
                    this.f8473k.e1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f8910f1) {
                    this.f8473k.c1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f8917g1) {
                    this.f8473k.Z0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f8785L1) {
                    this.f8473k.X1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f8725B1) {
                    this.f8473k.M1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f8779K1) {
                    this.f8473k.W1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f9022v1) {
                    this.f8473k.G1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f8737D1) {
                    this.f8473k.O1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f9035x1) {
                    this.f8473k.I1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f8749F1) {
                    this.f8473k.Q1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f9047z1) {
                    this.f8473k.K1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f9015u1) {
                    this.f8473k.F1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f8731C1) {
                    this.f8473k.N1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f9029w1) {
                    this.f8473k.H1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f8743E1) {
                    this.f8473k.P1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f8767I1) {
                    this.f8473k.U1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f9041y1) {
                    this.f8473k.J1(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == i.f8761H1) {
                    this.f8473k.T1(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == i.f8719A1) {
                    this.f8473k.L1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f8773J1) {
                    this.f8473k.V1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f8755G1) {
                    this.f8473k.R1(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
        }
        this.f8596d = this.f8473k;
        m();
    }

    @Override // androidx.constraintlayout.widget.c
    public void h(e eVar, boolean z9) {
        this.f8473k.K0(z9);
    }

    @Override // androidx.constraintlayout.widget.j
    public void n(l lVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.S0(mode, size, mode2, size2);
            setMeasuredDimension(lVar.N0(), lVar.M0());
        }
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    protected void onMeasure(int i10, int i11) {
        n(this.f8473k, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f8473k.F1(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f8473k.G1(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f8473k.H1(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f8473k.I1(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f8473k.J1(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f8473k.K1(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f8473k.L1(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f8473k.M1(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f8473k.R1(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f8473k.S1(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f8473k.Y0(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f8473k.Z0(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f8473k.b1(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f8473k.c1(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f8473k.e1(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f8473k.T1(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f8473k.U1(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f8473k.V1(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f8473k.W1(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f8473k.X1(i10);
        requestLayout();
    }
}
