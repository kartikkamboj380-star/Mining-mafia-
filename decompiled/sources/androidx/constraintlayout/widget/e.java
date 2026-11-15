package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.ConnectionResult;
import com.google.protobuf.DescriptorProtos;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f8616d = {0, 4, 8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static SparseIntArray f8617e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap f8618a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8619b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap f8620c = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f8621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f8622b = new d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f8623c = new c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f8624d = new b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C0142e f8625e = new C0142e();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public HashMap f8626f = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i10, ConstraintLayout.b bVar) {
            this.f8621a = i10;
            b bVar2 = this.f8624d;
            bVar2.f8668h = bVar.f8530d;
            bVar2.f8670i = bVar.f8532e;
            bVar2.f8672j = bVar.f8534f;
            bVar2.f8674k = bVar.f8536g;
            bVar2.f8675l = bVar.f8538h;
            bVar2.f8676m = bVar.f8540i;
            bVar2.f8677n = bVar.f8542j;
            bVar2.f8678o = bVar.f8544k;
            bVar2.f8679p = bVar.f8546l;
            bVar2.f8680q = bVar.f8554p;
            bVar2.f8681r = bVar.f8555q;
            bVar2.f8682s = bVar.f8556r;
            bVar2.f8683t = bVar.f8557s;
            bVar2.f8684u = bVar.f8564z;
            bVar2.f8685v = bVar.f8498A;
            bVar2.f8686w = bVar.f8499B;
            bVar2.f8687x = bVar.f8548m;
            bVar2.f8688y = bVar.f8550n;
            bVar2.f8689z = bVar.f8552o;
            bVar2.f8628A = bVar.f8514Q;
            bVar2.f8629B = bVar.f8515R;
            bVar2.f8630C = bVar.f8516S;
            bVar2.f8666g = bVar.f8528c;
            bVar2.f8662e = bVar.f8524a;
            bVar2.f8664f = bVar.f8526b;
            bVar2.f8658c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f8660d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f8631D = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f8632E = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f8633F = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f8634G = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f8643P = bVar.f8503F;
            bVar2.f8644Q = bVar.f8502E;
            bVar2.f8646S = bVar.f8505H;
            bVar2.f8645R = bVar.f8504G;
            bVar2.f8669h0 = bVar.f8517T;
            bVar2.f8671i0 = bVar.f8518U;
            bVar2.f8647T = bVar.f8506I;
            bVar2.f8648U = bVar.f8507J;
            bVar2.f8649V = bVar.f8510M;
            bVar2.f8650W = bVar.f8511N;
            bVar2.f8651X = bVar.f8508K;
            bVar2.f8652Y = bVar.f8509L;
            bVar2.f8653Z = bVar.f8512O;
            bVar2.f8655a0 = bVar.f8513P;
            bVar2.f8667g0 = bVar.f8519V;
            bVar2.f8638K = bVar.f8559u;
            bVar2.f8640M = bVar.f8561w;
            bVar2.f8637J = bVar.f8558t;
            bVar2.f8639L = bVar.f8560v;
            bVar2.f8642O = bVar.f8562x;
            bVar2.f8641N = bVar.f8563y;
            bVar2.f8635H = bVar.getMarginEnd();
            this.f8624d.f8636I = bVar.getMarginStart();
        }

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f8624d;
            bVar.f8530d = bVar2.f8668h;
            bVar.f8532e = bVar2.f8670i;
            bVar.f8534f = bVar2.f8672j;
            bVar.f8536g = bVar2.f8674k;
            bVar.f8538h = bVar2.f8675l;
            bVar.f8540i = bVar2.f8676m;
            bVar.f8542j = bVar2.f8677n;
            bVar.f8544k = bVar2.f8678o;
            bVar.f8546l = bVar2.f8679p;
            bVar.f8554p = bVar2.f8680q;
            bVar.f8555q = bVar2.f8681r;
            bVar.f8556r = bVar2.f8682s;
            bVar.f8557s = bVar2.f8683t;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f8631D;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f8632E;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f8633F;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f8634G;
            bVar.f8562x = bVar2.f8642O;
            bVar.f8563y = bVar2.f8641N;
            bVar.f8559u = bVar2.f8638K;
            bVar.f8561w = bVar2.f8640M;
            bVar.f8564z = bVar2.f8684u;
            bVar.f8498A = bVar2.f8685v;
            bVar.f8548m = bVar2.f8687x;
            bVar.f8550n = bVar2.f8688y;
            bVar.f8552o = bVar2.f8689z;
            bVar.f8499B = bVar2.f8686w;
            bVar.f8514Q = bVar2.f8628A;
            bVar.f8515R = bVar2.f8629B;
            bVar.f8503F = bVar2.f8643P;
            bVar.f8502E = bVar2.f8644Q;
            bVar.f8505H = bVar2.f8646S;
            bVar.f8504G = bVar2.f8645R;
            bVar.f8517T = bVar2.f8669h0;
            bVar.f8518U = bVar2.f8671i0;
            bVar.f8506I = bVar2.f8647T;
            bVar.f8507J = bVar2.f8648U;
            bVar.f8510M = bVar2.f8649V;
            bVar.f8511N = bVar2.f8650W;
            bVar.f8508K = bVar2.f8651X;
            bVar.f8509L = bVar2.f8652Y;
            bVar.f8512O = bVar2.f8653Z;
            bVar.f8513P = bVar2.f8655a0;
            bVar.f8516S = bVar2.f8630C;
            bVar.f8528c = bVar2.f8666g;
            bVar.f8524a = bVar2.f8662e;
            bVar.f8526b = bVar2.f8664f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f8658c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f8660d;
            String str = bVar2.f8667g0;
            if (str != null) {
                bVar.f8519V = str;
            }
            bVar.setMarginStart(bVar2.f8636I);
            bVar.setMarginEnd(this.f8624d.f8635H);
            bVar.a();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f8624d.a(this.f8624d);
            aVar.f8623c.a(this.f8623c);
            aVar.f8622b.a(this.f8622b);
            aVar.f8625e.a(this.f8625e);
            aVar.f8621a = this.f8621a;
            return aVar;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        private static SparseIntArray f8627k0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8660d;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int[] f8663e0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public String f8665f0;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public String f8667g0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8654a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8656b = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8662e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8664f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f8666g = -1.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8668h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8670i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f8672j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f8674k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f8675l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f8676m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f8677n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f8678o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f8679p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f8680q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f8681r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f8682s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f8683t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f8684u = 0.5f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f8685v = 0.5f;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f8686w = null;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f8687x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f8688y = 0;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f8689z = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f8628A = -1;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f8629B = -1;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f8630C = -1;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f8631D = -1;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f8632E = -1;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public int f8633F = -1;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public int f8634G = -1;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f8635H = -1;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f8636I = -1;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f8637J = -1;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public int f8638K = -1;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public int f8639L = -1;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f8640M = -1;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f8641N = -1;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f8642O = -1;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public float f8643P = -1.0f;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public float f8644Q = -1.0f;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f8645R = 0;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f8646S = 0;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public int f8647T = 0;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public int f8648U = 0;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public int f8649V = -1;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public int f8650W = -1;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public int f8651X = -1;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f8652Y = -1;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public float f8653Z = 1.0f;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public float f8655a0 = 1.0f;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f8657b0 = -1;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f8659c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f8661d0 = -1;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public boolean f8669h0 = false;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public boolean f8671i0 = false;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public boolean f8673j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8627k0 = sparseIntArray;
            sparseIntArray.append(i.f8823R3, 24);
            f8627k0.append(i.f8829S3, 25);
            f8627k0.append(i.f8841U3, 28);
            f8627k0.append(i.f8847V3, 29);
            f8627k0.append(i.f8878a4, 35);
            f8627k0.append(i.f8871Z3, 34);
            f8627k0.append(i.f8733C3, 4);
            f8627k0.append(i.f8727B3, 3);
            f8627k0.append(i.f9049z3, 1);
            f8627k0.append(i.f8913f4, 6);
            f8627k0.append(i.f8920g4, 7);
            f8627k0.append(i.f8775J3, 17);
            f8627k0.append(i.f8781K3, 18);
            f8627k0.append(i.f8787L3, 19);
            f8627k0.append(i.f8947k3, 26);
            f8627k0.append(i.f8853W3, 31);
            f8627k0.append(i.f8859X3, 32);
            f8627k0.append(i.f8769I3, 10);
            f8627k0.append(i.f8763H3, 9);
            f8627k0.append(i.f8941j4, 13);
            f8627k0.append(i.f8962m4, 16);
            f8627k0.append(i.f8948k4, 14);
            f8627k0.append(i.f8927h4, 11);
            f8627k0.append(i.f8955l4, 15);
            f8627k0.append(i.f8934i4, 12);
            f8627k0.append(i.f8899d4, 38);
            f8627k0.append(i.f8811P3, 37);
            f8627k0.append(i.f8805O3, 39);
            f8627k0.append(i.f8892c4, 40);
            f8627k0.append(i.f8799N3, 20);
            f8627k0.append(i.f8885b4, 36);
            f8627k0.append(i.f8757G3, 5);
            f8627k0.append(i.f8817Q3, 76);
            f8627k0.append(i.f8865Y3, 76);
            f8627k0.append(i.f8835T3, 76);
            f8627k0.append(i.f8721A3, 76);
            f8627k0.append(i.f9043y3, 76);
            f8627k0.append(i.f8968n3, 23);
            f8627k0.append(i.f8982p3, 27);
            f8627k0.append(i.f8996r3, 30);
            f8627k0.append(i.f9003s3, 8);
            f8627k0.append(i.f8975o3, 33);
            f8627k0.append(i.f8989q3, 2);
            f8627k0.append(i.f8954l3, 22);
            f8627k0.append(i.f8961m3, 21);
            f8627k0.append(i.f8739D3, 61);
            f8627k0.append(i.f8751F3, 62);
            f8627k0.append(i.f8745E3, 63);
            f8627k0.append(i.f8906e4, 69);
            f8627k0.append(i.f8793M3, 70);
            f8627k0.append(i.f9031w3, 71);
            f8627k0.append(i.f9017u3, 72);
            f8627k0.append(i.f9024v3, 73);
            f8627k0.append(i.f9037x3, 74);
            f8627k0.append(i.f9010t3, 75);
        }

        public void a(b bVar) {
            this.f8654a = bVar.f8654a;
            this.f8658c = bVar.f8658c;
            this.f8656b = bVar.f8656b;
            this.f8660d = bVar.f8660d;
            this.f8662e = bVar.f8662e;
            this.f8664f = bVar.f8664f;
            this.f8666g = bVar.f8666g;
            this.f8668h = bVar.f8668h;
            this.f8670i = bVar.f8670i;
            this.f8672j = bVar.f8672j;
            this.f8674k = bVar.f8674k;
            this.f8675l = bVar.f8675l;
            this.f8676m = bVar.f8676m;
            this.f8677n = bVar.f8677n;
            this.f8678o = bVar.f8678o;
            this.f8679p = bVar.f8679p;
            this.f8680q = bVar.f8680q;
            this.f8681r = bVar.f8681r;
            this.f8682s = bVar.f8682s;
            this.f8683t = bVar.f8683t;
            this.f8684u = bVar.f8684u;
            this.f8685v = bVar.f8685v;
            this.f8686w = bVar.f8686w;
            this.f8687x = bVar.f8687x;
            this.f8688y = bVar.f8688y;
            this.f8689z = bVar.f8689z;
            this.f8628A = bVar.f8628A;
            this.f8629B = bVar.f8629B;
            this.f8630C = bVar.f8630C;
            this.f8631D = bVar.f8631D;
            this.f8632E = bVar.f8632E;
            this.f8633F = bVar.f8633F;
            this.f8634G = bVar.f8634G;
            this.f8635H = bVar.f8635H;
            this.f8636I = bVar.f8636I;
            this.f8637J = bVar.f8637J;
            this.f8638K = bVar.f8638K;
            this.f8639L = bVar.f8639L;
            this.f8640M = bVar.f8640M;
            this.f8641N = bVar.f8641N;
            this.f8642O = bVar.f8642O;
            this.f8643P = bVar.f8643P;
            this.f8644Q = bVar.f8644Q;
            this.f8645R = bVar.f8645R;
            this.f8646S = bVar.f8646S;
            this.f8647T = bVar.f8647T;
            this.f8648U = bVar.f8648U;
            this.f8649V = bVar.f8649V;
            this.f8650W = bVar.f8650W;
            this.f8651X = bVar.f8651X;
            this.f8652Y = bVar.f8652Y;
            this.f8653Z = bVar.f8653Z;
            this.f8655a0 = bVar.f8655a0;
            this.f8657b0 = bVar.f8657b0;
            this.f8659c0 = bVar.f8659c0;
            this.f8661d0 = bVar.f8661d0;
            this.f8667g0 = bVar.f8667g0;
            int[] iArr = bVar.f8663e0;
            if (iArr != null) {
                this.f8663e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f8663e0 = null;
            }
            this.f8665f0 = bVar.f8665f0;
            this.f8669h0 = bVar.f8669h0;
            this.f8671i0 = bVar.f8671i0;
            this.f8673j0 = bVar.f8673j0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f8940j3);
            this.f8656b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f8627k0.get(index);
                if (i11 == 80) {
                    this.f8669h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f8669h0);
                } else if (i11 != 81) {
                    switch (i11) {
                        case 1:
                            this.f8679p = e.m(typedArrayObtainStyledAttributes, index, this.f8679p);
                            break;
                        case 2:
                            this.f8634G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8634G);
                            break;
                        case 3:
                            this.f8678o = e.m(typedArrayObtainStyledAttributes, index, this.f8678o);
                            break;
                        case 4:
                            this.f8677n = e.m(typedArrayObtainStyledAttributes, index, this.f8677n);
                            break;
                        case 5:
                            this.f8686w = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f8628A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8628A);
                            break;
                        case 7:
                            this.f8629B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8629B);
                            break;
                        case 8:
                            this.f8635H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8635H);
                            break;
                        case 9:
                            this.f8683t = e.m(typedArrayObtainStyledAttributes, index, this.f8683t);
                            break;
                        case 10:
                            this.f8682s = e.m(typedArrayObtainStyledAttributes, index, this.f8682s);
                            break;
                        case 11:
                            this.f8640M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8640M);
                            break;
                        case 12:
                            this.f8641N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8641N);
                            break;
                        case 13:
                            this.f8637J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8637J);
                            break;
                        case 14:
                            this.f8639L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8639L);
                            break;
                        case 15:
                            this.f8642O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8642O);
                            break;
                        case 16:
                            this.f8638K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8638K);
                            break;
                        case 17:
                            this.f8662e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8662e);
                            break;
                        case 18:
                            this.f8664f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8664f);
                            break;
                        case 19:
                            this.f8666g = typedArrayObtainStyledAttributes.getFloat(index, this.f8666g);
                            break;
                        case 20:
                            this.f8684u = typedArrayObtainStyledAttributes.getFloat(index, this.f8684u);
                            break;
                        case 21:
                            this.f8660d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f8660d);
                            break;
                        case 22:
                            this.f8658c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f8658c);
                            break;
                        case 23:
                            this.f8631D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8631D);
                            break;
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                            this.f8668h = e.m(typedArrayObtainStyledAttributes, index, this.f8668h);
                            break;
                        case 25:
                            this.f8670i = e.m(typedArrayObtainStyledAttributes, index, this.f8670i);
                            break;
                        case 26:
                            this.f8630C = typedArrayObtainStyledAttributes.getInt(index, this.f8630C);
                            break;
                        case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            this.f8632E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8632E);
                            break;
                        case 28:
                            this.f8672j = e.m(typedArrayObtainStyledAttributes, index, this.f8672j);
                            break;
                        case 29:
                            this.f8674k = e.m(typedArrayObtainStyledAttributes, index, this.f8674k);
                            break;
                        case 30:
                            this.f8636I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8636I);
                            break;
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            this.f8680q = e.m(typedArrayObtainStyledAttributes, index, this.f8680q);
                            break;
                        case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                            this.f8681r = e.m(typedArrayObtainStyledAttributes, index, this.f8681r);
                            break;
                        case 33:
                            this.f8633F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8633F);
                            break;
                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                            this.f8676m = e.m(typedArrayObtainStyledAttributes, index, this.f8676m);
                            break;
                        case 35:
                            this.f8675l = e.m(typedArrayObtainStyledAttributes, index, this.f8675l);
                            break;
                        case 36:
                            this.f8685v = typedArrayObtainStyledAttributes.getFloat(index, this.f8685v);
                            break;
                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            this.f8644Q = typedArrayObtainStyledAttributes.getFloat(index, this.f8644Q);
                            break;
                        case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                            this.f8643P = typedArrayObtainStyledAttributes.getFloat(index, this.f8643P);
                            break;
                        case 39:
                            this.f8645R = typedArrayObtainStyledAttributes.getInt(index, this.f8645R);
                            break;
                        case 40:
                            this.f8646S = typedArrayObtainStyledAttributes.getInt(index, this.f8646S);
                            break;
                        default:
                            switch (i11) {
                                case 54:
                                    this.f8647T = typedArrayObtainStyledAttributes.getInt(index, this.f8647T);
                                    break;
                                case 55:
                                    this.f8648U = typedArrayObtainStyledAttributes.getInt(index, this.f8648U);
                                    break;
                                case 56:
                                    this.f8649V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8649V);
                                    break;
                                case 57:
                                    this.f8650W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8650W);
                                    break;
                                case 58:
                                    this.f8651X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8651X);
                                    break;
                                case 59:
                                    this.f8652Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8652Y);
                                    break;
                                default:
                                    switch (i11) {
                                        case 61:
                                            this.f8687x = e.m(typedArrayObtainStyledAttributes, index, this.f8687x);
                                            break;
                                        case 62:
                                            this.f8688y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8688y);
                                            break;
                                        case 63:
                                            this.f8689z = typedArrayObtainStyledAttributes.getFloat(index, this.f8689z);
                                            break;
                                        default:
                                            switch (i11) {
                                                case 69:
                                                    this.f8653Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f8655a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f8657b0 = typedArrayObtainStyledAttributes.getInt(index, this.f8657b0);
                                                    break;
                                                case 73:
                                                    this.f8659c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8659c0);
                                                    break;
                                                case 74:
                                                    this.f8665f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f8673j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f8673j0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8627k0.get(index));
                                                    break;
                                                case 77:
                                                    this.f8667g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f8627k0.get(index));
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.f8671i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f8671i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static SparseIntArray f8690h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8691a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8692b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f8693c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8694d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8695e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f8696f = Float.NaN;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f8697g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8690h = sparseIntArray;
            sparseIntArray.append(i.f9038x4, 1);
            f8690h.append(i.f9050z4, 2);
            f8690h.append(i.f8722A4, 3);
            f8690h.append(i.f9032w4, 4);
            f8690h.append(i.f9025v4, 5);
            f8690h.append(i.f9044y4, 6);
        }

        public void a(c cVar) {
            this.f8691a = cVar.f8691a;
            this.f8692b = cVar.f8692b;
            this.f8693c = cVar.f8693c;
            this.f8694d = cVar.f8694d;
            this.f8695e = cVar.f8695e;
            this.f8697g = cVar.f8697g;
            this.f8696f = cVar.f8696f;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f9018u4);
            this.f8691a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f8690h.get(index)) {
                    case 1:
                        this.f8697g = typedArrayObtainStyledAttributes.getFloat(index, this.f8697g);
                        break;
                    case 2:
                        this.f8694d = typedArrayObtainStyledAttributes.getInt(index, this.f8694d);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f8693c = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f8693c = p210v.a.f50090c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f8695e = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f8692b = e.m(typedArrayObtainStyledAttributes, index, this.f8692b);
                        break;
                    case 6:
                        this.f8696f = typedArrayObtainStyledAttributes.getFloat(index, this.f8696f);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8698a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8699b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8700c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f8701d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f8702e = Float.NaN;

        public void a(d dVar) {
            this.f8698a = dVar.f8698a;
            this.f8699b = dVar.f8699b;
            this.f8701d = dVar.f8701d;
            this.f8702e = dVar.f8702e;
            this.f8700c = dVar.f8700c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f8776J4);
            this.f8698a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f8788L4) {
                    this.f8701d = typedArrayObtainStyledAttributes.getFloat(index, this.f8701d);
                } else if (index == i.f8782K4) {
                    this.f8699b = typedArrayObtainStyledAttributes.getInt(index, this.f8699b);
                    this.f8699b = e.f8616d[this.f8699b];
                } else if (index == i.f8800N4) {
                    this.f8700c = typedArrayObtainStyledAttributes.getInt(index, this.f8700c);
                } else if (index == i.f8794M4) {
                    this.f8702e = typedArrayObtainStyledAttributes.getFloat(index, this.f8702e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$e, reason: collision with other inner class name */
    public static class C0142e {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static SparseIntArray f8703n;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8704a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f8705b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f8706c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f8707d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f8708e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f8709f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f8710g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f8711h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f8712i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f8713j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f8714k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f8715l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f8716m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8703n = sparseIntArray;
            sparseIntArray.append(i.f8928h5, 1);
            f8703n.append(i.f8935i5, 2);
            f8703n.append(i.f8942j5, 3);
            f8703n.append(i.f8914f5, 4);
            f8703n.append(i.f8921g5, 5);
            f8703n.append(i.f8886b5, 6);
            f8703n.append(i.f8893c5, 7);
            f8703n.append(i.f8900d5, 8);
            f8703n.append(i.f8907e5, 9);
            f8703n.append(i.f8949k5, 10);
            f8703n.append(i.f8956l5, 11);
        }

        public void a(C0142e c0142e) {
            this.f8704a = c0142e.f8704a;
            this.f8705b = c0142e.f8705b;
            this.f8706c = c0142e.f8706c;
            this.f8707d = c0142e.f8707d;
            this.f8708e = c0142e.f8708e;
            this.f8709f = c0142e.f8709f;
            this.f8710g = c0142e.f8710g;
            this.f8711h = c0142e.f8711h;
            this.f8712i = c0142e.f8712i;
            this.f8713j = c0142e.f8713j;
            this.f8714k = c0142e.f8714k;
            this.f8715l = c0142e.f8715l;
            this.f8716m = c0142e.f8716m;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f8879a5);
            this.f8704a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f8703n.get(index)) {
                    case 1:
                        this.f8705b = typedArrayObtainStyledAttributes.getFloat(index, this.f8705b);
                        break;
                    case 2:
                        this.f8706c = typedArrayObtainStyledAttributes.getFloat(index, this.f8706c);
                        break;
                    case 3:
                        this.f8707d = typedArrayObtainStyledAttributes.getFloat(index, this.f8707d);
                        break;
                    case 4:
                        this.f8708e = typedArrayObtainStyledAttributes.getFloat(index, this.f8708e);
                        break;
                    case 5:
                        this.f8709f = typedArrayObtainStyledAttributes.getFloat(index, this.f8709f);
                        break;
                    case 6:
                        this.f8710g = typedArrayObtainStyledAttributes.getDimension(index, this.f8710g);
                        break;
                    case 7:
                        this.f8711h = typedArrayObtainStyledAttributes.getDimension(index, this.f8711h);
                        break;
                    case 8:
                        this.f8712i = typedArrayObtainStyledAttributes.getDimension(index, this.f8712i);
                        break;
                    case 9:
                        this.f8713j = typedArrayObtainStyledAttributes.getDimension(index, this.f8713j);
                        break;
                    case 10:
                        this.f8714k = typedArrayObtainStyledAttributes.getDimension(index, this.f8714k);
                        break;
                    case 11:
                        this.f8715l = true;
                        this.f8716m = typedArrayObtainStyledAttributes.getDimension(index, this.f8716m);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8617e = sparseIntArray;
        sparseIntArray.append(i.f9014u0, 25);
        f8617e.append(i.f9021v0, 26);
        f8617e.append(i.f9034x0, 29);
        f8617e.append(i.f9040y0, 30);
        f8617e.append(i.f8742E0, 36);
        f8617e.append(i.f8736D0, 35);
        f8617e.append(i.f8888c0, 4);
        f8617e.append(i.f8881b0, 3);
        f8617e.append(i.f8867Z, 1);
        f8617e.append(i.f8790M0, 6);
        f8617e.append(i.f8796N0, 7);
        f8617e.append(i.f8937j0, 17);
        f8617e.append(i.f8944k0, 18);
        f8617e.append(i.f8951l0, 19);
        f8617e.append(i.f8999s, 27);
        f8617e.append(i.f9046z0, 32);
        f8617e.append(i.f8718A0, 33);
        f8617e.append(i.f8930i0, 10);
        f8617e.append(i.f8923h0, 9);
        f8617e.append(i.f8814Q0, 13);
        f8617e.append(i.f8832T0, 16);
        f8617e.append(i.f8820R0, 14);
        f8617e.append(i.f8802O0, 11);
        f8617e.append(i.f8826S0, 15);
        f8617e.append(i.f8808P0, 12);
        f8617e.append(i.f8760H0, 40);
        f8617e.append(i.f9000s0, 39);
        f8617e.append(i.f8993r0, 41);
        f8617e.append(i.f8754G0, 42);
        f8617e.append(i.f8986q0, 20);
        f8617e.append(i.f8748F0, 37);
        f8617e.append(i.f8916g0, 5);
        f8617e.append(i.f9007t0, 82);
        f8617e.append(i.f8730C0, 82);
        f8617e.append(i.f9028w0, 82);
        f8617e.append(i.f8874a0, 82);
        f8617e.append(i.f8861Y, 82);
        f8617e.append(i.f9033x, 24);
        f8617e.append(i.f9045z, 28);
        f8617e.append(i.f8783L, 31);
        f8617e.append(i.f8789M, 8);
        f8617e.append(i.f9039y, 34);
        f8617e.append(i.f8717A, 2);
        f8617e.append(i.f9020v, 23);
        f8617e.append(i.f9027w, 21);
        f8617e.append(i.f9013u, 22);
        f8617e.append(i.f8723B, 43);
        f8617e.append(i.f8801O, 44);
        f8617e.append(i.f8771J, 45);
        f8617e.append(i.f8777K, 46);
        f8617e.append(i.f8765I, 60);
        f8617e.append(i.f8753G, 47);
        f8617e.append(i.f8759H, 48);
        f8617e.append(i.f8729C, 49);
        f8617e.append(i.f8735D, 50);
        f8617e.append(i.f8741E, 51);
        f8617e.append(i.f8747F, 52);
        f8617e.append(i.f8795N, 53);
        f8617e.append(i.f8766I0, 54);
        f8617e.append(i.f8958m0, 55);
        f8617e.append(i.f8772J0, 56);
        f8617e.append(i.f8965n0, 57);
        f8617e.append(i.f8778K0, 58);
        f8617e.append(i.f8972o0, 59);
        f8617e.append(i.f8895d0, 61);
        f8617e.append(i.f8909f0, 62);
        f8617e.append(i.f8902e0, 63);
        f8617e.append(i.f8807P, 64);
        f8617e.append(i.f8856X0, 65);
        f8617e.append(i.f8843V, 66);
        f8617e.append(i.f8862Y0, 67);
        f8617e.append(i.f8844V0, 79);
        f8617e.append(i.f9006t, 38);
        f8617e.append(i.f8838U0, 68);
        f8617e.append(i.f8784L0, 69);
        f8617e.append(i.f8979p0, 70);
        f8617e.append(i.f8831T, 71);
        f8617e.append(i.f8819R, 72);
        f8617e.append(i.f8825S, 73);
        f8617e.append(i.f8837U, 74);
        f8617e.append(i.f8813Q, 75);
        f8617e.append(i.f8850W0, 76);
        f8617e.append(i.f8724B0, 77);
        f8617e.append(i.f8868Z0, 78);
        f8617e.append(i.f8855X, 80);
        f8617e.append(i.f8849W, 81);
    }

    private int[] h(View view, String str) {
        int iIntValue;
        Object objF;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objF = ((ConstraintLayout) view.getParent()).f(0, strTrim)) != null && (objF instanceof Integer)) {
                iIntValue = ((Integer) objF).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    private a i(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f8992r);
        n(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a j(int i10) {
        if (!this.f8620c.containsKey(Integer.valueOf(i10))) {
            this.f8620c.put(Integer.valueOf(i10), new a());
        }
        return (a) this.f8620c.get(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    private void n(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != i.f9006t && i.f8783L != index && i.f8789M != index) {
                aVar.f8623c.f8691a = true;
                aVar.f8624d.f8656b = true;
                aVar.f8622b.f8698a = true;
                aVar.f8625e.f8704a = true;
            }
            switch (f8617e.get(index)) {
                case 1:
                    b bVar = aVar.f8624d;
                    bVar.f8679p = m(typedArray, index, bVar.f8679p);
                    break;
                case 2:
                    b bVar2 = aVar.f8624d;
                    bVar2.f8634G = typedArray.getDimensionPixelSize(index, bVar2.f8634G);
                    break;
                case 3:
                    b bVar3 = aVar.f8624d;
                    bVar3.f8678o = m(typedArray, index, bVar3.f8678o);
                    break;
                case 4:
                    b bVar4 = aVar.f8624d;
                    bVar4.f8677n = m(typedArray, index, bVar4.f8677n);
                    break;
                case 5:
                    aVar.f8624d.f8686w = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f8624d;
                    bVar5.f8628A = typedArray.getDimensionPixelOffset(index, bVar5.f8628A);
                    break;
                case 7:
                    b bVar6 = aVar.f8624d;
                    bVar6.f8629B = typedArray.getDimensionPixelOffset(index, bVar6.f8629B);
                    break;
                case 8:
                    b bVar7 = aVar.f8624d;
                    bVar7.f8635H = typedArray.getDimensionPixelSize(index, bVar7.f8635H);
                    break;
                case 9:
                    b bVar8 = aVar.f8624d;
                    bVar8.f8683t = m(typedArray, index, bVar8.f8683t);
                    break;
                case 10:
                    b bVar9 = aVar.f8624d;
                    bVar9.f8682s = m(typedArray, index, bVar9.f8682s);
                    break;
                case 11:
                    b bVar10 = aVar.f8624d;
                    bVar10.f8640M = typedArray.getDimensionPixelSize(index, bVar10.f8640M);
                    break;
                case 12:
                    b bVar11 = aVar.f8624d;
                    bVar11.f8641N = typedArray.getDimensionPixelSize(index, bVar11.f8641N);
                    break;
                case 13:
                    b bVar12 = aVar.f8624d;
                    bVar12.f8637J = typedArray.getDimensionPixelSize(index, bVar12.f8637J);
                    break;
                case 14:
                    b bVar13 = aVar.f8624d;
                    bVar13.f8639L = typedArray.getDimensionPixelSize(index, bVar13.f8639L);
                    break;
                case 15:
                    b bVar14 = aVar.f8624d;
                    bVar14.f8642O = typedArray.getDimensionPixelSize(index, bVar14.f8642O);
                    break;
                case 16:
                    b bVar15 = aVar.f8624d;
                    bVar15.f8638K = typedArray.getDimensionPixelSize(index, bVar15.f8638K);
                    break;
                case 17:
                    b bVar16 = aVar.f8624d;
                    bVar16.f8662e = typedArray.getDimensionPixelOffset(index, bVar16.f8662e);
                    break;
                case 18:
                    b bVar17 = aVar.f8624d;
                    bVar17.f8664f = typedArray.getDimensionPixelOffset(index, bVar17.f8664f);
                    break;
                case 19:
                    b bVar18 = aVar.f8624d;
                    bVar18.f8666g = typedArray.getFloat(index, bVar18.f8666g);
                    break;
                case 20:
                    b bVar19 = aVar.f8624d;
                    bVar19.f8684u = typedArray.getFloat(index, bVar19.f8684u);
                    break;
                case 21:
                    b bVar20 = aVar.f8624d;
                    bVar20.f8660d = typedArray.getLayoutDimension(index, bVar20.f8660d);
                    break;
                case 22:
                    d dVar = aVar.f8622b;
                    dVar.f8699b = typedArray.getInt(index, dVar.f8699b);
                    d dVar2 = aVar.f8622b;
                    dVar2.f8699b = f8616d[dVar2.f8699b];
                    break;
                case 23:
                    b bVar21 = aVar.f8624d;
                    bVar21.f8658c = typedArray.getLayoutDimension(index, bVar21.f8658c);
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    b bVar22 = aVar.f8624d;
                    bVar22.f8631D = typedArray.getDimensionPixelSize(index, bVar22.f8631D);
                    break;
                case 25:
                    b bVar23 = aVar.f8624d;
                    bVar23.f8668h = m(typedArray, index, bVar23.f8668h);
                    break;
                case 26:
                    b bVar24 = aVar.f8624d;
                    bVar24.f8670i = m(typedArray, index, bVar24.f8670i);
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    b bVar25 = aVar.f8624d;
                    bVar25.f8630C = typedArray.getInt(index, bVar25.f8630C);
                    break;
                case 28:
                    b bVar26 = aVar.f8624d;
                    bVar26.f8632E = typedArray.getDimensionPixelSize(index, bVar26.f8632E);
                    break;
                case 29:
                    b bVar27 = aVar.f8624d;
                    bVar27.f8672j = m(typedArray, index, bVar27.f8672j);
                    break;
                case 30:
                    b bVar28 = aVar.f8624d;
                    bVar28.f8674k = m(typedArray, index, bVar28.f8674k);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    b bVar29 = aVar.f8624d;
                    bVar29.f8636I = typedArray.getDimensionPixelSize(index, bVar29.f8636I);
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                    b bVar30 = aVar.f8624d;
                    bVar30.f8680q = m(typedArray, index, bVar30.f8680q);
                    break;
                case 33:
                    b bVar31 = aVar.f8624d;
                    bVar31.f8681r = m(typedArray, index, bVar31.f8681r);
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    b bVar32 = aVar.f8624d;
                    bVar32.f8633F = typedArray.getDimensionPixelSize(index, bVar32.f8633F);
                    break;
                case 35:
                    b bVar33 = aVar.f8624d;
                    bVar33.f8676m = m(typedArray, index, bVar33.f8676m);
                    break;
                case 36:
                    b bVar34 = aVar.f8624d;
                    bVar34.f8675l = m(typedArray, index, bVar34.f8675l);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    b bVar35 = aVar.f8624d;
                    bVar35.f8685v = typedArray.getFloat(index, bVar35.f8685v);
                    break;
                case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                    aVar.f8621a = typedArray.getResourceId(index, aVar.f8621a);
                    break;
                case 39:
                    b bVar36 = aVar.f8624d;
                    bVar36.f8644Q = typedArray.getFloat(index, bVar36.f8644Q);
                    break;
                case 40:
                    b bVar37 = aVar.f8624d;
                    bVar37.f8643P = typedArray.getFloat(index, bVar37.f8643P);
                    break;
                case 41:
                    b bVar38 = aVar.f8624d;
                    bVar38.f8645R = typedArray.getInt(index, bVar38.f8645R);
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    b bVar39 = aVar.f8624d;
                    bVar39.f8646S = typedArray.getInt(index, bVar39.f8646S);
                    break;
                case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                    d dVar3 = aVar.f8622b;
                    dVar3.f8701d = typedArray.getFloat(index, dVar3.f8701d);
                    break;
                case 44:
                    C0142e c0142e = aVar.f8625e;
                    c0142e.f8715l = true;
                    c0142e.f8716m = typedArray.getDimension(index, c0142e.f8716m);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    C0142e c0142e2 = aVar.f8625e;
                    c0142e2.f8706c = typedArray.getFloat(index, c0142e2.f8706c);
                    break;
                case 46:
                    C0142e c0142e3 = aVar.f8625e;
                    c0142e3.f8707d = typedArray.getFloat(index, c0142e3.f8707d);
                    break;
                case 47:
                    C0142e c0142e4 = aVar.f8625e;
                    c0142e4.f8708e = typedArray.getFloat(index, c0142e4.f8708e);
                    break;
                case 48:
                    C0142e c0142e5 = aVar.f8625e;
                    c0142e5.f8709f = typedArray.getFloat(index, c0142e5.f8709f);
                    break;
                case 49:
                    C0142e c0142e6 = aVar.f8625e;
                    c0142e6.f8710g = typedArray.getDimension(index, c0142e6.f8710g);
                    break;
                case 50:
                    C0142e c0142e7 = aVar.f8625e;
                    c0142e7.f8711h = typedArray.getDimension(index, c0142e7.f8711h);
                    break;
                case 51:
                    C0142e c0142e8 = aVar.f8625e;
                    c0142e8.f8712i = typedArray.getDimension(index, c0142e8.f8712i);
                    break;
                case 52:
                    C0142e c0142e9 = aVar.f8625e;
                    c0142e9.f8713j = typedArray.getDimension(index, c0142e9.f8713j);
                    break;
                case 53:
                    C0142e c0142e10 = aVar.f8625e;
                    c0142e10.f8714k = typedArray.getDimension(index, c0142e10.f8714k);
                    break;
                case 54:
                    b bVar40 = aVar.f8624d;
                    bVar40.f8647T = typedArray.getInt(index, bVar40.f8647T);
                    break;
                case 55:
                    b bVar41 = aVar.f8624d;
                    bVar41.f8648U = typedArray.getInt(index, bVar41.f8648U);
                    break;
                case 56:
                    b bVar42 = aVar.f8624d;
                    bVar42.f8649V = typedArray.getDimensionPixelSize(index, bVar42.f8649V);
                    break;
                case 57:
                    b bVar43 = aVar.f8624d;
                    bVar43.f8650W = typedArray.getDimensionPixelSize(index, bVar43.f8650W);
                    break;
                case 58:
                    b bVar44 = aVar.f8624d;
                    bVar44.f8651X = typedArray.getDimensionPixelSize(index, bVar44.f8651X);
                    break;
                case 59:
                    b bVar45 = aVar.f8624d;
                    bVar45.f8652Y = typedArray.getDimensionPixelSize(index, bVar45.f8652Y);
                    break;
                case 60:
                    C0142e c0142e11 = aVar.f8625e;
                    c0142e11.f8705b = typedArray.getFloat(index, c0142e11.f8705b);
                    break;
                case 61:
                    b bVar46 = aVar.f8624d;
                    bVar46.f8687x = m(typedArray, index, bVar46.f8687x);
                    break;
                case 62:
                    b bVar47 = aVar.f8624d;
                    bVar47.f8688y = typedArray.getDimensionPixelSize(index, bVar47.f8688y);
                    break;
                case 63:
                    b bVar48 = aVar.f8624d;
                    bVar48.f8689z = typedArray.getFloat(index, bVar48.f8689z);
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                    c cVar = aVar.f8623c;
                    cVar.f8692b = m(typedArray, index, cVar.f8692b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f8623c.f8693c = typedArray.getString(index);
                    } else {
                        aVar.f8623c.f8693c = p210v.a.f50090c[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.f8623c.f8695e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f8623c;
                    cVar2.f8697g = typedArray.getFloat(index, cVar2.f8697g);
                    break;
                case 68:
                    d dVar4 = aVar.f8622b;
                    dVar4.f8702e = typedArray.getFloat(index, dVar4.f8702e);
                    break;
                case 69:
                    aVar.f8624d.f8653Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f8624d.f8655a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f8624d;
                    bVar49.f8657b0 = typedArray.getInt(index, bVar49.f8657b0);
                    break;
                case 73:
                    b bVar50 = aVar.f8624d;
                    bVar50.f8659c0 = typedArray.getDimensionPixelSize(index, bVar50.f8659c0);
                    break;
                case 74:
                    aVar.f8624d.f8665f0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f8624d;
                    bVar51.f8673j0 = typedArray.getBoolean(index, bVar51.f8673j0);
                    break;
                case 76:
                    c cVar3 = aVar.f8623c;
                    cVar3.f8694d = typedArray.getInt(index, cVar3.f8694d);
                    break;
                case 77:
                    aVar.f8624d.f8667g0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f8622b;
                    dVar5.f8700c = typedArray.getInt(index, dVar5.f8700c);
                    break;
                case 79:
                    c cVar4 = aVar.f8623c;
                    cVar4.f8696f = typedArray.getFloat(index, cVar4.f8696f);
                    break;
                case 80:
                    b bVar52 = aVar.f8624d;
                    bVar52.f8669h0 = typedArray.getBoolean(index, bVar52.f8669h0);
                    break;
                case 81:
                    b bVar53 = aVar.f8624d;
                    bVar53.f8671i0 = typedArray.getBoolean(index, bVar53.f8671i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8617e.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f8617e.get(index));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(ConstraintLayout constraintLayout, boolean z9) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f8620c.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id = childAt.getId();
            if (!this.f8620c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + p220w.a.a(childAt));
            } else {
                if (this.f8619b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f8620c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = (a) this.f8620c.get(Integer.valueOf(id));
                        if (childAt instanceof androidx.constraintlayout.widget.a) {
                            aVar.f8624d.f8661d0 = 1;
                        }
                        int i11 = aVar.f8624d.f8661d0;
                        if (i11 != -1 && i11 == 1) {
                            androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                            aVar2.setId(id);
                            aVar2.setType(aVar.f8624d.f8657b0);
                            aVar2.setMargin(aVar.f8624d.f8659c0);
                            aVar2.setAllowsGoneWidget(aVar.f8624d.f8673j0);
                            b bVar = aVar.f8624d;
                            int[] iArr = bVar.f8663e0;
                            if (iArr != null) {
                                aVar2.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f8665f0;
                                if (str != null) {
                                    bVar.f8663e0 = h(aVar2, str);
                                    aVar2.setReferencedIds(aVar.f8624d.f8663e0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.b(bVar2);
                        if (z9) {
                            androidx.constraintlayout.widget.b.c(childAt, aVar.f8626f);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f8622b;
                        if (dVar.f8700c == 0) {
                            childAt.setVisibility(dVar.f8699b);
                        }
                        childAt.setAlpha(aVar.f8622b.f8701d);
                        childAt.setRotation(aVar.f8625e.f8705b);
                        childAt.setRotationX(aVar.f8625e.f8706c);
                        childAt.setRotationY(aVar.f8625e.f8707d);
                        childAt.setScaleX(aVar.f8625e.f8708e);
                        childAt.setScaleY(aVar.f8625e.f8709f);
                        if (!Float.isNaN(aVar.f8625e.f8710g)) {
                            childAt.setPivotX(aVar.f8625e.f8710g);
                        }
                        if (!Float.isNaN(aVar.f8625e.f8711h)) {
                            childAt.setPivotY(aVar.f8625e.f8711h);
                        }
                        childAt.setTranslationX(aVar.f8625e.f8712i);
                        childAt.setTranslationY(aVar.f8625e.f8713j);
                        childAt.setTranslationZ(aVar.f8625e.f8714k);
                        C0142e c0142e = aVar.f8625e;
                        if (c0142e.f8715l) {
                            childAt.setElevation(c0142e.f8716m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar3 = (a) this.f8620c.get(num);
            int i12 = aVar3.f8624d.f8661d0;
            if (i12 != -1 && i12 == 1) {
                androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                aVar4.setId(num.intValue());
                b bVar3 = aVar3.f8624d;
                int[] iArr2 = bVar3.f8663e0;
                if (iArr2 != null) {
                    aVar4.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f8665f0;
                    if (str2 != null) {
                        bVar3.f8663e0 = h(aVar4, str2);
                        aVar4.setReferencedIds(aVar3.f8624d.f8663e0);
                    }
                }
                aVar4.setType(aVar3.f8624d.f8657b0);
                aVar4.setMargin(aVar3.f8624d.f8659c0);
                ConstraintLayout.b bVarD = constraintLayout.generateDefaultLayoutParams();
                aVar4.m();
                aVar3.b(bVarD);
                constraintLayout.addView(aVar4, bVarD);
            }
            if (aVar3.f8624d.f8654a) {
                View gVar = new g(constraintLayout.getContext());
                gVar.setId(num.intValue());
                ConstraintLayout.b bVarD2 = constraintLayout.generateDefaultLayoutParams();
                aVar3.b(bVarD2);
                constraintLayout.addView(gVar, bVarD2);
            }
        }
    }

    public void e(Context context, int i10) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f8620c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f8619b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f8620c.containsKey(Integer.valueOf(id))) {
                this.f8620c.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f8620c.get(Integer.valueOf(id));
            aVar.f8626f = androidx.constraintlayout.widget.b.a(this.f8618a, childAt);
            aVar.d(id, bVar);
            aVar.f8622b.f8699b = childAt.getVisibility();
            aVar.f8622b.f8701d = childAt.getAlpha();
            aVar.f8625e.f8705b = childAt.getRotation();
            aVar.f8625e.f8706c = childAt.getRotationX();
            aVar.f8625e.f8707d = childAt.getRotationY();
            aVar.f8625e.f8708e = childAt.getScaleX();
            aVar.f8625e.f8709f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                C0142e c0142e = aVar.f8625e;
                c0142e.f8710g = pivotX;
                c0142e.f8711h = pivotY;
            }
            aVar.f8625e.f8712i = childAt.getTranslationX();
            aVar.f8625e.f8713j = childAt.getTranslationY();
            aVar.f8625e.f8714k = childAt.getTranslationZ();
            C0142e c0142e2 = aVar.f8625e;
            if (c0142e2.f8715l) {
                c0142e2.f8716m = childAt.getElevation();
            }
            if (childAt instanceof androidx.constraintlayout.widget.a) {
                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                aVar.f8624d.f8673j0 = aVar2.n();
                aVar.f8624d.f8663e0 = aVar2.getReferencedIds();
                aVar.f8624d.f8657b0 = aVar2.getType();
                aVar.f8624d.f8659c0 = aVar2.getMargin();
            }
        }
    }

    public void g(int i10, int i11, int i12, float f10) {
        b bVar = j(i10).f8624d;
        bVar.f8687x = i11;
        bVar.f8688y = i12;
        bVar.f8689z = f10;
    }

    public void k(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarI = i(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarI.f8624d.f8654a = true;
                    }
                    this.f8620c.put(Integer.valueOf(aVarI.f8621a), aVarI);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    public void l(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            a aVarI = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        switch (xmlPullParser.getName()) {
                            case "Constraint":
                                aVarI = i(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case "Guideline":
                                aVarI = i(context, Xml.asAttributeSet(xmlPullParser));
                                b bVar = aVarI.f8624d;
                                bVar.f8654a = true;
                                bVar.f8656b = true;
                                break;
                            case "Barrier":
                                aVarI = i(context, Xml.asAttributeSet(xmlPullParser));
                                aVarI.f8624d.f8661d0 = 1;
                                break;
                            case "PropertySet":
                                if (aVarI == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarI.f8622b.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case "Transform":
                                if (aVarI == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarI.f8625e.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case "Layout":
                                if (aVarI == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarI.f8624d.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case "Motion":
                                if (aVarI == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarI.f8623c.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case "CustomAttribute":
                                if (aVarI == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                androidx.constraintlayout.widget.b.b(context, xmlPullParser, aVarI.f8626f);
                                break;
                                break;
                        }
                    } else if (eventType != 3) {
                        continue;
                    } else {
                        String name = xmlPullParser.getName();
                        if ("ConstraintSet".equals(name)) {
                            return;
                        }
                        if (name.equalsIgnoreCase("Constraint")) {
                            this.f8620c.put(Integer.valueOf(aVarI.f8621a), aVarI);
                            aVarI = null;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
