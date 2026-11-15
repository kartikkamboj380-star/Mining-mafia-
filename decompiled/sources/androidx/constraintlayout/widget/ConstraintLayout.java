package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.protobuf.DescriptorProtos;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import p240y.l;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    int f8474G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    int f8475H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    int f8476I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    int f8477J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private SparseArray f8478K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    c f8479L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f8480M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f8481N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SparseArray f8482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f8483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected p240y.f f8484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f8489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e f8491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected d f8492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private HashMap f8494m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f8495v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f8496w;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8497a;

        static {
            int[] iArr = new int[y.e.b.values().length];
            f8497a = iArr;
            try {
                iArr[y.e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8497a[y.e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8497a[y.e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8497a[y.e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c implements p250z.b.InterfaceC0560b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ConstraintLayout f8566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8568c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f8569d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f8570e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f8571f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f8572g;

        public c(ConstraintLayout constraintLayout) {
            this.f8566a = constraintLayout;
        }

        @Override // p250z.b.InterfaceC0560b
        public final void a() {
            int childCount = this.f8566a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f8566a.getChildAt(i10);
            }
            int size = this.f8566a.f8483b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.c) this.f8566a.f8483b.get(i11)).j(this.f8566a);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0182 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:110:0x0196  */
        /* JADX WARN: Code duplicated, block: B:112:0x019a  */
        /* JADX WARN: Code duplicated, block: B:115:0x01a8  */
        /* JADX WARN: Code duplicated, block: B:118:0x01b9  */
        /* JADX WARN: Code duplicated, block: B:119:0x01c0  */
        /* JADX WARN: Code duplicated, block: B:121:0x01c8  */
        /* JADX WARN: Code duplicated, block: B:122:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:125:0x01d9  */
        /* JADX WARN: Code duplicated, block: B:126:0x01de  */
        /* JADX WARN: Code duplicated, block: B:129:0x01e3  */
        /* JADX WARN: Code duplicated, block: B:132:0x01eb  */
        /* JADX WARN: Code duplicated, block: B:133:0x01f0  */
        /* JADX WARN: Code duplicated, block: B:136:0x01f5  */
        /* JADX WARN: Code duplicated, block: B:139:0x01fd A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:141:0x0206 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:142:0x0208 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:145:0x0212 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:146:0x0214  */
        /* JADX WARN: Code duplicated, block: B:148:0x0218  */
        /* JADX WARN: Code duplicated, block: B:150:0x021e  */
        /* JADX WARN: Code duplicated, block: B:153:0x0235  */
        /* JADX WARN: Code duplicated, block: B:154:0x0238  */
        /* JADX WARN: Code duplicated, block: B:157:0x023e  */
        /* JADX WARN: Code duplicated, block: B:161:0x0246  */
        /* JADX WARN: Code duplicated, block: B:164:0x024e  */
        /* JADX WARN: Code duplicated, block: B:166:0x0252  */
        /* JADX WARN: Code duplicated, block: B:41:0x00bd A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x00bf A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:46:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:48:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:52:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:53:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:61:0x00f5 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:65:0x0106  */
        /* JADX WARN: Code duplicated, block: B:66:0x0117  */
        /* JADX WARN: Code duplicated, block: B:67:0x0123  */
        /* JADX WARN: Code duplicated, block: B:70:0x0133  */
        /* JADX WARN: Code duplicated, block: B:71:0x0135  */
        /* JADX WARN: Code duplicated, block: B:73:0x0139  */
        /* JADX WARN: Code duplicated, block: B:74:0x013b  */
        /* JADX WARN: Code duplicated, block: B:77:0x0143  */
        /* JADX WARN: Code duplicated, block: B:81:0x014b  */
        /* JADX WARN: Code duplicated, block: B:83:0x014e  */
        /* JADX WARN: Code duplicated, block: B:87:0x0156  */
        /* JADX WARN: Code duplicated, block: B:90:0x015a  */
        /* JADX WARN: Code duplicated, block: B:93:0x0162  */
        /* JADX WARN: Code duplicated, block: B:95:0x0166  */
        /* JADX WARN: Code duplicated, block: B:98:0x0170  */
        @Override // p250z.b.InterfaceC0560b
        public final void b(p240y.e eVar, z.b.a aVar) {
            int iMakeMeasureSpec;
            boolean z9;
            int i10;
            int iMakeMeasureSpec2;
            boolean z10;
            y.e.b bVar;
            boolean z11;
            boolean z12;
            y.e.b bVar2;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            b bVar3;
            int measuredWidth;
            int measuredHeight;
            int baseline;
            int i11;
            int measuredWidth2;
            int i12;
            int i13;
            int measuredHeight2;
            int i14;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z20;
            if (eVar == null) {
                return;
            }
            if (eVar.O() == 8 && !eVar.W()) {
                aVar.f50813e = 0;
                aVar.f50814f = 0;
                aVar.f50815g = 0;
                return;
            }
            y.e.b bVar4 = aVar.f50809a;
            y.e.b bVar5 = aVar.f50810b;
            int i15 = aVar.f50811c;
            int i16 = aVar.f50812d;
            int i17 = this.f8567b + this.f8568c;
            int i18 = this.f8569d;
            View view = (View) eVar.q();
            int[] iArr = a.f8497a;
            int i19 = iArr[bVar4.ordinal()];
            if (i19 != 1) {
                if (i19 == 2) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f8571f, i18, -2);
                    eVar.f50642h[2] = -2;
                } else {
                    if (i19 != 3) {
                        if (i19 != 4) {
                            iMakeMeasureSpec = 0;
                            z9 = false;
                        } else {
                            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f8571f, i18, -2);
                            boolean z21 = eVar.f50650l == 1;
                            int[] iArr2 = eVar.f50642h;
                            iArr2[2] = 0;
                            if (aVar.f50818j) {
                                boolean z22 = (!z21 || iArr2[3] == 0 || iArr2[0] == eVar.P()) ? false : true;
                                if (!z21 || z22) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.P(), 1073741824);
                                }
                            }
                        }
                        i10 = iArr[bVar5.ordinal()];
                        if (i10 != 1) {
                            if (i10 == 2) {
                                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8572g, i17, -2);
                                eVar.f50642h[3] = -2;
                            } else {
                                if (i10 != 3) {
                                    if (i10 != 4) {
                                        iMakeMeasureSpec2 = 0;
                                        z10 = false;
                                    } else {
                                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8572g, i17, -2);
                                        if (eVar.f50652m == 1) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        int[] iArr3 = eVar.f50642h;
                                        iArr3[3] = 0;
                                        if (aVar.f50818j) {
                                            if (z19 || iArr3[2] == 0 || iArr3[1] == eVar.v()) {
                                                z20 = false;
                                            } else {
                                                z20 = true;
                                            }
                                            if (z19 || z20) {
                                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.v(), 1073741824);
                                            }
                                        }
                                    }
                                    bVar = y.e.b.MATCH_CONSTRAINT;
                                    if (bVar4 == bVar) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (bVar5 == bVar) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    bVar2 = y.e.b.MATCH_PARENT;
                                    if (bVar5 != bVar2 || bVar5 == y.e.b.FIXED) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (bVar4 != bVar2 || bVar4 == y.e.b.FIXED) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z11 || eVar.f50618Q <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        z15 = false;
                                    } else {
                                        z15 = true;
                                    }
                                    if (z12 || eVar.f50618Q <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        z16 = false;
                                    } else {
                                        z16 = true;
                                    }
                                    bVar3 = (b) view.getLayoutParams();
                                    if (aVar.f50818j && z11 && eVar.f50650l == 0 && z12 && eVar.f50652m == 0) {
                                        measuredWidth2 = 0;
                                        measuredHeight2 = 0;
                                        baseline = 0;
                                    } else {
                                        if ((view instanceof j) || !(eVar instanceof l)) {
                                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                        } else {
                                            ((j) view).n((l) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                                        }
                                        measuredWidth = view.getMeasuredWidth();
                                        measuredHeight = view.getMeasuredHeight();
                                        baseline = view.getBaseline();
                                        if (z9) {
                                            int[] iArr4 = eVar.f50642h;
                                            iArr4[0] = measuredWidth;
                                            iArr4[2] = measuredHeight;
                                        } else {
                                            int[] iArr5 = eVar.f50642h;
                                            iArr5[0] = 0;
                                            iArr5[2] = 0;
                                        }
                                        if (z10) {
                                            int[] iArr6 = eVar.f50642h;
                                            iArr6[1] = measuredHeight;
                                            iArr6[3] = measuredWidth;
                                        } else {
                                            int[] iArr7 = eVar.f50642h;
                                            iArr7[1] = 0;
                                            iArr7[3] = 0;
                                        }
                                        i11 = eVar.f50656o;
                                        if (i11 > 0) {
                                            measuredWidth2 = Math.max(i11, measuredWidth);
                                        } else {
                                            measuredWidth2 = measuredWidth;
                                        }
                                        i12 = eVar.f50658p;
                                        if (i12 > 0) {
                                            measuredWidth2 = Math.min(i12, measuredWidth2);
                                        }
                                        i13 = eVar.f50662r;
                                        if (i13 > 0) {
                                            measuredHeight2 = Math.max(i13, measuredHeight);
                                        } else {
                                            measuredHeight2 = measuredHeight;
                                        }
                                        i14 = eVar.f50664s;
                                        if (i14 > 0) {
                                            measuredHeight2 = Math.min(i14, measuredHeight2);
                                        }
                                        if (!z15 && z13) {
                                            measuredWidth2 = (int) ((measuredHeight2 * eVar.f50618Q) + 0.5f);
                                        } else if (z16 && z14) {
                                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                                        }
                                        if (measuredWidth == measuredWidth2 || measuredHeight != measuredHeight2) {
                                            if (measuredWidth != measuredWidth2) {
                                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                            }
                                            if (measuredHeight != measuredHeight2) {
                                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                            }
                                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                            measuredWidth2 = view.getMeasuredWidth();
                                            measuredHeight2 = view.getMeasuredHeight();
                                            baseline = view.getBaseline();
                                        }
                                    }
                                    if (baseline != -1) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    if (measuredWidth2 == aVar.f50811c || measuredHeight2 != aVar.f50812d) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    aVar.f50817i = z18;
                                    if (bVar3.f8522Y) {
                                        z17 = true;
                                    }
                                    if (z17 && baseline != -1 && eVar.n() != baseline) {
                                        aVar.f50817i = true;
                                    }
                                    aVar.f50813e = measuredWidth2;
                                    aVar.f50814f = measuredHeight2;
                                    aVar.f50816h = z17;
                                    aVar.f50815g = baseline;
                                }
                                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8572g, i17 + eVar.N(), -1);
                                eVar.f50642h[3] = -1;
                            }
                            z10 = true;
                            bVar = y.e.b.MATCH_CONSTRAINT;
                            if (bVar4 == bVar) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (bVar5 == bVar) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            bVar2 = y.e.b.MATCH_PARENT;
                            if (bVar5 != bVar2) {
                                z13 = true;
                            } else {
                                z13 = true;
                            }
                            if (bVar4 != bVar2) {
                                z14 = true;
                            } else {
                                z14 = true;
                            }
                            if (z11) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            if (z12) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            bVar3 = (b) view.getLayoutParams();
                            if (aVar.f50818j) {
                                if (view instanceof j) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                                if (z9) {
                                    int[] iArr8 = eVar.f50642h;
                                    iArr8[0] = measuredWidth;
                                    iArr8[2] = measuredHeight;
                                } else {
                                    int[] iArr9 = eVar.f50642h;
                                    iArr9[0] = 0;
                                    iArr9[2] = 0;
                                }
                                if (z10) {
                                    int[] iArr10 = eVar.f50642h;
                                    iArr10[1] = measuredHeight;
                                    iArr10[3] = measuredWidth;
                                } else {
                                    int[] iArr11 = eVar.f50642h;
                                    iArr11[1] = 0;
                                    iArr11[3] = 0;
                                }
                                i11 = eVar.f50656o;
                                if (i11 > 0) {
                                    measuredWidth2 = Math.max(i11, measuredWidth);
                                } else {
                                    measuredWidth2 = measuredWidth;
                                }
                                i12 = eVar.f50658p;
                                if (i12 > 0) {
                                    measuredWidth2 = Math.min(i12, measuredWidth2);
                                }
                                i13 = eVar.f50662r;
                                if (i13 > 0) {
                                    measuredHeight2 = Math.max(i13, measuredHeight);
                                } else {
                                    measuredHeight2 = measuredHeight;
                                }
                                i14 = eVar.f50664s;
                                if (i14 > 0) {
                                    measuredHeight2 = Math.min(i14, measuredHeight2);
                                }
                                if (!z15) {
                                    if (z16) {
                                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                                    }
                                } else if (z16) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                                }
                                if (measuredWidth == measuredWidth2) {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                            } else {
                                if (view instanceof j) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                                if (z9) {
                                    int[] iArr12 = eVar.f50642h;
                                    iArr12[0] = measuredWidth;
                                    iArr12[2] = measuredHeight;
                                } else {
                                    int[] iArr13 = eVar.f50642h;
                                    iArr13[0] = 0;
                                    iArr13[2] = 0;
                                }
                                if (z10) {
                                    int[] iArr14 = eVar.f50642h;
                                    iArr14[1] = measuredHeight;
                                    iArr14[3] = measuredWidth;
                                } else {
                                    int[] iArr15 = eVar.f50642h;
                                    iArr15[1] = 0;
                                    iArr15[3] = 0;
                                }
                                i11 = eVar.f50656o;
                                if (i11 > 0) {
                                    measuredWidth2 = Math.max(i11, measuredWidth);
                                } else {
                                    measuredWidth2 = measuredWidth;
                                }
                                i12 = eVar.f50658p;
                                if (i12 > 0) {
                                    measuredWidth2 = Math.min(i12, measuredWidth2);
                                }
                                i13 = eVar.f50662r;
                                if (i13 > 0) {
                                    measuredHeight2 = Math.max(i13, measuredHeight);
                                } else {
                                    measuredHeight2 = measuredHeight;
                                }
                                i14 = eVar.f50664s;
                                if (i14 > 0) {
                                    measuredHeight2 = Math.min(i14, measuredHeight2);
                                }
                                if (!z15) {
                                    if (z16) {
                                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                                    }
                                } else if (z16) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                                }
                                if (measuredWidth == measuredWidth2) {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                            }
                            if (baseline != -1) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (measuredWidth2 == aVar.f50811c) {
                                z18 = true;
                            } else {
                                z18 = true;
                            }
                            aVar.f50817i = z18;
                            if (bVar3.f8522Y) {
                                z17 = true;
                            }
                            if (z17) {
                                aVar.f50817i = true;
                            }
                            aVar.f50813e = measuredWidth2;
                            aVar.f50814f = measuredHeight2;
                            aVar.f50816h = z17;
                            aVar.f50815g = baseline;
                        }
                        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                        eVar.f50642h[3] = i16;
                        iMakeMeasureSpec2 = iMakeMeasureSpec3;
                        z10 = false;
                        bVar = y.e.b.MATCH_CONSTRAINT;
                        if (bVar4 == bVar) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (bVar5 == bVar) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        bVar2 = y.e.b.MATCH_PARENT;
                        if (bVar5 != bVar2) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (bVar4 != bVar2) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        if (z11) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (z12) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        bVar3 = (b) view.getLayoutParams();
                        if (aVar.f50818j) {
                            if (view instanceof j) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z9) {
                                int[] iArr16 = eVar.f50642h;
                                iArr16[0] = measuredWidth;
                                iArr16[2] = measuredHeight;
                            } else {
                                int[] iArr17 = eVar.f50642h;
                                iArr17[0] = 0;
                                iArr17[2] = 0;
                            }
                            if (z10) {
                                int[] iArr18 = eVar.f50642h;
                                iArr18[1] = measuredHeight;
                                iArr18[3] = measuredWidth;
                            } else {
                                int[] iArr19 = eVar.f50642h;
                                iArr19[1] = 0;
                                iArr19[3] = 0;
                            }
                            i11 = eVar.f50656o;
                            if (i11 > 0) {
                                measuredWidth2 = Math.max(i11, measuredWidth);
                            } else {
                                measuredWidth2 = measuredWidth;
                            }
                            i12 = eVar.f50658p;
                            if (i12 > 0) {
                                measuredWidth2 = Math.min(i12, measuredWidth2);
                            }
                            i13 = eVar.f50662r;
                            if (i13 > 0) {
                                measuredHeight2 = Math.max(i13, measuredHeight);
                            } else {
                                measuredHeight2 = measuredHeight;
                            }
                            i14 = eVar.f50664s;
                            if (i14 > 0) {
                                measuredHeight2 = Math.min(i14, measuredHeight2);
                            }
                            if (!z15) {
                                if (z16) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                                }
                            } else if (z16) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                            }
                            if (measuredWidth == measuredWidth2) {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                        } else {
                            if (view instanceof j) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z9) {
                                int[] iArr110 = eVar.f50642h;
                                iArr110[0] = measuredWidth;
                                iArr110[2] = measuredHeight;
                            } else {
                                int[] iArr111 = eVar.f50642h;
                                iArr111[0] = 0;
                                iArr111[2] = 0;
                            }
                            if (z10) {
                                int[] iArr112 = eVar.f50642h;
                                iArr112[1] = measuredHeight;
                                iArr112[3] = measuredWidth;
                            } else {
                                int[] iArr113 = eVar.f50642h;
                                iArr113[1] = 0;
                                iArr113[3] = 0;
                            }
                            i11 = eVar.f50656o;
                            if (i11 > 0) {
                                measuredWidth2 = Math.max(i11, measuredWidth);
                            } else {
                                measuredWidth2 = measuredWidth;
                            }
                            i12 = eVar.f50658p;
                            if (i12 > 0) {
                                measuredWidth2 = Math.min(i12, measuredWidth2);
                            }
                            i13 = eVar.f50662r;
                            if (i13 > 0) {
                                measuredHeight2 = Math.max(i13, measuredHeight);
                            } else {
                                measuredHeight2 = measuredHeight;
                            }
                            i14 = eVar.f50664s;
                            if (i14 > 0) {
                                measuredHeight2 = Math.min(i14, measuredHeight2);
                            }
                            if (!z15) {
                                if (z16) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                                }
                            } else if (z16) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                            }
                            if (measuredWidth == measuredWidth2) {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                        }
                        if (baseline != -1) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (measuredWidth2 == aVar.f50811c) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        aVar.f50817i = z18;
                        if (bVar3.f8522Y) {
                            z17 = true;
                        }
                        if (z17) {
                            aVar.f50817i = true;
                        }
                        aVar.f50813e = measuredWidth2;
                        aVar.f50814f = measuredHeight2;
                        aVar.f50816h = z17;
                        aVar.f50815g = baseline;
                    }
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f8571f, i18 + eVar.z(), -1);
                    eVar.f50642h[2] = -1;
                }
                z9 = true;
                i10 = iArr[bVar5.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8572g, i17, -2);
                        eVar.f50642h[3] = -2;
                    } else {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                iMakeMeasureSpec2 = 0;
                                z10 = false;
                            } else {
                                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8572g, i17, -2);
                                if (eVar.f50652m == 1) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                int[] iArr20 = eVar.f50642h;
                                iArr20[3] = 0;
                                if (aVar.f50818j) {
                                    if (z19) {
                                        z20 = false;
                                    } else {
                                        z20 = false;
                                    }
                                    if (z19) {
                                    }
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.v(), 1073741824);
                                }
                            }
                            bVar = y.e.b.MATCH_CONSTRAINT;
                            if (bVar4 == bVar) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (bVar5 == bVar) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            bVar2 = y.e.b.MATCH_PARENT;
                            if (bVar5 != bVar2) {
                                z13 = true;
                            } else {
                                z13 = true;
                            }
                            if (bVar4 != bVar2) {
                                z14 = true;
                            } else {
                                z14 = true;
                            }
                            if (z11) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            if (z12) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            bVar3 = (b) view.getLayoutParams();
                            if (aVar.f50818j) {
                                if (view instanceof j) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                                if (z9) {
                                    int[] iArr114 = eVar.f50642h;
                                    iArr114[0] = measuredWidth;
                                    iArr114[2] = measuredHeight;
                                } else {
                                    int[] iArr115 = eVar.f50642h;
                                    iArr115[0] = 0;
                                    iArr115[2] = 0;
                                }
                                if (z10) {
                                    int[] iArr116 = eVar.f50642h;
                                    iArr116[1] = measuredHeight;
                                    iArr116[3] = measuredWidth;
                                } else {
                                    int[] iArr117 = eVar.f50642h;
                                    iArr117[1] = 0;
                                    iArr117[3] = 0;
                                }
                                i11 = eVar.f50656o;
                                if (i11 > 0) {
                                    measuredWidth2 = Math.max(i11, measuredWidth);
                                } else {
                                    measuredWidth2 = measuredWidth;
                                }
                                i12 = eVar.f50658p;
                                if (i12 > 0) {
                                    measuredWidth2 = Math.min(i12, measuredWidth2);
                                }
                                i13 = eVar.f50662r;
                                if (i13 > 0) {
                                    measuredHeight2 = Math.max(i13, measuredHeight);
                                } else {
                                    measuredHeight2 = measuredHeight;
                                }
                                i14 = eVar.f50664s;
                                if (i14 > 0) {
                                    measuredHeight2 = Math.min(i14, measuredHeight2);
                                }
                                if (!z15) {
                                    if (z16) {
                                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                                    }
                                } else if (z16) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                                }
                                if (measuredWidth == measuredWidth2) {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                            } else {
                                if (view instanceof j) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                                if (z9) {
                                    int[] iArr118 = eVar.f50642h;
                                    iArr118[0] = measuredWidth;
                                    iArr118[2] = measuredHeight;
                                } else {
                                    int[] iArr119 = eVar.f50642h;
                                    iArr119[0] = 0;
                                    iArr119[2] = 0;
                                }
                                if (z10) {
                                    int[] iArr1110 = eVar.f50642h;
                                    iArr1110[1] = measuredHeight;
                                    iArr1110[3] = measuredWidth;
                                } else {
                                    int[] iArr1111 = eVar.f50642h;
                                    iArr1111[1] = 0;
                                    iArr1111[3] = 0;
                                }
                                i11 = eVar.f50656o;
                                if (i11 > 0) {
                                    measuredWidth2 = Math.max(i11, measuredWidth);
                                } else {
                                    measuredWidth2 = measuredWidth;
                                }
                                i12 = eVar.f50658p;
                                if (i12 > 0) {
                                    measuredWidth2 = Math.min(i12, measuredWidth2);
                                }
                                i13 = eVar.f50662r;
                                if (i13 > 0) {
                                    measuredHeight2 = Math.max(i13, measuredHeight);
                                } else {
                                    measuredHeight2 = measuredHeight;
                                }
                                i14 = eVar.f50664s;
                                if (i14 > 0) {
                                    measuredHeight2 = Math.min(i14, measuredHeight2);
                                }
                                if (!z15) {
                                    if (z16) {
                                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                                    }
                                } else if (z16) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                                }
                                if (measuredWidth == measuredWidth2) {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                            }
                            if (baseline != -1) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (measuredWidth2 == aVar.f50811c) {
                                z18 = true;
                            } else {
                                z18 = true;
                            }
                            aVar.f50817i = z18;
                            if (bVar3.f8522Y) {
                                z17 = true;
                            }
                            if (z17) {
                                aVar.f50817i = true;
                            }
                            aVar.f50813e = measuredWidth2;
                            aVar.f50814f = measuredHeight2;
                            aVar.f50816h = z17;
                            aVar.f50815g = baseline;
                        }
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8572g, i17 + eVar.N(), -1);
                        eVar.f50642h[3] = -1;
                    }
                    z10 = true;
                    bVar = y.e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (bVar5 == bVar) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    bVar2 = y.e.b.MATCH_PARENT;
                    if (bVar5 != bVar2) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (bVar4 != bVar2) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (z11) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (z12) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    bVar3 = (b) view.getLayoutParams();
                    if (aVar.f50818j) {
                        if (view instanceof j) {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        if (z9) {
                            int[] iArr1112 = eVar.f50642h;
                            iArr1112[0] = measuredWidth;
                            iArr1112[2] = measuredHeight;
                        } else {
                            int[] iArr1113 = eVar.f50642h;
                            iArr1113[0] = 0;
                            iArr1113[2] = 0;
                        }
                        if (z10) {
                            int[] iArr1114 = eVar.f50642h;
                            iArr1114[1] = measuredHeight;
                            iArr1114[3] = measuredWidth;
                        } else {
                            int[] iArr1115 = eVar.f50642h;
                            iArr1115[1] = 0;
                            iArr1115[3] = 0;
                        }
                        i11 = eVar.f50656o;
                        if (i11 > 0) {
                            measuredWidth2 = Math.max(i11, measuredWidth);
                        } else {
                            measuredWidth2 = measuredWidth;
                        }
                        i12 = eVar.f50658p;
                        if (i12 > 0) {
                            measuredWidth2 = Math.min(i12, measuredWidth2);
                        }
                        i13 = eVar.f50662r;
                        if (i13 > 0) {
                            measuredHeight2 = Math.max(i13, measuredHeight);
                        } else {
                            measuredHeight2 = measuredHeight;
                        }
                        i14 = eVar.f50664s;
                        if (i14 > 0) {
                            measuredHeight2 = Math.min(i14, measuredHeight2);
                        }
                        if (!z15) {
                            if (z16) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                            }
                        } else if (z16) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                        }
                        if (measuredWidth == measuredWidth2) {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        } else {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                    } else {
                        if (view instanceof j) {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        if (z9) {
                            int[] iArr1116 = eVar.f50642h;
                            iArr1116[0] = measuredWidth;
                            iArr1116[2] = measuredHeight;
                        } else {
                            int[] iArr1117 = eVar.f50642h;
                            iArr1117[0] = 0;
                            iArr1117[2] = 0;
                        }
                        if (z10) {
                            int[] iArr1118 = eVar.f50642h;
                            iArr1118[1] = measuredHeight;
                            iArr1118[3] = measuredWidth;
                        } else {
                            int[] iArr1119 = eVar.f50642h;
                            iArr1119[1] = 0;
                            iArr1119[3] = 0;
                        }
                        i11 = eVar.f50656o;
                        if (i11 > 0) {
                            measuredWidth2 = Math.max(i11, measuredWidth);
                        } else {
                            measuredWidth2 = measuredWidth;
                        }
                        i12 = eVar.f50658p;
                        if (i12 > 0) {
                            measuredWidth2 = Math.min(i12, measuredWidth2);
                        }
                        i13 = eVar.f50662r;
                        if (i13 > 0) {
                            measuredHeight2 = Math.max(i13, measuredHeight);
                        } else {
                            measuredHeight2 = measuredHeight;
                        }
                        i14 = eVar.f50664s;
                        if (i14 > 0) {
                            measuredHeight2 = Math.min(i14, measuredHeight2);
                        }
                        if (!z15) {
                            if (z16) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                            }
                        } else if (z16) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                        }
                        if (measuredWidth == measuredWidth2) {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        } else {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                    }
                    if (baseline != -1) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (measuredWidth2 == aVar.f50811c) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    aVar.f50817i = z18;
                    if (bVar3.f8522Y) {
                        z17 = true;
                    }
                    if (z17) {
                        aVar.f50817i = true;
                    }
                    aVar.f50813e = measuredWidth2;
                    aVar.f50814f = measuredHeight2;
                    aVar.f50816h = z17;
                    aVar.f50815g = baseline;
                }
                int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                eVar.f50642h[3] = i16;
                iMakeMeasureSpec2 = iMakeMeasureSpec4;
                z10 = false;
                bVar = y.e.b.MATCH_CONSTRAINT;
                if (bVar4 == bVar) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (bVar5 == bVar) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2 = y.e.b.MATCH_PARENT;
                if (bVar5 != bVar2) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (bVar4 != bVar2) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (z11) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z12) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                bVar3 = (b) view.getLayoutParams();
                if (aVar.f50818j) {
                    if (view instanceof j) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    if (z9) {
                        int[] iArr11110 = eVar.f50642h;
                        iArr11110[0] = measuredWidth;
                        iArr11110[2] = measuredHeight;
                    } else {
                        int[] iArr11111 = eVar.f50642h;
                        iArr11111[0] = 0;
                        iArr11111[2] = 0;
                    }
                    if (z10) {
                        int[] iArr11112 = eVar.f50642h;
                        iArr11112[1] = measuredHeight;
                        iArr11112[3] = measuredWidth;
                    } else {
                        int[] iArr11113 = eVar.f50642h;
                        iArr11113[1] = 0;
                        iArr11113[3] = 0;
                    }
                    i11 = eVar.f50656o;
                    if (i11 > 0) {
                        measuredWidth2 = Math.max(i11, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i12 = eVar.f50658p;
                    if (i12 > 0) {
                        measuredWidth2 = Math.min(i12, measuredWidth2);
                    }
                    i13 = eVar.f50662r;
                    if (i13 > 0) {
                        measuredHeight2 = Math.max(i13, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    i14 = eVar.f50664s;
                    if (i14 > 0) {
                        measuredHeight2 = Math.min(i14, measuredHeight2);
                    }
                    if (!z15) {
                        if (z16) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                        }
                    } else if (z16) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                } else {
                    if (view instanceof j) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    if (z9) {
                        int[] iArr11114 = eVar.f50642h;
                        iArr11114[0] = measuredWidth;
                        iArr11114[2] = measuredHeight;
                    } else {
                        int[] iArr11115 = eVar.f50642h;
                        iArr11115[0] = 0;
                        iArr11115[2] = 0;
                    }
                    if (z10) {
                        int[] iArr11116 = eVar.f50642h;
                        iArr11116[1] = measuredHeight;
                        iArr11116[3] = measuredWidth;
                    } else {
                        int[] iArr11117 = eVar.f50642h;
                        iArr11117[1] = 0;
                        iArr11117[3] = 0;
                    }
                    i11 = eVar.f50656o;
                    if (i11 > 0) {
                        measuredWidth2 = Math.max(i11, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i12 = eVar.f50658p;
                    if (i12 > 0) {
                        measuredWidth2 = Math.min(i12, measuredWidth2);
                    }
                    i13 = eVar.f50662r;
                    if (i13 > 0) {
                        measuredHeight2 = Math.max(i13, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    i14 = eVar.f50664s;
                    if (i14 > 0) {
                        measuredHeight2 = Math.min(i14, measuredHeight2);
                    }
                    if (!z15) {
                        if (z16) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                        }
                    } else if (z16) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                }
                if (baseline != -1) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (measuredWidth2 == aVar.f50811c) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                aVar.f50817i = z18;
                if (bVar3.f8522Y) {
                    z17 = true;
                }
                if (z17) {
                    aVar.f50817i = true;
                }
                aVar.f50813e = measuredWidth2;
                aVar.f50814f = measuredHeight2;
                aVar.f50816h = z17;
                aVar.f50815g = baseline;
            }
            int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
            eVar.f50642h[2] = i15;
            iMakeMeasureSpec = iMakeMeasureSpec5;
            z9 = false;
            i10 = iArr[bVar5.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8572g, i17, -2);
                    eVar.f50642h[3] = -2;
                } else {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            iMakeMeasureSpec2 = 0;
                            z10 = false;
                        } else {
                            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8572g, i17, -2);
                            if (eVar.f50652m == 1) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            int[] iArr21 = eVar.f50642h;
                            iArr21[3] = 0;
                            if (aVar.f50818j) {
                                if (z19) {
                                    z20 = false;
                                } else {
                                    z20 = false;
                                }
                                if (z19) {
                                }
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.v(), 1073741824);
                            }
                        }
                        bVar = y.e.b.MATCH_CONSTRAINT;
                        if (bVar4 == bVar) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (bVar5 == bVar) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        bVar2 = y.e.b.MATCH_PARENT;
                        if (bVar5 != bVar2) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (bVar4 != bVar2) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        if (z11) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (z12) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        bVar3 = (b) view.getLayoutParams();
                        if (aVar.f50818j) {
                            if (view instanceof j) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z9) {
                                int[] iArr11118 = eVar.f50642h;
                                iArr11118[0] = measuredWidth;
                                iArr11118[2] = measuredHeight;
                            } else {
                                int[] iArr11119 = eVar.f50642h;
                                iArr11119[0] = 0;
                                iArr11119[2] = 0;
                            }
                            if (z10) {
                                int[] iArr111110 = eVar.f50642h;
                                iArr111110[1] = measuredHeight;
                                iArr111110[3] = measuredWidth;
                            } else {
                                int[] iArr111111 = eVar.f50642h;
                                iArr111111[1] = 0;
                                iArr111111[3] = 0;
                            }
                            i11 = eVar.f50656o;
                            if (i11 > 0) {
                                measuredWidth2 = Math.max(i11, measuredWidth);
                            } else {
                                measuredWidth2 = measuredWidth;
                            }
                            i12 = eVar.f50658p;
                            if (i12 > 0) {
                                measuredWidth2 = Math.min(i12, measuredWidth2);
                            }
                            i13 = eVar.f50662r;
                            if (i13 > 0) {
                                measuredHeight2 = Math.max(i13, measuredHeight);
                            } else {
                                measuredHeight2 = measuredHeight;
                            }
                            i14 = eVar.f50664s;
                            if (i14 > 0) {
                                measuredHeight2 = Math.min(i14, measuredHeight2);
                            }
                            if (!z15) {
                                if (z16) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                                }
                            } else if (z16) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                            }
                            if (measuredWidth == measuredWidth2) {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                        } else {
                            if (view instanceof j) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z9) {
                                int[] iArr111112 = eVar.f50642h;
                                iArr111112[0] = measuredWidth;
                                iArr111112[2] = measuredHeight;
                            } else {
                                int[] iArr111113 = eVar.f50642h;
                                iArr111113[0] = 0;
                                iArr111113[2] = 0;
                            }
                            if (z10) {
                                int[] iArr111114 = eVar.f50642h;
                                iArr111114[1] = measuredHeight;
                                iArr111114[3] = measuredWidth;
                            } else {
                                int[] iArr111115 = eVar.f50642h;
                                iArr111115[1] = 0;
                                iArr111115[3] = 0;
                            }
                            i11 = eVar.f50656o;
                            if (i11 > 0) {
                                measuredWidth2 = Math.max(i11, measuredWidth);
                            } else {
                                measuredWidth2 = measuredWidth;
                            }
                            i12 = eVar.f50658p;
                            if (i12 > 0) {
                                measuredWidth2 = Math.min(i12, measuredWidth2);
                            }
                            i13 = eVar.f50662r;
                            if (i13 > 0) {
                                measuredHeight2 = Math.max(i13, measuredHeight);
                            } else {
                                measuredHeight2 = measuredHeight;
                            }
                            i14 = eVar.f50664s;
                            if (i14 > 0) {
                                measuredHeight2 = Math.min(i14, measuredHeight2);
                            }
                            if (!z15) {
                                if (z16) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                                }
                            } else if (z16) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                            }
                            if (measuredWidth == measuredWidth2) {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                        }
                        if (baseline != -1) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (measuredWidth2 == aVar.f50811c) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        aVar.f50817i = z18;
                        if (bVar3.f8522Y) {
                            z17 = true;
                        }
                        if (z17) {
                            aVar.f50817i = true;
                        }
                        aVar.f50813e = measuredWidth2;
                        aVar.f50814f = measuredHeight2;
                        aVar.f50816h = z17;
                        aVar.f50815g = baseline;
                    }
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f8572g, i17 + eVar.N(), -1);
                    eVar.f50642h[3] = -1;
                }
                z10 = true;
                bVar = y.e.b.MATCH_CONSTRAINT;
                if (bVar4 == bVar) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (bVar5 == bVar) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2 = y.e.b.MATCH_PARENT;
                if (bVar5 != bVar2) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (bVar4 != bVar2) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (z11) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z12) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                bVar3 = (b) view.getLayoutParams();
                if (aVar.f50818j) {
                    if (view instanceof j) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    if (z9) {
                        int[] iArr111116 = eVar.f50642h;
                        iArr111116[0] = measuredWidth;
                        iArr111116[2] = measuredHeight;
                    } else {
                        int[] iArr111117 = eVar.f50642h;
                        iArr111117[0] = 0;
                        iArr111117[2] = 0;
                    }
                    if (z10) {
                        int[] iArr111118 = eVar.f50642h;
                        iArr111118[1] = measuredHeight;
                        iArr111118[3] = measuredWidth;
                    } else {
                        int[] iArr111119 = eVar.f50642h;
                        iArr111119[1] = 0;
                        iArr111119[3] = 0;
                    }
                    i11 = eVar.f50656o;
                    if (i11 > 0) {
                        measuredWidth2 = Math.max(i11, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i12 = eVar.f50658p;
                    if (i12 > 0) {
                        measuredWidth2 = Math.min(i12, measuredWidth2);
                    }
                    i13 = eVar.f50662r;
                    if (i13 > 0) {
                        measuredHeight2 = Math.max(i13, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    i14 = eVar.f50664s;
                    if (i14 > 0) {
                        measuredHeight2 = Math.min(i14, measuredHeight2);
                    }
                    if (!z15) {
                        if (z16) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                        }
                    } else if (z16) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                } else {
                    if (view instanceof j) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    if (z9) {
                        int[] iArr1111110 = eVar.f50642h;
                        iArr1111110[0] = measuredWidth;
                        iArr1111110[2] = measuredHeight;
                    } else {
                        int[] iArr1111111 = eVar.f50642h;
                        iArr1111111[0] = 0;
                        iArr1111111[2] = 0;
                    }
                    if (z10) {
                        int[] iArr1111112 = eVar.f50642h;
                        iArr1111112[1] = measuredHeight;
                        iArr1111112[3] = measuredWidth;
                    } else {
                        int[] iArr1111113 = eVar.f50642h;
                        iArr1111113[1] = 0;
                        iArr1111113[3] = 0;
                    }
                    i11 = eVar.f50656o;
                    if (i11 > 0) {
                        measuredWidth2 = Math.max(i11, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i12 = eVar.f50658p;
                    if (i12 > 0) {
                        measuredWidth2 = Math.min(i12, measuredWidth2);
                    }
                    i13 = eVar.f50662r;
                    if (i13 > 0) {
                        measuredHeight2 = Math.max(i13, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    i14 = eVar.f50664s;
                    if (i14 > 0) {
                        measuredHeight2 = Math.min(i14, measuredHeight2);
                    }
                    if (!z15) {
                        if (z16) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                        }
                    } else if (z16) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                }
                if (baseline != -1) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (measuredWidth2 == aVar.f50811c) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                aVar.f50817i = z18;
                if (bVar3.f8522Y) {
                    z17 = true;
                }
                if (z17) {
                    aVar.f50817i = true;
                }
                aVar.f50813e = measuredWidth2;
                aVar.f50814f = measuredHeight2;
                aVar.f50816h = z17;
                aVar.f50815g = baseline;
            }
            int iMakeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
            eVar.f50642h[3] = i16;
            iMakeMeasureSpec2 = iMakeMeasureSpec6;
            z10 = false;
            bVar = y.e.b.MATCH_CONSTRAINT;
            if (bVar4 == bVar) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (bVar5 == bVar) {
                z12 = true;
            } else {
                z12 = false;
            }
            bVar2 = y.e.b.MATCH_PARENT;
            if (bVar5 != bVar2) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (bVar4 != bVar2) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (z11) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (z12) {
                z16 = false;
            } else {
                z16 = false;
            }
            bVar3 = (b) view.getLayoutParams();
            if (aVar.f50818j) {
                if (view instanceof j) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                if (z9) {
                    int[] iArr1111114 = eVar.f50642h;
                    iArr1111114[0] = measuredWidth;
                    iArr1111114[2] = measuredHeight;
                } else {
                    int[] iArr1111115 = eVar.f50642h;
                    iArr1111115[0] = 0;
                    iArr1111115[2] = 0;
                }
                if (z10) {
                    int[] iArr1111116 = eVar.f50642h;
                    iArr1111116[1] = measuredHeight;
                    iArr1111116[3] = measuredWidth;
                } else {
                    int[] iArr1111117 = eVar.f50642h;
                    iArr1111117[1] = 0;
                    iArr1111117[3] = 0;
                }
                i11 = eVar.f50656o;
                if (i11 > 0) {
                    measuredWidth2 = Math.max(i11, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                i12 = eVar.f50658p;
                if (i12 > 0) {
                    measuredWidth2 = Math.min(i12, measuredWidth2);
                }
                i13 = eVar.f50662r;
                if (i13 > 0) {
                    measuredHeight2 = Math.max(i13, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i14 = eVar.f50664s;
                if (i14 > 0) {
                    measuredHeight2 = Math.min(i14, measuredHeight2);
                }
                if (!z15) {
                    if (z16) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                    }
                } else if (z16) {
                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
            } else {
                if (view instanceof j) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                if (z9) {
                    int[] iArr1111118 = eVar.f50642h;
                    iArr1111118[0] = measuredWidth;
                    iArr1111118[2] = measuredHeight;
                } else {
                    int[] iArr1111119 = eVar.f50642h;
                    iArr1111119[0] = 0;
                    iArr1111119[2] = 0;
                }
                if (z10) {
                    int[] iArr11111110 = eVar.f50642h;
                    iArr11111110[1] = measuredHeight;
                    iArr11111110[3] = measuredWidth;
                } else {
                    int[] iArr11111111 = eVar.f50642h;
                    iArr11111111[1] = 0;
                    iArr11111111[3] = 0;
                }
                i11 = eVar.f50656o;
                if (i11 > 0) {
                    measuredWidth2 = Math.max(i11, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                i12 = eVar.f50658p;
                if (i12 > 0) {
                    measuredWidth2 = Math.min(i12, measuredWidth2);
                }
                i13 = eVar.f50662r;
                if (i13 > 0) {
                    measuredHeight2 = Math.max(i13, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i14 = eVar.f50664s;
                if (i14 > 0) {
                    measuredHeight2 = Math.min(i14, measuredHeight2);
                }
                if (!z15) {
                    if (z16) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                    }
                } else if (z16) {
                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f50618Q) + 0.5f);
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
            }
            if (baseline != -1) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (measuredWidth2 == aVar.f50811c) {
                z18 = true;
            } else {
                z18 = true;
            }
            aVar.f50817i = z18;
            if (bVar3.f8522Y) {
                z17 = true;
            }
            if (z17) {
                aVar.f50817i = true;
            }
            aVar.f50813e = measuredWidth2;
            aVar.f50814f = measuredHeight2;
            aVar.f50816h = z17;
            aVar.f50815g = baseline;
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f8567b = i12;
            this.f8568c = i13;
            this.f8569d = i14;
            this.f8570e = i15;
            this.f8571f = i10;
            this.f8572g = i11;
        }
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8482a = new SparseArray();
        this.f8483b = new ArrayList(4);
        this.f8484c = new p240y.f();
        this.f8485d = 0;
        this.f8486e = 0;
        this.f8487f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f8488g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f8489h = true;
        this.f8490i = 263;
        this.f8491j = null;
        this.f8492k = null;
        this.f8493l = -1;
        this.f8494m = new HashMap();
        this.f8495v = -1;
        this.f8496w = -1;
        this.f8474G = -1;
        this.f8475H = -1;
        this.f8476I = 0;
        this.f8477J = 0;
        this.f8478K = new SparseArray();
        this.f8479L = new c(this);
        this.f8480M = 0;
        this.f8481N = 0;
        j(attributeSet, 0, 0);
    }

    private final p240y.e g(int i10) {
        if (i10 == 0) {
            return this.f8484c;
        }
        View viewFindViewById = (View) this.f8482a.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f8484c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f8551n0;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    private void j(AttributeSet attributeSet, int i10, int i11) {
        this.f8484c.c0(this);
        this.f8484c.f1(this.f8479L);
        this.f8482a.put(getId(), this);
        this.f8491j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f8875a1, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == i.f8945k1) {
                    this.f8485d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8485d);
                } else if (index == i.f8952l1) {
                    this.f8486e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8486e);
                } else if (index == i.f8931i1) {
                    this.f8487f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8487f);
                } else if (index == i.f8938j1) {
                    this.f8488g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8488g);
                } else if (index == i.f8786L2) {
                    this.f8490i = typedArrayObtainStyledAttributes.getInt(index, this.f8490i);
                } else if (index == i.f8791M1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f8492k = null;
                        }
                    }
                } else if (index == i.f9001s1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.f8491j = eVar;
                        eVar.k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f8491j = null;
                    }
                    this.f8493l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f8484c.g1(this.f8490i);
    }

    private void l() {
        this.f8489h = true;
        this.f8495v = -1;
        this.f8496w = -1;
        this.f8474G = -1;
        this.f8475H = -1;
        this.f8476I = 0;
        this.f8477J = 0;
    }

    private void p() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            p240y.e eVarI = i(getChildAt(i10));
            if (eVarI != null) {
                eVarI.Y();
            }
        }
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    g(childAt.getId()).d0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f8493l != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                getChildAt(i12).getId();
            }
        }
        e eVar = this.f8491j;
        if (eVar != null) {
            eVar.d(this, true);
        }
        this.f8484c.M0();
        int size = this.f8483b.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                ((androidx.constraintlayout.widget.c) this.f8483b.get(i13)).l(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            getChildAt(i14);
        }
        this.f8478K.clear();
        this.f8478K.put(0, this.f8484c);
        this.f8478K.put(getId(), this.f8484c);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            this.f8478K.put(childAt2.getId(), i(childAt2));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt3 = getChildAt(i16);
            p240y.e eVarI2 = i(childAt3);
            if (eVarI2 != null) {
                b bVar = (b) childAt3.getLayoutParams();
                this.f8484c.a(eVarI2);
                c(zIsInEditMode, childAt3, eVarI2, bVar, this.f8478K);
            }
        }
    }

    private boolean s() {
        int childCount = getChildCount();
        boolean z9 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt(i10).isLayoutRequested()) {
                z9 = true;
                break;
            }
        }
        if (z9) {
            p();
        }
        return z9;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a1  */
    protected void c(boolean z9, View view, p240y.e eVar, b bVar, SparseArray sparseArray) {
        p240y.e eVar2;
        p240y.e eVar3;
        p240y.e eVar4;
        p240y.e eVar5;
        p240y.e eVar6;
        int i10;
        float f10;
        View view2;
        p240y.e eVar7;
        int i11;
        bVar.a();
        bVar.f8553o0 = false;
        eVar.D0(view.getVisibility());
        if (bVar.f8527b0) {
            eVar.p0(true);
            eVar.D0(8);
        }
        eVar.c0(view);
        if (view instanceof androidx.constraintlayout.widget.c) {
            ((androidx.constraintlayout.widget.c) view).h(eVar, this.f8484c.a1());
        }
        if (bVar.f8523Z) {
            p240y.h hVar = (p240y.h) eVar;
            int i12 = bVar.f8545k0;
            int i13 = bVar.f8547l0;
            float f11 = bVar.f8549m0;
            if (f11 != -1.0f) {
                hVar.Q0(f11);
                return;
            } else if (i12 != -1) {
                hVar.O0(i12);
                return;
            } else {
                if (i13 != -1) {
                    hVar.P0(i13);
                    return;
                }
                return;
            }
        }
        int i14 = bVar.f8531d0;
        int i15 = bVar.f8533e0;
        int i16 = bVar.f8535f0;
        int i17 = bVar.f8537g0;
        int i18 = bVar.f8539h0;
        int i19 = bVar.f8541i0;
        float f12 = bVar.f8543j0;
        int i20 = bVar.f8548m;
        if (i20 != -1) {
            p240y.e eVar8 = (p240y.e) sparseArray.get(i20);
            if (eVar8 != null) {
                eVar.k(eVar8, bVar.f8552o, bVar.f8550n);
            }
            eVar6 = eVar;
        } else {
            if (i14 != -1) {
                p240y.e eVar9 = (p240y.e) sparseArray.get(i14);
                if (eVar9 != null) {
                    y.d.b bVar2 = y.d.b.LEFT;
                    eVar.T(bVar2, eVar9, bVar2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i18);
                }
            } else if (i15 != -1 && (eVar2 = (p240y.e) sparseArray.get(i15)) != null) {
                eVar.T(y.d.b.LEFT, eVar2, y.d.b.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i18);
            }
            if (i16 != -1) {
                p240y.e eVar10 = (p240y.e) sparseArray.get(i16);
                if (eVar10 != null) {
                    eVar.T(y.d.b.RIGHT, eVar10, y.d.b.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i19);
                }
            } else if (i17 != -1 && (eVar3 = (p240y.e) sparseArray.get(i17)) != null) {
                y.d.b bVar3 = y.d.b.RIGHT;
                eVar.T(bVar3, eVar3, bVar3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i19);
            }
            int i21 = bVar.f8538h;
            if (i21 != -1) {
                p240y.e eVar11 = (p240y.e) sparseArray.get(i21);
                if (eVar11 != null) {
                    y.d.b bVar4 = y.d.b.TOP;
                    eVar.T(bVar4, eVar11, bVar4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f8559u);
                }
            } else {
                int i22 = bVar.f8540i;
                if (i22 != -1 && (eVar4 = (p240y.e) sparseArray.get(i22)) != null) {
                    eVar.T(y.d.b.TOP, eVar4, y.d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f8559u);
                }
            }
            int i23 = bVar.f8542j;
            if (i23 != -1) {
                p240y.e eVar12 = (p240y.e) sparseArray.get(i23);
                if (eVar12 != null) {
                    eVar.T(y.d.b.BOTTOM, eVar12, y.d.b.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f8561w);
                }
            } else {
                int i24 = bVar.f8544k;
                if (i24 != -1 && (eVar5 = (p240y.e) sparseArray.get(i24)) != null) {
                    y.d.b bVar5 = y.d.b.BOTTOM;
                    eVar6 = eVar;
                    eVar6.T(bVar5, eVar5, bVar5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f8561w);
                }
                i10 = bVar.f8546l;
                if (i10 != -1) {
                    view2 = (View) this.f8482a.get(i10);
                    eVar7 = (p240y.e) sparseArray.get(bVar.f8546l);
                    if (eVar7 != null && view2 != null && (view2.getLayoutParams() instanceof b)) {
                        b bVar6 = (b) view2.getLayoutParams();
                        bVar.f8522Y = true;
                        bVar6.f8522Y = true;
                        y.d.b bVar7 = y.d.b.BASELINE;
                        eVar6.m(bVar7).b(eVar7.m(bVar7), 0, -1, true);
                        eVar6.g0(true);
                        bVar6.f8551n0.g0(true);
                        eVar6.m(y.d.b.TOP).l();
                        eVar6.m(y.d.b.BOTTOM).l();
                    }
                }
                if (f12 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    eVar6.i0(f12);
                }
                f10 = bVar.f8498A;
                if (f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    eVar6.x0(f10);
                }
            }
            eVar6 = eVar;
            i10 = bVar.f8546l;
            if (i10 != -1) {
                view2 = (View) this.f8482a.get(i10);
                eVar7 = (p240y.e) sparseArray.get(bVar.f8546l);
                if (eVar7 != null) {
                    b bVar8 = (b) view2.getLayoutParams();
                    bVar.f8522Y = true;
                    bVar8.f8522Y = true;
                    y.d.b bVar9 = y.d.b.BASELINE;
                    eVar6.m(bVar9).b(eVar7.m(bVar9), 0, -1, true);
                    eVar6.g0(true);
                    bVar8.f8551n0.g0(true);
                    eVar6.m(y.d.b.TOP).l();
                    eVar6.m(y.d.b.BOTTOM).l();
                }
            }
            if (f12 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                eVar6.i0(f12);
            }
            f10 = bVar.f8498A;
            if (f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                eVar6.x0(f10);
            }
        }
        if (z9 && ((i11 = bVar.f8514Q) != -1 || bVar.f8515R != -1)) {
            eVar6.v0(i11, bVar.f8515R);
        }
        if (bVar.f8520W) {
            eVar6.l0(y.e.b.FIXED);
            eVar6.E0(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar6.l0(y.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
            if (bVar.f8517T) {
                eVar6.l0(y.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.l0(y.e.b.MATCH_PARENT);
            }
            eVar6.m(y.d.b.LEFT).f50587e = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            eVar6.m(y.d.b.RIGHT).f50587e = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            eVar6.l0(y.e.b.MATCH_CONSTRAINT);
            eVar6.E0(0);
        }
        if (bVar.f8521X) {
            eVar6.A0(y.e.b.FIXED);
            eVar6.h0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar6.A0(y.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
            if (bVar.f8518U) {
                eVar6.A0(y.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.A0(y.e.b.MATCH_PARENT);
            }
            eVar6.m(y.d.b.TOP).f50587e = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            eVar6.m(y.d.b.BOTTOM).f50587e = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            eVar6.A0(y.e.b.MATCH_CONSTRAINT);
            eVar6.h0(0);
        }
        eVar6.e0(bVar.f8499B);
        eVar6.n0(bVar.f8502E);
        eVar6.C0(bVar.f8503F);
        eVar6.j0(bVar.f8504G);
        eVar6.y0(bVar.f8505H);
        eVar6.m0(bVar.f8506I, bVar.f8508K, bVar.f8510M, bVar.f8512O);
        eVar6.B0(bVar.f8507J, bVar.f8509L, bVar.f8511N, bVar.f8513P);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f8483b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.constraintlayout.widget.c) this.f8483b.get(i10)).k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        int i17 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + i17;
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.f8494m;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f8494m.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        l();
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.f8488g;
    }

    public int getMaxWidth() {
        return this.f8487f;
    }

    public int getMinHeight() {
        return this.f8486e;
    }

    public int getMinWidth() {
        return this.f8485d;
    }

    public int getOptimizationLevel() {
        return this.f8484c.V0();
    }

    public View h(int i10) {
        return (View) this.f8482a.get(i10);
    }

    public final p240y.e i(View view) {
        if (view == this) {
            return this.f8484c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f8551n0;
    }

    protected boolean k() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    protected void m(int i10) {
        this.f8492k = new d(getContext(), this, i10);
    }

    protected void n(int i10, int i11, int i12, int i13, boolean z9, boolean z10) {
        c cVar = this.f8479L;
        int i14 = cVar.f8570e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f8569d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.f8487f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f8488g, iResolveSizeAndState2);
        if (z9) {
            iMin |= 16777216;
        }
        if (z10) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f8495v = iMin;
        this.f8496w = iMin2;
    }

    protected void o(p240y.f fVar, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i14 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f8479L.c(i11, i12, iMax, iMax2, paddingWidth, i14);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (k()) {
                i13 = iMax4;
            }
            int i15 = size - paddingWidth;
            int i16 = size2 - i14;
            r(fVar, mode, i15, mode2, i16);
            fVar.c1(i10, mode, i15, mode2, i16, this.f8495v, this.f8496w, i13, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i13 = iMax3;
        int i17 = size - paddingWidth;
        int i18 = size2 - i14;
        r(fVar, mode, i17, mode2, i18);
        fVar.c1(i10, mode, i17, mode2, i18, this.f8495v, this.f8496w, i13, iMax);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            p240y.e eVar = bVar.f8551n0;
            if ((childAt.getVisibility() != 8 || bVar.f8523Z || bVar.f8525a0 || bVar.f8529c0 || zIsInEditMode) && !bVar.f8527b0) {
                int iQ = eVar.Q();
                int iR = eVar.R();
                childAt.layout(iQ, iR, eVar.P() + iQ, eVar.v() + iR);
            }
        }
        int size = this.f8483b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((androidx.constraintlayout.widget.c) this.f8483b.get(i15)).i(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        this.f8480M = i10;
        this.f8481N = i11;
        this.f8484c.h1(k());
        if (this.f8489h) {
            this.f8489h = false;
            if (s()) {
                this.f8484c.j1();
            }
        }
        o(this.f8484c, this.f8490i, i10, i11);
        n(i10, i11, this.f8484c.P(), this.f8484c.v(), this.f8484c.b1(), this.f8484c.Z0());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        p240y.e eVarI = i(view);
        if ((view instanceof g) && !(eVarI instanceof p240y.h)) {
            b bVar = (b) view.getLayoutParams();
            p240y.h hVar = new p240y.h();
            bVar.f8551n0 = hVar;
            bVar.f8523Z = true;
            hVar.R0(bVar.f8516S);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.m();
            ((b) view.getLayoutParams()).f8525a0 = true;
            if (!this.f8483b.contains(cVar)) {
                this.f8483b.add(cVar);
            }
        }
        this.f8482a.put(view.getId(), view);
        this.f8489h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f8482a.remove(view.getId());
        this.f8484c.L0(i(view));
        this.f8483b.remove(view);
        this.f8489h = true;
    }

    public void q(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f8494m == null) {
                this.f8494m = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.f8494m.put(strSubstring, num);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 y.e$b) = (r2v3 y.e$b), (r2v0 y.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    protected void r(p240y.f fVar, int i10, int i11, int i12, int i13) {
        y.e.b bVar;
        c cVar = this.f8479L;
        int i14 = cVar.f8570e;
        int i15 = cVar.f8569d;
        y.e.b bVar2 = y.e.b.FIXED;
        int childCount = getChildCount();
        if (i10 == Integer.MIN_VALUE) {
            bVar = y.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f8485d);
            }
        } else if (i10 == 0) {
            bVar = y.e.b.WRAP_CONTENT;
            i11 = childCount == 0 ? Math.max(0, this.f8485d) : 0;
        } else if (i10 != 1073741824) {
            bVar = bVar2;
        } else {
            i11 = Math.min(this.f8487f - i15, i11);
            bVar = bVar2;
        }
        if (i12 == Integer.MIN_VALUE) {
            bVar2 = y.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f8486e);
            }
        } else if (i12 == 0) {
            bVar2 = y.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f8486e);
            } else {
                i13 = 0;
            }
        } else if (i12 != 1073741824) {
            i13 = 0;
        } else {
            i13 = Math.min(this.f8488g - i14, i13);
        }
        if (i11 != fVar.P() || i13 != fVar.v()) {
            fVar.Y0();
        }
        fVar.F0(0);
        fVar.G0(0);
        fVar.s0(this.f8487f - i15);
        fVar.r0(this.f8488g - i14);
        fVar.u0(0);
        fVar.t0(0);
        fVar.l0(bVar);
        fVar.E0(i11);
        fVar.A0(bVar2);
        fVar.h0(i13);
        fVar.u0(this.f8485d - i15);
        fVar.t0(this.f8486e - i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public void setConstraintSet(e eVar) {
        this.f8491j = eVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f8482a.remove(getId());
        super.setId(i10);
        this.f8482a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f8488g) {
            return;
        }
        this.f8488g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f8487f) {
            return;
        }
        this.f8487f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f8486e) {
            return;
        }
        this.f8486e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f8485d) {
            return;
        }
        this.f8485d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        d dVar = this.f8492k;
        if (dVar != null) {
            dVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f8490i = i10;
        this.f8484c.g1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8482a = new SparseArray();
        this.f8483b = new ArrayList(4);
        this.f8484c = new p240y.f();
        this.f8485d = 0;
        this.f8486e = 0;
        this.f8487f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f8488g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f8489h = true;
        this.f8490i = 263;
        this.f8491j = null;
        this.f8492k = null;
        this.f8493l = -1;
        this.f8494m = new HashMap();
        this.f8495v = -1;
        this.f8496w = -1;
        this.f8474G = -1;
        this.f8475H = -1;
        this.f8476I = 0;
        this.f8477J = 0;
        this.f8478K = new SparseArray();
        this.f8479L = new c(this);
        this.f8480M = 0;
        this.f8481N = 0;
        j(attributeSet, i10, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public float f8498A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public String f8499B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        float f8500C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        int f8501D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public float f8502E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public float f8503F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public int f8504G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f8505H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f8506I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f8507J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public int f8508K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public int f8509L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f8510M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f8511N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public float f8512O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public float f8513P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f8514Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f8515R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f8516S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public boolean f8517T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public boolean f8518U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public String f8519V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        boolean f8520W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        boolean f8521X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        boolean f8522Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        boolean f8523Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8524a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        boolean f8525a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8526b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        boolean f8527b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f8528c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        boolean f8529c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8530d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        int f8531d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8532e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        int f8533e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8534f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        int f8535f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8536g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        int f8537g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8538h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        int f8539h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8540i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        int f8541i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f8542j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        float f8543j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f8544k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        int f8545k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f8546l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        int f8547l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f8548m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        float f8549m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f8550n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        p240y.e f8551n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f8552o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f8553o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f8554p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f8555q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f8556r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f8557s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f8558t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f8559u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f8560v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f8561w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f8562x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f8563y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f8564z;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f8565a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f8565a = sparseIntArray;
                sparseIntArray.append(i.f8953l2, 8);
                sparseIntArray.append(i.f8960m2, 9);
                sparseIntArray.append(i.f8974o2, 10);
                sparseIntArray.append(i.f8981p2, 11);
                sparseIntArray.append(i.f9023v2, 12);
                sparseIntArray.append(i.f9016u2, 13);
                sparseIntArray.append(i.f8833T1, 14);
                sparseIntArray.append(i.f8827S1, 15);
                sparseIntArray.append(i.f8815Q1, 16);
                sparseIntArray.append(i.f8839U1, 2);
                sparseIntArray.append(i.f8851W1, 3);
                sparseIntArray.append(i.f8845V1, 4);
                sparseIntArray.append(i.f8738D2, 49);
                sparseIntArray.append(i.f8744E2, 50);
                sparseIntArray.append(i.f8876a2, 5);
                sparseIntArray.append(i.f8883b2, 6);
                sparseIntArray.append(i.f8890c2, 7);
                sparseIntArray.append(i.f8882b1, 1);
                sparseIntArray.append(i.f8988q2, 17);
                sparseIntArray.append(i.f8995r2, 18);
                sparseIntArray.append(i.f8869Z1, 19);
                sparseIntArray.append(i.f8863Y1, 20);
                sparseIntArray.append(i.f8762H2, 21);
                sparseIntArray.append(i.f8780K2, 22);
                sparseIntArray.append(i.f8768I2, 23);
                sparseIntArray.append(i.f8750F2, 24);
                sparseIntArray.append(i.f8774J2, 25);
                sparseIntArray.append(i.f8756G2, 26);
                sparseIntArray.append(i.f8925h2, 29);
                sparseIntArray.append(i.f9030w2, 30);
                sparseIntArray.append(i.f8857X1, 44);
                sparseIntArray.append(i.f8939j2, 45);
                sparseIntArray.append(i.f9042y2, 46);
                sparseIntArray.append(i.f8932i2, 47);
                sparseIntArray.append(i.f9036x2, 48);
                sparseIntArray.append(i.f8803O1, 27);
                sparseIntArray.append(i.f8797N1, 28);
                sparseIntArray.append(i.f9048z2, 31);
                sparseIntArray.append(i.f8897d2, 32);
                sparseIntArray.append(i.f8726B2, 33);
                sparseIntArray.append(i.f8720A2, 34);
                sparseIntArray.append(i.f8732C2, 35);
                sparseIntArray.append(i.f8911f2, 36);
                sparseIntArray.append(i.f8904e2, 37);
                sparseIntArray.append(i.f8918g2, 38);
                sparseIntArray.append(i.f8946k2, 39);
                sparseIntArray.append(i.f9009t2, 40);
                sparseIntArray.append(i.f8967n2, 41);
                sparseIntArray.append(i.f8821R1, 42);
                sparseIntArray.append(i.f8809P1, 43);
                sparseIntArray.append(i.f9002s2, 51);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            int i10;
            super(context, attributeSet);
            this.f8524a = -1;
            this.f8526b = -1;
            this.f8528c = -1.0f;
            this.f8530d = -1;
            this.f8532e = -1;
            this.f8534f = -1;
            this.f8536g = -1;
            this.f8538h = -1;
            this.f8540i = -1;
            this.f8542j = -1;
            this.f8544k = -1;
            this.f8546l = -1;
            this.f8548m = -1;
            this.f8550n = 0;
            this.f8552o = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f8554p = -1;
            this.f8555q = -1;
            this.f8556r = -1;
            this.f8557s = -1;
            this.f8558t = -1;
            this.f8559u = -1;
            this.f8560v = -1;
            this.f8561w = -1;
            this.f8562x = -1;
            this.f8563y = -1;
            this.f8564z = 0.5f;
            this.f8498A = 0.5f;
            this.f8499B = null;
            this.f8500C = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f8501D = 1;
            this.f8502E = -1.0f;
            this.f8503F = -1.0f;
            this.f8504G = 0;
            this.f8505H = 0;
            this.f8506I = 0;
            this.f8507J = 0;
            this.f8508K = 0;
            this.f8509L = 0;
            this.f8510M = 0;
            this.f8511N = 0;
            this.f8512O = 1.0f;
            this.f8513P = 1.0f;
            this.f8514Q = -1;
            this.f8515R = -1;
            this.f8516S = -1;
            this.f8517T = false;
            this.f8518U = false;
            this.f8519V = null;
            this.f8520W = true;
            this.f8521X = true;
            this.f8522Y = false;
            this.f8523Z = false;
            this.f8525a0 = false;
            this.f8527b0 = false;
            this.f8529c0 = false;
            this.f8531d0 = -1;
            this.f8533e0 = -1;
            this.f8535f0 = -1;
            this.f8537g0 = -1;
            this.f8539h0 = -1;
            this.f8541i0 = -1;
            this.f8543j0 = 0.5f;
            this.f8551n0 = new p240y.e();
            this.f8553o0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f8875a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                int i12 = a.f8565a.get(index);
                switch (i12) {
                    case 1:
                        this.f8516S = typedArrayObtainStyledAttributes.getInt(index, this.f8516S);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f8548m);
                        this.f8548m = resourceId;
                        if (resourceId == -1) {
                            this.f8548m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f8550n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8550n);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f8552o) % 360.0f;
                        this.f8552o = f10;
                        if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            this.f8552o = (360.0f - f10) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f8524a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8524a);
                        break;
                    case 6:
                        this.f8526b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8526b);
                        break;
                    case 7:
                        this.f8528c = typedArrayObtainStyledAttributes.getFloat(index, this.f8528c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8530d);
                        this.f8530d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f8530d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8532e);
                        this.f8532e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f8532e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8534f);
                        this.f8534f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f8534f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8536g);
                        this.f8536g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f8536g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8538h);
                        this.f8538h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f8538h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8540i);
                        this.f8540i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f8540i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8542j);
                        this.f8542j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f8542j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8544k);
                        this.f8544k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f8544k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8546l);
                        this.f8546l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f8546l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8554p);
                        this.f8554p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f8554p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8555q);
                        this.f8555q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f8555q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8556r);
                        this.f8556r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f8556r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f8557s);
                        this.f8557s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f8557s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f8558t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8558t);
                        break;
                    case 22:
                        this.f8559u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8559u);
                        break;
                    case 23:
                        this.f8560v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8560v);
                        break;
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        this.f8561w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8561w);
                        break;
                    case 25:
                        this.f8562x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8562x);
                        break;
                    case 26:
                        this.f8563y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8563y);
                        break;
                    case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        this.f8517T = typedArrayObtainStyledAttributes.getBoolean(index, this.f8517T);
                        break;
                    case 28:
                        this.f8518U = typedArrayObtainStyledAttributes.getBoolean(index, this.f8518U);
                        break;
                    case 29:
                        this.f8564z = typedArrayObtainStyledAttributes.getFloat(index, this.f8564z);
                        break;
                    case 30:
                        this.f8498A = typedArrayObtainStyledAttributes.getFloat(index, this.f8498A);
                        break;
                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f8506I = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                        int i14 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f8507J = i14;
                        if (i14 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f8508K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8508K);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f8508K) == -2) {
                                this.f8508K = -2;
                            }
                        }
                        break;
                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        try {
                            this.f8510M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8510M);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f8510M) == -2) {
                                this.f8510M = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f8512O = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, typedArrayObtainStyledAttributes.getFloat(index, this.f8512O));
                        this.f8506I = 2;
                        break;
                    case 36:
                        try {
                            this.f8509L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8509L);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f8509L) == -2) {
                                this.f8509L = -2;
                            }
                        }
                        break;
                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        try {
                            this.f8511N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8511N);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f8511N) == -2) {
                                this.f8511N = -2;
                            }
                        }
                        break;
                    case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                        this.f8513P = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, typedArrayObtainStyledAttributes.getFloat(index, this.f8513P));
                        this.f8507J = 2;
                        break;
                    default:
                        switch (i12) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.f8499B = string;
                                this.f8500C = Float.NaN;
                                this.f8501D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.f8499B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i10 = 0;
                                    } else {
                                        String strSubstring = this.f8499B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.f8501D = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.f8501D = 1;
                                        }
                                        i10 = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.f8499B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.f8499B.substring(i10);
                                        if (strSubstring2.length() > 0) {
                                            this.f8500C = Float.parseFloat(strSubstring2);
                                        }
                                    } else {
                                        String strSubstring3 = this.f8499B.substring(i10, iIndexOf2);
                                        String strSubstring4 = this.f8499B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                            try {
                                                float f11 = Float.parseFloat(strSubstring3);
                                                float f12 = Float.parseFloat(strSubstring4);
                                                if (f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                    if (this.f8501D == 1) {
                                                        this.f8500C = Math.abs(f12 / f11);
                                                    } else {
                                                        this.f8500C = Math.abs(f11 / f12);
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                            }
                                        }
                                    }
                                }
                                break;
                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                this.f8502E = typedArrayObtainStyledAttributes.getFloat(index, this.f8502E);
                                break;
                            case 46:
                                this.f8503F = typedArrayObtainStyledAttributes.getFloat(index, this.f8503F);
                                break;
                            case 47:
                                this.f8504G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f8505H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f8514Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8514Q);
                                break;
                            case 50:
                                this.f8515R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8515R);
                                break;
                            case 51:
                                this.f8519V = typedArrayObtainStyledAttributes.getString(index);
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.f8523Z = false;
            this.f8520W = true;
            this.f8521X = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f8517T) {
                this.f8520W = false;
                if (this.f8506I == 0) {
                    this.f8506I = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f8518U) {
                this.f8521X = false;
                if (this.f8507J == 0) {
                    this.f8507J = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f8520W = false;
                if (i10 == 0 && this.f8506I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f8517T = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f8521X = false;
                if (i11 == 0 && this.f8507J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f8518U = true;
                }
            }
            if (this.f8528c == -1.0f && this.f8524a == -1 && this.f8526b == -1) {
                return;
            }
            this.f8523Z = true;
            this.f8520W = true;
            this.f8521X = true;
            if (!(this.f8551n0 instanceof p240y.h)) {
                this.f8551n0 = new p240y.h();
            }
            ((p240y.h) this.f8551n0).R0(this.f8516S);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0048  */
        /* JADX WARN: Code duplicated, block: B:20:0x004f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0056  */
        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x0062  */
        /* JADX WARN: Code duplicated, block: B:36:0x0074  */
        /* JADX WARN: Code duplicated, block: B:37:0x007c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x007e  */
        /* JADX WARN: Code duplicated, block: B:39:0x0085 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0087  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public void resolveLayoutDirection(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i16 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i10);
            boolean z9 = false;
            boolean z10 = 1 == getLayoutDirection();
            this.f8535f0 = -1;
            this.f8537g0 = -1;
            this.f8531d0 = -1;
            this.f8533e0 = -1;
            this.f8539h0 = this.f8558t;
            this.f8541i0 = this.f8560v;
            float f10 = this.f8564z;
            this.f8543j0 = f10;
            int i17 = this.f8524a;
            this.f8545k0 = i17;
            int i18 = this.f8526b;
            this.f8547l0 = i18;
            float f11 = this.f8528c;
            this.f8549m0 = f11;
            if (z10) {
                int i19 = this.f8554p;
                if (i19 != -1) {
                    this.f8535f0 = i19;
                } else {
                    int i20 = this.f8555q;
                    if (i20 != -1) {
                        this.f8537g0 = i20;
                    } else {
                        i11 = this.f8556r;
                        if (i11 != -1) {
                            this.f8533e0 = i11;
                            z9 = true;
                        }
                        i12 = this.f8557s;
                        if (i12 != -1) {
                            this.f8531d0 = i12;
                            z9 = true;
                        }
                        i13 = this.f8562x;
                        if (i13 != -1) {
                            this.f8541i0 = i13;
                        }
                        i14 = this.f8563y;
                        if (i14 != -1) {
                            this.f8539h0 = i14;
                        }
                        if (z9) {
                            this.f8543j0 = 1.0f - f10;
                        }
                        if (this.f8523Z && this.f8516S == 1) {
                            if (f11 != -1.0f) {
                                this.f8549m0 = 1.0f - f11;
                                this.f8545k0 = -1;
                                this.f8547l0 = -1;
                            } else if (i17 != -1) {
                                this.f8547l0 = i17;
                                this.f8545k0 = -1;
                                this.f8549m0 = -1.0f;
                            } else if (i18 != -1) {
                                this.f8545k0 = i18;
                                this.f8547l0 = -1;
                                this.f8549m0 = -1.0f;
                            }
                        }
                    }
                }
                z9 = true;
                i11 = this.f8556r;
                if (i11 != -1) {
                    this.f8533e0 = i11;
                    z9 = true;
                }
                i12 = this.f8557s;
                if (i12 != -1) {
                    this.f8531d0 = i12;
                    z9 = true;
                }
                i13 = this.f8562x;
                if (i13 != -1) {
                    this.f8541i0 = i13;
                }
                i14 = this.f8563y;
                if (i14 != -1) {
                    this.f8539h0 = i14;
                }
                if (z9) {
                    this.f8543j0 = 1.0f - f10;
                }
                if (this.f8523Z) {
                    if (f11 != -1.0f) {
                        this.f8549m0 = 1.0f - f11;
                        this.f8545k0 = -1;
                        this.f8547l0 = -1;
                    } else if (i17 != -1) {
                        this.f8547l0 = i17;
                        this.f8545k0 = -1;
                        this.f8549m0 = -1.0f;
                    } else if (i18 != -1) {
                        this.f8545k0 = i18;
                        this.f8547l0 = -1;
                        this.f8549m0 = -1.0f;
                    }
                }
            } else {
                int i21 = this.f8554p;
                if (i21 != -1) {
                    this.f8533e0 = i21;
                }
                int i22 = this.f8555q;
                if (i22 != -1) {
                    this.f8531d0 = i22;
                }
                int i23 = this.f8556r;
                if (i23 != -1) {
                    this.f8535f0 = i23;
                }
                int i24 = this.f8557s;
                if (i24 != -1) {
                    this.f8537g0 = i24;
                }
                int i25 = this.f8562x;
                if (i25 != -1) {
                    this.f8539h0 = i25;
                }
                int i26 = this.f8563y;
                if (i26 != -1) {
                    this.f8541i0 = i26;
                }
            }
            if (this.f8556r == -1 && this.f8557s == -1 && this.f8555q == -1 && this.f8554p == -1) {
                int i27 = this.f8534f;
                if (i27 != -1) {
                    this.f8535f0 = i27;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                    }
                } else {
                    int i28 = this.f8536g;
                    if (i28 != -1) {
                        this.f8537g0 = i28;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                        }
                    }
                }
                int i29 = this.f8530d;
                if (i29 != -1) {
                    this.f8531d0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                    return;
                }
                int i30 = this.f8532e;
                if (i30 != -1) {
                    this.f8533e0 = i30;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                }
            }
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f8524a = -1;
            this.f8526b = -1;
            this.f8528c = -1.0f;
            this.f8530d = -1;
            this.f8532e = -1;
            this.f8534f = -1;
            this.f8536g = -1;
            this.f8538h = -1;
            this.f8540i = -1;
            this.f8542j = -1;
            this.f8544k = -1;
            this.f8546l = -1;
            this.f8548m = -1;
            this.f8550n = 0;
            this.f8552o = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f8554p = -1;
            this.f8555q = -1;
            this.f8556r = -1;
            this.f8557s = -1;
            this.f8558t = -1;
            this.f8559u = -1;
            this.f8560v = -1;
            this.f8561w = -1;
            this.f8562x = -1;
            this.f8563y = -1;
            this.f8564z = 0.5f;
            this.f8498A = 0.5f;
            this.f8499B = null;
            this.f8500C = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f8501D = 1;
            this.f8502E = -1.0f;
            this.f8503F = -1.0f;
            this.f8504G = 0;
            this.f8505H = 0;
            this.f8506I = 0;
            this.f8507J = 0;
            this.f8508K = 0;
            this.f8509L = 0;
            this.f8510M = 0;
            this.f8511N = 0;
            this.f8512O = 1.0f;
            this.f8513P = 1.0f;
            this.f8514Q = -1;
            this.f8515R = -1;
            this.f8516S = -1;
            this.f8517T = false;
            this.f8518U = false;
            this.f8519V = null;
            this.f8520W = true;
            this.f8521X = true;
            this.f8522Y = false;
            this.f8523Z = false;
            this.f8525a0 = false;
            this.f8527b0 = false;
            this.f8529c0 = false;
            this.f8531d0 = -1;
            this.f8533e0 = -1;
            this.f8535f0 = -1;
            this.f8537g0 = -1;
            this.f8539h0 = -1;
            this.f8541i0 = -1;
            this.f8543j0 = 0.5f;
            this.f8551n0 = new p240y.e();
            this.f8553o0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8524a = -1;
            this.f8526b = -1;
            this.f8528c = -1.0f;
            this.f8530d = -1;
            this.f8532e = -1;
            this.f8534f = -1;
            this.f8536g = -1;
            this.f8538h = -1;
            this.f8540i = -1;
            this.f8542j = -1;
            this.f8544k = -1;
            this.f8546l = -1;
            this.f8548m = -1;
            this.f8550n = 0;
            this.f8552o = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f8554p = -1;
            this.f8555q = -1;
            this.f8556r = -1;
            this.f8557s = -1;
            this.f8558t = -1;
            this.f8559u = -1;
            this.f8560v = -1;
            this.f8561w = -1;
            this.f8562x = -1;
            this.f8563y = -1;
            this.f8564z = 0.5f;
            this.f8498A = 0.5f;
            this.f8499B = null;
            this.f8500C = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f8501D = 1;
            this.f8502E = -1.0f;
            this.f8503F = -1.0f;
            this.f8504G = 0;
            this.f8505H = 0;
            this.f8506I = 0;
            this.f8507J = 0;
            this.f8508K = 0;
            this.f8509L = 0;
            this.f8510M = 0;
            this.f8511N = 0;
            this.f8512O = 1.0f;
            this.f8513P = 1.0f;
            this.f8514Q = -1;
            this.f8515R = -1;
            this.f8516S = -1;
            this.f8517T = false;
            this.f8518U = false;
            this.f8519V = null;
            this.f8520W = true;
            this.f8521X = true;
            this.f8522Y = false;
            this.f8523Z = false;
            this.f8525a0 = false;
            this.f8527b0 = false;
            this.f8529c0 = false;
            this.f8531d0 = -1;
            this.f8533e0 = -1;
            this.f8535f0 = -1;
            this.f8537g0 = -1;
            this.f8539h0 = -1;
            this.f8541i0 = -1;
            this.f8543j0 = 0.5f;
            this.f8551n0 = new p240y.e();
            this.f8553o0 = false;
        }
    }
}
